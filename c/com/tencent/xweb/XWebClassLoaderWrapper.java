package com.tencent.xweb;

import android.util.Log;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.util.XWebFileUtil;
import com.tencent.xweb.util.XWebLog;
import dalvik.system.DexClassLoader;
import java.io.File;
import org.xwalk.core.XWalkEnvironment;

public class XWebClassLoaderWrapper {
    private static final String TAG = "XWebClassLoaderWrapper";
    private static boolean sApkLoadModeSetted = false;
    private static int supportApkLoadModeMinVersion = -1;

    public static boolean generateOptDex(int i) {
        try {
            return getXWebClassLoader(i) != null;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "generateOptDex error", th);
            return false;
        }
    }

    public static ClassLoader getChildProcessDexClassLoader(int i) {
        XWebLog.m21911i(TAG, "getChildProcessDexClassLoader, apkVersion:" + i);
        String downloadChildProcessApkPath = XWebFileUtil.getDownloadChildProcessApkPath(i);
        if (new File(downloadChildProcessApkPath).exists()) {
            return new DexClassLoader(downloadChildProcessApkPath, XWebFileUtil.getChildProcessOptimizedDexDir(i), (String) null, ClassLoader.getSystemClassLoader());
        }
        XWebLog.m21913w(TAG, "getChildProcessDexClassLoader, apk file not exist");
        return null;
    }

    public static ClassLoader getClassLoader(String str, String str2, String str3) {
        return getClassLoader(str, str2, str3, ClassLoader.getSystemClassLoader());
    }

    public static ClassLoader getXWebClassLoader() {
        return getXWebClassLoader(XWalkEnvironment.getAvailableVersion());
    }

    public static boolean isApkLoadMode(int i) {
        XWebLog.m21911i(TAG, "isApkLoadMode, current version:" + i);
        if (i >= 3000) {
            return true;
        }
        if (i <= 0) {
            return false;
        }
        if (!sApkLoadModeSetted) {
            sApkLoadModeSetted = true;
            supportApkLoadModeMinVersion = CommandCfg.getInstance().getCmdAsInt(CommandDef.COMMAND_APK_LOAD_MIN_VER, (String) null, -1);
            XWebLog.m21911i(TAG, "isApkLoadMode, support apk load min version:" + supportApkLoadModeMinVersion);
        }
        return i > supportApkLoadModeMinVersion;
    }

    private static ClassLoader getClassLoader(String str, String str2, String str3, ClassLoader classLoader) {
        XWebLog.m21911i(TAG, String.format("getClassLoader, dexPath:%s, optimizedDirectory:%s, librarySearchPath:%s", new Object[]{str, str2, str3}));
        return new DexClassLoader(str, str2, str3, classLoader);
    }

    public static ClassLoader getXWebClassLoader(int i) {
        ClassLoader classLoader;
        XWebLog.m21911i(TAG, "getXWebClassLoader, apkVersion:" + i);
        long currentTimeMillis = System.currentTimeMillis();
        if (i == -1) {
            XWebLog.m21911i(TAG, "getXWebClassLoader, version invalid");
            return null;
        }
        if (isApkLoadMode(i)) {
            String downloadApkPath = XWebFileUtil.getDownloadApkPath(i);
            if (!new File(downloadApkPath).exists()) {
                XWebLog.m21913w(TAG, "getXWebClassLoader, apk file not exist");
                return null;
            }
            classLoader = getClassLoader(downloadApkPath, XWebFileUtil.getOptimizedDexDir(i), XWebFileUtil.getExtractedCoreDir(i));
        } else {
            try {
                String classDexFilePath = XWebFileUtil.getClassDexFilePath(i);
                if (!new File(classDexFilePath).exists()) {
                    XWebLog.m21913w(TAG, "getXWebClassLoader, dex file not exist");
                    return null;
                }
                classLoader = getClassLoader(classDexFilePath, XWebFileUtil.getOptimizedDexDir(i), XWebFileUtil.getExtractedCoreDir(i));
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "getXWebClassLoader, error", th);
                return null;
            }
        }
        XWebLog.m21913w(TAG, "###### getXWebClassLoader, costTime:" + (System.currentTimeMillis() - currentTimeMillis) + ", stack:" + Log.getStackTraceString(new Exception("please ignore this exception")));
        return classLoader;
    }
}
