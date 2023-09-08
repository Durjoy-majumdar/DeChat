package com.tencent.ilink;

import pw3.C89441a;

public class AppSession {
    private long callbackHandle = 0;
    private C89441a interfaceMap = new C89441a();
    private long nativeHandle = 0;

    public interface Callback {
        void onSessionTimeoutEvent();
    }

    public AppSession(long j) {
        jniCreateAppSessionFromHandle(j);
    }

    private native String jniAppId();

    private native void jniCreateAppSessionFromHandle(long j);

    private native void jniDeleteNetworkManager(long j);

    private native void jniDestroyAppSession();

    private native void jniDisableAppMsgBypass();

    private native long jniGetAuthManager();

    private native long jniIdent();

    private native long jniNewNetworkManager();

    private native void jniSetCallback(Object obj);

    private native void jniStartSync();

    public String appId() {
        return jniAppId();
    }

    public void deleteNetworkManager(NetworkManager networkManager) {
        jniDeleteNetworkManager(this.interfaceMap.mo123760a(networkManager));
    }

    public void disableAppMsgBypass() {
        jniDisableAppMsgBypass();
    }

    public AuthManager getAuthManager() {
        return (AuthManager) this.interfaceMap.mo123761b(jniGetAuthManager(), AuthManager.class.getName());
    }

    public long ident() {
        return jniIdent();
    }

    public NetworkManager newNetworkManager() {
        return (NetworkManager) this.interfaceMap.mo123761b(jniNewNetworkManager(), NetworkManager.class.getName());
    }

    public void onDestroy() {
        jniDestroyAppSession();
        this.nativeHandle = 0;
        this.callbackHandle = 0;
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }

    public void startSync() {
        jniStartSync();
    }
}
