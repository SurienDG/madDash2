package com.example.example.maddash;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Yixiong on 7/16/2017.
 */

public class GameLevelManager {

    public static int upperBound, lowerBound, leftBound, rightBound;

    public Player player;

    public GameLevelManager(int width, int height) {
        leftBound = width / 10;
        rightBound = width / 10 * 9;
        upperBound = height / 10;
        lowerBound = height / 10 * 9;
        player = new Player();
    }


    public void update() {

    }


    public void draw(Canvas canvas, Paint paint) {
        canvas.drawColor(Color.argb(255,  26, 128, 182));
        canvas.drawLine(leftBound, upperBound, rightBound, upperBound, paint);
        canvas.drawLine(leftBound, upperBound, leftBound, lowerBound, paint);
        canvas.drawLine(leftBound, lowerBound, rightBound, lowerBound, paint);
        canvas.drawLine(rightBound, upperBound, rightBound, lowerBound, paint);


    }

}
