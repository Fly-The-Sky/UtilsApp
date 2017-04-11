package com.syc.utilsapp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Hunter
 * Describe
 * on 2017/4/6.
 */

public class MyApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
    }


    /**
     * 重启当前应用
     */
    public static void restart() {
        final Intent intent = mContext.getPackageManager().getLaunchIntentForPackage(mContext.getPackageName());
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        mContext.startActivity(intent);
    }

    //以下属性应用于整个应用程序，合理利用资源，减少资源浪费
    private static Context mContext;//上下文
    private static Thread mMainThread;//主线程
    private static long mMainThreadId;//主线程id
    private static Looper mMainLooper;//循环队列
    private static Handler mHandler;//主线程Handler

    public static Context getmContext() {
        return mContext.getApplicationContext();
    }

    public static void setContext(Context mContext) {
        MyApp.mContext = mContext;
    }

    public static Thread getMainThread() {
        return mMainThread;
    }

    public static void setMainThread(Thread mMainThread) {
        MyApp.mMainThread = mMainThread;
    }

    public static long getMainThreadId() {
        return mMainThreadId;
    }

    public static void setMainThreadId(long mMainThreadId) {
        MyApp.mMainThreadId = mMainThreadId;
    }

    public static Looper getMainThreadLooper() {
        return mMainLooper;
    }

    public static void setMainLooper(Looper mMainLooper) {
        MyApp.mMainLooper = mMainLooper;
    }

    public static Handler getMainHandler() {
        return mHandler;
    }

    public static void setMainHandler(Handler mHandler) {
        MyApp.mHandler = mHandler;
    }


    public static List<Activity> activities = new LinkedList<Activity>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    /**
     * 完全退出
     */
    public static void exit() {
        for (Activity activity : activities) {
            activity.finish();
        }
    }
}
