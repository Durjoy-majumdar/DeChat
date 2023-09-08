package com.tencent.thumbplayer.core.common;

import android.content.Context;
import android.text.TextUtils;
import j20.C117292a;
import k20.C9556a;

public class TPNativeLibraryLoader {
    private static final String DEFAULT_LIB_PLAYER_CORE_VERSION = "2.33.0.1016.wechat";
    private static final String MAIN_PLAYER_CORE_VERSION = "2.33.0";
    private static boolean mIsLibLoaded = false;
    private static Object mIsLibLoadedLock = new Object();
    private static final boolean mIsNeedLoadThirdPartiesAndFFmpeg = false;
    private static final String mLibFFmpegPrefix = "TPFFmpeg-master";
    private static ITPNativeLibraryExternalLoader mLibLoader = null;
    private static final boolean mLibNameHasArchSuffix = false;
    private static final String mLibPlayerCorePrefix = "TPCore-master";
    private static final String mLibThirdPartiesPrefix = "TPThirdParties-master";
    private static final int mPlayerCoreSupportMinAndroidAPILevel = 14;
    private byte _hellAccFlag_;

    private static native String _getPlayerCoreVersion();

    public static String getLibVersion() {
        return getPlayerCoreVersion();
    }

    public static String getPlayerCoreVersion() {
        try {
            return _getPlayerCoreVersion();
        } catch (Throwable unused) {
            TPNativeLog.printLog(2, "getPlayerCoreVersion: *.so is not loaded yet, return the hard-coded version number:2.33.0.1016.wechat");
            return DEFAULT_LIB_PLAYER_CORE_VERSION;
        }
    }

    public static boolean isLibLoaded() {
        return mIsLibLoaded;
    }

    public static boolean isLibLoadedAndTryToLoad() {
        boolean z;
        try {
            loadLibIfNeeded((Context) null);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, "TPNativeLibraryLoader isLibLoaded error:" + th.getMessage());
        }
        synchronized (mIsLibLoadedLock) {
            z = mIsLibLoaded;
        }
        return z;
    }

    private static boolean isMatchJavaAndPlayerCore(String str, String str2) {
        TPNativeLog.printLog(2, "javaVersion:" + str + ", coreVersion:" + str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        if (split.length < 3 || split2.length < 3) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (!split[i].matches(split2[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean loadLib(Context context) {
        TPNativeLog.printLog(2, "loadLib cpu arch:" + TPSystemInfo.getCpuArchitecture());
        if (TPSystemInfo.getApiLevel() < 14) {
            TPNativeLog.printLog(3, "so load failed, current api level " + TPSystemInfo.getApiLevel() + " is less than " + 14);
            return false;
        } else if (TPSystemInfo.getCpuArchitecture() == 3 || TPSystemInfo.getCpuArchitecture() == 4 || TPSystemInfo.getCpuArchitecture() == 0) {
            return false;
        } else {
            ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader = mLibLoader;
            boolean loadLib = iTPNativeLibraryExternalLoader != null ? iTPNativeLibraryExternalLoader.loadLib(mLibPlayerCorePrefix, DEFAULT_LIB_PLAYER_CORE_VERSION) : loadLibDefault(mLibPlayerCorePrefix, context);
            if (loadLib) {
                String playerCoreVersion = getPlayerCoreVersion();
                boolean isMatchJavaAndPlayerCore = isMatchJavaAndPlayerCore(MAIN_PLAYER_CORE_VERSION, playerCoreVersion);
                if (!isMatchJavaAndPlayerCore) {
                    TPNativeLog.printLog(4, "nativePlayerCoreVer(" + playerCoreVersion + ") doesn't match javaPlayerCoreVer:(" + MAIN_PLAYER_CORE_VERSION + ")");
                }
                loadLib = isMatchJavaAndPlayerCore;
            }
            if (loadLib) {
                TPNativeLog.printLog(2, "Native libs loaded successfully");
            } else {
                TPNativeLog.printLog(4, "Failed to load native libs");
            }
            return loadLib;
        }
    }

    private static boolean loadLibDefault(String str, Context context) {
        boolean z = false;
        try {
            TPNativeLog.printLog(2, "loadLibDefault loading " + str);
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/thumbplayer/core/common/TPNativeLibraryLoader", "loadLibDefault", "(Ljava/lang/String;Landroid/content/Context;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/thumbplayer/core/common/TPNativeLibraryLoader", "loadLibDefault", "(Ljava/lang/String;Landroid/content/Context;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            z = true;
            TPNativeLog.printLog(2, "loadLibDefault " + str + " loaded successfully");
        } catch (Throwable th) {
            TPNativeLog.printLog(4, "loadLibDefault failed to load " + str + "," + th.getMessage());
        }
        if (!z && context != null && TPSystemInfo.getCpuArchitecture() >= 6) {
            try {
                TPNativeLog.printLog(2, "loadLibDefault try to load " + str + " from APK");
                z = TPLoadLibFromApk.load(str, TPNativeLibraryLoader.class.getClassLoader(), context);
                if (z) {
                    TPNativeLog.printLog(2, "loadLibDefault loaded " + str + " from APK successfully");
                } else {
                    TPNativeLog.printLog(4, "loadLibDefault loaded " + str + " from APK failed");
                }
            } catch (Throwable th4) {
                TPNativeLog.printLog(4, "loadLibDefault loaded " + str + " from APK failed," + th4.getMessage());
            }
        }
        return z;
    }

    public static void loadLibIfNeeded(Context context) {
        synchronized (mIsLibLoadedLock) {
            if (!mIsLibLoaded) {
                boolean loadLib = loadLib(context);
                mIsLibLoaded = loadLib;
                if (loadLib) {
                    TPNativeLog.printLog(2, "TPNativeLibraryLoader load lib successfully");
                } else {
                    TPNativeLog.printLog(2, "TPNativeLibraryLoader load lib failed");
                }
            }
            if (!mIsLibLoaded) {
                throw new UnsupportedOperationException("Failed to load native library");
            }
        }
    }

    public static void setLibLoader(ITPNativeLibraryExternalLoader iTPNativeLibraryExternalLoader) {
        mLibLoader = iTPNativeLibraryExternalLoader;
    }
}
