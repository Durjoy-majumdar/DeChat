package com.tencent.xweb.util;

import android.content.pm.PackageInfo;
import android.os.Looper;
import android.webkit.WebView;
import com.tencent.xweb.DeprecatedOutsideXWebSdk;
import org.xwalk.core.XWalkEnvironment;

public class ChromiumVersionUtil {
    private static final int INVALID_VERSION = 0;
    public static final String TAG = "ChromiumVersionUtil";
    private static int sNChromiumVersion;
    private static int sNChromiumVersionFromPackageInfo;

    public static int getChromiumVersion() {
        if (sNChromiumVersion <= 0) {
            sNChromiumVersion = getChromiumVersionInternal();
        }
        return sNChromiumVersion;
    }

    private static int getChromiumVersionFromPackageInfo() {
        int i = sNChromiumVersionFromPackageInfo;
        if (i > 0) {
            return i;
        }
        if (XWalkEnvironment.getApplicationContext() != null) {
            try {
                PackageInfo packageInfo = XWalkEnvironment.getApplicationContext().getPackageManager().getPackageInfo("com.google.android.webview", 0);
                if (packageInfo != null) {
                    int versionFromVersionName = getVersionFromVersionName(packageInfo.versionName);
                    sNChromiumVersionFromPackageInfo = versionFromVersionName;
                    if (versionFromVersionName > 0) {
                        return versionFromVersionName;
                    }
                }
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "getChromiumVersionFromPackageInfo failed, Android System WebView not found, error", th);
            }
        } else {
            XWebLog.m21911i(TAG, "getChromiumVersionFromPackageInfo, invalid context");
        }
        return 0;
    }

    private static int getChromiumVersionInternal() {
        String[] split;
        int chromiumVersionFromPackageInfo = getChromiumVersionFromPackageInfo();
        if (chromiumVersionFromPackageInfo > 0) {
            return chromiumVersionFromPackageInfo;
        }
        try {
            if (!runningOnUiThread()) {
                XWebLog.m21909e(TAG, "getChromiumVersionInternal NOT IN UI THREAD");
                return 0;
            }
            String userAgentString = new WebView(XWalkEnvironment.getApplicationContext()).getSettings().getUserAgentString();
            if (!(userAgentString == null || (split = userAgentString.split("Chrome/")) == null || split.length == 0)) {
                if (split.length != 1 || split[0].length() != userAgentString.length()) {
                    return getVersionFromVersionName(split[1]);
                }
            }
            return 0;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getChromiumVersionInternal failed, Android System WebView not found, error", th);
        }
        return 0;
    }

    private static int getVersionFromVersionName(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                return Integer.parseInt(str.split("\\.")[0]);
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "getVersionFromVersionName failed, versionName:" + str + ", error", th);
            }
        }
        return 0;
    }

    private static boolean runningOnUiThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static int safeGetChromiumVersion() {
        int chromiumVersionFromPackageInfo;
        if (sNChromiumVersion > 0 || (chromiumVersionFromPackageInfo = getChromiumVersionFromPackageInfo()) <= 0) {
            return sNChromiumVersion;
        }
        sNChromiumVersion = chromiumVersionFromPackageInfo;
        return chromiumVersionFromPackageInfo;
    }
}
