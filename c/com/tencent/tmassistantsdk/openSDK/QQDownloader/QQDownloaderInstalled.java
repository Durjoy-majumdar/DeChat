package com.tencent.tmassistantsdk.openSDK.QQDownloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.util.TMLog;
import zt3.C119157j;

public class QQDownloaderInstalled extends BroadcastReceiver {
    private static final String TAG = "QQDownloaderInstalled";
    public static QQDownloaderInstalled mInstance;
    public boolean isRegisted = false;
    public IQQDownloaderInstalled mListener = null;

    public interface IQQDownloaderInstalled {
        void onQQDownloaderInstalled(Context context);
    }

    private QQDownloaderInstalled() {
    }

    public static synchronized QQDownloaderInstalled getInstance() {
        QQDownloaderInstalled qQDownloaderInstalled;
        synchronized (QQDownloaderInstalled.class) {
            if (mInstance == null) {
                mInstance = new QQDownloaderInstalled();
            }
            qQDownloaderInstalled = mInstance;
        }
        return qQDownloaderInstalled;
    }

    public void onReceive(final Context context, Intent intent) {
        TMLog.m164114i(TAG, "onReceive!");
        ((C119157j) C119157j.f356862d).mo183884o(new Runnable() {
            public void run() {
                IQQDownloaderInstalled iQQDownloaderInstalled = QQDownloaderInstalled.this.mListener;
                if (iQQDownloaderInstalled != null) {
                    iQQDownloaderInstalled.onQQDownloaderInstalled(context);
                }
            }
        });
    }

    public void registeListener(IQQDownloaderInstalled iQQDownloaderInstalled) {
        this.mListener = iQQDownloaderInstalled;
    }

    public void registeReceiver(Context context) {
        if (!this.isRegisted) {
            TMLog.m164114i(TAG, "registeReceiver   context" + context + "  receiver:" + this);
            try {
                this.isRegisted = true;
            } catch (Throwable th) {
                TMLog.m164114i(TAG, "registeReceiver exception!!!");
                this.isRegisted = false;
                Log.printErrStackTrace(TAG, th, "", new Object[0]);
            }
        }
    }

    public void unRegisteReceiver(Context context) {
        if (context != null && mInstance != null && this.isRegisted) {
            TMLog.m164114i(TAG, "realy unRegisteReceiver  context:" + context + "  receiver:" + this);
            try {
                this.isRegisted = false;
            } catch (Throwable th) {
                TMLog.m164114i(TAG, "unRegisteReceiver exception!!!");
                this.isRegisted = false;
                Log.printErrStackTrace(TAG, th, "", new Object[0]);
            }
        }
    }

    public void unregisteListener() {
        this.mListener = null;
    }
}
