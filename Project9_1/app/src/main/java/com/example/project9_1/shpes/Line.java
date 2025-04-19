package com.example.project9_1.shpes;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Line extends Shape {
    public Line(int startX, int startY, int stopX, int stopY) {
        super(startX, startY, stopX, stopY);
    }
    public void draw(Canvas canvas, Paint paint) {
        canvas.drawLine(startX, startY, stopX, stopY, paint);
    }
}