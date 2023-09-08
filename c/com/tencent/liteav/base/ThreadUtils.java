package com.tencent.liteav.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadUtils {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object sLock = new Object();
    private static boolean sThreadAssertsDisabled;
    private static Handler sUiThreadHandler;
    private static boolean sWillOverride;

    public static void assertOnBackgroundThread() {
    }

    public static void assertOnUiThread() {
    }

    public static void checkUiThread() {
        if (!sThreadAssertsDisabled && !runningOnUiThread()) {
            throw new IllegalStateException("Must be called on the UI thread.");
        }
    }

    public static Handler getUiThreadHandler() {
        Handler handler;
        synchronized (sLock) {
            if (sUiThreadHandler == null) {
                if (!sWillOverride) {
                    sUiThreadHandler = new Handler(Looper.getMainLooper());
                } else {
                    throw new RuntimeException("Did not yet override the UI thread");
                }
            }
            handler = sUiThreadHandler;
        }
        return handler;
    }

    public static Looper getUiThreadLooper() {
        return getUiThreadHandler().getLooper();
    }

    private static boolean isThreadPriorityAudio(int i) {
        return Process.getThreadPriority(i) == -16;
    }

    @Deprecated
    public static <T> FutureTask<T> postOnUiThread(FutureTask<T> futureTask) {
        getUiThreadHandler().post(futureTask);
        return futureTask;
    }

    @Deprecated
    public static void postOnUiThreadDelayed(Runnable runnable, long j) {
        getUiThreadHandler().postDelayed(runnable, j);
    }

    @Deprecated
    public static <T> FutureTask<T> runOnUiThread(FutureTask<T> futureTask) {
        if (runningOnUiThread()) {
            futureTask.run();
        } else {
            postOnUiThread(futureTask);
        }
        return futureTask;
    }

    @Deprecated
    public static void runOnUiThreadBlocking(Runnable runnable) {
        if (runningOnUiThread()) {
            runnable.run();
            return;
        }
        FutureTask futureTask = new FutureTask(runnable, (Object) null);
        postOnUiThread(futureTask);
        try {
            futureTask.get();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while waiting for runnable", e);
        }
    }

    @Deprecated
    public static <T> T runOnUiThreadBlockingNoException(Callable<T> callable) {
        try {
            return runOnUiThreadBlocking(callable);
        } catch (ExecutionException e) {
            throw new RuntimeException("Error occurred waiting for callable", e);
        }
    }

    public static boolean runningOnUiThread() {
        return getUiThreadHandler().getLooper() == Looper.myLooper();
    }

    public static void setThreadAssertsDisabledForTesting(boolean z) {
        sThreadAssertsDisabled = z;
    }

    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }

    public static void setUiThread(Looper looper) {
        synchronized (sLock) {
            if (looper == null) {
                sUiThreadHandler = null;
                return;
            }
            Handler handler = sUiThreadHandler;
            if (handler != null) {
                if (handler.getLooper() != looper) {
                    throw new RuntimeException("UI thread looper is already set to " + sUiThreadHandler.getLooper() + " (Main thread looper is " + Looper.getMainLooper() + "), cannot set to new looper " + looper);
                }
            }
            sUiThreadHandler = new Handler(looper);
        }
    }

    public static void setWillOverrideUiThread(boolean z) {
        synchronized (sLock) {
            sWillOverride = z;
        }
    }

    @Deprecated
    public static void postOnUiThread(Runnable runnable) {
        getUiThreadHandler().post(runnable);
    }

    @Deprecated
    public static <T> FutureTask<T> runOnUiThread(Callable<T> callable) {
        return runOnUiThread(new FutureTask(callable));
    }

    @Deprecated
    public static void runOnUiThread(Runnable runnable) {
        if (runningOnUiThread()) {
            runnable.run();
        } else {
            getUiThreadHandler().post(runnable);
        }
    }

    @Deprecated
    public static <T> T runOnUiThreadBlocking(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        runOnUiThread(futureTask);
        try {
            return futureTask.get();
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupted waiting for callable", e);
        }
    }
}
