package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.EventLogTags;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //warning 打印警告信息
        Log.w(TAG, "onCreate: " + "warning");

        //输入“loge”：（TAG,String,Exception)
        //error 打印错误信息
        Log.e(TAG, "onCreate: " + "error");

        //输入“logd”: (TAG,String)
        //debug 打印调试信息
        Log.d(TAG, "onCreate: " + "debug");

        //输入“logi”：(TAG,String)
        //info 打印一般提示信息
        Log.i(TAG, "onCreate: " + "info");

        //输入“logr”: (TAG,String)
        //log result of this method 打印方法的返回值
        Log.d(TAG, "onCreate() returned: hello world");
    }

}
