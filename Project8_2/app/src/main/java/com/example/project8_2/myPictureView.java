package com.example.project8_2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class myPictureView extends View {
    public String imagePath = null;
    public myPictureView(Context context, @Nullable AttributeSet attrs){
        super(context, attrs);
    }
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        if (imagePath != null){
            Bitmap bitmap = BitmapFactory.decodeFile(imagePath);
            if (bitmap != null) {
                Bitmap scaledBitmap = Bitmap.createScaledBitmap(bitmap, getWidth(), getHeight(), true);
                canvas.drawBitmap(scaledBitmap, 0, 0, null);
                bitmap.recycle();
            }
        }
    }

}
