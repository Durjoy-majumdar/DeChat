package com.tencent.soter.core.biometric;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import ot3.C21881e;

class SoterBiometricAntiBruteForceStrategy {
    private static final long DEFAULT_FREEZE_TIME = -1;
    private static final int FREEZE_SECOND = 30;
    private static final String KEY_FAIL_TIMES = "key_fail_times";
    private static final String KEY_LAST_FREEZE_TIME = "key_last_freeze_time";
    private static final int MAX_FAIL_NUM = 5;
    private static final String TAG = "Soter.SoterBiometricAntiBruteForceStrategy";

    public static void addFailTime(Context context) {
        setCurrentFailTime(context, Integer.valueOf(Integer.valueOf(getCurrentFailTime(context)).intValue() + 1).intValue());
    }

    public static void freeze(Context context) {
        setCurrentFailTime(context, 6);
        setLastFreezeTime(context, System.currentTimeMillis());
    }

    private static int getCurrentFailTime(Context context) {
        Integer valueOf = Integer.valueOf(getCurrentFailTimeInDB(context));
        C21881e.m25084c(TAG, "soter: current retry time: " + valueOf, new Object[0]);
        return valueOf.intValue();
    }

    private static int getCurrentFailTimeInDB(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(KEY_FAIL_TIMES, 0);
    }

    private static long getLastFreezeTime(Context context) {
        Long valueOf = Long.valueOf(getLastFreezeTimeInDB(context));
        C21881e.m25084c(TAG, "soter: current last freeze time: " + valueOf, new Object[0]);
        return valueOf.longValue();
    }

    private static long getLastFreezeTimeInDB(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong(KEY_LAST_FREEZE_TIME, -1);
    }

    public static boolean isCurrentFailTimeAvailable(Context context) {
        if (getCurrentFailTime(context) >= 5) {
            return false;
        }
        C21881e.m25084c(TAG, "soter: fail time available", new Object[0]);
        return true;
    }

    public static boolean isCurrentTweenTimeAvailable(Context context) {
        int currentTimeMillis = (int) ((System.currentTimeMillis() - getLastFreezeTime(context)) / 1000);
        C21881e.m25084c(TAG, "soter: tween sec after last freeze: " + currentTimeMillis, new Object[0]);
        if (currentTimeMillis <= 30) {
            return false;
        }
        C21881e.m25082a(TAG, "soter: after last freeze", new Object[0]);
        return true;
    }

    public static boolean isSystemHasAntiBruteForce() {
        return Build.VERSION.SDK_INT >= 23;
    }

    private static void setCurrentFailTime(Context context, int i) {
        C21881e.m25084c(TAG, "soter: setting to time: " + i, new Object[0]);
        if (i < 0) {
            C21881e.m25087f(TAG, "soter: illegal fail time", new Object[0]);
        } else {
            setCurrentFailTimeInDB(context, i);
        }
    }

    private static void setCurrentFailTimeInDB(Context context, int i) {
        if (context == null) {
            C21881e.m25083b(TAG, "soter: context is null", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt(KEY_FAIL_TIMES, i);
        edit.apply();
    }

    private static void setLastFreezeTime(Context context, long j) {
        C21881e.m25084c(TAG, "soter: setting last freeze time: " + j, new Object[0]);
        if (j < -1) {
            C21881e.m25087f(TAG, "soter: illegal setLastFreezeTime", new Object[0]);
        } else {
            setLastFreezeTimeInDB(context, j);
        }
    }

    private static void setLastFreezeTimeInDB(Context context, long j) {
        if (context == null) {
            C21881e.m25083b(TAG, "soter: context is null", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putLong(KEY_LAST_FREEZE_TIME, j);
        edit.apply();
    }

    public static void unFreeze(Context context) {
        setLastFreezeTime(context, -1);
        setCurrentFailTime(context, 0);
    }
}
