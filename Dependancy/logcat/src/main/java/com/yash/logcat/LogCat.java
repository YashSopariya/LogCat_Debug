package com.yash.logcat;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class LogCat {
    public static void log(String message,String TAG){

        Log.d(TAG, message);

    }
}
