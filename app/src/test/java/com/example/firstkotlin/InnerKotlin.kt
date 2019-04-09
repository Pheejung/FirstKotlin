package com.example.firstkotlin

class InnerKotlin {
    val outerField = 0

    inner class InnerClass { // 내부클래스
        val innerField = outerField
    }

    class NestedClass {
        // val innterField = outerField
    }
}