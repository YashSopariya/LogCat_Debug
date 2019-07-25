package com.yash.logcat;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class LogCat {
    public static void debug(String TAG,String message){

        Log.d(TAG, message);

    }
}
