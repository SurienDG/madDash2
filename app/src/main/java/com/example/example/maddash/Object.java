package com.example.example.maddash;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;

/**
 * Created by Yixiong on 7/16/2017.
 */

public class Object {

    protected int width, height;

    protected double x, y, dx, dy;

    protected Bitmap image;

    public Object() {


    }

    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setVector(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public void draw(Canvas canvas, Paint paint) {
        canvas.drawBitmap(image, 0, 0, paint);
    }

}
