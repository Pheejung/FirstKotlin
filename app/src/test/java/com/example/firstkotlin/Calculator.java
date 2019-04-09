package com.example.firstkotlin;

public class Calculator {
    public static int calcAccuracy(MoveObject moveObject, int attackAccuracy) {
        if(moveObject.getSpeed() == 0) {
            moveObject.addSpeed(1);
        }
        double result = attackAccuracy/moveObject.getSpeed();
        return (int)result;
    }
}
