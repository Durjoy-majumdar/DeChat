package com.tencent.midas.plugin;

import android.content.Context;
import android.text.TextUtils;
import com.pay.tool.APMidasTools;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.data.APPluginReportManager;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.HashMap;

public class APPluginLoader {
    private static DexClassLoader parentClassLoader = null;
    private static final HashMap<String, DexClassLoader> sClassLoaderMap = new HashMap<>();

    public static synchronized ClassLoader getClassLoader(String str, String str2) {
        ClassLoader classLoader;
        synchronized (APPluginLoader.class) {
            HashMap<String, DexClassLoader> hashMap = sClassLoaderMap;
            classLoader = hashMap.get(str + "_" + str2);
        }
        return classLoader;
    }

    public static synchronized ClassLoader getOrCreateClassLoader(Context context, String str) {
        DexClassLoader orCreateClassLoaderByPath;
        synchronized (APPluginLoader.class) {
            orCreateClassLoaderByPath = getOrCreateClassLoaderByPath(context, str, APPluginInstallerAndUpdater.getInstallPath(context, str).getCanonicalPath());
            APLog.m161210d("APPluginStatic", "getClassLoader getOrCreateClassLoader midasClassLoader: " + orCreateClassLoaderByPath.hashCode());
        }
        return orCreateClassLoaderByPath;
    }

    public static synchronized DexClassLoader getOrCreateClassLoaderByPath(Context context, String str, String str2) {
        synchronized (APPluginLoader.class) {
            String mD5FromPath = APPluginUtils.getMD5FromPath(str2);
            String str3 = str + "_" + mD5FromPath;
            HashMap<String, DexClassLoader> hashMap = sClassLoaderMap;
            DexClassLoader dexClassLoader = hashMap.get(str3);
            APLog.m161210d("APPluginStatic", "getOrCreateClassLoader apkFilePath: " + str2 + ", MD5: " + mD5FromPath + ", key: " + str3 + ", dexClassLoader: " + dexClassLoader);
            if (dexClassLoader != null) {
                return dexClassLoader;
            }
            try {
                if (!APPluginChecker.isPluginValid(str2, mD5FromPath)) {
                    APLog.m161212e("APPluginStatic", "getOrCreateClassLoader isPluginValid false");
                    return null;
                }
                String canonicalPath = APPluginConfig.getOptimizedDexPath(context).getCanonicalPath();
                long currentTimeMillis = System.currentTimeMillis();
                APPluginUtils.extractLibs(str2, APPluginConfig.getLibPath(context).getCanonicalPath());
                APPluginReportManager.getInstance().insertTimeDataEx(APMidasTools.getCurrentThreadName(Thread.currentThread()), APPluginReportManager.MIDASPLUGIN_TIMENAME_UNZIP_SO, currentTimeMillis);
                String canonicalPath2 = APPluginConfig.getLibPath(context).getCanonicalPath();
                DexClassLoader dexClassLoader2 = parentClassLoader != null ? new DexClassLoader(str2, canonicalPath, canonicalPath2, parentClassLoader) : new DexClassLoader(str2, canonicalPath, canonicalPath2, context.getClassLoader());
                APLog.m161210d("APPluginStatic", "getOrCreateClassLoader new DexClassLoader cache: " + canonicalPath + " libDir: " + canonicalPath2);
                hashMap.put(str3, dexClassLoader2);
                return dexClassLoader2;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static synchronized void preCreateClassLoaderByPath(Context context) {
        synchronized (APPluginLoader.class) {
            String str = "";
            String str2 = "";
            File pluginPath = APPluginConfig.getPluginPath(context);
            if (pluginPath != null) {
                File[] listFiles = pluginPath.listFiles();
                int i = 0;
                while (true) {
                    if (i >= listFiles.length) {
                        break;
                    }
                    File file = listFiles[i];
                    if (file.getName().startsWith("MidasPay")) {
                        str = "MidasPay";
                        str2 = file.getCanonicalPath();
                        break;
                    }
                    i++;
                }
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                getOrCreateClassLoaderByPath(context, str, str2);
            }
        }
    }

    public static void release() {
        sClassLoaderMap.clear();
    }

    public static void setParentClassLoader(DexClassLoader dexClassLoader) {
        parentClassLoader = dexClassLoader;
    }
}
