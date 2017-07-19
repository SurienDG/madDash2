package com.example.example.maddash;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Yixiong on 7/16/2017.
 */

public class Player extends Object {

    private int health, maxHealth, damage;

    public Player(Context context){
        image = BitmapFactory.decodeResource(context.getResources() ,R.drawable.character);
        width = 20;
        height = 20;


    }

    public void draw(Canvas canvas, Paint paint){
        super.draw(canvas, paint);
    }

}
