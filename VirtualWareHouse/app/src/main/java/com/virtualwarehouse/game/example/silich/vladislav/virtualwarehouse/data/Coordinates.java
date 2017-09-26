package com.virtualwarehouse.game.example.silich.vladislav.virtualwarehouse.data;

/**
 * Created by Lenovo on 19.09.2017.
 */

public class Coordinates {
    public static int X = -1;
    public static int Y = -1;
    public static boolean isMatch = false;
    public static boolean isMove = false;

    public static synchronized void setX(int x){
        X = x;
    }

    public static synchronized int getX(){
        return X;
    }
}
