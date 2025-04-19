package com.example.project9_1.shpes;


import android.graphics.Canvas;
import android.graphics.Paint;

public class Circle extends Shape {
    public Circle(int startX, int startY, int stopX, int stopY) {
        super(startX, startY, stopX, stopY);
    }
    public void draw(Canvas canvas, Paint paint) {
        int radius = (int) Math.sqrt(Math.pow(stopX - startX, 2) + Math.pow(stopY - startY, 2));
        canvas.drawCircle(startX, startY, radius, paint);
    }
}