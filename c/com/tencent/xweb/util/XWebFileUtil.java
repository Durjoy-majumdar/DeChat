package com.tencent.xweb.util;

import android.content.Context;
import java.io.File;
import org.xwalk.core.XWalkEnvironment;

public class XWebFileUtil {
    public static final String TAG = "XWebFileUtil";
    private static final String XWALK_CORE_APK_DIR = "apk";
    public static final String XWALK_CORE_APK_NAME = "base.apk";
    public static final String XWALK_CORE_CHILD_PROCESS_APK_NAME = "child_process.apk";
    private static final String XWALK_CORE_CHILD_PROCESS_OPTIMIZED_DEX_DIR = "child_process_dex";
    public static final String XWALK_CORE_CLASSES_DEX = "classes.dex";
    private static final String XWALK_CORE_EXTRACTED_DIR = "extracted_xwalkcore";
    public static final String XWALK_CORE_FILELIST_CONFIG_NAME = "filelist.config";
    private static final String XWALK_CORE_HPATCH_NAME = "hpatch.zip";
    private static final String XWALK_CORE_NAME_PREFIX = "xwalk_";
    private static final String XWALK_CORE_OPTIMIZED_DEX_DIR = "dex";
    private static final String XWALK_CORE_PATCH_CONFIG_NAME = "patch.config";
    private static final String XWALK_CORE_PATCH_NAME = "patch.zip";
    private static final String XWALK_CORE_PATCH_XML_NAME = "patch.xml";
    private static final String XWALK_CORE_RES_FILELIST_CONFIG_NAME = "reslist.config";
    private static final String XWALK_CORE_ZIP_DIR = "zip";
    private static final String XWALK_CORE_ZIP_NAME = "base.zip";
    private static final String XWALK_PATCH_ZIP_TEMP_DECOMPRESS_DIR = "patch_temp_decompress";
    private static final String XWALK_PLUGIN_BASE_DIR = "xwalkplugin";
    private static final String XWALK_PLUGIN_UPDATE_CONFIG_NAME = "pluginUpdateConfig.xml";
    private static final String XWALK_UPDATE_CONFIG_DIR = "xwalkconfig";
    private static final String XWEB_CORE_CRASH = "crash";

    public static String getChildProcessOptimizedDexDir(int i) {
        String str = getExtractedCoreDir(i) + File.separator + XWALK_CORE_CHILD_PROCESS_OPTIMIZED_DEX_DIR;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static String getClassDexFilePath(int i) {
        return getExtractedCoreDir(i) + File.separator + "classes.dex";
    }

    public static String getCurrentVersionDir(Context context) {
        if (context == null) {
            XWebLog.m21909e(TAG, "getCurrentVersionDir with context, context is null");
            return "";
        }
        int availableVersion = XWalkEnvironment.getAvailableVersion();
        XWebLog.m21911i(TAG, "getCurrentVersionDir, version:" + availableVersion);
        return getVersionDir(context, availableVersion);
    }

    public static String getDownloadApkDir(int i) {
        String str = getVersionDir(i) + File.separator + XWALK_CORE_APK_DIR;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static String getDownloadApkPath(int i) {
        return getDownloadApkDir(i) + File.separator + XWALK_CORE_APK_NAME;
    }

    public static String getDownloadChildProcessApkPath(int i) {
        return getExtractedCoreFile(i, XWALK_CORE_CHILD_PROCESS_APK_NAME);
    }

    public static String getDownloadPatchPath(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(getVersionDir(i));
        String str = File.separator;
        sb.append(str);
        sb.append(XWALK_CORE_ZIP_DIR);
        String sb4 = sb.toString();
        File file = new File(sb4);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (i2 == 1) {
            return sb4 + str + XWALK_CORE_PATCH_NAME;
        } else if (i2 == 2) {
            return sb4 + str + XWALK_CORE_HPATCH_NAME;
        } else {
            XWebLog.m21909e(TAG, "invalid patchType in updateConfig");
            return "";
        }
    }

    public static String getDownloadResFileListConfig(int i) {
        return getExtractedCoreFile(i, XWALK_CORE_RES_FILELIST_CONFIG_NAME);
    }

    public static String getDownloadZipFileListConfig(int i) {
        return getExtractedCoreFile(i, "filelist.config");
    }

    public static String getDownloadZipPath(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(getVersionDir(i));
        String str = File.separator;
        sb.append(str);
        sb.append(XWALK_CORE_ZIP_DIR);
        String sb4 = sb.toString();
        File file = new File(sb4);
        if (!file.exists()) {
            file.mkdirs();
        }
        return sb4 + str + XWALK_CORE_ZIP_NAME;
    }

    public static String getExtractedCoreDir(int i) {
        String str = getVersionDir(i) + File.separator + XWALK_CORE_EXTRACTED_DIR;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static String getExtractedCoreFile(int i, String str) {
        return getExtractedCoreDir(i) + File.separator + str;
    }

    public static String getNewestVersionDir(Context context) {
        if (context == null) {
            XWebLog.m21909e(TAG, "getNewestVersionDir with context, context is null");
            return "";
        }
        int installedNewstVersionForCurAbi = XWalkEnvironment.getInstalledNewstVersionForCurAbi();
        XWebLog.m21911i(TAG, "getNewestVersionDir, version:" + installedNewstVersionForCurAbi);
        return getVersionDir(context, installedNewstVersionForCurAbi);
    }

    public static String getOptimizedDexDir(int i) {
        String str = getVersionDir(i) + File.separator + "dex";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static String getPatchConfig(int i) {
        return getPatchZipTempDecompressFilePath(i, "patch.config");
    }

    public static String getPatchFileListConfig(int i) {
        return getPatchZipTempDecompressFilePath(i, "filelist.config");
    }

    public static String getPatchXml(int i) {
        return getPatchZipTempDecompressFilePath(i, XWALK_CORE_PATCH_XML_NAME);
    }

    public static String getPatchZipTempDecompressDir(int i) {
        String str = getVersionDir(i) + File.separator + XWALK_PATCH_ZIP_TEMP_DECOMPRESS_DIR;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static String getPatchZipTempDecompressFilePath(int i, String str) {
        return getPatchZipTempDecompressDir(i) + File.separator + str;
    }

    public static String getPluginBaseDir() {
        return XWalkEnvironment.getApplicationContext().getDir(XWALK_PLUGIN_BASE_DIR, 0).getAbsolutePath();
    }

    public static String getPluginUpdateConfigFilePath() {
        return getUpdateConfigDir() + File.separator + XWALK_PLUGIN_UPDATE_CONFIG_NAME;
    }

    public static String getPredownloadVersionDir(Context context) {
        if (context == null) {
            XWebLog.m21909e(TAG, "getPredownloadVersionDir with context, context is null");
            return "";
        }
        int installedNewstVersionForPredownAbi = XWalkEnvironment.getInstalledNewstVersionForPredownAbi();
        XWebLog.m21911i(TAG, "getPredownloadVersionDir, version:" + installedNewstVersionForPredownAbi);
        return getVersionDir(context, installedNewstVersionForPredownAbi);
    }

    public static String getUpdateConfigDir() {
        return XWalkEnvironment.getApplicationContext().getDir(XWALK_UPDATE_CONFIG_DIR, 0).getAbsolutePath();
    }

    public static String getUpdateConfigFullPath() {
        return getUpdateConfigDir() + File.separator + "updateConfg.xml";
    }

    public static String getVersionDir(int i) {
        Context applicationContext = XWalkEnvironment.getApplicationContext();
        String absolutePath = applicationContext.getDir(XWALK_CORE_NAME_PREFIX + i, 0).getAbsolutePath();
        File file = new File(absolutePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return absolutePath;
    }

    public static String getXWebCrashDir(int i) {
        String str = getVersionDir(i) + File.separator + "crash";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static boolean isDownloadApkFileExist(int i) {
        File file = new File(getDownloadApkPath(i));
        return file.exists() && file.isFile();
    }

    public static boolean isExtractedCoreDirFileExist(int i, String str) {
        File file = new File(getExtractedCoreDir(i) + File.separator + str);
        return file.exists() && file.isFile();
    }

    public static String getDownloadApkPath(Context context, int i) {
        if (context == null) {
            XWebLog.m21909e(TAG, "getDownloadApkPath with context, context is null");
            return "";
        }
        String versionDir = getVersionDir(context, i);
        if (versionDir.isEmpty()) {
            XWebLog.m21909e(TAG, "getDownloadApkPath with context, versionDir is empty");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(versionDir);
        String str = File.separator;
        sb.append(str);
        sb.append(XWALK_CORE_APK_DIR);
        sb.append(str);
        sb.append(XWALK_CORE_APK_NAME);
        return sb.toString();
    }

    public static String getDownloadZipFileListConfig(Context context, int i) {
        return getExtractedCoreFile(context, i, "filelist.config");
    }

    public static String getExtractedCoreFile(Context context, int i, String str) {
        if (context == null) {
            XWebLog.m21909e(TAG, "getExtractedCoreFile with context, context is null");
            return "";
        }
        String versionDir = getVersionDir(context, i);
        if (versionDir.isEmpty()) {
            XWebLog.m21909e(TAG, "getExtractedCoreFile with context, versionDir is empty");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(versionDir);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(XWALK_CORE_EXTRACTED_DIR);
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    public static String getPatchFileListConfig(Context context, int i) {
        return getPatchZipTempDecompressFilePath(context, i, "filelist.config");
    }

    public static String getPatchZipTempDecompressFilePath(Context context, int i, String str) {
        if (context == null) {
            XWebLog.m21909e(TAG, "getPatchZipTempDecompressFilePath with context, context is null");
            return "";
        }
        String versionDir = getVersionDir(context, i);
        if (versionDir.isEmpty()) {
            XWebLog.m21909e(TAG, "getPatchZipTempDecompressFilePath with context, versionDir is empty");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(versionDir);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(XWALK_PATCH_ZIP_TEMP_DECOMPRESS_DIR);
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    public static String getVersionDir(Context context, int i) {
        if (context == null) {
            XWebLog.m21909e(TAG, "getVersionDir with context, context is null");
            return "";
        }
        return context.getDir(XWALK_CORE_NAME_PREFIX + i, 0).getAbsolutePath();
    }
}
