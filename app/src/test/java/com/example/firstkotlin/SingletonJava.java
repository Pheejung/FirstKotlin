package com.example.firstkotlin;

public class SingletonJava {
    // 인스턴스 하나 생성 -> 돌려쓰는것

    private SingletonJava() {

    }

    private static SingletonJava instance = new SingletonJava();

    public static SingletonJava getInstance() {
        return instance;
    }

    public void log(String text) {
        System.out.println(text);
    }
}
