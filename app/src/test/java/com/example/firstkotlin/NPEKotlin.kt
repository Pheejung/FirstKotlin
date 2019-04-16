package com.example.firstkotlin

fun strLen1(str:String) : Int {
    return str.length
}

fun strLen2(str:String?) : Int {
    // return str.length
    if(str != null) {
        return str.length
    } else {
        return 0
    }
}

fun strLast1(str:String?) : Char? {
    return str?.get(str.length-1)  // ? :
    // ?. Elvis 연산자 ?:
}

fun strLast2(str:String?) : Char {
    return str?.get(str.length-1) ?: "n".single()
}

fun strPrintLen(str:String?) {
    str?.let { println(strLast1(it)) }
    // str?.let { item -> println(strLast1(item)) }
}