package com.example.project9_1.shpes;


import android.graphics.Canvas;
import android.graphics.Paint;

public class Rect extends Shape {
    public Rect(int startX, int startY, int stopX, int stopY) {
        super(startX, startY, stopX, stopY);
    }
    public void draw(Canvas canvas, Paint paint) {
        canvas.drawRect(startX, startY, stopX, stopY, paint);
    }
}
