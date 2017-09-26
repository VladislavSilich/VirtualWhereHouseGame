package com.virtualwarehouse.game.example.silich.vladislav.virtualwarehouse.game;

import android.graphics.Canvas;

/**
 * Created by Lenovo on 19.09.2017.
 */

public class GameManager extends Thread {
    private GameView view;

    private boolean running = false;

    public GameManager(GameView view){
        this.view = view;
    }

    public void setRunning(boolean run){
        running = run;
    }

    public void run(){
        while(running){
            Canvas c = null;
            try{
                c = view.getHolder().lockCanvas();
                synchronized (view.getHolder()) {
                    view.onDraw(c);
                }
            }
            finally{
                if(c!=null){
                    view.getHolder().unlockCanvasAndPost(c);
                }
            }
        }
    }
}
