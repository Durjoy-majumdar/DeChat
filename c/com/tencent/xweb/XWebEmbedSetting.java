package com.tencent.xweb;

import android.text.TextUtils;
import com.tencent.xweb.util.XWebLog;
import java.io.File;
import java.util.List;
import org.xwalk.core.XWalkEnvironment;

public class XWebEmbedSetting {
    private static final String TAG = "XWebEmbedSetting";
    private static List<File> sFileList = null;
    private static boolean sForbidDownloadCode = false;
    private static boolean sIsEmbedDirReady = true;
    private static String sLibDir;

    public static synchronized String getEmbedInstallLibDir() {
        synchronized (XWebEmbedSetting.class) {
            if (!TextUtils.isEmpty(sLibDir)) {
                String str = sLibDir;
                return str;
            }
            String str2 = XWalkEnvironment.getApplicationContext().getApplicationInfo().nativeLibraryDir;
            return str2;
        }
    }

    public static synchronized boolean getForbidDownloadCode() {
        boolean z;
        synchronized (XWebEmbedSetting.class) {
            z = sForbidDownloadCode || XWalkEnvironment.getBuildConfigNeedTurnOffDynamicCode();
        }
        return z;
    }

    public static synchronized boolean getIsEmbedDirReady() {
        boolean z;
        synchronized (XWebEmbedSetting.class) {
            z = sIsEmbedDirReady;
        }
        return z;
    }

    public static synchronized List<File> getSoLibDirs() {
        List<File> list;
        synchronized (XWebEmbedSetting.class) {
            list = sFileList;
        }
        return list;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static synchronized void setEmbedInstallLibDir(String str) {
        synchronized (XWebEmbedSetting.class) {
            XWebLog.m21911i(TAG, "setEmbedInstallLibDir:" + str);
            sLibDir = str;
        }
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static synchronized void setForbidDownloadCode(boolean z) {
        synchronized (XWebEmbedSetting.class) {
            XWebLog.m21911i(TAG, "setForbidDownloadCode:" + z);
            sForbidDownloadCode = z;
        }
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static synchronized void setIsEmbedDirReady(boolean z) {
        synchronized (XWebEmbedSetting.class) {
            XWebLog.m21911i(TAG, "setIsEmbedDirReady:" + z);
            sIsEmbedDirReady = z;
        }
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static synchronized void setSoLibDirs(List<File> list) {
        synchronized (XWebEmbedSetting.class) {
            sFileList = list;
        }
    }
}
