package com.tencent.tmassistantsdk.downloadclient;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback;
import com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface;
import com.tencent.tmassistantsdk.util.TMLog;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class TMAssistantDownloadSDKClient extends TMAssistantDownloadSDKClientBase {
    public static final String DOWNDLOADSDKSERVICENAME = "com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService";
    public static final String TAG = "TMAssistantDownloadSDKClient";
    public ReferenceQueue<ITMAssistantDownloadSDKClientListener> mListenerReferenceQueue = new ReferenceQueue<>();
    public ArrayList<WeakReference<ITMAssistantDownloadSDKClientListener>> mWeakListenerArrayList = new ArrayList<>();

    public TMAssistantDownloadSDKClient(Context context, String str) {
        super(context, str, DOWNDLOADSDKSERVICENAME);
        this.mServiceCallback = new ITMAssistantDownloadSDKServiceCallback.Stub() {
            public void OnDownloadSDKServiceTaskProgressChanged(String str, String str2, long j, long j2) {
                TMLog.m164114i("TMAssistantDownloadSDKClient", "OnDownloadProgressChanged,clientKey:" + str + ",receivedLen:" + j + ",totalLen:" + j2 + ",url:" + str2);
                Iterator<WeakReference<ITMAssistantDownloadSDKClientListener>> it = TMAssistantDownloadSDKClient.this.mWeakListenerArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener = (ITMAssistantDownloadSDKClientListener) next.get();
                    if (iTMAssistantDownloadSDKClientListener == null) {
                        TMLog.m164114i("TMAssistantDownloadSDKClient", " listener = " + iTMAssistantDownloadSDKClientListener + "   linstenerWeakReference :" + next);
                    }
                    TMAssistantDownloadSDKMessageThread.getInstance().postTaskProgressChangedMessage(TMAssistantDownloadSDKClient.this, iTMAssistantDownloadSDKClientListener, str2, j, j2);
                }
            }

            public void OnDownloadSDKServiceTaskStateChanged(String str, String str2, int i, int i2, String str3, boolean z, boolean z2) {
                TMLog.m164114i("TMAssistantDownloadSDKClient", "OnDownloadStateChanged,clientKey:" + str + ",state:" + i + ", errorcode" + i2 + ",url:" + str2);
                Iterator<WeakReference<ITMAssistantDownloadSDKClientListener>> it = TMAssistantDownloadSDKClient.this.mWeakListenerArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener = (ITMAssistantDownloadSDKClientListener) next.get();
                    if (iTMAssistantDownloadSDKClientListener == null) {
                        TMLog.m164114i("TMAssistantDownloadSDKClient", " listener = " + iTMAssistantDownloadSDKClientListener + "   linstenerWeakReference :" + next);
                    }
                    TMAssistantDownloadSDKMessageThread.getInstance().postTaskStateChangedMessage(TMAssistantDownloadSDKClient.this, iTMAssistantDownloadSDKClientListener, str2, i, i2, str3, z, z2);
                }
            }
        };
    }

    public static String about() {
        return "TMAssistantDownloadSDKClient_2014_03_06_11_20_release_25634";
    }

    public synchronized void cancelDownloadTask(String str) {
        TMLog.m164114i("TMAssistantDownloadSDKClient", "cancelDownloadTask,clientKey:" + this.mClientKey + ",url:" + str);
        if (str != null) {
            ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
            if (iTMAssistantDownloadSDKServiceInterface != null) {
                iTMAssistantDownloadSDKServiceInterface.cancelDownloadTask(this.mClientKey, str);
            } else {
                TMLog.m164114i("TMAssistantDownloadSDKClient", "cancelDownloadTask, serviceInterface is null");
                super.initTMAssistantDownloadSDK();
            }
        } else {
            throw new IllegalArgumentException("TMAssistantDownloadSDKClient.startDownloadTask url is null");
        }
    }

    public Intent getBindServiceIntent() {
        return new Intent(this.mContext, Class.forName(this.mDwonloadServiceName));
    }

    public synchronized TMAssistantDownloadTaskInfo getDownloadTaskState(String str) {
        TMLog.m164114i("TMAssistantDownloadSDKClient", "getDownloadTaskState,clientKey:" + this.mClientKey + ",url:" + str);
        if (str != null) {
            ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
            if (iTMAssistantDownloadSDKServiceInterface != null) {
                return iTMAssistantDownloadSDKServiceInterface.getDownloadTaskInfo(this.mClientKey, str);
            }
            super.initTMAssistantDownloadSDK();
            return null;
        }
        throw new IllegalArgumentException("TMAssistantDownloadSDKClient.getDownloadTaskState url is null");
    }

    public void onDownloadSDKServiceInvalid() {
        Iterator<WeakReference<ITMAssistantDownloadSDKClientListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            TMAssistantDownloadSDKMessageThread.getInstance().postSDKServiceInvalidMessage(this, (ITMAssistantDownloadSDKClientListener) it.next().get());
        }
    }

    public synchronized void pauseDownloadTask(String str) {
        TMLog.m164114i("TMAssistantDownloadSDKClient", "pauseDownloadTask,clientKey:" + this.mClientKey + ",url:" + str);
        if (str != null) {
            ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
            if (iTMAssistantDownloadSDKServiceInterface != null) {
                iTMAssistantDownloadSDKServiceInterface.pauseDownloadTask(this.mClientKey, str);
            } else {
                TMLog.m164114i("TMAssistantDownloadSDKClient", "pauseDownloadTask, serviceInterface is null");
                super.initTMAssistantDownloadSDK();
            }
        } else {
            throw new IllegalArgumentException("TMAssistantDownloadSDKClient.startDownloadTask url is null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r0.hasNext() == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (((com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener) r0.next().get()) != r4) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.mWeakListenerArrayList.add(new java.lang.ref.WeakReference(r4, r3.mListenerReferenceQueue));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r0 = r3.mWeakListenerArrayList.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean registerDownloadTaskListener(com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L_0x0006
            r4 = 0
            monitor-exit(r3)
            return r4
        L_0x0006:
            java.lang.ref.ReferenceQueue<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener> r0 = r3.mListenerReferenceQueue     // Catch:{ all -> 0x0046 }
            java.lang.ref.Reference r0 = r0.poll()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x001b
            java.lang.String r1 = "TMAssistantDownloadSDKClient"
            java.lang.String r2 = "registerDownloadTaskListener removed listener!!!!"
            com.tencent.tmassistantsdk.util.TMLog.m164114i(r1, r2)     // Catch:{ all -> 0x0046 }
            java.util.ArrayList<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener>> r1 = r3.mWeakListenerArrayList     // Catch:{ all -> 0x0046 }
            r1.remove(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x0006
        L_0x001b:
            java.util.ArrayList<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener>> r0 = r3.mWeakListenerArrayList     // Catch:{ all -> 0x0046 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0046 }
        L_0x0021:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0046 }
            r2 = 1
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0046 }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x0046 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0046 }
            com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener r1 = (com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener) r1     // Catch:{ all -> 0x0046 }
            if (r1 != r4) goto L_0x0021
            monitor-exit(r3)
            return r2
        L_0x0038:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0046 }
            java.lang.ref.ReferenceQueue<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener> r1 = r3.mListenerReferenceQueue     // Catch:{ all -> 0x0046 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0046 }
            java.util.ArrayList<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener>> r4 = r3.mWeakListenerArrayList     // Catch:{ all -> 0x0046 }
            r4.add(r0)     // Catch:{ all -> 0x0046 }
            monitor-exit(r3)
            return r2
        L_0x0046:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient.registerDownloadTaskListener(com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener):boolean");
    }

    public void registerServiceCallback() {
        ((ITMAssistantDownloadSDKServiceInterface) this.mServiceInterface).registerDownloadTaskCallback(this.mClientKey, (ITMAssistantDownloadSDKServiceCallback) this.mServiceCallback);
    }

    public synchronized int startDownloadTask(String str, String str2) {
        return startDownloadTask(str, "", 0, 0, str2, (String) null, true, (Map<String, String>) null);
    }

    public void stubAsInterface(IBinder iBinder) {
        this.mServiceInterface = ITMAssistantDownloadSDKServiceInterface.Stub.asInterface(iBinder);
    }

    public synchronized boolean unRegisterDownloadTaskListener(ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener) {
        if (iTMAssistantDownloadSDKClientListener == null) {
            return false;
        }
        Iterator<WeakReference<ITMAssistantDownloadSDKClientListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (((ITMAssistantDownloadSDKClientListener) next.get()) == iTMAssistantDownloadSDKClientListener) {
                this.mWeakListenerArrayList.remove(next);
                return true;
            }
        }
        return false;
    }

    public void unRegisterServiceCallback() {
        ((ITMAssistantDownloadSDKServiceInterface) this.mServiceInterface).unregisterDownloadTaskCallback(this.mClientKey, (ITMAssistantDownloadSDKServiceCallback) this.mServiceCallback);
    }

    public synchronized int startDownloadTask(String str, String str2, Map<String, String> map) {
        return startDownloadTask(str, "", 0, 0, str2, (String) null, true, map);
    }

    public synchronized int startDownloadTask(String str, String str2, String str3) {
        return startDownloadTask(str, "", 0, 0, str2, str3, true, (Map<String, String>) null);
    }

    public synchronized int startDownloadTask(String str, String str2, long j, int i, String str3, String str4, boolean z, Map<String, String> map) {
        String str5 = str;
        String str6 = str3;
        synchronized (this) {
            TMLog.m164114i("TMAssistantDownloadSDKClient", "startDownloadTask,clientKey:" + this.mClientKey + ",url:" + str + ",contentType:" + str6);
            if (str5 != null) {
                if (str6.equals("resource/tm.android.unknown")) {
                    if (TextUtils.isEmpty(str4)) {
                        throw new IllegalArgumentException("if contentType is others, filename shouldn't be null!");
                    }
                }
                ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
                if (iTMAssistantDownloadSDKServiceInterface != null) {
                    iTMAssistantDownloadSDKServiceInterface.setServiceSetingIsDownloadWifiOnly(z);
                    int startDownloadTask = iTMAssistantDownloadSDKServiceInterface.startDownloadTask(this.mClientKey, str, str2, j, 0, str3, str4, map);
                    return startDownloadTask;
                }
                TMLog.m164114i("TMAssistantDownloadSDKClient", "startDownloadTask, serviceInterface is null");
                super.initTMAssistantDownloadSDK();
                return 0;
            }
            throw new IllegalArgumentException("TMAssistantDownloadSDKClient.startDownloadTask url is null");
        }
    }
}
