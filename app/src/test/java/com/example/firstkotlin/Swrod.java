package com.example.firstkotlin;

public final class Swrod implements ISword{
    String name;

    public Swrod(String name) {
        this.name = name;
    }

    public void eqiup() {
        System.out.println(name + "이 장착됨");
        // 장착 -> 사운드
    }
}
