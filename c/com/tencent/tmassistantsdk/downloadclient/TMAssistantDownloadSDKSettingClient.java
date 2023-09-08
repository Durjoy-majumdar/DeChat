package com.tencent.tmassistantsdk.downloadclient;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback;
import com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface;

public class TMAssistantDownloadSDKSettingClient extends TMAssistantDownloadSDKClientBase {
    public static final String DOWNDLOADSDKSERVICENAME = "com.tencent.TMAssistantDownloadSDKService";

    public TMAssistantDownloadSDKSettingClient(Context context, String str) {
        super(context, str, DOWNDLOADSDKSERVICENAME);
    }

    public Intent getBindServiceIntent() {
        return new Intent(this.mContext, Class.forName(this.mDwonloadServiceName));
    }

    public synchronized int getVersion() {
        ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
        if (iTMAssistantDownloadSDKServiceInterface != null) {
            return iTMAssistantDownloadSDKServiceInterface.getServiceVersion();
        }
        super.initTMAssistantDownloadSDK();
        return 0;
    }

    public synchronized boolean isAllDownloadFinished() {
        boolean z;
        z = false;
        ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
        if (iTMAssistantDownloadSDKServiceInterface != null) {
            z = iTMAssistantDownloadSDKServiceInterface.isAllDownloadFinished();
        } else {
            super.initTMAssistantDownloadSDK();
        }
        return z;
    }

    public void onDownloadSDKServiceInvalid() {
    }

    public void registerServiceCallback() {
        ((ITMAssistantDownloadSDKServiceInterface) this.mServiceInterface).registerDownloadTaskCallback(this.mClientKey, (ITMAssistantDownloadSDKServiceCallback) this.mServiceCallback);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setDownloadSDKMaxTaskNum(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            if (r2 < r0) goto L_0x001d
            r0 = 10
            if (r2 <= r0) goto L_0x0009
            goto L_0x001d
        L_0x0009:
            android.os.IInterface r0 = super.getServiceInterface()     // Catch:{ all -> 0x001a }
            com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface r0 = (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface) r0     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0015
            r0.setServiceSetingMaxTaskNum(r2)     // Catch:{ all -> 0x001a }
            goto L_0x0018
        L_0x0015:
            super.initTMAssistantDownloadSDK()     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x001d:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKSettingClient.setDownloadSDKMaxTaskNum(int):void");
    }

    public synchronized void setDownloadSDKWifiOnly(boolean z) {
        ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
        if (iTMAssistantDownloadSDKServiceInterface != null) {
            iTMAssistantDownloadSDKServiceInterface.setServiceSetingIsDownloadWifiOnly(z);
        } else {
            super.initTMAssistantDownloadSDK();
        }
    }

    public void stubAsInterface(IBinder iBinder) {
        this.mServiceInterface = ITMAssistantDownloadSDKServiceInterface.Stub.asInterface(iBinder);
    }

    public void unRegisterServiceCallback() {
        ((ITMAssistantDownloadSDKServiceInterface) this.mServiceInterface).unregisterDownloadTaskCallback(this.mClientKey, (ITMAssistantDownloadSDKServiceCallback) this.mServiceCallback);
    }
}
