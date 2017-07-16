package com.example.example.maddash;

import android.graphics.Canvas;

/**
 * Created by Yixiong on 7/16/2017.
 */

public class Object {

    protected int width, height;

    protected double x, y, dx, dy;

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

    public void draw(Canvas canvas) {

    }

}
