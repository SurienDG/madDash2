package com.example.example.maddash;

import android.content.Context;
import android.view.SurfaceView;

/**
 * Created by Yixiong on 7/10/2017.
 */

public class GameView extends SurfaceView implements Runnable{

    private Thread thread;

    volatile boolean running;

    private long fps;

    public GameView(Context context) {
        super(context);

        running = true;
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

    }

    public void draw() {

    }




}
