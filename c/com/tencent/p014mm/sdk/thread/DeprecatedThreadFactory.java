package com.tencent.p014mm.sdk.thread;

import android.os.HandlerThread;

@Deprecated
/* renamed from: com.tencent.mm.sdk.thread.DeprecatedThreadFactory */
public class DeprecatedThreadFactory {
    private static final String TAG = "[D]";

    @Deprecated
    public static HandlerThread createHandlerThread(String str) {
        HandlerThread handlerThread = new HandlerThread("[D]#" + str);
        handlerThread.start();
        return handlerThread;
    }
}
