package com.tencent.thumbplayer.tmediacodec.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ThreadManager {
    private static final Handler mHandler = new Handler(Looper.getMainLooper());
    private static final HandlerThread mHandlerThread;
    private static final ExecutorService mThreadPool = Executors.newCachedThreadPool();
    private static Handler sSubHandler;

    static {
        HandlerThread handlerThread = new HandlerThread("tmediacodec-sub");
        mHandlerThread = handlerThread;
        handlerThread.start();
        sSubHandler = new Handler(handlerThread.getLooper());
    }

    private ThreadManager() {
    }

    public static void execute(Runnable runnable) {
        mThreadPool.execute(runnable);
    }

    public static void postOnSubThread(Runnable runnable) {
        sSubHandler.post(runnable);
    }

    public static void runOnSubThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mThreadPool.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnUiThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            mHandler.post(runnable);
        }
    }
}
