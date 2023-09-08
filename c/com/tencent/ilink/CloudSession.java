package com.tencent.ilink;

import com.tencent.ilink.network.Proto;
import pw3.C89441a;

public class CloudSession {
    private long callbackHandle = 0;
    private C89441a interfaceMap = new C89441a();
    private long nativeHandle = 0;

    public interface Callback {
        void onCancelCloudCgiRequestEvent(int i);

        int onLoginEvent();

        void onLogoutComplete(int i, int i2);

        void onSendCloudCgiRequestEvent(Proto.CloudCgiRequest cloudCgiRequest);
    }

    public CloudSession(long j) {
        jniCreateCloudSessionFromHandle(j);
    }

    private native void jniConfig(String str);

    private native void jniCreateCloudSessionFromHandle(long j);

    private native void jniDeleteNetworkManager(long j);

    private native void jniDestroyCloudSession();

    private native byte[] jniLockToUseCustomAuth();

    private native void jniLogoutAsync(int i);

    private native long jniNewNetworkManager();

    private native void jniNotifyAuthResult(int i, byte[] bArr);

    private native void jniReceiveCloudCgiResponse(int i, int i2, byte[] bArr);

    private native void jniReceiveCloudNotify(byte[] bArr);

    private native void jniSetCallback(Object obj);

    public void config(String str) {
        jniConfig(str);
    }

    public void deleteNetworkManager(NetworkManager networkManager) {
        jniDeleteNetworkManager(this.interfaceMap.mo123760a(networkManager));
    }

    public byte[] lockToUseCustomAuth() {
        return jniLockToUseCustomAuth();
    }

    public void logoutAsync(int i) {
        jniLogoutAsync(i);
    }

    public NetworkManager newNetworkManager() {
        return (NetworkManager) this.interfaceMap.mo123761b(jniNewNetworkManager(), NetworkManager.class.getName());
    }

    public void notifyAuthResult(int i, byte[] bArr) {
        jniNotifyAuthResult(i, bArr);
    }

    public void onDestroy() {
        jniDestroyCloudSession();
        this.nativeHandle = 0;
        this.callbackHandle = 0;
    }

    public void receiveCloudCgiResponse(int i, int i2, byte[] bArr) {
        jniReceiveCloudCgiResponse(i, i2, bArr);
    }

    public void receiveCloudNotify(byte[] bArr) {
        jniReceiveCloudNotify(bArr);
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }
}
