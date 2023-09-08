package com.tencent.xweb.util;

import android.content.SharedPreferences;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.CommandCfgPlugin;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class FrequentLimiter {
    public static final long DAY_MILLS = 86400000;
    public static final long HOURS_MILLS = 3600000;
    public static final String KEY_CLEAR_DOWNLOAD_ZIP = "CLEAR_DOWNLOAD_ZIP";
    public static final String KEY_CLEAR_OLD_APK = "CLEAR_OLD_APK";
    public static final long MINITUE_MILLS = 60000;
    public static final long SECOND_MILLS = 1000;
    public static final String TAG = "FrequentLimiter";
    public static final long WEEK_MILLS = 604800000;
    private static HashMap<String, Long> sMapRecord = new HashMap<>();

    public static synchronized boolean canDo(String str, long j) {
        synchronized (FrequentLimiter.class) {
            CommandCfg instance = CommandCfg.getInstance();
            if ("true".equals(instance.getCmd("dis_" + str))) {
                XWebLog.m21911i(TAG, "canDo, dis_" + str + " is true");
                return false;
            }
            SharedPreferences mMKVSharedPreferencesForFrequentLimiter = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForFrequentLimiter();
            long j2 = mMKVSharedPreferencesForFrequentLimiter.getLong(str, 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - j2) < j) {
                XWebLog.m21911i(TAG, "canDo, time not up for " + str);
                return false;
            }
            mMKVSharedPreferencesForFrequentLimiter.edit().putLong(str, currentTimeMillis).commit();
            return true;
        }
    }

    public static synchronized boolean canDoDaily(String str) {
        synchronized (FrequentLimiter.class) {
            SharedPreferences sharedPreferencesForReportDaily = XWebSharedPreferenceUtil.getSharedPreferencesForReportDaily();
            String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
            if (format.equals(sharedPreferencesForReportDaily.getString(str, ""))) {
                return false;
            }
            CommandCfgPlugin instance = CommandCfgPlugin.getInstance();
            if ("true".equals(instance.getCmd("dis_" + str))) {
                XWebLog.m21911i(TAG, "canDoDaily, dis_" + str + " is true");
                return false;
            }
            sharedPreferencesForReportDaily.edit().putString(str, format).commit();
            return true;
        }
    }

    public static synchronized boolean canDoOnProcessLive(String str, long j) {
        synchronized (FrequentLimiter.class) {
            CommandCfg instance = CommandCfg.getInstance();
            if ("true".equals(instance.getCmd("dis_" + str))) {
                XWebLog.m21911i(TAG, "canDoOnProcessLive, dis_" + str + " is true");
                return false;
            }
            long j2 = 0;
            Long l = sMapRecord.get(str);
            if (l != null) {
                j2 = l.longValue();
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - j2) < j) {
                XWebLog.m21911i(TAG, "canDoOnProcessLive, time not up for " + str);
                return false;
            }
            sMapRecord.put(str, new Long(currentTimeMillis));
            return true;
        }
    }

    public static synchronized void resetCanDoTimeStamp(String str) {
        synchronized (FrequentLimiter.class) {
            XWebSharedPreferenceUtil.getMMKVSharedPreferencesForFrequentLimiter().edit().putLong(str, 0).commit();
        }
    }

    public static synchronized boolean valueChanged(String str, String str2) {
        synchronized (FrequentLimiter.class) {
            SharedPreferences mMKVSharedPreferencesForXWebValueChanged = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForXWebValueChanged();
            String string = mMKVSharedPreferencesForXWebValueChanged.getString(str, "");
            if (string == null) {
                string = "";
            }
            if (string.equals(str2)) {
                return false;
            }
            mMKVSharedPreferencesForXWebValueChanged.edit().putString(str, str2).commit();
            return true;
        }
    }
}
