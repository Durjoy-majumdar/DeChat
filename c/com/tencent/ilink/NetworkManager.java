package com.tencent.ilink;

import com.tencent.ilink.network.Proto;

public class NetworkManager {
    private long callbackHandle = 0;
    private long nativeHandle = 0;

    public interface Callback {
        void onAppSessionTimeoutEvent();

        void onC2CDownloadComplete(int i, Proto.IlinkC2CDownloadResult ilinkC2CDownloadResult);

        void onC2CDownloadProgress(int i, long j, long j2);

        void onC2CUploadComplete(int i, Proto.IlinkC2CUploadResult ilinkC2CUploadResult);

        void onC2CUploadProgress(int i, long j, long j2);

        void onReceiveAppMessageEvent(Proto.IlinkBypassMsgList ilinkBypassMsgList);

        void onReceiveNotifyEvent(int i, byte[] bArr);

        void onReceiveSyncMessageEvent(int i, byte[] bArr);

        void onRequestCheckResourceComplete(int i, int i2, byte[] bArr);

        void onRequestUploadLogEvent(byte[] bArr);

        void onSendRequestComplete(int i, int i2, byte[] bArr);

        void onUpdatePushTokenComplete(int i, int i2, byte[] bArr, int i3);
    }

    public NetworkManager(String str, long j) {
        jniCreateNetworkManager(str, j);
    }

    private native void jniC2CDownloadAsync(int i, byte[] bArr);

    private native void jniC2CUploadAsync(int i, byte[] bArr);

    private native void jniCancelAllTask();

    private native void jniCancelC2CDownload(int i);

    private native void jniCancelC2CUpload(int i);

    private native void jniCancelTask(int i);

    private native void jniCreateNetworkManager(String str, long j);

    private native void jniCreateNetworkManagerFromHandle(long j);

    private native void jniDestroyNetworkManager();

    private native int jniGenTaskId();

    private native long jniRealUin();

    private native void jniRequestCheckResourceAsync(int i, byte[] bArr);

    private native void jniRequestUploadLog(int i, int i2);

    private native void jniSendRequestAsync(int i, byte[] bArr);

    private native void jniSetCallback(Object obj);

    private native void jniSetSmcBaseInfo(byte[] bArr);

    private native void jniSetSmcUin(int i);

    private native long jniShowUin();

    private native void jniSmcFlush();

    private native void jniSubscribeNotify(int[] iArr);

    private native void jniSubscribeSyncMessage(int[] iArr);

    private native void jniUnsubscribeNotify(int[] iArr);

    private native void jniUnsubscribeSyncMessage(int[] iArr);

    private native void jniUpdateAppSession(byte[] bArr, int i);

    private native void jniUpdatePushTokenAsync(int i, byte[] bArr);

    private native void jniWriteKvData(byte[] bArr);

    public void c2CDownloadAsync(int i, Proto.IlinkC2CDownload ilinkC2CDownload) {
        jniC2CDownloadAsync(i, ilinkC2CDownload.toByteArray());
    }

    public void c2CUploadAsync(int i, Proto.IlinkC2CUpload ilinkC2CUpload) {
        jniC2CUploadAsync(i, ilinkC2CUpload.toByteArray());
    }

    public void cancelAllTask() {
        jniCancelAllTask();
    }

    public void cancelC2CDownload(int i) {
        jniCancelC2CDownload(i);
    }

    public void cancelC2CUpload(int i) {
        jniCancelC2CUpload(i);
    }

    public void cancelTask(int i) {
        jniCancelTask(i);
    }

    public int genTaskId() {
        return jniGenTaskId();
    }

    public void onDestroy() {
        jniDestroyNetworkManager();
        this.nativeHandle = 0;
        this.callbackHandle = 0;
    }

    public long realUin() {
        return jniRealUin();
    }

    public void requestCheckResourceAsync(int i, Proto.ResourceRequestInfo resourceRequestInfo) {
        jniRequestCheckResourceAsync(i, resourceRequestInfo.toByteArray());
    }

    public void requestUploadLog(int i, int i2) {
        jniRequestUploadLog(i, i2);
    }

    public void sendRequestAsync(int i, Proto.IlinkRequestInfo ilinkRequestInfo) {
        jniSendRequestAsync(i, ilinkRequestInfo.toByteArray());
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }

    public void setSmcBaseInfo(Proto.IlinkSmcBaseInfo ilinkSmcBaseInfo) {
        jniSetSmcBaseInfo(ilinkSmcBaseInfo.toByteArray());
    }

    public void setSmcUin(int i) {
        jniSetSmcUin(i);
    }

    public long showUin() {
        return jniShowUin();
    }

    public void smcFlush() {
        jniSmcFlush();
    }

    public void subscribeNotify(int[] iArr) {
        jniSubscribeNotify(iArr);
    }

    public void subscribeSyncMessage(int[] iArr) {
        jniSubscribeSyncMessage(iArr);
    }

    public void unsubscribeNotify(int[] iArr) {
        jniUnsubscribeNotify(iArr);
    }

    public void unsubscribeSyncMessage(int[] iArr) {
        jniUnsubscribeSyncMessage(iArr);
    }

    public void updateAppSession(byte[] bArr, Proto.IlinkAppSessionType ilinkAppSessionType) {
        jniUpdateAppSession(bArr, ilinkAppSessionType.getNumber());
    }

    public void updatePushTokenAsync(int i, byte[] bArr) {
        jniUpdatePushTokenAsync(i, bArr);
    }

    public void writeKvData(Proto.IlinkKvReportInfo ilinkKvReportInfo) {
        jniWriteKvData(ilinkKvReportInfo.toByteArray());
    }

    public NetworkManager(long j) {
        jniCreateNetworkManagerFromHandle(j);
    }
}
