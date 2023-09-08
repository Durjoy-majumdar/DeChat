package com.tencent.wechat.aff.ting;

public class AffTingReportManager {
    private static AffTingReportManager instance = new AffTingReportManager();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    public interface Callback {
        void onKvStatComplete(int i);

        void onTestEvent();
    }

    private AffTingReportManager() {
        jniCreateAffTingReportManager();
    }

    public static AffTingReportManager getInstance() {
        return instance;
    }

    private native void jniCreateAffTingReportManager();

    private native void jniKvStatAsync(int i, int i2, String str);

    private native void jniSetCallback(Object obj);

    public void kvStatAsync(int i, int i2, String str) {
        jniKvStatAsync(i, i2, str);
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }
}
