package com.example.firstkotlin

import kotlin.properties.Delegates

class User {
   /* var nickname by DelegateString()

    val httpText by lazy {
        println("lazy init start")
        InputStreamReader(URL("https://naver.com").openConnection().getInputStream()).readText()
    }

    lateinit var name:String */

    var name:String by Delegates.observable("") {
        property, oldValue, newValue -> println("기존값:${oldValue}, 새 값:${newValue}")
    }
}