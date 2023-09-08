package com.tencent.ilink;

import pw3.C89441a;

public class DeviceSession {
    private long callbackHandle = 0;
    private C89441a interfaceMap = new C89441a();
    private long nativeHandle = 0;

    public interface Callback {
        void onLonglinkConnectedEvent();

        void onLonglinkDisconnectedEvent();

        void onSessionTimeoutEvent();
    }

    public DeviceSession(long j) {
        jniCreateDeviceSessionFromHandle(j);
    }

    private native void jniCreateDeviceSessionFromHandle(long j);

    private native void jniDeleteNetworkManager(long j);

    private native void jniDestroyDeviceSession();

    private native long jniGetAuthManager();

    private native long jniIdent();

    private native long jniNewNetworkManager();

    private native void jniSetCallback(Object obj);

    private native void jniStartSync();

    private native void jniUpdateSession(byte[] bArr);

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
        jniDestroyDeviceSession();
        this.nativeHandle = 0;
        this.callbackHandle = 0;
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }

    public void startSync() {
        jniStartSync();
    }

    public void updateSession(byte[] bArr) {
        jniUpdateSession(bArr);
    }
}
