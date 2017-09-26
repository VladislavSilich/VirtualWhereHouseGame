package com.virtualwarehouse.game.example.silich.vladislav.virtualwarehouse.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import com.virtualwarehouse.game.example.silich.vladislav.virtualwarehouse.data.Coordinates;
import com.virtualwarehouse.game.example.silich.vladislav.virtualwarehouse.IDraw;
import com.virtualwarehouse.game.example.silich.vladislav.virtualwarehouse.IMove;
import com.virtualwarehouse.game.example.silich.vladislav.virtualwarehouse.data.Point;
import com.virtualwarehouse.game.example.silich.vladislav.virtualwarehouse.algoritm.SearchAllPointsOfMap;

import java.util.ArrayList;

/**
 * Created by Lenovo on 19.09.2017.
 */

public class Robot implements IMove, IDraw {

    private GameView gameView;

    private Bitmap bmp;

    private int x;
    private int y;

    private int xSpeed = 2;
    private int ySpeed = 2;

    private int val = 11;

    private int width;
    private int height;

    private ArrayList<Point> allPointOfMap = null;

    private static int count = 0;

    public Robot(GameView gameView, Bitmap bmp){
        this.gameView = gameView;
        this.bmp = bmp;
        width = bmp.getWidth();
        height = bmp.getHeight();
    }

    private void searchBox(){
        gameView.gameMap.getGameFieldCoordinates();
        SearchAllPointsOfMap sAllPointsOfMap = new SearchAllPointsOfMap(480, 320, gameView.gameMap.getGameFieldCoordinates());
       //allPointOfMap = sAllPointsOfMap.getAllPointsOfMap();
    }

    @Override
    public synchronized void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        if(Coordinates.isMove){
            move();
            if(Coordinates.getX()!=x+val)
                Coordinates.setX(x+val);
            else
                Coordinates.isMatch = true;
        }

        canvas.drawBitmap(bmp, x, y, null);
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        if (x > gameView.getWidth() - bmp.getWidth() - xSpeed) {
            xSpeed = -2;
            if(val>0)
                val*=(-1);
        }
        if (x + xSpeed< 0) {
            xSpeed = 2;
            if(val<0){
                val*=(-1);
            }
        }
        x = x + xSpeed;
    }

    @Override
    public void setPosition(int _x, int _y) {
        // TODO Auto-generated method stub
        x = _x;
        y = _y;
    }

    @Override
    public int getX() {
        // TODO Auto-generated method stub
        return x;
    }

    @Override
    public int getY() {
        // TODO Auto-generated method stub
        return y;
    }

}