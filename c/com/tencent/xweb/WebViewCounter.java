package com.tencent.xweb;

import com.tencent.xweb.util.XWebLog;

public class WebViewCounter {
    public static final String TAG = "WebViewCounter";
    private static volatile int sCount;

    public static synchronized void decrease() {
        synchronized (WebViewCounter.class) {
            sCount--;
            XWebLog.m21911i(TAG, "decrease, count:" + sCount);
        }
    }

    public static synchronized int getCount() {
        int i;
        synchronized (WebViewCounter.class) {
            i = sCount;
        }
        return i;
    }

    public static synchronized void increase() {
        synchronized (WebViewCounter.class) {
            sCount++;
            XWebLog.m21911i(TAG, "increase, count:" + sCount);
        }
    }
}
