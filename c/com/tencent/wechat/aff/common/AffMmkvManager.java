package com.tencent.wechat.aff.common;

public class AffMmkvManager {
    private static AffMmkvManager instance = new AffMmkvManager();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    public interface Callback {
        void onGetBoolComplete(long j, boolean z);

        void onGetInt32Complete(long j, int i);

        void onGetStringComplete(long j, String str);

        void onSetBoolComplete(long j, boolean z);

        void onSetInt32Complete(long j, boolean z);

        void onSetStringComplete(long j, boolean z);
    }

    private AffMmkvManager() {
        jniCreateAffMmkvManager();
    }

    public static AffMmkvManager getInstance() {
        return instance;
    }

    private native void jniCreateAffMmkvManager();

    private native void jniGetBoolAsync(long j, String str, boolean z, String str2);

    private native void jniGetInt32Async(long j, String str, int i, String str2);

    private native void jniGetStringAsync(long j, String str, String str2, String str3);

    private native void jniSetBoolAsync(long j, String str, boolean z, String str2);

    private native void jniSetCallback(Object obj);

    private native void jniSetInt32Async(long j, String str, int i, String str2);

    private native void jniSetStringAsync(long j, String str, String str2, String str3);

    public void getBoolAsync(long j, String str, boolean z, String str2) {
        jniGetBoolAsync(j, str, z, str2);
    }

    public void getInt32Async(long j, String str, int i, String str2) {
        jniGetInt32Async(j, str, i, str2);
    }

    public void getStringAsync(long j, String str, String str2, String str3) {
        jniGetStringAsync(j, str, str2, str3);
    }

    public void setBoolAsync(long j, String str, boolean z, String str2) {
        jniSetBoolAsync(j, str, z, str2);
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }

    public void setInt32Async(long j, String str, int i, String str2) {
        jniSetInt32Async(j, str, i, str2);
    }

    public void setStringAsync(long j, String str, String str2, String str3) {
        jniSetStringAsync(j, str, str2, str3);
    }
}
