package com.tencent.tmassistantsdk.downloadclient;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tmassistantsdk.util.Base64;
import com.tencent.tmassistantsdk.util.Cryptor;
import com.tencent.tmassistantsdk.util.TMLog;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C9556a;
import p1176ca.C113257a;
import p1176ca.C113260b;

public class TMAssistantDownloadOpenSDKClient extends TMAssistantDownloadSDKClientBase {
    public static final String TAG = "TMAssistantDownloadOpenSDKClient";
    private byte _hellAccFlag_;
    public ArrayList<IAssistantOnActionListener> mListeners = new ArrayList<>();
    public boolean retryBindResult = false;
    public int retryCount = 0;

    public TMAssistantDownloadOpenSDKClient(Context context, String str, String str2) {
        super(context, str, str2);
        this.mServiceCallback = new C113260b.C113261a() {
            public void onActionResult(byte[] bArr) {
                TMLog.m164114i(TMAssistantDownloadOpenSDKClient.TAG, "onActionResult  callBack data:" + bArr + "  mListeners.size:" + TMAssistantDownloadOpenSDKClient.this.mListeners.size());
                TMAssistantDownloadSDKMessageThread.getInstance().postActionResult(bArr, TMAssistantDownloadOpenSDKClient.this.mListeners);
            }
        };
    }

    public static String about() {
        return "TMAssistantDownloadOpenSDKClient_2014_03_06_11_20_release_25634";
    }

    public void addAssistantOnActionListener(IAssistantOnActionListener iAssistantOnActionListener) {
        TMLog.m164114i(TAG, "addAssistantOnActionListener");
        if (iAssistantOnActionListener != null && !this.mListeners.contains(iAssistantOnActionListener)) {
            this.mListeners.add(iAssistantOnActionListener);
        }
    }

    public Intent getBindServiceIntent() {
        Intent intent = new Intent(this.mDwonloadServiceName);
        intent.setPackage("com.tencent.android.qqdownloader");
        return intent;
    }

    public synchronized boolean initTMAssistantDownloadSDK() {
        boolean initTMAssistantDownloadSDK;
        initTMAssistantDownloadSDK = super.initTMAssistantDownloadSDK();
        TMLog.m164114i(TAG, "initTMAssistantDownloadSDK bindResult:" + initTMAssistantDownloadSDK);
        if (!initTMAssistantDownloadSDK) {
            try {
                Intent intent = new Intent();
                intent.setClassName("com.tencent.android.qqdownloader", "com.tencent.pangu.link.LinkProxyActivity");
                intent.addFlags(268435456);
                Context context = this.mContext;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadOpenSDKClient", "initTMAssistantDownloadSDK", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/tmassistantsdk/downloadclient/TMAssistantDownloadOpenSDKClient", "initTMAssistantDownloadSDK", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                TMLog.m164116w(TAG, "retry bind service startActivity Exception:" + e.toString());
            }
            final MMHandler mMHandler = new MMHandler("retry_thread");
            mMHandler.postDelayed(new Runnable() {
                public void run() {
                    try {
                        Intent bindServiceIntent = TMAssistantDownloadOpenSDKClient.this.getBindServiceIntent();
                        TMAssistantDownloadOpenSDKClient tMAssistantDownloadOpenSDKClient = TMAssistantDownloadOpenSDKClient.this;
                        tMAssistantDownloadOpenSDKClient.retryBindResult = tMAssistantDownloadOpenSDKClient.mContext.bindService(bindServiceIntent, tMAssistantDownloadOpenSDKClient, 1);
                    } catch (Exception e) {
                        TMLog.m164113e(TMAssistantDownloadOpenSDKClient.TAG, "retry bind service Exception:" + e.toString());
                    }
                    TMAssistantDownloadOpenSDKClient.this.retryCount++;
                    TMLog.m164114i(TMAssistantDownloadOpenSDKClient.TAG, "retry bind service! retryBindResult:" + TMAssistantDownloadOpenSDKClient.this.retryBindResult + ",retryCount:" + TMAssistantDownloadOpenSDKClient.this.retryCount);
                    TMAssistantDownloadOpenSDKClient tMAssistantDownloadOpenSDKClient2 = TMAssistantDownloadOpenSDKClient.this;
                    if (!tMAssistantDownloadOpenSDKClient2.retryBindResult && tMAssistantDownloadOpenSDKClient2.retryCount < 3) {
                        mMHandler.postDelayed(this, 1000);
                    }
                }
            }, 1000);
        }
        return initTMAssistantDownloadSDK;
    }

    public void onDownloadSDKServiceInvalid() {
        ArrayList<IAssistantOnActionListener> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<IAssistantOnActionListener> it = this.mListeners.iterator();
            while (it.hasNext()) {
                IAssistantOnActionListener next = it.next();
                if (next != null) {
                    next.onDownloadSDKServiceInvalid();
                }
            }
        }
    }

    public void registerServiceCallback() {
        String encodeToString = Base64.encodeToString(new Cryptor().encrypt(String.valueOf(System.currentTimeMillis()).getBytes(), this.mClientKey.getBytes()), 0);
        int jh02 = ((C113257a) this.mServiceInterface).jh0(this.mClientKey, encodeToString, (C113260b) this.mServiceCallback);
        TMLog.m164114i(TAG, "onServiceConnected,registerActionCallback:" + this.mClientKey + ",tokenString:" + encodeToString + ",threadId:" + Thread.currentThread().getId() + ",mServiceCallback:" + this.mServiceCallback + ",registed result:" + jh02);
        if (jh02 == 2) {
            onDownloadSDKServiceInvalid();
        }
    }

    public void sendAsyncData(byte[] bArr) {
        C113257a aVar;
        if (!TextUtils.isEmpty(this.mClientKey) && (aVar = (C113257a) super.getServiceInterface()) != null) {
            aVar.ov0(this.mClientKey, bArr);
        }
    }

    public byte[] sendSyncData(byte[] bArr) {
        C113257a aVar;
        if (TextUtils.isEmpty(this.mClientKey) || (aVar = (C113257a) super.getServiceInterface()) == null) {
            return null;
        }
        return aVar.mo165804dI(this.mClientKey, bArr);
    }

    public void stubAsInterface(IBinder iBinder) {
        C113257a aVar;
        int i = C113257a.C113258a.f338869d;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.assistant.sdk.BaseService");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C113257a)) ? new C113257a.C113258a.C113259a(iBinder) : (C113257a) queryLocalInterface;
        }
        this.mServiceInterface = aVar;
    }

    public void unRegisterServiceCallback() {
        if (((C113257a) this.mServiceInterface).mo165803a6((C113260b) this.mServiceCallback) == 2) {
            onDownloadSDKServiceInvalid();
        }
    }
}
