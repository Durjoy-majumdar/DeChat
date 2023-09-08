package com.tencent.youtu.ytcommon.tools;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class YTThreadOperate {
    private static ExecutorService mExecutorService = Executors.newFixedThreadPool(3);
    /* access modifiers changed from: private */
    public static Handler mHandler = new Handler(Looper.getMainLooper());

    public interface UiThreadCallback<T> {
        void callback(T t);
    }

    public static void runOnSubThread(final Runnable runnable) {
        mExecutorService.submit(new Runnable() {
            public void run() {
                runnable.run();
            }
        });
    }

    public static void runOnUiThread(Runnable runnable) {
        mHandler.post(runnable);
    }

    public static void runOnUiThreadDelay(Runnable runnable, long j) {
        mHandler.postDelayed(runnable, j);
    }

    public static <T> Future<T> runOnSubThread(final Callable<T> callable) {
        return mExecutorService.submit(new Callable<T>() {
            public T call() {
                try {
                    return callable.call();
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    public static <T> void runOnSubThread(final Callable<T> callable, final UiThreadCallback<T> uiThreadCallback) {
        mExecutorService.submit(new Runnable() {
            public void run() {
                final Object obj;
                try {
                    obj = callable.call();
                } catch (Exception unused) {
                    obj = null;
                }
                YTThreadOperate.mHandler.post(new Runnable() {
                    public void run() {
                        UiThreadCallback uiThreadCallback = uiThreadCallback;
                        if (uiThreadCallback != null) {
                            try {
                                uiThreadCallback.callback(obj);
                            } catch (Exception e) {
                                YTException.report(e);
                            }
                        }
                    }
                });
            }
        });
    }
}
