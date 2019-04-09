package com.example.firstkotlin;

import android.widget.Toast;

public class ToastUtilJava {
    public static void toastShort(String m) {
        Toast.makeText(MainApplication.getAppContext(), m, Toast.LENGTH_SHORT).show();
    }

    public static void toastLong(String m) {
        Toast.makeText(MainApplication.getAppContext(), m, Toast.LENGTH_LONG).show();
    }

    public static void toast(String m, int length) { //디폴트 파라미터
        Toast.makeText(MainApplication.getAppContext(), m, length).show();
    }

    public static void toast(String m) {
        toast(m, Toast.LENGTH_SHORT);
    }
}
