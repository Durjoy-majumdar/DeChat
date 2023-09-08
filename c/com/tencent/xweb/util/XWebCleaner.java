package com.tencent.xweb.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.WebDebugCfg;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.report.KVReportForCheckFiles;
import com.tencent.xweb.report.KVReportForCheckStorage;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import com.tencent.xweb.xwalk.plugin.XWalkPluginManager;
import java.io.File;
import java.util.HashSet;
import nu3.C117640b;
import org.xwalk.core.XWalkEnvironment;

public class XWebCleaner {
    public static final String CHECK_FILES_MD5_TIME_KEY = "CHECK_FILES_MD5_TIME_KEY";
    public static final int MIN_APK_VERSION_HAS_RESOURCE_CONFIG_FILE = 362;
    private static final String TAG = "XWebCleaner";
    /* access modifiers changed from: private */
    public static volatile boolean sIsBusy;

    public static void checkFiles(boolean z) {
        boolean z2;
        int availableVersion = XWalkEnvironment.getAvailableVersion();
        if (availableVersion <= 0 || XWalkEnvironment.isTestVersion(availableVersion)) {
            XWebLog.m21911i(TAG, "checkFiles, invalid available version, version:" + availableVersion);
            return;
        }
        SharedPreferences sharedPreferencesForUpdateConfig = XWebSharedPreferenceUtil.getSharedPreferencesForUpdateConfig();
        if (sharedPreferencesForUpdateConfig == null) {
            XWebLog.m21911i(TAG, "checkFiles, invalid shared preferences");
        } else if (z || FrequentLimiter.canDo(CHECK_FILES_MD5_TIME_KEY, Scheduler.RE_SCHEDULER_APPEND_TIME)) {
            KVReportForCheckFiles.reset();
            XWebLog.m21911i(TAG, "checkFiles, start check res files, version:" + availableVersion);
            boolean doCheckResFiles = doCheckResFiles(availableVersion);
            if (!doCheckResFiles) {
                int i = sharedPreferencesForUpdateConfig.getInt("lastCheckResVersion", -1);
                sharedPreferencesForUpdateConfig.edit().putInt("lastCheckResVersion", -1).commit();
                if (i != availableVersion) {
                    WXWebReporter.idkeyReport(77, 1);
                    XWebLog.m21911i(TAG, "checkFiles, some res files corrupted at first time");
                } else {
                    XWebLog.m21911i(TAG, "checkFiles, some res files corrupted");
                }
                WXWebReporter.idkeyReport(76, 1);
            }
            XWebLog.m21911i(TAG, "checkFiles, start check installed files, version:" + availableVersion);
            boolean doCheckFiles = doCheckFiles(availableVersion);
            if (!doCheckFiles) {
                int i2 = sharedPreferencesForUpdateConfig.getInt("lastCheckVersion", -1);
                sharedPreferencesForUpdateConfig.edit().putInt("lastCheckVersion", -1).commit();
                if (i2 != availableVersion) {
                    WXWebReporter.idkeyReport(64, 1);
                    XWebLog.m21911i(TAG, "checkFiles, some installed files corrupted at first time");
                } else {
                    XWebLog.m21911i(TAG, "checkFiles, some installed files corrupted");
                }
                WXWebReporter.idkeyReport(63, 1);
            }
            if (!"true".equalsIgnoreCase(CommandCfg.getInstance().getCmd(CommandDef.COMMAND_DISABLE_RES_CHECK, XWalkEnvironment.MODULE_TOOLS))) {
                z2 = doCheckFiles & doCheckResFiles;
            } else {
                XWebLog.m21911i(TAG, "checkFiles, ignore res files check");
                z2 = doCheckFiles;
            }
            if (!z2) {
                KVReportForCheckFiles.report(doCheckResFiles, doCheckFiles, false);
                XWebLog.m21909e(TAG, "checkFiles, check failed");
                XWalkEnvironment.setCoreVersionInfo(-1, (String) null, AbiUtil.getRuntimeAbi());
                return;
            }
            sharedPreferencesForUpdateConfig.edit().putInt("lastCheckVersion", availableVersion).commit();
            XWebLog.m21911i(TAG, "checkFiles success");
        } else {
            XWebLog.m21911i(TAG, "checkFiles, skip check");
        }
    }

    public static void checkStorage(Context context) {
        if (WebDebugCfg.getInst().getEnableCheckStorage() || CommandCfg.getInstance().getEnableCheckStorage()) {
            File[] listFiles = new File(context.getApplicationInfo().dataDir).listFiles();
            if (listFiles == null) {
                XWebLog.m21909e(TAG, "checkStorage failed, files is null");
                return;
            }
            KVReportForCheckStorage kVReportForCheckStorage = new KVReportForCheckStorage();
            long j = 0;
            for (File file : listFiles) {
                String name = file.getName();
                if (name.startsWith("app_xwalk_") && file.isDirectory()) {
                    j += getTotalCoreSize(kVReportForCheckStorage, file, name);
                } else if (name.startsWith("app_xwalkconfig") && file.isDirectory()) {
                    long fileSize = FileUtils.getFileSize(file, true);
                    j += fileSize;
                    XWebLog.m21911i(TAG, "checkStorage, config dir:" + name + ", size:" + FileUtils.humanReadableByteCount(fileSize));
                    kVReportForCheckStorage.setConfigSize(fileSize);
                } else if (name.startsWith("app_xwalkplugin") && file.isDirectory()) {
                    getTotalPluginSize(kVReportForCheckStorage, file);
                }
            }
            if (j > 0) {
                XWebLog.m21911i(TAG, "checkStorage, app_xwalk total size:" + FileUtils.humanReadableByteCount(j));
                kVReportForCheckStorage.setAppXWalkTotalSize(j);
                kVReportForCheckStorage.report();
                return;
            }
            return;
        }
        XWebLog.m21911i(TAG, "checkStorage, disabled by command");
    }

    public static void clearAllVersion(Context context) {
        if (context == null || context.getApplicationInfo() == null || context.getApplicationInfo().dataDir == null) {
            XWebLog.m21909e(TAG, "clearAllVersion failed, context is null");
            return;
        }
        File file = new File(context.getApplicationInfo().dataDir);
        if (!file.exists()) {
            XWebLog.m21909e(TAG, "clearAllVersion failed, dataDir not exist");
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            XWebLog.m21909e(TAG, "clearAllVersion failed, files is null");
            return;
        }
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (name.startsWith("app_xwalk_") && file2.isDirectory()) {
                XWebLog.m21911i(TAG, "clearAllVersion, version:" + name);
                FileUtils.deleteAll(file2.getAbsolutePath());
            }
        }
        XWalkEnvironment.setCoreVersionInfo(-1, (String) null, XWalkEnvironment.RUNTIME_ABI_ARM32_STR);
        XWalkEnvironment.setCoreVersionInfo(-1, (String) null, XWalkEnvironment.RUNTIME_ABI_ARM64_STR);
    }

    private static void clearOldXWebCore(Context context) {
        if (context == null) {
            XWebLog.m21909e(TAG, "clearOldXWebCore failed, invalid context");
            return;
        }
        File[] listFiles = new File(context.getApplicationInfo().dataDir).listFiles();
        if (listFiles == null) {
            XWebLog.m21909e(TAG, "clearOldXWebCore failed, files is null");
            return;
        }
        HashSet<String> keepVersionSet = getKeepVersionSet();
        int availableVersion = XWalkEnvironment.getAvailableVersion();
        int i = 0;
        int i2 = 0;
        for (File apkVersion : listFiles) {
            int apkVersion2 = getApkVersion(apkVersion);
            if (apkVersion2 >= 0 && apkVersion2 != availableVersion) {
                if (apkVersion2 >= i) {
                    i2 = i;
                    i = apkVersion2;
                } else if (apkVersion2 >= i2) {
                    i2 = apkVersion2;
                }
            }
        }
        int installedNewstVersion = XWalkEnvironment.getInstalledNewstVersion(XWalkEnvironment.RUNTIME_ABI_ARM32_STR);
        int installedNewstVersion2 = XWalkEnvironment.getInstalledNewstVersion(XWalkEnvironment.RUNTIME_ABI_ARM64_STR);
        XWebLog.m21911i(TAG, "clearOldXWebCore, nAvailableVersion:" + availableVersion + ", nNewstVersion:" + i + ", newstVerForArm32:" + installedNewstVersion + ", newstVerForArm64:" + installedNewstVersion2);
        clearOldXWebCore(listFiles, keepVersionSet, i, installedNewstVersion, installedNewstVersion2);
    }

    public static boolean clearVersion(int i) {
        XWebLog.m21911i(TAG, "clearVersion start, version:" + i);
        if (i <= 0) {
            XWebLog.m21909e(TAG, "clearVersion failed, version is not valid");
            return false;
        }
        Context applicationContext = XWalkEnvironment.getApplicationContext();
        if (applicationContext == null || applicationContext.getApplicationInfo() == null || applicationContext.getApplicationInfo().dataDir == null) {
            XWebLog.m21909e(TAG, "clearVersion failed, context is null");
            return false;
        }
        File file = new File(applicationContext.getApplicationInfo().dataDir);
        if (!file.exists()) {
            XWebLog.m21909e(TAG, "clearVersion failed, dataDir not exist");
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            XWebLog.m21909e(TAG, "clearVersion failed, files is null");
            return false;
        }
        int length = listFiles.length;
        int i2 = 0;
        while (i2 < length) {
            File file2 = listFiles[i2];
            int apkVersion = getApkVersion(file2);
            if (apkVersion <= 0 || apkVersion != i || !FileUtils.deleteAll(file2.getAbsolutePath())) {
                i2++;
            } else {
                XWebLog.m21911i(TAG, "clearVersion, version:" + apkVersion);
                return true;
            }
        }
        return false;
    }

    private static boolean doCheckFiles(int i) {
        File fileListConfigFile = getFileListConfigFile(i);
        if (fileListConfigFile != null) {
            return FileListMD5Checker.checkFileListMd5(i, fileListConfigFile);
        }
        if (XWalkEnvironment.isTestVersion(i)) {
            XWebLog.m21913w(TAG, "doCheckFiles, configFile not exist, maybe test runtime or old runtime");
            return true;
        }
        XWebLog.m21913w(TAG, "doCheckFiles, no config file");
        WXWebReporter.idkeyReport(78, 1);
        if (!"true".equalsIgnoreCase(CommandCfg.getInstance().getCmd(CommandDef.COMMAND_DISABLE_CONFIG_FILE_CHECK, XWalkEnvironment.MODULE_TOOLS))) {
            return false;
        }
        XWebLog.m21911i(TAG, "doCheckFiles, dis_config_file_check is true");
        return true;
    }

    private static boolean doCheckResFiles(int i) {
        String downloadResFileListConfig = XWebFileUtil.getDownloadResFileListConfig(i);
        File file = new File(downloadResFileListConfig);
        if (file.exists()) {
            return FileListMD5Checker.checkResFileListMd5(i, file);
        }
        if (XWalkEnvironment.isTestVersion(i) || i < 362) {
            XWebLog.m21913w(TAG, "doCheckResFiles, resConfigFile not exist, maybe test runtime or old runtime, path:" + downloadResFileListConfig);
            return true;
        }
        WXWebReporter.idkeyReport(79, 1);
        XWebLog.m21911i(TAG, "doCheckResFiles, resConfigFile not exist, path:" + downloadResFileListConfig);
        if (!"true".equalsIgnoreCase(CommandCfg.getInstance().getCmd(CommandDef.COMMAND_DIS_RES_CONFIG_FILE_CHECK_DEX, XWalkEnvironment.MODULE_TOOLS))) {
            return false;
        }
        XWebLog.m21913w(TAG, "doCheckResFiles, resConfigFile not exist and dis_res_config_file_check");
        return true;
    }

    public static int getApkVersion(File file) {
        String name;
        if (file != null && (name = file.getName()) != null && name.startsWith("app_xwalk_") && file.isDirectory()) {
            String substring = name.substring(10);
            try {
                return Integer.parseInt(substring);
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "getApkVersion error, strApkVer:" + substring + ", error", th);
            }
        }
        return -1;
    }

    public static File getFileListConfigFile(int i) {
        try {
            String patchFileListConfig = XWebFileUtil.getPatchFileListConfig(i);
            File file = new File(patchFileListConfig);
            if (file.exists()) {
                XWebLog.m21911i(TAG, "getFileListConfigFile, path:" + patchFileListConfig);
                return file;
            }
            String downloadZipFileListConfig = XWebFileUtil.getDownloadZipFileListConfig(i);
            File file2 = new File(downloadZipFileListConfig);
            if (!file2.exists()) {
                return null;
            }
            XWebLog.m21911i(TAG, "getFileListConfigFile, path:" + downloadZipFileListConfig);
            return file2;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getFileListConfigFile error", th);
            return null;
        }
    }

    private static HashSet<String> getKeepVersionSet() {
        String cmd = CommandCfg.getInstance().getCmd(CommandDef.COMMAND_KEEP_XWEB_CORE_LIST, XWalkEnvironment.MODULE_TOOLS);
        XWebLog.m21911i(TAG, "getKeepVersionSet, dump KEEP_XWEB_CORE_LIST:" + cmd);
        HashSet<String> hashSet = new HashSet<>();
        if (!TextUtils.isEmpty(cmd)) {
            String[] split = cmd.split(";");
            if (split.length > 0) {
                for (String str : split) {
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str.trim())) {
                        hashSet.add(str.trim());
                    }
                }
            }
        }
        return hashSet;
    }

    private static long getTotalCoreSize(KVReportForCheckStorage kVReportForCheckStorage, File file, String str) {
        long fileSize = FileUtils.getFileSize(file, false);
        long j = 0;
        if (fileSize > 0) {
            j = 0 + fileSize;
            XWebLog.m21911i(TAG, "getTotalCoreSize, xweb dir:" + str + ", size:" + FileUtils.humanReadableByteCount(fileSize));
            int apkVersion = getApkVersion(file);
            if (apkVersion > 0) {
                kVReportForCheckStorage.appendXWebVersion(apkVersion, fileSize);
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    XWebLog.m21911i(TAG, "getTotalCoreSize, xweb sub dir:" + file2.getName() + ", size:" + FileUtils.humanReadableByteCount(FileUtils.getFileSize(file2, true)));
                }
            }
        }
        return j;
    }

    private static long getTotalPluginSize(KVReportForCheckStorage kVReportForCheckStorage, File file) {
        long j;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            j = 0;
            for (File file2 : listFiles) {
                long fileSize = FileUtils.getFileSize(file2, !XWalkPlugin.PRIVATE_CACHE_DIR_NAME.equalsIgnoreCase(file2.getName()));
                if (fileSize > 0) {
                    j += fileSize;
                    XWebLog.m21911i(TAG, "getTotalPluginSize, plugin dir:" + file2.getName() + ", size:" + FileUtils.humanReadableByteCount(fileSize));
                    XWalkPluginManager.PluginInfo pluginInfoFromDir = XWalkPluginManager.getPluginInfoFromDir(file2);
                    if (pluginInfoFromDir != null) {
                        kVReportForCheckStorage.appendPluginVersion(pluginInfoFromDir.pluginName, pluginInfoFromDir.pluginVersion, fileSize);
                    }
                }
            }
        } else {
            j = 0;
        }
        if (j > 0) {
            XWebLog.m21911i(TAG, "getTotalPluginSize, plugin total size:" + FileUtils.humanReadableByteCount(j));
            kVReportForCheckStorage.setPluginTotalSize(j);
        }
        return j;
    }

    public static boolean isBusy() {
        XWebLog.m21911i(TAG, "isBusy:" + sIsBusy);
        return sIsBusy;
    }

    public static void tryClean(final Context context) {
        C117640b.f351893a.execute(new Runnable() {
            public void run() {
                XWebLog.m21911i(XWebCleaner.TAG, "tryClean start");
                XWebCleaner.checkFiles(false);
                XWebCleaner.tryClearOldXWebCore(context, false);
                XWebCleaner.tryCleanAllDownloadedZip(context, false);
                XWebCleaner.tryClearTestSetting(context, false);
                XWebCleaner.checkStorage(context);
                boolean unused = XWebCleaner.sIsBusy = false;
                XWebLog.m21911i(XWebCleaner.TAG, "tryClean finished");
            }
        });
        sIsBusy = true;
    }

    public static void tryCleanAllDownloadedZip(Context context, boolean z) {
        int apkVersion;
        if (!z && !FrequentLimiter.canDo(FrequentLimiter.KEY_CLEAR_DOWNLOAD_ZIP, 86400000)) {
            XWebLog.m21913w(TAG, "tryCleanAllDownloadedZip, can not clean now");
        } else if (context == null || context.getApplicationInfo() == null || context.getApplicationInfo().dataDir == null) {
            XWebLog.m21909e(TAG, "tryCleanAllDownloadedZip failed, context is null");
        } else {
            File file = new File(context.getApplicationInfo().dataDir);
            if (!file.exists()) {
                XWebLog.m21909e(TAG, "tryCleanAllDownloadedZip failed, dataDir not exist");
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                XWebLog.m21909e(TAG, "tryCleanAllDownloadedZip failed, files is null");
                return;
            }
            for (File file2 : listFiles) {
                if (file2.getName().startsWith("app_xwalk_") && file2.isDirectory() && (apkVersion = getApkVersion(file2)) > 0) {
                    XWebLog.m21911i(TAG, "tryCleanAllDownloadedZip, clean version:" + apkVersion);
                    tryCleanDownloadedZip(apkVersion);
                }
            }
        }
    }

    public static boolean tryCleanDownloadedZip(int i) {
        if (!new File(XWebFileUtil.getDownloadApkPath(i)).exists()) {
            XWebLog.m21913w(TAG, "tryCleanDownloadedZip, base.apk file not exist");
            return false;
        } else if (!new File(XWebFileUtil.getExtractedCoreDir(i)).exists()) {
            XWebLog.m21913w(TAG, "tryCleanDownloadedZip, extracted_core directory not exist");
            return false;
        } else {
            String downloadZipPath = XWebFileUtil.getDownloadZipPath(i);
            boolean deleteFile = FileUtils.deleteFile(downloadZipPath);
            XWebLog.m21911i(TAG, "tryCleanDownloadedZip, delete result:" + deleteFile + ", path:" + downloadZipPath);
            return deleteFile;
        }
    }

    private static void tryCleanUselessFiles(int i) {
        XWebLog.m21911i(TAG, "tryCleanUselessFiles, version:" + i);
        File file = new File(XWebFileUtil.getVersionDir(i));
        if (!file.exists() || !file.isDirectory()) {
            XWebLog.m21913w(TAG, "tryCleanUselessFiles, version dir not exist");
            return;
        }
        File file2 = new File(file, "BrowserMetrics");
        if (file2.exists() && file2.isDirectory()) {
            XWebLog.m21911i(TAG, "tryCleanUselessFiles, delete BrowserMetrics");
            FileUtils.deleteAll(file2.getAbsolutePath());
        }
    }

    public static void tryClearOldXWebCore(Context context, boolean z) {
        if (z || FrequentLimiter.canDo(FrequentLimiter.KEY_CLEAR_OLD_APK, 86400000)) {
            clearOldXWebCore(context);
        } else {
            XWebLog.m21911i(TAG, "tryClearOldXWebCore, time not up");
        }
    }

    public static void tryClearTestSetting(Context context, boolean z) {
        if (z || FrequentLimiter.canDo("clear_test_settings", 2592000000L)) {
            XWebLog.m21911i(TAG, "tryClearTestSetting");
            try {
                WebDebugCfg.getInst().cleanTestSetting();
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "tryClearTestSetting error", th);
            }
        }
    }

    private static void clearOldXWebCore(File[] fileArr, HashSet<String> hashSet, int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        for (File file : fileArr) {
            int apkVersion = getApkVersion(file);
            if (apkVersion < 0) {
                XWebLog.m21911i(TAG, "clearOldXWebCore, ignore file:" + file.getName());
                HashSet<String> hashSet2 = hashSet;
            } else {
                if (hashSet.contains("" + apkVersion)) {
                    XWebLog.m21911i(TAG, "clearOldXWebCore, version in keep list:" + apkVersion);
                } else {
                    boolean cmdAsBoolean = CommandCfg.getInstance().getCmdAsBoolean(CommandDef.COMMAND_KEEP_NEAREST_VERSION, XWalkEnvironment.MODULE_TOOLS, false);
                    boolean z = true;
                    if (XWalkEnvironment.getBuildConfigThirdPartyRelease() || !cmdAsBoolean ? apkVersion <= 0 || apkVersion > i4 || apkVersion == XWalkEnvironment.getAvailableVersion() || apkVersion == i5 || apkVersion == i6 : apkVersion <= 0 || apkVersion >= i4 || apkVersion == XWalkEnvironment.getAvailableVersion() || apkVersion == i5 || apkVersion == i6) {
                        z = false;
                    }
                    if (z) {
                        try {
                            if (!XWebCoreInfo.isCoreVersionUsing(apkVersion)) {
                                FileUtils.deleteAll(file.getAbsolutePath());
                                XWebLog.m21911i(TAG, "clearOldXWebCore, clear version:" + apkVersion + ", core not using, shouldKeepNearestVersion:" + cmdAsBoolean);
                                WXWebReporter.idkeyReport(577, 65, 1);
                            } else {
                                XWebLog.m21911i(TAG, "clearOldXWebCore, keep version:" + apkVersion + ", core using, shouldKeepNearestVersion:" + cmdAsBoolean);
                            }
                        } catch (Throwable th) {
                            XWebLog.m21911i(TAG, "clearOldXWebCore failed, error:" + th);
                            WXWebReporter.idkeyReport(577, 66, 1);
                        }
                    } else {
                        XWebLog.m21911i(TAG, "clearOldXWebCore, keep version:" + apkVersion + ", shouldKeepNearestVersion:" + cmdAsBoolean);
                        tryCleanUselessFiles(apkVersion);
                    }
                }
            }
        }
    }
}
