package com.tencent.xweb.xwalk.plugin;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import com.tencent.xweb.util.XWebUpdateConfigUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xwalk.core.XWalkEnvironment;

public class XWalkPluginUpdater implements WCWebUpdater.IWebviewPluginUpdater {
    private static final String TAG = "XWalkPluginUpdater";
    public static final int UPDATE_BIZ_TYPE_PLUGIN_PACKAGE = 1;
    public static final int UPDATE_BIZ_TYPE_PLUGIN_PATCH = 2;
    private XWalkPluginUpdaterChecker mPluginUpdaterChecker = null;
    private String mSinglePluginToUpdate = "";
    private XWalkPluginUpdateListener mSingleUpdateListener = null;

    public static long getLastCheckPluginUpdateTime() {
        SharedPreferences sharedPreferencesForPluginUpdateInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginUpdateInfo();
        if (sharedPreferencesForPluginUpdateInfo != null) {
            return sharedPreferencesForPluginUpdateInfo.getLong(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_UPDATE_CONFIG_LAST_FETCH_TIME, 0);
        }
        XWebLog.addInitializeLog(TAG, "get time sp is null");
        return 0;
    }

    private static boolean hasScheduleNeedToUpdate() {
        for (XWalkPlugin next : XWalkPluginManager.getAllPlugins()) {
            if (next != null && XFileSchedulerFactory.getScheduler(next.getPluginName()).isTimeToUpdate(false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNeedCheckPluginUpdate() {
        if (hasScheduleNeedToUpdate()) {
            XWebLog.addInitializeLog(TAG, "has plugin need update, fetch plugin config first");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long lastCheckPluginUpdateTime = getLastCheckPluginUpdateTime();
        return currentTimeMillis - lastCheckPluginUpdateTime >= ((long) XWebUpdateConfigUtil.getPluginUpdatePeriod()) || currentTimeMillis < lastCheckPluginUpdateTime;
    }

    public static boolean isPluginUpdatingByOtherProcess() {
        int i;
        SharedPreferences sharedPreferencesForPluginUpdateInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginUpdateInfo();
        if (sharedPreferencesForPluginUpdateInfo == null || (i = sharedPreferencesForPluginUpdateInfo.getInt(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_UPDATE_PROCESS_ID, -1)) < 0) {
            return false;
        }
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        if (i == myPid) {
            XWebLog.addInitializeLog(TAG, "current process is updating plugin");
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> list = null;
        try {
            list = ((ActivityManager) XWalkEnvironment.getApplicationContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
        } catch (Throwable th) {
            XWebLog.m21909e(TAG, th.getMessage());
        }
        if (list != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == i) {
                    if (next.uid == myUid) {
                        XWebLog.addInitializeLog(TAG, "other process is in updating plugin progress");
                        return true;
                    }
                }
            }
        }
        XWebLog.addInitializeLog(TAG, "plugin update process pid invalid, clear");
        markPluginUpdateFinishedInProcess();
        return false;
    }

    public static void markPluginUpdateFinishedInProcess() {
        SharedPreferences sharedPreferencesForPluginUpdateInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginUpdateInfo();
        if (sharedPreferencesForPluginUpdateInfo != null) {
            SharedPreferences.Editor edit = sharedPreferencesForPluginUpdateInfo.edit();
            edit.remove(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_UPDATE_PROCESS_ID);
            edit.commit();
            XWebLog.addInitializeLog(TAG, "plugin update progress finish");
        }
    }

    public static void markPluginUpdateStartedInProcess() {
        SharedPreferences sharedPreferencesForPluginUpdateInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginUpdateInfo();
        if (sharedPreferencesForPluginUpdateInfo != null) {
            int myPid = Process.myPid();
            SharedPreferences.Editor edit = sharedPreferencesForPluginUpdateInfo.edit();
            edit.putInt(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_UPDATE_PROCESS_ID, myPid);
            edit.commit();
            XWebLog.addInitializeLog(TAG, "plugin update progress start pid " + myPid);
        }
    }

    public static void setLastCheckPluginUpdateTime(long j) {
        SharedPreferences sharedPreferencesForPluginUpdateInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginUpdateInfo();
        if (sharedPreferencesForPluginUpdateInfo == null) {
            XWebLog.addInitializeLog(TAG, "set time sp is null");
            return;
        }
        SharedPreferences.Editor edit = sharedPreferencesForPluginUpdateInfo.edit();
        edit.putLong(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_UPDATE_CONFIG_LAST_FETCH_TIME, j);
        edit.commit();
    }

    public void cancelPluginUpdate() {
        XWalkPluginUpdaterChecker xWalkPluginUpdaterChecker = this.mPluginUpdaterChecker;
        if (xWalkPluginUpdaterChecker != null) {
            xWalkPluginUpdaterChecker.tryCancelUpdate();
        }
    }

    public boolean isBusy() {
        XWalkPluginUpdaterChecker xWalkPluginUpdaterChecker = this.mPluginUpdaterChecker;
        if (xWalkPluginUpdaterChecker != null) {
            return xWalkPluginUpdaterChecker.isBusy();
        }
        return false;
    }

    public boolean needCheckUpdate() {
        return isNeedCheckPluginUpdate();
    }

    public void setPluginOnlyOneToUpdate(String str, XWalkPluginUpdateListener xWalkPluginUpdateListener) {
        this.mSinglePluginToUpdate = str;
        this.mSingleUpdateListener = xWalkPluginUpdateListener;
    }

    public void startCheck(Context context, HashMap<String, String> hashMap) {
        synchronized (this) {
            XWalkPluginUpdaterChecker xWalkPluginUpdaterChecker = new XWalkPluginUpdaterChecker();
            this.mPluginUpdaterChecker = xWalkPluginUpdaterChecker;
            xWalkPluginUpdaterChecker.setParams(hashMap, this.mSinglePluginToUpdate, this.mSingleUpdateListener);
            this.mPluginUpdaterChecker.execute(new String[0]);
            this.mSinglePluginToUpdate = "";
            this.mSingleUpdateListener = null;
        }
    }
}
