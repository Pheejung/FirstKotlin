package com.example.firstkotlin;

public class MoveObject {
    protected int speed;
    public int x,y;

    public void addSpeed(int param) {
        this.speed = speed + param;
    }

    public int getSpeed() {
        return speed;
    }
}
