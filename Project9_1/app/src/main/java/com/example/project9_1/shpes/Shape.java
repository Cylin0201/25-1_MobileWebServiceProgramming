package com.example.project9_1.shpes;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class Shape {
    int startX, startY, stopX, stopY;

    public Shape(int startX, int startY, int stopX, int stopY) {
        this.startX = startX;
        this.startY = startY;
        this.stopX = stopX;
        this.stopY = stopY;
    }

    public abstract void draw(Canvas canvas, Paint paint);
}
