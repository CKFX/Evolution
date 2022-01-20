package com.sxb.evolution;

import android.app.Application;
import android.content.Context;

/**
 * 方便获取context对象,在AndroidManifest中也需要设置才能生效
 */
public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        //获取context
        mContext = getApplicationContext();
    }
    //创建一个静态的方法，以便获取context对象
    public static Context getContext(){
        return mContext;
    }
}