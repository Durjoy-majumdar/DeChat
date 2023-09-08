package com.tencent.xweb.util;

import android.content.Context;
import android.content.SharedPreferences;
import org.xwalk.core.XWalkEnvironment;

public class XWebCoreInfo {
    public static final int INVALID_VERSION = -1;
    private static final String STR_TAG_USING_CORE_VERSION = "using_core_version_";
    private static final String STR_TAG_VERSION = "version";
    private static final String STR_TAG_VERSION_DETAIL = "versionDetail";
    private static final String TAG = "XWebCoreInfo";
    public String strAbi;
    public int ver;
    public String verDetail;

    public XWebCoreInfo() {
    }

    private static String getBackupKey(String str, String str2) {
        return "back_core_" + str2 + "_for_" + str;
    }

    public static int getInstalledNewestVersionForCurAbi(Context context) {
        if (context == null) {
            XWebLog.m21913w(TAG, "getInstalledNewestVersionForCurAbi, context is null, return -1");
            return -1;
        }
        if (XWalkEnvironment.getApplicationContext() == null) {
            XWalkEnvironment.init(context);
        }
        return XWebSharedPreferenceUtil.getSharedPreferencesForVersionInfo().getInt(getBackupKey(AbiUtil.getRuntimeAbi(), "version"), -1);
    }

    public static XWebCoreInfo getVersionInfoForAbi(String str) {
        XWebCoreInfo xWebCoreInfo = new XWebCoreInfo();
        SharedPreferences sharedPreferencesForVersionInfo = XWebSharedPreferenceUtil.getSharedPreferencesForVersionInfo();
        xWebCoreInfo.strAbi = str;
        xWebCoreInfo.ver = sharedPreferencesForVersionInfo.getInt(getBackupKey(str, "version"), -1);
        xWebCoreInfo.verDetail = sharedPreferencesForVersionInfo.getString(getBackupKey(str, STR_TAG_VERSION_DETAIL), "");
        return xWebCoreInfo;
    }

    public static boolean isCoreVersionUsing(int i) {
        SharedPreferences sharedPreferencesForUsingCoreVersion = XWebSharedPreferenceUtil.getSharedPreferencesForUsingCoreVersion();
        if (sharedPreferencesForUsingCoreVersion == null) {
            return false;
        }
        boolean contains = sharedPreferencesForUsingCoreVersion.contains(STR_TAG_USING_CORE_VERSION + i);
        XWebLog.m21911i(TAG, "core version(" + i + ") is using:" + contains);
        return contains;
    }

    public static void resetUsingCoreVersionIfNeed() {
        SharedPreferences sharedPreferencesForUsingCoreVersion = XWebSharedPreferenceUtil.getSharedPreferencesForUsingCoreVersion();
        if (sharedPreferencesForUsingCoreVersion != null && XWalkEnvironment.getPackageName().equalsIgnoreCase(XWalkEnvironment.getProcessName())) {
            XWebLog.m21911i(TAG, "reset using core version in main process");
            sharedPreferencesForUsingCoreVersion.edit().clear().apply();
        }
    }

    public static void saveUsingCoreVersion(int i) {
        SharedPreferences sharedPreferencesForUsingCoreVersion = XWebSharedPreferenceUtil.getSharedPreferencesForUsingCoreVersion();
        if (sharedPreferencesForUsingCoreVersion != null) {
            XWebLog.m21911i(TAG, "save using core version:" + i);
            SharedPreferences.Editor edit = sharedPreferencesForUsingCoreVersion.edit();
            edit.putBoolean(STR_TAG_USING_CORE_VERSION + i, true).apply();
        }
    }

    public static boolean setVersionInfo(int i, String str, String str2) {
        SharedPreferences.Editor edit = XWebSharedPreferenceUtil.getSharedPreferencesForVersionInfo().edit();
        edit.putInt(getBackupKey(str2, "version"), i);
        edit.putString(getBackupKey(str2, STR_TAG_VERSION_DETAIL), str);
        boolean commit = edit.commit();
        if (commit && i > 0 && !AbiUtil.getRuntimeAbi().equalsIgnoreCase(str2)) {
            if (XWalkEnvironment.RUNTIME_ABI_ARM32_STR.equalsIgnoreCase(str2)) {
                WXWebReporter.idkeyReport(577, 238, 1);
            } else if (XWalkEnvironment.RUNTIME_ABI_ARM64_STR.equalsIgnoreCase(str2)) {
                WXWebReporter.idkeyReport(577, 239, 1);
            }
        }
        XWebLog.addInitializeLog(TAG, "setVersionInfo, version:" + i + ", abi:" + str2 + ", detail:" + str);
        return commit;
    }

    public String toString() {
        return "XWebCoreInfo{ver=" + this.ver + ", verDetail='" + this.verDetail + '\'' + ", strAbi='" + this.strAbi + '\'' + '}';
    }

    public XWebCoreInfo(int i, String str, String str2) {
        this.ver = i;
        this.verDetail = str;
        this.strAbi = str2;
    }

    public static boolean setVersionInfo(XWebCoreInfo xWebCoreInfo) {
        if (xWebCoreInfo != null) {
            return setVersionInfo(xWebCoreInfo.ver, xWebCoreInfo.verDetail, xWebCoreInfo.strAbi);
        }
        XWebLog.m21913w(TAG, "setVersionInfo, info is null");
        return false;
    }
}
