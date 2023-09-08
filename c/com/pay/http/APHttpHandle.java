package com.pay.http;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.midas.comm.APLog;
import java.util.HashMap;

public class APHttpHandle extends Handler {
    private static APHttpHandle handle;
    private static byte[] lock = new byte[0];
    private HashMap<String, IAPHttpAnsObserver> observerMap = new HashMap<>();

    private APHttpHandle() {
    }

    public static APHttpHandle getIntanceHandel() {
        synchronized (lock) {
            if (handle == null) {
                try {
                    if (Thread.currentThread() != Looper.getMainLooper().getThread() && Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                } catch (Exception e) {
                    APLog.m161214i("APHttpHandle", e.toString());
                }
                handle = new APHttpHandle();
            }
        }
        return handle;
    }

    private void runObserverOnMainThread(Message message) {
        try {
            int i = message.what;
            APBaseHttpAns aPBaseHttpAns = (APBaseHttpAns) message.obj;
            String httpReqKey = aPBaseHttpAns.getHttpReqKey();
            IAPHttpAnsObserver iAPHttpAnsObserver = this.observerMap.get(httpReqKey);
            if (iAPHttpAnsObserver != null) {
                unregister(httpReqKey);
                if (i == 3) {
                    iAPHttpAnsObserver.onFinish(aPBaseHttpAns);
                } else if (i == 4) {
                    iAPHttpAnsObserver.onError(aPBaseHttpAns);
                } else if (i == 5) {
                    iAPHttpAnsObserver.onStop(aPBaseHttpAns);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void handleMessage(Message message) {
        runObserverOnMainThread(message);
    }

    public void register(String str, IAPHttpAnsObserver iAPHttpAnsObserver) {
        HashMap<String, IAPHttpAnsObserver> hashMap = this.observerMap;
        if (hashMap != null) {
            hashMap.put(str, iAPHttpAnsObserver);
        }
    }

    public void release() {
        handle = null;
    }

    public void unregister(String str) {
        HashMap<String, IAPHttpAnsObserver> hashMap = this.observerMap;
        if (hashMap != null) {
            hashMap.remove(str);
        }
    }
}
