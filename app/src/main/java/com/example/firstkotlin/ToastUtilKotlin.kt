@file:JvmName("T")
package com.example.firstkotlin

import android.widget.Toast

fun toastShort(m:String) {
    Toast.makeText(MainApplication.getAppContext(), m, Toast.LENGTH_SHORT).show()
}

fun toastLong(m:String) {
    Toast.makeText(MainApplication.getAppContext(), m, Toast.LENGTH_LONG).show()
}

fun toast(m:String, length:Int=Toast.LENGTH_SHORT) {
    Toast.makeText(MainApplication.getAppContext(), m, length).show()
}