package com.tencent.wechat.aff.affroam;

public class AffRoamManager {
    private long callbackHandle = 0;
    private long nativeHandle = 0;

    public interface Callback {
        void onSayHelloComplete(int i, int i2, String str, String str2);
    }

    public AffRoamManager(String str) {
        jniCreateAffRoamManager(str);
    }

    private native void jniCreateAffRoamManager(String str);

    private native void jniCreateAffRoamManagerFromHandle(long j);

    private native void jniDestroyAffRoamManager();

    private native void jniSetCallback(Object obj);

    public void onDestroy() {
        jniDestroyAffRoamManager();
        this.nativeHandle = 0;
        this.callbackHandle = 0;
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }

    public AffRoamManager(long j) {
        jniCreateAffRoamManagerFromHandle(j);
    }
}
