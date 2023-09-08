package com.tencent.wechat.aff.common;

public class AffAccountManager {
    private static AffAccountManager instance = new AffAccountManager();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    public interface Callback {
        void onAccountLoginAsyncComplete(long j);

        void onAccountLogoutAsyncComplete(long j);

        void onLogoutEvent();
    }

    private AffAccountManager() {
        jniCreateAffAccountManager();
    }

    public static AffAccountManager getInstance() {
        return instance;
    }

    private native void jniAccountLogin(String str, String str2);

    private native void jniAccountLoginAsyncAsync(long j, String str, String str2);

    private native void jniAccountLogout(String str);

    private native void jniAccountLogoutAsyncAsync(long j, String str);

    private native void jniCreateAffAccountManager();

    private native String jniCurrentUin();

    private native boolean jniIsLogin();

    private native void jniSetCallback(Object obj);

    public void accountLogin(String str, String str2) {
        jniAccountLogin(str, str2);
    }

    public void accountLoginAsyncAsync(long j, String str, String str2) {
        jniAccountLoginAsyncAsync(j, str, str2);
    }

    public void accountLogout(String str) {
        jniAccountLogout(str);
    }

    public void accountLogoutAsyncAsync(long j, String str) {
        jniAccountLogoutAsyncAsync(j, str);
    }

    public String currentUin() {
        return jniCurrentUin();
    }

    public boolean isLogin() {
        return jniIsLogin();
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }
}
