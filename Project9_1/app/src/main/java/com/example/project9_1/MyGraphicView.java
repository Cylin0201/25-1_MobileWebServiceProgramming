package com.example.project9_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.example.project9_1.shpes.Shape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;

import com.example.project9_1.shpes.Circle;
import com.example.project9_1.shpes.Line;
import com.example.project9_1.shpes.Rect;

import java.util.ArrayList;

public class MyGraphicView extends View {
    final static int LINE = 1, CIRCLE = 2, RECT = 3;
    static int curShape = LINE;

    int startX = -1, startY = -1, stopX = -1, stopY = -1;

    ArrayList<Shape> shapeList = new ArrayList<>();

    public MyGraphicView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setShape(int shape) {
        curShape = shape;
    }

    @Override
    public boolean onTouchEvent(@NonNull MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                startX = (int) event.getX();
                startY = (int) event.getY();
                break;
            case MotionEvent.ACTION_UP:
                stopX = (int) event.getX();
                stopY = (int) event.getY();

                Shape shape = null;
                switch (curShape) {
                    case LINE:
                        shape = new Line(startX, startY, stopX, stopY);
                        break;
                    case CIRCLE:
                        shape = new Circle(startX, startY, stopX, stopY);
                        break;
                    case RECT:
                        shape = new Rect(startX, startY, stopX, stopY);
                        break;
                }

                if (shape != null) {
                    shapeList.add(shape);
                }

                invalidate();
                break;
        }
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);

        for (Shape shape : shapeList) {
            shape.draw(canvas, paint);
        }
    }
}
