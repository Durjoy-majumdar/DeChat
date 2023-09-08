package com.tencent.tmassistantsdk.downloadclient;

import android.content.Context;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.Iterator;

public class TMAssistantDownloadSDKManager {
    public static TMAssistantDownloadSDKManager mInstance;
    public static ArrayList<TMAssistantDownloadOpenSDKClient> mOpenSDKClientList = new ArrayList<>();
    public static ArrayList<TMAssistantDownloadSDKClient> mSDKClientList = new ArrayList<>();
    public static TMAssistantDownloadSDKSettingClient mSDKSettingClient = null;
    public Context mContext;

    public TMAssistantDownloadSDKManager(Context context) {
        this.mContext = context;
    }

    public static String about() {
        return "TMAssistantDownloadSDKManager_2014_03_04_17_55_release_25406";
    }

    public static synchronized void closeAllService(Context context) {
        synchronized (TMAssistantDownloadSDKManager.class) {
            TMLog.m164114i("TMAssistantDownloadSDKManager", "closeAllService method!");
            if (mInstance == null) {
                TMLog.m164114i("TMAssistantDownloadSDKManager", "manager minstance == null");
                return;
            }
            ArrayList<TMAssistantDownloadSDKClient> arrayList = mSDKClientList;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<TMAssistantDownloadSDKClient> it = mSDKClientList.iterator();
                while (it.hasNext()) {
                    TMAssistantDownloadSDKClient next = it.next();
                    if (next != null) {
                        next.unInitTMAssistantDownloadSDK();
                    }
                }
                mSDKClientList.clear();
            }
            TMAssistantDownloadSDKSettingClient tMAssistantDownloadSDKSettingClient = mSDKSettingClient;
            if (tMAssistantDownloadSDKSettingClient != null) {
                tMAssistantDownloadSDKSettingClient.unInitTMAssistantDownloadSDK();
                mSDKSettingClient = null;
            }
            mInstance = null;
        }
    }

    public static synchronized TMAssistantDownloadSDKManager getInstance(Context context) {
        TMAssistantDownloadSDKManager tMAssistantDownloadSDKManager;
        synchronized (TMAssistantDownloadSDKManager.class) {
            if (mInstance == null) {
                mInstance = new TMAssistantDownloadSDKManager(context);
            }
            tMAssistantDownloadSDKManager = mInstance;
        }
        return tMAssistantDownloadSDKManager;
    }

    public synchronized TMAssistantDownloadOpenSDKClient getDownloadOpenSDKClient(String str) {
        Iterator<TMAssistantDownloadOpenSDKClient> it = mOpenSDKClientList.iterator();
        while (it.hasNext()) {
            TMAssistantDownloadOpenSDKClient next = it.next();
            if (next.mClientKey.equals(str)) {
                return next;
            }
        }
        TMAssistantDownloadOpenSDKClient tMAssistantDownloadOpenSDKClient = new TMAssistantDownloadOpenSDKClient(this.mContext, str, "com.tencent.android.qqdownloader.SDKService");
        if (!tMAssistantDownloadOpenSDKClient.initTMAssistantDownloadSDK()) {
            return null;
        }
        mOpenSDKClientList.add(tMAssistantDownloadOpenSDKClient);
        return tMAssistantDownloadOpenSDKClient;
    }

    public synchronized TMAssistantDownloadSDKClient getDownloadSDKClient(String str) {
        if (str != null) {
            if (str.length() > 0) {
                Iterator<TMAssistantDownloadSDKClient> it = mSDKClientList.iterator();
                while (it.hasNext()) {
                    TMAssistantDownloadSDKClient next = it.next();
                    if (next.mClientKey.equals(str)) {
                        return next;
                    }
                }
                TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient = new TMAssistantDownloadSDKClient(this.mContext, str);
                tMAssistantDownloadSDKClient.initTMAssistantDownloadSDK();
                mSDKClientList.add(tMAssistantDownloadSDKClient);
                return tMAssistantDownloadSDKClient;
            }
        }
        return null;
    }

    public synchronized TMAssistantDownloadSDKSettingClient getDownloadSDKSettingClient() {
        if (mSDKSettingClient == null) {
            TMAssistantDownloadSDKSettingClient tMAssistantDownloadSDKSettingClient = new TMAssistantDownloadSDKSettingClient(this.mContext, "TMAssistantDownloadSDKManager");
            mSDKSettingClient = tMAssistantDownloadSDKSettingClient;
            tMAssistantDownloadSDKSettingClient.initTMAssistantDownloadSDK();
        }
        return mSDKSettingClient;
    }

    public synchronized boolean releaseDownloadSDKClient(String str) {
        Iterator<TMAssistantDownloadSDKClient> it = mSDKClientList.iterator();
        while (it.hasNext()) {
            TMAssistantDownloadSDKClient next = it.next();
            if (next != null && next.mClientKey.equals(str)) {
                next.unInitTMAssistantDownloadSDK();
                it.remove();
                return true;
            }
        }
        TMAssistantDownloadSDKSettingClient tMAssistantDownloadSDKSettingClient = mSDKSettingClient;
        if (tMAssistantDownloadSDKSettingClient == null || !tMAssistantDownloadSDKSettingClient.mClientKey.equals(str)) {
            return false;
        }
        mSDKSettingClient.unInitTMAssistantDownloadSDK();
        mSDKSettingClient = null;
        return true;
    }
}
