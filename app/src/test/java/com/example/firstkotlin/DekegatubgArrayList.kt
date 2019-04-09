package com.example.firstkotlin

// 클래스 위임(인터페이스 활용)
class DekegatubgArrayList<T>(val innerList:MutableCollection<T> = mutableListOf()) : MutableCollection<T> by innerList {
    override fun add(element: T) : Boolean {
        return innerList.add((element))
    }
}