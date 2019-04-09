package com.example.firstkotlin;

public class InneJava {
    int outerFilde = 0;

    class InnerClass { // InnerClass 내부클래스
        int innerField = outerFilde;
    }

    // 중첩클래스
    public static class NestedClass {
        // int nestedField = outerFiled;
    }

}
