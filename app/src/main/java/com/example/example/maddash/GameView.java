package com.example.example.maddash;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Yixiong on 7/10/2017.
 */

public class GameView extends SurfaceView implements Runnable{

    public static int WIDTH, HEIGHT;

    private Thread thread;

    volatile boolean running;

    private long fps;

    private GameLevelManager gameLevelManager;

    SurfaceHolder surfaceHolder;

    Canvas canvas;

    Bitmap b;

    Paint paint;

    public GameView(Context context) {
        super(context);



        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) getContext()).getWindowManager()
                .getDefaultDisplay()
                .getMetrics(displayMetrics);
        HEIGHT = displayMetrics.heightPixels;
        WIDTH = displayMetrics.widthPixels;


        paint = new Paint();

        //b = Bitmap.createBitmap(WIDTH, HEIGHT, Bitmap.Config.ARGB_8888);

        //canvas = new Canvas();

        surfaceHolder = getHolder();


        running = true;

        gameLevelManager = new GameLevelManager();

        start();
    }

    public void start() {
        if(thread == null) {
            thread = new Thread(this);
            thread.start();

        }
    }

    @Override
    public void run() {

        long start;
        long elapsed;
        while(running) {
            start = System.currentTimeMillis();

            update();
            draw();

            elapsed = System.currentTimeMillis() - start;

            if (elapsed > 0) {
                fps = 1000 / elapsed;
            }

        }
    }


    public void update() {
        gameLevelManager.update();
    }

    public void draw() {




        if (surfaceHolder.getSurface().isValid()) {

            // Lock the canvas ready to draw
            canvas = surfaceHolder.lockCanvas();

            gameLevelManager.draw(canvas);

            // Draw the background color
            //canvas.drawColor(Color.argb(255,  26, 128, 182));

            // Choose the brush color for drawing
            paint.setColor(Color.argb(255,  249, 129, 0));

            // Make the text a bit bigger
            paint.setTextSize(45);

            // Display the current fps on the screen
            canvas.drawText("FPS:" + fps, 20, 40, paint);



            // Draw everything to the screen
            surfaceHolder.unlockCanvasAndPost(canvas);
        }
    }




}
