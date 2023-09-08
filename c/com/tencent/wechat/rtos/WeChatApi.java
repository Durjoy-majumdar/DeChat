package com.tencent.wechat.rtos;

public class WeChatApi {
    private long callbackHandle = 0;
    private long nativeHandle = 0;

    public interface Callback {
        void onCancelLoginEvent();

        void onCannotLoginEvent();

        void onChannelHandshakeSuccessEvent();

        void onCloseChannelEvent(long j);

        void onCloudHandShakeEvent(int i, String str);

        String onGetExtSpamInfoEvent(int i);

        int onGetLicenseEvent(String str, String str2);

        String onGetLoginAvatarEvent();

        boolean onIsForegroundEvent();

        boolean onIsPhysicalLinkConnectedEvent();

        void onListenServiceEvent(String str);

        void onLoginResultEvent(int i);

        void onLogoutEvent();

        boolean onRequestUseCloudHandShakeEvent();

        void onWriteChannelDataEvent(long j, byte[] bArr);

        boolean onisNetworkConnectedEvent();
    }

    public WeChatApi() {
        jniCreateWeChatApi();
    }

    private native void jniCancelLogin();

    private native void jniCloudHandShakeEnd(int i, int i2, String str);

    private native void jniCreateWeChatApi();

    private native void jniCreateWeChatApi(long j);

    private native void jniDestroyWeChatApi();

    private native void jniLogout();

    private native void jniNotifyChannelData(long j, byte[] bArr);

    private native void jniNotifyChannelDisconnected(long j);

    private native void jniNotifyForegroundChanged(boolean z);

    private native void jniNotifyNetworkChanged();

    private native void jniNotifyNewChannelConnected(long j, int i);

    private native void jniNotifyNewMessage(String str);

    private native void jniNotifyPhysicalLinkStateChanged(boolean z);

    private native void jniNotifyUnbindWechat();

    private native void jniOnGetOAuthTicket(String str, byte[] bArr);

    private native void jniRequireLogin(String str);

    private native void jniSetCallback(Object obj);

    private native void jniSetFastReplies(String[] strArr);

    private native void jniStart(byte[] bArr);

    private native void jniStop();

    private native int jniTryAutoLogin(String str);

    private native void jniUpdateDeviceName(String str);

    private native void jniUploadXlog(int i);

    public void cancelLogin() {
        jniCancelLogin();
    }

    public void cloudHandShakeEnd(int i, int i2, String str) {
        jniCloudHandShakeEnd(i, i2, str);
    }

    public void logout() {
        jniLogout();
    }

    public void notifyChannelData(long j, byte[] bArr) {
        jniNotifyChannelData(j, bArr);
    }

    public void notifyChannelDisconnected(long j) {
        jniNotifyChannelDisconnected(j);
    }

    public void notifyForegroundChanged(boolean z) {
        jniNotifyForegroundChanged(z);
    }

    public void notifyNetworkChanged() {
        jniNotifyNetworkChanged();
    }

    public void notifyNewChannelConnected(long j, int i) {
        jniNotifyNewChannelConnected(j, i);
    }

    public void notifyNewMessage(String str) {
        jniNotifyNewMessage(str);
    }

    public void notifyPhysicalLinkStateChanged(boolean z) {
        jniNotifyPhysicalLinkStateChanged(z);
    }

    public void notifyUnbindWechat() {
        jniNotifyUnbindWechat();
    }

    public void onDestroy() {
        jniDestroyWeChatApi();
        this.nativeHandle = 0;
        this.callbackHandle = 0;
    }

    public void onGetOAuthTicket(String str, byte[] bArr) {
        jniOnGetOAuthTicket(str, bArr);
    }

    public void requireLogin(String str) {
        jniRequireLogin(str);
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }

    public void setFastReplies(String[] strArr) {
        jniSetFastReplies(strArr);
    }

    public void start(byte[] bArr) {
        jniStart(bArr);
    }

    public void stop() {
        jniStop();
    }

    public int tryAutoLogin(String str) {
        return jniTryAutoLogin(str);
    }

    public void updateDeviceName(String str) {
        jniUpdateDeviceName(str);
    }

    public void uploadXlog(int i) {
        jniUploadXlog(i);
    }

    public WeChatApi(long j) {
        jniCreateWeChatApi(j);
    }
}
