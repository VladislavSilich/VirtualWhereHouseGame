package com.virtualwarehouse.game.example.silich.vladislav.virtualwarehouse.algoritm;

import com.virtualwarehouse.game.example.silich.vladislav.virtualwarehouse.data.Point;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Lenovo on 19.09.2017.
 */

public class SearchAllPointsOfMap {

    private Stack<Point> stack;

    private ArrayList<Point> allPointsOfMap = new ArrayList<Point>();

    public SearchAllPointsOfMap(int a, int b,ArrayList<Point> allPoints){
        stack = new Stack<>();
        stack.push(new Point(allPoints.get(0).getX()+25, allPoints.get(0).getX()+25));

        while(!stack.empty()){
            Point cur = stack.pop();
        }
    }
}
