package com.tencent.xweb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.report.KVReportForMultiProcessDowngrade;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.xwalk.core.XWalkEnvironment;

public class XWebChildProcessMonitor {
    public static final String SP_KEY_CHILD_PROCESS_CRASH_COUNT_DAY = "SP_KEY_CHILD_PROCESS_CRASH_COUNT_";
    public static final String SP_KEY_CHILD_PROCESS_CRASH_KEY = "SP_KEY_CHILD_PROCESS_CRASH_KEY";
    public static final String SP_KEY_CHILD_PROCESS_CRASH_VERSION = "SP_KEY_CHILD_PROCESS_CRASH_VERSION_";
    public static final String SP_KEY_DISABLE_MULTI_PROCESS_STATE = "SP_KEY_DISABLE_MULTI_PROCESS_STATE";
    public static final String SP_KEY_LAST_DISABLE_START_TIME = "SP_KEY_LAST_DISABLE_START_TIME";
    public static final String SP_KEY_MAYBE_WXDK = "SP_KEY_MAYBE_WXDK";
    public static final String SP_KEY_SWITCH_TO_SYS = "SP_KEY_SWITCH_TO_SYS";
    private static final String TAG = "XWebChildProcessMonitor";
    private static String sCrashCountKeyForToday;
    private static Boolean sDisableMultiProcess;

    public static synchronized boolean checkDisableMultiProcess() {
        synchronized (XWebChildProcessMonitor.class) {
            if (sDisableMultiProcess != null) {
                XWebLog.m21911i(TAG, "checkDisableMultiProcess, already checked:" + sDisableMultiProcess);
                boolean booleanValue = sDisableMultiProcess.booleanValue();
                return booleanValue;
            }
            SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
            if (sharedPreferencesForMultiProcess != null) {
                if (sharedPreferencesForMultiProcess.contains(SP_KEY_DISABLE_MULTI_PROCESS_STATE)) {
                    sDisableMultiProcess = Boolean.valueOf(sharedPreferencesForMultiProcess.getBoolean(SP_KEY_DISABLE_MULTI_PROCESS_STATE, false));
                    XWebLog.m21911i(TAG, "checkDisableMultiProcess, already checked in mm process:" + sDisableMultiProcess);
                    boolean booleanValue2 = sDisableMultiProcess.booleanValue();
                    return booleanValue2;
                } else if (maybeWxdk() && CommandCfg.getInstance().getWxdkDowngrade()) {
                    XWebLog.m21913w(TAG, "checkDisableMultiProcess, maybe wxdk");
                    Boolean bool = Boolean.TRUE;
                    sDisableMultiProcess = bool;
                    saveDisableMultiProcessStateIfNeed(bool.booleanValue());
                    return true;
                } else if (hasChildProcessCrash()) {
                    XWebLog.m21913w(TAG, "checkDisableMultiProcess, has child process crash");
                    Boolean bool2 = Boolean.TRUE;
                    sDisableMultiProcess = bool2;
                    saveDisableMultiProcessStateIfNeed(bool2.booleanValue());
                    return true;
                } else {
                    int i = sharedPreferencesForMultiProcess.getInt(getCrashCountKeyForToday(), 0);
                    long j = sharedPreferencesForMultiProcess.getLong(SP_KEY_LAST_DISABLE_START_TIME, -1);
                    StringBuilder sb = new StringBuilder();
                    sb.append("checkDisableMultiProcess, crash count:");
                    sb.append(i);
                    sb.append(", lastDisableStartTime:");
                    sb.append(j > 0 ? getHumanReadableTime(j) : Long.valueOf(j));
                    XWebLog.m21911i(TAG, sb.toString());
                    long currentTimeMillis = System.currentTimeMillis();
                    if (j != -1) {
                        if (currentTimeMillis - j > ((long) getChildProcessCrashWatchTime())) {
                            XWebLog.m21911i(TAG, "checkDisableMultiProcess, false for time out, threshold time:" + getChildProcessCrashWatchTime());
                            sharedPreferencesForMultiProcess.edit().remove(getCrashCountKeyForToday()).apply();
                            sharedPreferencesForMultiProcess.edit().remove(SP_KEY_LAST_DISABLE_START_TIME).apply();
                            Boolean bool3 = Boolean.FALSE;
                            sDisableMultiProcess = bool3;
                            saveDisableMultiProcessStateIfNeed(bool3.booleanValue());
                            KVReportForMultiProcessDowngrade.report(2, i, getChildProcessCrashWatchCount(), getChildProcessCrashWatchTime(), KVReportForMultiProcessDowngrade.CRASH_TYPE_DOWNGRADE_CRASH_COUNT);
                            return false;
                        }
                        XWebLog.m21911i(TAG, "checkDisableMultiProcess, true for time not up, threshold time:" + getChildProcessCrashWatchTime());
                        Boolean bool4 = Boolean.TRUE;
                        sDisableMultiProcess = bool4;
                        saveDisableMultiProcessStateIfNeed(bool4.booleanValue());
                        return true;
                    } else if (i > getChildProcessCrashWatchCount()) {
                        XWebLog.m21911i(TAG, "checkDisableMultiProcess, true for crash count:" + i + ", threshold crash count:" + getChildProcessCrashWatchCount() + ", disable start time:" + getHumanReadableTime(currentTimeMillis));
                        sharedPreferencesForMultiProcess.edit().putLong(SP_KEY_LAST_DISABLE_START_TIME, currentTimeMillis).apply();
                        Boolean bool5 = Boolean.TRUE;
                        sDisableMultiProcess = bool5;
                        saveDisableMultiProcessStateIfNeed(bool5.booleanValue());
                        KVReportForMultiProcessDowngrade.report(1, i, getChildProcessCrashWatchCount(), getChildProcessCrashWatchTime(), KVReportForMultiProcessDowngrade.CRASH_TYPE_DOWNGRADE_CRASH_COUNT);
                        return true;
                    }
                }
            }
            XWebLog.m21911i(TAG, "checkDisableMultiProcess, false");
            Boolean bool6 = Boolean.FALSE;
            sDisableMultiProcess = bool6;
            saveDisableMultiProcessStateIfNeed(bool6.booleanValue());
            return false;
        }
    }

    private static void checkSwitchToSysIfNeed() {
        Boolean bool = sDisableMultiProcess;
        if (bool != null && !bool.booleanValue()) {
            int crashCount = getCrashCount();
            int childProcessCrashWatchCount = getChildProcessCrashWatchCount();
            XWebLog.m21911i(TAG, "checkSwitchToSysIfNeed, configCount:" + childProcessCrashWatchCount + ", currentCount:" + crashCount);
            if (crashCount > childProcessCrashWatchCount) {
                XWebLog.m21913w(TAG, "checkSwitchToSysIfNeed, switch to sys");
                setShouldSwitchToSys(true, KVReportForMultiProcessDowngrade.CRASH_TYPE_DOWNGRADE_CRASH_COUNT);
            }
        }
    }

    private static String childProcessCrashVersion() {
        return SP_KEY_CHILD_PROCESS_CRASH_VERSION + XWalkEnvironment.getAvailableVersion();
    }

    public static synchronized void decreaseCrashCount() {
        synchronized (XWebChildProcessMonitor.class) {
            SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
            if (sharedPreferencesForMultiProcess != null) {
                int max = Math.max(sharedPreferencesForMultiProcess.getInt(getCrashCountKeyForToday(), 0) - 1, 0);
                XWebLog.m21911i(TAG, "decreaseCrashCount, new crash count:" + max);
                sharedPreferencesForMultiProcess.edit().putInt(getCrashCountKeyForToday(), max).apply();
            }
        }
    }

    private static int getChildProcessCrashWatchCount() {
        return CommandCfg.getInstance().getCmdAsInt(CommandDef.COMMAND_CHILD_PROCESS_CRASH_WATCH_COUNT, XWalkEnvironment.MODULE_TOOLS, 5);
    }

    private static int getChildProcessCrashWatchTime() {
        return CommandCfg.getInstance().getCmdAsInt(CommandDef.COMMAND_CHILD_PROCESS_CRASH_WATCH_TIME, XWalkEnvironment.MODULE_TOOLS, 1440) * 60 * 1000;
    }

    private static int getCrashCount() {
        SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
        if (sharedPreferencesForMultiProcess != null) {
            return sharedPreferencesForMultiProcess.getInt(getCrashCountKeyForToday(), 0);
        }
        return 0;
    }

    private static String getCrashCountKeyForToday() {
        String str = sCrashCountKeyForToday;
        if (str != null) {
            return str;
        }
        sCrashCountKeyForToday = getCrashCountKeyForTodayInternal();
        XWebLog.m21911i(TAG, "getCrashCountKeyForToday, crashCountKeyForToday:" + sCrashCountKeyForToday);
        SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
        if (sharedPreferencesForMultiProcess != null) {
            for (String next : sharedPreferencesForMultiProcess.getAll().keySet()) {
                if (next.startsWith(SP_KEY_CHILD_PROCESS_CRASH_COUNT_DAY) && !sCrashCountKeyForToday.equals(next)) {
                    sharedPreferencesForMultiProcess.edit().remove(next).apply();
                }
            }
        }
        return sCrashCountKeyForToday;
    }

    private static String getCrashCountKeyForTodayInternal() {
        String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
        return SP_KEY_CHILD_PROCESS_CRASH_COUNT_DAY + format;
    }

    private static String getHumanReadableTime(long j) {
        return j <= 0 ? "0" : new Date(j).toLocaleString();
    }

    public static synchronized boolean getShouldSwitchToSys() {
        synchronized (XWebChildProcessMonitor.class) {
            SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
            if (!XWalkEnvironment.getPackageName().equalsIgnoreCase(XWalkEnvironment.getProcessName())) {
                return false;
            }
            boolean z = sharedPreferencesForMultiProcess.getBoolean(SP_KEY_SWITCH_TO_SYS, false);
            return z;
        }
    }

    private static boolean hasChildProcessCrash() {
        SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
        if (sharedPreferencesForMultiProcess == null || !sharedPreferencesForMultiProcess.contains(SP_KEY_CHILD_PROCESS_CRASH_KEY)) {
            return false;
        }
        String string = sharedPreferencesForMultiProcess.getString(SP_KEY_CHILD_PROCESS_CRASH_KEY, "");
        String childProcessCrashVersion = childProcessCrashVersion();
        XWebLog.m21913w(TAG, "hasChildProcessCrash, savedVersion:" + string + ", childProcessCrashVersion:" + childProcessCrashVersion);
        return string.equalsIgnoreCase(childProcessCrashVersion);
    }

    public static synchronized void increaseCrashCount() {
        synchronized (XWebChildProcessMonitor.class) {
            SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
            if (sharedPreferencesForMultiProcess != null) {
                int i = sharedPreferencesForMultiProcess.getInt(getCrashCountKeyForToday(), 0) + 1;
                XWebLog.m21911i(TAG, "increaseCrashCount, new crash count:" + i);
                sharedPreferencesForMultiProcess.edit().putInt(getCrashCountKeyForToday(), i).apply();
                checkSwitchToSysIfNeed();
            }
        }
    }

    public static synchronized void init() {
        synchronized (XWebChildProcessMonitor.class) {
            SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
            if (sharedPreferencesForMultiProcess != null && XWalkEnvironment.getPackageName().equalsIgnoreCase(XWalkEnvironment.getProcessName())) {
                XWebLog.m21911i(TAG, "init, remove disable multi process state & switch to sys flag");
                sharedPreferencesForMultiProcess.edit().remove(SP_KEY_DISABLE_MULTI_PROCESS_STATE).apply();
                sharedPreferencesForMultiProcess.edit().remove(SP_KEY_SWITCH_TO_SYS).apply();
            }
        }
    }

    public static boolean maybeWxdk() {
        SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
        if (sharedPreferencesForMultiProcess != null) {
            return sharedPreferencesForMultiProcess.getBoolean(SP_KEY_MAYBE_WXDK, false);
        }
        return false;
    }

    public static void recordChildProcessCrash(String str) {
        SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
        if (sharedPreferencesForMultiProcess != null) {
            sharedPreferencesForMultiProcess.edit().remove(SP_KEY_CHILD_PROCESS_CRASH_KEY).apply();
            String childProcessCrashVersion = childProcessCrashVersion();
            if (TextUtils.isEmpty(str)) {
                str = KVReportForMultiProcessDowngrade.CRASH_TYPE_DOWNGRADE_CHILD_PROCESS_CRASH;
            }
            XWebLog.m21913w(TAG, "recordChildProcessCrash, crashType:" + str + ", childProcessCrashVersion:" + childProcessCrashVersion);
            sharedPreferencesForMultiProcess.edit().putString(SP_KEY_CHILD_PROCESS_CRASH_KEY, childProcessCrashVersion).apply();
            KVReportForMultiProcessDowngrade.report(4, getCrashCount(), getChildProcessCrashWatchCount(), getChildProcessCrashWatchTime(), str);
        }
    }

    public static synchronized void resetCrashCount() {
        synchronized (XWebChildProcessMonitor.class) {
            XWebLog.m21911i(TAG, "resetCrashCount");
            SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
            if (sharedPreferencesForMultiProcess != null) {
                sharedPreferencesForMultiProcess.edit().remove(getCrashCountKeyForToday()).apply();
                sharedPreferencesForMultiProcess.edit().remove(SP_KEY_LAST_DISABLE_START_TIME).apply();
                sharedPreferencesForMultiProcess.edit().remove(SP_KEY_CHILD_PROCESS_CRASH_KEY).apply();
            }
        }
    }

    private static synchronized void saveDisableMultiProcessStateIfNeed(boolean z) {
        SharedPreferences sharedPreferencesForMultiProcess;
        synchronized (XWebChildProcessMonitor.class) {
            if (XWalkEnvironment.getPackageName().equalsIgnoreCase(XWalkEnvironment.getProcessName()) && (sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess()) != null) {
                XWebLog.m21911i(TAG, "saveDisableMultiProcessStateIfNeed, value:" + z);
                sharedPreferencesForMultiProcess.edit().putBoolean(SP_KEY_DISABLE_MULTI_PROCESS_STATE, z).apply();
            }
        }
    }

    public static void setMaybeWxdk(boolean z) {
        SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
        if (sharedPreferencesForMultiProcess != null) {
            XWebLog.m21913w(TAG, "setMaybeWxdk, flag:" + z);
            sharedPreferencesForMultiProcess.edit().putBoolean(SP_KEY_MAYBE_WXDK, z).apply();
            XWebSdk.appendAppInfo(ConstValue.APP_INFO_WXDK_USER);
        }
    }

    public static synchronized void setShouldSwitchToSys(boolean z, String str) {
        synchronized (XWebChildProcessMonitor.class) {
            SharedPreferences sharedPreferencesForMultiProcess = XWebSharedPreferenceUtil.getSharedPreferencesForMultiProcess();
            if (sharedPreferencesForMultiProcess != null) {
                sharedPreferencesForMultiProcess.edit().putBoolean(SP_KEY_SWITCH_TO_SYS, z).apply();
            }
            if (TextUtils.isEmpty(str)) {
                str = KVReportForMultiProcessDowngrade.CRASH_TYPE_DOWNGRADE_SYS;
            }
            XWebLog.m21913w(TAG, "setShouldSwitchToSys, flag:" + z + ", crashType:" + str);
            if (z) {
                KVReportForMultiProcessDowngrade.report(3, getCrashCount(), getChildProcessCrashWatchCount(), getChildProcessCrashWatchTime(), str);
            }
        }
    }
}
