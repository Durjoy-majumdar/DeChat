package com.tencent.ilink;

import pw3.C89441a;

public class AppDeviceSession {
    private C89441a interfaceMap = new C89441a();
    private long nativeHandle = 0;

    public AppDeviceSession(long j) {
        jniCreateAppDeviceSessionFromHandle(j);
    }

    private native String jniAppId();

    private native void jniCreateAppDeviceSessionFromHandle(long j);

    private native void jniDeleteNetworkManager(long j);

    private native void jniDestroyAppDeviceSession();

    private native long jniGetAuthManager();

    private native long jniIdent();

    private native long jniNewNetworkManager();

    public String appId() {
        return jniAppId();
    }

    public void deleteNetworkManager(NetworkManager networkManager) {
        jniDeleteNetworkManager(this.interfaceMap.mo123760a(networkManager));
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
        jniDestroyAppDeviceSession();
        this.nativeHandle = 0;
    }
}
