package com.example.firstkotlin

fun String.lastString():String {
    return this.get(this.length-1).toString()
}

class ExtTestn {
    fun String.extFunc() {
        println(this.lastString())
    }

    fun fn1() {
        "test".extFunc()
    }
}

fun test() {
    // "test".extFunc()
    "test".lastString()
}