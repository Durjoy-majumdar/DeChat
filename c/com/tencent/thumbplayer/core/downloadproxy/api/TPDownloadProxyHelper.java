package com.tencent.thumbplayer.core.downloadproxy.api;

import android.content.Context;
import com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils;

public class TPDownloadProxyHelper {
    private static final String FILE_NAME = "TPDownloadProxyHelper";
    private static Context applicationContext;
    private static ITPOfflineVinfoAdapter offlineVinfoAdapter;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = offlineVinfoAdapter;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String checkVideoStatus(java.lang.String r2, java.lang.String r3) {
        /*
            boolean r0 = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.canUseService()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineVinfoAdapter r0 = offlineVinfoAdapter
            if (r0 == 0) goto L_0x0012
            java.lang.String r2 = r0.checkVideoStatus(r2, r3)
            return r2
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper.checkVideoStatus(java.lang.String, java.lang.String):java.lang.String");
    }

    public static Context getContext() {
        return applicationContext;
    }

    public static String getHLSOfflineExttag(String str, String str2, int i, long j) {
        try {
            return TPDownloadProxyNative.getInstance().isNativeLoaded() ? TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getHLSOfflineExttag(str, str2, i, j)) : "";
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "get exttag failed, error:" + th.toString());
            return "";
        }
    }

    public static String getNativeInfo(int i) {
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return null;
        }
        try {
            return TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getNativeInfo(i));
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getNativeInfo failed, error:" + th.toString());
            return null;
        }
    }

    public static String getNativeLibVersion() {
        return TPDownloadProxyFactory.getNativeVersion();
    }

    public static int getRecordDuration(String str, String str2) {
        ITPOfflineVinfoAdapter iTPOfflineVinfoAdapter = offlineVinfoAdapter;
        if (iTPOfflineVinfoAdapter != null) {
            return iTPOfflineVinfoAdapter.getRecordDuration(str, str2);
        }
        return -1;
    }

    public static boolean isReadyForPlay() {
        return TPDownloadProxyFactory.isReadyForPlay();
    }

    public static void setContext(Context context) {
        applicationContext = context;
    }

    public static void setNativeLibLoader(ITPDLProxyNativeLibLoader iTPDLProxyNativeLibLoader) {
        TPDownloadProxyNative.getInstance().setLibLoader(iTPDLProxyNativeLibLoader);
    }

    public static void setTPOfflineVinfoAdapter(ITPOfflineVinfoAdapter iTPOfflineVinfoAdapter) {
        offlineVinfoAdapter = iTPOfflineVinfoAdapter;
    }

    public static void setTPProxyAdapter(ITPProxyAdapter iTPProxyAdapter) {
    }

    public static void setUseService(boolean z) {
        TPDownloadProxyFactory.setUseService(z);
    }

    public static void setUserData(String str, Object obj) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().setUserData(str, obj.toString());
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setUserData failed, error:" + th.toString());
            }
        }
    }

    public static long verifyOfflineCacheSync(String str, int i, String str2, String str3) {
        try {
            if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
                return TPDownloadProxyNative.getInstance().verifyOfflineCacheSync(str, i, str2, str3);
            }
            return -1;
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "verify offline cache failed, error:" + th.toString());
            return -1;
        }
    }
}
