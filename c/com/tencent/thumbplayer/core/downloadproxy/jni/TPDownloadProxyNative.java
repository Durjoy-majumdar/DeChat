package com.tencent.thumbplayer.core.downloadproxy.jni;

import android.content.Context;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyNativeLibLoader;
import com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils;
import j20.C117292a;
import k20.C9556a;

public class TPDownloadProxyNative {
    private static final String FILE_NAME = "TPDownloadProxyNative";
    private static Context appContext;
    private static boolean isLoadDownloadProxySucceed;
    private byte _hellAccFlag_;
    private ITPDLProxyNativeLibLoader mLibLoader;

    public static class SingletonHolder {
        /* access modifiers changed from: private */
        public static final TPDownloadProxyNative INSTANCE = new TPDownloadProxyNative();

        private SingletonHolder() {
        }
    }

    private TPDownloadProxyNative() {
    }

    public static TPDownloadProxyNative getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static int nativeIntMessageCallback(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return TPListenerManager.getInstance().handleIntCallbackMessage(i, i2, obj, obj2, obj3, obj4, obj5);
    }

    private static void nativeLogCallback(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) {
        if (i == 6) {
            TPDLProxyLog.m21865e(TPDLProxyUtils.byteArrayToString(bArr), i2, TPDLProxyUtils.byteArrayToString(bArr2), TPDLProxyUtils.byteArrayToString(bArr3));
        } else if (i == 5) {
            TPDLProxyLog.m21867w(TPDLProxyUtils.byteArrayToString(bArr), i2, TPDLProxyUtils.byteArrayToString(bArr2), TPDLProxyUtils.byteArrayToString(bArr3));
        } else if (i == 4) {
            TPDLProxyLog.m21866i(TPDLProxyUtils.byteArrayToString(bArr), i2, TPDLProxyUtils.byteArrayToString(bArr2), TPDLProxyUtils.byteArrayToString(bArr3));
        } else if (i == 3) {
            TPDLProxyLog.m21864d(TPDLProxyUtils.byteArrayToString(bArr), i2, TPDLProxyUtils.byteArrayToString(bArr2), TPDLProxyUtils.byteArrayToString(bArr3));
        } else {
            TPDLProxyLog.m21866i(TPDLProxyUtils.byteArrayToString(bArr), i2, TPDLProxyUtils.byteArrayToString(bArr2), TPDLProxyUtils.byteArrayToString(bArr3));
        }
    }

    private static void nativeMessageCallback(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        TPListenerManager.getInstance().handleCallbackMessage(i, i2, obj, obj2, obj3, obj4, obj5);
    }

    private static String nativeStringMessageCallback(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return TPListenerManager.getInstance().handleStringCallbackMessage(i, i2, obj, obj2, obj3, obj4, obj5);
    }

    public native int checkResourceStatus(String str, String str2, int i);

    public native int clearCache(String str, String str2, int i);

    public native int createDownloadTask(int i, String str, int i2, int i3);

    public native int deInitService(int i);

    public native int deleteCache(String str, String str2);

    public Context getAppContext() {
        return appContext;
    }

    public native byte[] getClipPlayUrl(int i, int i2, int i3);

    public native byte[] getErrorCodeStr(int i);

    public native byte[] getHLSOfflineExttag(String str, String str2, int i, long j);

    public native byte[] getNativeInfo(int i);

    public String getNativeVersion() {
        String byteArrayToString = isLoadDownloadProxySucceed ? TPDLProxyUtils.byteArrayToString(getVersion()) : "2.20.0.00016";
        TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "get native version:" + byteArrayToString);
        return byteArrayToString;
    }

    public native long getResourceSize(String str, String str2);

    public native byte[] getVersion();

    public native int initService(int i, String str, String str2, String str3);

    public boolean isNativeLoaded() {
        if (!isLoadDownloadProxySucceed) {
            try {
                ITPDLProxyNativeLibLoader iTPDLProxyNativeLibLoader = this.mLibLoader;
                if (iTPDLProxyNativeLibLoader != null) {
                    isLoadDownloadProxySucceed = iTPDLProxyNativeLibLoader.loadLib("DownloadProxy", getNativeVersion());
                    StringBuilder sb = new StringBuilder();
                    sb.append("third module so load ret:");
                    sb.append(isLoadDownloadProxySucceed ? "0" : "1");
                    TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, sb.toString());
                }
            } catch (Throwable th) {
                isLoadDownloadProxySucceed = false;
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "third module so load failed, error:" + th.toString());
            }
            try {
                if (!isLoadDownloadProxySucceed) {
                    C9556a aVar = new C9556a();
                    aVar.mo10233c("DownloadProxy");
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/thumbplayer/core/downloadproxy/jni/TPDownloadProxyNative", "isNativeLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    System.loadLibrary((String) aVar.mo10231a(0));
                    C117292a.m165359e(obj, "com/tencent/thumbplayer/core/downloadproxy/jni/TPDownloadProxyNative", "isNativeLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    isLoadDownloadProxySucceed = true;
                    TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "system so load success!");
                }
            } catch (Throwable th4) {
                isLoadDownloadProxySucceed = false;
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "system so load failed, error:" + th4.toString());
            }
        }
        return isLoadDownloadProxySucceed;
    }

    public native boolean isNativeReadyForWork();

    public boolean isReadyForWork() {
        if (isLoadDownloadProxySucceed) {
            return isNativeReadyForWork();
        }
        return false;
    }

    public native int pauseDownload(int i);

    public native void pushEvent(int i);

    public native int resumeDownload(int i);

    public void setAppContext(Context context) {
        if (context != null) {
            appContext = context.getApplicationContext();
        }
    }

    public native int setClipInfo(int i, int i2, String str, int i3, String str2, String str3, String str4);

    public void setLibLoader(ITPDLProxyNativeLibLoader iTPDLProxyNativeLibLoader) {
        TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "set third module so loader!!!");
        this.mLibLoader = iTPDLProxyNativeLibLoader;
    }

    public native int setMaxStorageSizeMB(int i, long j);

    public native void setPlayerState(int i, int i2);

    public native void setServiceConfig(int i, String str);

    public native void setUserData(String str, String str2);

    public native int startDownload(int i);

    public native int stopAllDownload(int i);

    public native int stopDownload(int i);

    public native void updatePlayerPlayMsg(int i, int i2, int i3, int i4);

    public native int updateStoragePath(int i, String str);

    public native void updateTaskInfo(int i, String str, String str2);

    public native long verifyOfflineCacheSync(String str, int i, String str2, String str3);
}
