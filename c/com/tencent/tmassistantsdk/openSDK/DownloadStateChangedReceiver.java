package com.tencent.tmassistantsdk.openSDK;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.Iterator;

public class DownloadStateChangedReceiver extends BroadcastReceiver {
    private static final String TAG = "DownloadStateChangedReceiver";
    public static DownloadStateChangedReceiver mInstance;
    public MMHandler handler;
    public boolean isRegisted;
    public ArrayList<IDownloadStateChangedListener> mListeners;

    public DownloadStateChangedReceiver() {
        this.handler = null;
        this.isRegisted = false;
        this.mListeners = new ArrayList<>();
        this.handler = new MMHandler("downloadStateChangedThread");
    }

    public static synchronized DownloadStateChangedReceiver getInstance() {
        DownloadStateChangedReceiver downloadStateChangedReceiver;
        synchronized (DownloadStateChangedReceiver.class) {
            if (mInstance == null) {
                mInstance = new DownloadStateChangedReceiver();
            }
            downloadStateChangedReceiver = mInstance;
        }
        return downloadStateChangedReceiver;
    }

    public void addDownloadStateChangedListener(IDownloadStateChangedListener iDownloadStateChangedListener) {
        if (iDownloadStateChangedListener != null && !this.mListeners.contains(iDownloadStateChangedListener)) {
            this.mListeners.add(iDownloadStateChangedListener);
        }
    }

    public void onReceive(Context context, final Intent intent) {
        MMHandler mMHandler = this.handler;
        if (mMHandler != null) {
            mMHandler.post(new Runnable() {
                public void run() {
                    TMQQDownloaderStateChangeParam tMQQDownloaderStateChangeParam = new TMQQDownloaderStateChangeParam();
                    tMQQDownloaderStateChangeParam.hostPackageName = intent.getStringExtra(OpenSDKTool4Assistant.EXTRA_HOST_PAGECKAGENAME);
                    tMQQDownloaderStateChangeParam.hostVersion = intent.getStringExtra(OpenSDKTool4Assistant.EXTRA_HOST_VERSION);
                    tMQQDownloaderStateChangeParam.taskId = intent.getStringExtra("taskId");
                    tMQQDownloaderStateChangeParam.errorCode = Util.getInt(intent.getStringExtra(OpenSDKTool4Assistant.EXTRA_ERROR_CODE), 0);
                    tMQQDownloaderStateChangeParam.errorMsg = intent.getStringExtra(OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
                    tMQQDownloaderStateChangeParam.state = Util.getInt(intent.getStringExtra("state"), 0);
                    TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam = new TMQQDownloaderOpenSDKParam();
                    tMQQDownloaderOpenSDKParam.SNGAppId = intent.getStringExtra(OpenSDKTool4Assistant.EXTRA_SNGAPPID);
                    tMQQDownloaderOpenSDKParam.taskAppId = intent.getStringExtra(OpenSDKTool4Assistant.EXTRA_TASK_APPID);
                    tMQQDownloaderOpenSDKParam.taskApkId = intent.getStringExtra(OpenSDKTool4Assistant.EXTRA_TASK_APKID);
                    tMQQDownloaderOpenSDKParam.taskPackageName = intent.getStringExtra(OpenSDKTool4Assistant.EXTRA_TASK_PACKAGENAME);
                    tMQQDownloaderOpenSDKParam.taskVersion = Util.getInt(intent.getStringExtra(OpenSDKTool4Assistant.EXTRA_TASK_VERSION), 0);
                    tMQQDownloaderOpenSDKParam.via = intent.getStringExtra(OpenSDKTool4Assistant.EXTRA_VIA);
                    tMQQDownloaderOpenSDKParam.uin = intent.getStringExtra("uin");
                    tMQQDownloaderOpenSDKParam.uinType = intent.getStringExtra(OpenSDKTool4Assistant.EXTRA_UINTYPE);
                    tMQQDownloaderStateChangeParam.param = tMQQDownloaderOpenSDKParam;
                    Iterator<IDownloadStateChangedListener> it = DownloadStateChangedReceiver.this.mListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onDownloadStateChanged(tMQQDownloaderStateChangeParam);
                    }
                }
            });
        }
    }

    public void registeReceiver(Context context) {
        if (!this.isRegisted) {
            TMLog.m164114i(TAG, "registeReceiver   context" + context + "  receiver:" + this);
            try {
                Intent registerReceiver = context.registerReceiver(this, new IntentFilter(OpenSDKTool4Assistant.OPENSDK_ACTION_NAME));
                TMLog.m164114i(TAG, "" + registerReceiver);
                this.isRegisted = true;
            } catch (Throwable th) {
                TMLog.m164114i(TAG, "registeReceiver exception!!!");
                this.isRegisted = false;
                Log.printErrStackTrace(TAG, th, "", new Object[0]);
            }
        }
    }

    public void removeDownloadStateChangedListener(IDownloadStateChangedListener iDownloadStateChangedListener) {
        if (iDownloadStateChangedListener != null) {
            this.mListeners.remove(iDownloadStateChangedListener);
        }
    }

    public void unRegisteReceiver(Context context) {
        if (context != null && mInstance != null && this.isRegisted) {
            TMLog.m164114i(TAG, "realy unRegisteReceiver  context:" + context + "  receiver:" + this);
            try {
                context.unregisterReceiver(this);
                this.isRegisted = false;
            } catch (Throwable th) {
                TMLog.m164114i(TAG, "unRegisteReceiver exception!!!");
                this.isRegisted = false;
                Log.printErrStackTrace(TAG, th, "", new Object[0]);
            }
        }
    }
}
