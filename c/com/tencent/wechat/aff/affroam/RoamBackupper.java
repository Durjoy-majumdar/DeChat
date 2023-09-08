package com.tencent.wechat.aff.affroam;

import com.google.protobuf.C23922p0;
import com.tencent.wechat.aff.affroam.AffRoamProto;
import java.util.ArrayList;
import java.util.Iterator;

public class RoamBackupper {
    private long callbackHandle = 0;
    private long nativeHandle = 0;

    public interface Callback {
        void onBackupResultEvent(int i, String str);

        void onBackupperStateChangeEvent(String str, AffRoamProto.RoamBackupperState roamBackupperState);

        void onConnectDeviceComplete(int i, int i2, String str, String str2);

        void onDeleteAllBackupDataComplete(int i, int i2);

        void onDeleteBackupDataComplete(int i, int i2);

        void onDeviceDisconnectedEvent(int i, String str);

        void onDeviceDiscoveredEvent(String str, String str2, String str3, int i, boolean z, String str4, int i2);

        void onGetBackedUpConversationListComplete(int i, int i2, AffRoamProto.BackedUpConversationsInfo backedUpConversationsInfo);

        AffRoamProto.RoamPackage onGetChatRoamPackageEvent(String str, long j, long j2, long j3, int i);

        void onGetStorageServerInfoComplete(int i, int i2, AffRoamProto.StorageServerInfo storageServerInfo);

        void onNotifyBackupProgressEvent(int i, int i2);

        void onNotifyRestoreProgressEvent(int i, int i2);

        void onNotifyRoamFileEncKeyResultComplete(int i);

        void onNotifyTunnelCryptoInfoResultComplete(int i);

        void onPauseComplete(int i, int i2, String str);

        void onRequireRoamFileEncKeyEvent(long j, boolean z);

        void onRequireTunnelCryptoInfoEvent(String str);

        void onRestoreConversationCompleteEvent(String str);

        void onRestoreResultEvent(int i, String str);

        void onRestoreRoamPackageCompleteEvent(String str, AffRoamProto.RoamPackage roamPackage);

        void onResumeComplete(int i);

        void onResumeResultEvent(int i, String str);

        void onStartBackupComplete(int i, String str);

        void onStartRestoreComplete(int i, String str);

        void onStopComplete(int i, int i2, String str);
    }

    public RoamBackupper() {
        jniCreateRoamBackupper();
    }

    private native ArrayList<byte[]> jniCheckIncompleteTask();

    private native void jniConnectDeviceAsync(int i, String str);

    private native void jniCreateRoamBackupper();

    private native void jniCreateRoamBackupperFromHandle(long j);

    private native void jniDeleteAllBackupDataAsync(int i);

    private native void jniDeleteBackupDataAsync(int i, String[] strArr, long j, long j2);

    private native void jniDestroyRoamBackupper();

    private native void jniDisconnectDevice();

    private native int jniEnableCrypto(boolean z, boolean z2);

    private native byte[] jniGetAutoBackupConversations(String str);

    private native int jniGetAutoBackupRange(String str);

    private native void jniGetBackedUpConversationListAsync(int i, long j, long j2);

    private native float jniGetBackupRestoreProgress();

    private native int jniGetBackupperState(String str);

    private native String jniGetCurAutoBackupDevice();

    private native int jniGetCurDeviceType();

    private native byte[] jniGetReportData();

    private native void jniGetStorageServerInfoAsync(int i, String str);

    private native byte[] jniGetTransferStats();

    private native int jniInit(String str, String str2);

    private native void jniNotifyRoamFileEncKeyResultAsync(int i, int i2, boolean z, byte[] bArr);

    private native void jniNotifyTunnelCryptoInfoResultAsync(int i, String str);

    private native void jniPauseAsync(int i);

    private native void jniResumeAsync(int i, String str);

    private native void jniScanDevices(int i);

    private native int jniSetAutoBackupConversations(String str, String[] strArr);

    private native int jniSetAutoBackupRange(String str, int i);

    private native void jniSetCallback(Object obj);

    private native void jniStartBackupAsync(int i, String[] strArr, long j, long j2, boolean z, boolean z2, long j3, String str);

    private native void jniStartRestoreAsync(int i, String[] strArr, long[] jArr, long[] jArr2);

    private native void jniStopAsync(int i, String str);

    private native int jniUnInit();

    public ArrayList<AffRoamProto.IncompleteTaskInfo> checkIncompleteTask() {
        ArrayList<byte[]> jniCheckIncompleteTask = jniCheckIncompleteTask();
        ArrayList<AffRoamProto.IncompleteTaskInfo> arrayList = new ArrayList<>();
        Iterator<byte[]> it = jniCheckIncompleteTask.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(AffRoamProto.IncompleteTaskInfo.parseFrom(it.next()));
            } catch (C23922p0 unused) {
            }
        }
        return arrayList;
    }

    public void connectDeviceAsync(int i, String str) {
        jniConnectDeviceAsync(i, str);
    }

    public void deleteAllBackupDataAsync(int i) {
        jniDeleteAllBackupDataAsync(i);
    }

    public void deleteBackupDataAsync(int i, String[] strArr, long j, long j2) {
        jniDeleteBackupDataAsync(i, strArr, j, j2);
    }

    public void disconnectDevice() {
        jniDisconnectDevice();
    }

    public int enableCrypto(boolean z, boolean z2) {
        return jniEnableCrypto(z, z2);
    }

    public AffRoamProto.StringList getAutoBackupConversations(String str) {
        try {
            return AffRoamProto.StringList.parseFrom(jniGetAutoBackupConversations(str));
        } catch (C23922p0 unused) {
            return null;
        }
    }

    public int getAutoBackupRange(String str) {
        return jniGetAutoBackupRange(str);
    }

    public void getBackedUpConversationListAsync(int i, long j, long j2) {
        jniGetBackedUpConversationListAsync(i, j, j2);
    }

    public float getBackupRestoreProgress() {
        return jniGetBackupRestoreProgress();
    }

    public AffRoamProto.RoamBackupperState getBackupperState(String str) {
        return AffRoamProto.RoamBackupperState.forNumber(jniGetBackupperState(str));
    }

    public String getCurAutoBackupDevice() {
        return jniGetCurAutoBackupDevice();
    }

    public AffRoamProto.DeviceType getCurDeviceType() {
        return AffRoamProto.DeviceType.forNumber(jniGetCurDeviceType());
    }

    public AffRoamProto.ReportData getReportData() {
        try {
            return AffRoamProto.ReportData.parseFrom(jniGetReportData());
        } catch (C23922p0 unused) {
            return null;
        }
    }

    public void getStorageServerInfoAsync(int i, String str) {
        jniGetStorageServerInfoAsync(i, str);
    }

    public AffRoamProto.TransferStats getTransferStats() {
        try {
            return AffRoamProto.TransferStats.parseFrom(jniGetTransferStats());
        } catch (C23922p0 unused) {
            return null;
        }
    }

    public int init(String str, String str2) {
        return jniInit(str, str2);
    }

    public void notifyRoamFileEncKeyResultAsync(int i, int i2, boolean z, AffRoamProto.RoamFileEncKeyList roamFileEncKeyList) {
        jniNotifyRoamFileEncKeyResultAsync(i, i2, z, roamFileEncKeyList.toByteArray());
    }

    public void notifyTunnelCryptoInfoResultAsync(int i, String str) {
        jniNotifyTunnelCryptoInfoResultAsync(i, str);
    }

    public void onDestroy() {
        jniDestroyRoamBackupper();
        this.nativeHandle = 0;
        this.callbackHandle = 0;
    }

    public void pauseAsync(int i) {
        jniPauseAsync(i);
    }

    public void resumeAsync(int i, String str) {
        jniResumeAsync(i, str);
    }

    public void scanDevices(int i) {
        jniScanDevices(i);
    }

    public int setAutoBackupConversations(String str, String[] strArr) {
        return jniSetAutoBackupConversations(str, strArr);
    }

    public int setAutoBackupRange(String str, int i) {
        return jniSetAutoBackupRange(str, i);
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }

    public void startBackupAsync(int i, String[] strArr, long j, long j2, boolean z, boolean z2, long j3, String str) {
        jniStartBackupAsync(i, strArr, j, j2, z, z2, j3, str);
    }

    public void startRestoreAsync(int i, String[] strArr, long[] jArr, long[] jArr2) {
        jniStartRestoreAsync(i, strArr, jArr, jArr2);
    }

    public void stopAsync(int i, String str) {
        jniStopAsync(i, str);
    }

    public int unInit() {
        return jniUnInit();
    }

    public RoamBackupper(long j) {
        jniCreateRoamBackupperFromHandle(j);
    }
}
