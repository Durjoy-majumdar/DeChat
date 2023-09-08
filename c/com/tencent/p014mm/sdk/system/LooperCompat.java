package com.tencent.p014mm.sdk.system;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;

/* renamed from: com.tencent.mm.sdk.system.LooperCompat */
public class LooperCompat {
    public static void addMainLooperIdleHandler(final MessageQueue.IdleHandler idleHandler) {
        if (idleHandler != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                Looper.getMainLooper().getQueue().addIdleHandler(idleHandler);
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                Looper.myQueue().addIdleHandler(idleHandler);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        Looper.myQueue().addIdleHandler(idleHandler);
                    }
                });
            }
        }
    }
}
