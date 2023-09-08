package com.tencent.wechat.aff;

public class IlinkAuthKeeper {
    private static IlinkAuthKeeper instance = new IlinkAuthKeeper();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    public interface Callback {
        void onCheckLoginQrCodeComplete(long j, int i, int i2);

        void onLoginComplete(long j, int i, long j2);

        void onLogoutComplete(long j, int i);

        void onRequestLoginQrcodeComplete(long j, int i, String str);

        void onRequireAuthCodeEvent();

        void onTryAutoLoginComplete(long j, int i, long j2);

        void onUploadLogCompleteEvent(int i);
    }

    private IlinkAuthKeeper() {
        jniCreateIlinkAuthKeeper();
    }

    public static IlinkAuthKeeper getInstance() {
        return instance;
    }

    private native void jniCheckLoginQrCodeAsync(long j);

    private native void jniCreateIlinkAuthKeeper();

    private native void jniInitialize(String str, int i, int i2);

    private native void jniLoginAsync(long j);

    private native void jniLogoutAsync(long j);

    private native void jniNotifyGetAuthCodeComplete(int i, String str);

    private native void jniRequestLoginQrcodeAsync(long j);

    private native void jniRequestUploadLog(int i, int i2);

    private native void jniSetCallback(Object obj);

    private native void jniTryAutoLoginAsync(long j);

    private native void jniUnInitialize();

    public void checkLoginQrCodeAsync(long j) {
        jniCheckLoginQrCodeAsync(j);
    }

    public void initialize(String str, int i, int i2) {
        jniInitialize(str, i, i2);
    }

    public void loginAsync(long j) {
        jniLoginAsync(j);
    }

    public void logoutAsync(long j) {
        jniLogoutAsync(j);
    }

    public void notifyGetAuthCodeComplete(int i, String str) {
        jniNotifyGetAuthCodeComplete(i, str);
    }

    public void requestLoginQrcodeAsync(long j) {
        jniRequestLoginQrcodeAsync(j);
    }

    public void requestUploadLog(int i, int i2) {
        jniRequestUploadLog(i, i2);
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }

    public void tryAutoLoginAsync(long j) {
        jniTryAutoLoginAsync(j);
    }

    public void unInitialize() {
        jniUnInitialize();
    }
}
