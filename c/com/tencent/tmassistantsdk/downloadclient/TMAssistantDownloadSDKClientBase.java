package com.tencent.tmassistantsdk.downloadclient;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.tencent.tmassistantsdk.util.TMLog;

public abstract class TMAssistantDownloadSDKClientBase implements ServiceConnection {
    public static final String CONNTECTSTATE_CONNECTING = "CONNECTING";
    public static final String CONNTECTSTATE_FINISH = "FINISH";
    public static final String CONNTECTSTATE_INIT = "INIT";
    public static final String TAG = "TMAssistantDownloadSDKClient";
    public String connectState = CONNTECTSTATE_INIT;
    public String mClientKey;
    public Context mContext;
    public String mDwonloadServiceName;
    public IInterface mServiceCallback = null;
    public IInterface mServiceInterface = null;
    public final Object mThreadlock = new Object();

    public TMAssistantDownloadSDKClientBase(Context context, String str, String str2) {
        this.mContext = context;
        this.mClientKey = str;
        this.mDwonloadServiceName = str2;
    }

    public abstract Intent getBindServiceIntent();

    public IInterface getServiceInterface() {
        Context context = this.mContext;
        if (context == null || context.getMainLooper().getThread().getId() != Thread.currentThread().getId()) {
            if (this.mServiceInterface == null) {
                initTMAssistantDownloadSDK();
                this.connectState = CONNTECTSTATE_CONNECTING;
                synchronized (this.mThreadlock) {
                    this.mThreadlock.wait(10000);
                }
            }
            IInterface iInterface = this.mServiceInterface;
            if (iInterface != null) {
                return iInterface;
            }
            throw new Exception("TMAssistantDownloadSDKClient ServiceInterface is null");
        }
        throw new Exception("TMAssistantDownloadSDKClient must be called in other Thread(no MainThread)");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean initTMAssistantDownloadSDK() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "TMAssistantDownloadSDKClient"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r1.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = "connectState = "
            r1.append(r2)     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = r5.connectState     // Catch:{ all -> 0x0098 }
            r1.append(r2)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0098 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r0, r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r5.connectState     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "INIT"
            r2 = 1
            if (r0 == r1) goto L_0x0022
            monitor-exit(r5)
            return r2
        L_0x0022:
            java.lang.String r0 = "TMAssistantDownloadSDKClient"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r1.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = "initTMAssistantDownloadSDK,clientKey:"
            r1.append(r3)     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = r5.mClientKey     // Catch:{ all -> 0x0098 }
            r1.append(r3)     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = ",mServiceInterface:"
            r1.append(r3)     // Catch:{ all -> 0x0098 }
            android.os.IInterface r3 = r5.mServiceInterface     // Catch:{ all -> 0x0098 }
            r1.append(r3)     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = ",threadId:"
            r1.append(r3)     // Catch:{ all -> 0x0098 }
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0098 }
            long r3 = r3.getId()     // Catch:{ all -> 0x0098 }
            r1.append(r3)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0098 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r0, r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "INIT"
            r5.connectState = r0     // Catch:{ all -> 0x0098 }
            android.os.IInterface r0 = r5.mServiceInterface     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "FINISH"
            r5.connectState = r0     // Catch:{ all -> 0x0098 }
            monitor-exit(r5)
            return r2
        L_0x0062:
            android.content.Context r0 = r5.mContext     // Catch:{ all -> 0x0098 }
            r1 = 0
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = r5.mDwonloadServiceName     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0096
            android.content.Intent r0 = r5.getBindServiceIntent()     // Catch:{ Exception -> 0x0076 }
            android.content.Context r3 = r5.mContext     // Catch:{ Exception -> 0x0076 }
            boolean r1 = r3.bindService(r0, r5, r2)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0080
        L_0x0076:
            r0 = move-exception
            java.lang.String r2 = "TMAssistantDownloadSDKClient"
            java.lang.String r3 = ""
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0098 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)     // Catch:{ all -> 0x0098 }
        L_0x0080:
            java.lang.String r0 = "TMAssistantDownloadSDKClient"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r2.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = "initTMAssistantDownloadSDK bindResult:"
            r2.append(r3)     // Catch:{ all -> 0x0098 }
            r2.append(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0098 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r0, r2)     // Catch:{ all -> 0x0098 }
        L_0x0096:
            monitor-exit(r5)
            return r1
        L_0x0098:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.initTMAssistantDownloadSDK():boolean");
    }

    public abstract void onDownloadSDKServiceInvalid();

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        stubAsInterface(iBinder);
        this.connectState = CONNTECTSTATE_FINISH;
        synchronized (this.mThreadlock) {
            this.mThreadlock.notifyAll();
        }
        TMLog.m164114i("TMAssistantDownloadSDKClient", "onServiceConnected,clientKey:" + this.mClientKey + ",mServiceInterface:" + this.mServiceInterface + ",IBinder:" + iBinder + ",threadId:" + Thread.currentThread().getId());
        try {
            if (this.mServiceInterface != null && this.mServiceCallback != null) {
                registerServiceCallback();
            }
        } catch (RemoteException e) {
            TMLog.m164114i("TMAssistantDownloadSDKClient", "onServiceConnected, exception : " + e.getMessage());
            onDownloadSDKServiceInvalid();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        TMLog.m164114i("TMAssistantDownloadSDKClient", "onServiceDisconnected,clientKey:" + this.mClientKey);
        synchronized (this) {
            this.mServiceInterface = null;
            this.connectState = CONNTECTSTATE_INIT;
            synchronized (this.mThreadlock) {
                this.mThreadlock.notifyAll();
            }
            onDownloadSDKServiceInvalid();
        }
    }

    public abstract void registerServiceCallback();

    public abstract void stubAsInterface(IBinder iBinder);

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|(2:7|8)|9|10|(1:14)|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void unInitTMAssistantDownloadSDK() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "TMAssistantDownloadSDKClient"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r1.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "unInitTMAssistantDownloadSDK,clientKey:"
            r1.append(r2)     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = r4.mClientKey     // Catch:{ all -> 0x0054 }
            r1.append(r2)     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = ",mServiceInterface:"
            r1.append(r2)     // Catch:{ all -> 0x0054 }
            android.os.IInterface r2 = r4.mServiceInterface     // Catch:{ all -> 0x0054 }
            r1.append(r2)     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = ",threadId:"
            r1.append(r2)     // Catch:{ all -> 0x0054 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0054 }
            long r2 = r2.getId()     // Catch:{ all -> 0x0054 }
            r1.append(r2)     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0054 }
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r0, r1)     // Catch:{ all -> 0x0054 }
            android.os.IInterface r0 = r4.mServiceInterface     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x003e
            android.os.IInterface r0 = r4.mServiceCallback     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x003e
            r4.unRegisterServiceCallback()     // Catch:{ RemoteException -> 0x003e }
        L_0x003e:
            android.content.Context r0 = r4.mContext     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0049
            android.os.IInterface r1 = r4.mServiceInterface     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0049
            r0.unbindService(r4)     // Catch:{ all -> 0x0054 }
        L_0x0049:
            r0 = 0
            r4.mServiceInterface = r0     // Catch:{ all -> 0x0054 }
            r4.mServiceCallback = r0     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "INIT"
            r4.connectState = r0     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.unInitTMAssistantDownloadSDK():void");
    }

    public abstract void unRegisterServiceCallback();
}
