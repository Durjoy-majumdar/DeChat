package com.tencent.xweb.updater;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.XWebClassLoaderWrapper;
import com.tencent.xweb.XWebCoreContentProvider;
import com.tencent.xweb.XWebDecompressor;
import com.tencent.xweb.XWebDownloader;
import com.tencent.xweb.XWebEmbedSetting;
import com.tencent.xweb.XWebViewProvider;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.report.KVReportForInstallRuntime;
import com.tencent.xweb.util.AbiUtil;
import com.tencent.xweb.util.FileListMD5Checker;
import com.tencent.xweb.util.FileUtils;
import com.tencent.xweb.util.FrequentLimiter;
import com.tencent.xweb.util.MD5;
import com.tencent.xweb.util.Patch;
import com.tencent.xweb.util.PatchFileConfig;
import com.tencent.xweb.util.PatchFileConfigParser;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebCleaner;
import com.tencent.xweb.util.XWebCoreInfo;
import com.tencent.xweb.util.XWebFileUtil;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.xwalk.core.XWalkEnvironment;

public class XWebRuntimeInstaller {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int ERROR_DOPATCH_FAILED = -3;
    public static final int ERROR_DOPATCH_MD5_FAILED = -4;
    public static final int ERROR_DOWNLOAD_FAILED = -1;
    public static final int ERROR_DOWNLOAD_MD5_FAILED = -2;
    public static final int ERROR_EMBED_INSTALL_FAIL_APK_COPY_FAIL = -203;
    public static final int ERROR_EMBED_INSTALL_FAIL_VERSION_LOW = -201;
    public static final int ERROR_EMBED_INSTALL_FAIL_VERSION_TRIED = -202;
    public static final int ERROR_EXTRACT_RESOURCE_FAILED = -5;
    public static final int ERROR_EXTRACT_RESOURCE_FAILED_FOR_RETRY = -12;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_SET_VERNUM = -101;
    public static final int ERROR_SHARED_MODE_EXCEED_MAX_COUNT = -7;
    public static final int ERROR_SHARED_MODE_FORCE_DOWNLOAD = -6;
    public static final int ERROR_SHARED_MODE_NO_CONTENT_RESOLVER = -8;
    public static final int ERROR_SHARED_MODE_NO_PROVIDER = -9;
    public static final int ERROR_SHARED_MODE_OTHER = -11;
    public static final int ERROR_SHARED_MODE_TRY_AGAIN = -10;
    private static final int RES_EXTRACTOR_MAXTIMES = 1;
    private static final String SP_KEY_INSTALLED_EMBED_VERSION = "INSTALLED_EMBED_VERSION";
    private static final String SP_KEY_INSTALLED_EMBED_VERSION_TIME = "INSTALLED_EMBED_VERSION_TIME";
    private static final String TAG = "XWebRuntimeInstaller";
    public static final int UPDATE_BIZ_TYPE_RUNTIME_PACKAGE = 1;
    public static final int UPDATE_BIZ_TYPE_RUNTIME_PATCH = 2;
    private static final int XWALK_GET_FROM_PROVIDER_MAX_COUNT = 2;
    private static int mCurrentTimeForRetryRes;
    private final XWalkRuntimeUpdateListener mRuntimeUpdateListener;

    public static class ErrorInfo {
        public int copyFailedCount = 0;
        public int errorCode = -11;
        public int extractFailedCount = 0;
        public int extractRetryFailedCount = 0;
        public int md5FailedCount = 0;
        public int noMatchedVersionCount = 0;
        public int readFileListFailedCount = 0;
        public int setVersionFailedCount = 0;
        public int targetVer = -1;
    }

    public XWebRuntimeInstaller() {
        this.mRuntimeUpdateListener = null;
    }

    public static void clearLastTryEmbedInstallVersion() {
        XWebLog.addInitializeLog(TAG, "clearLastTryEmbedInstallVersion");
        SharedPreferences mMKVSharedPreferencesForEmbedInstall = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForEmbedInstall(XWalkEnvironment.RUNTIME_ABI_ARM32_STR);
        mMKVSharedPreferencesForEmbedInstall.edit().putInt(SP_KEY_INSTALLED_EMBED_VERSION, -1).commit();
        mMKVSharedPreferencesForEmbedInstall.edit().putLong(SP_KEY_INSTALLED_EMBED_VERSION_TIME, 0).commit();
        SharedPreferences mMKVSharedPreferencesForEmbedInstall2 = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForEmbedInstall(XWalkEnvironment.RUNTIME_ABI_ARM64_STR);
        mMKVSharedPreferencesForEmbedInstall2.edit().putInt(SP_KEY_INSTALLED_EMBED_VERSION, -1).commit();
        mMKVSharedPreferencesForEmbedInstall2.edit().putLong(SP_KEY_INSTALLED_EMBED_VERSION_TIME, 0).commit();
    }

    private void convertInstallRuntimeResultToErrorInfo(ErrorInfo errorInfo, int i) {
        if (i == 0) {
            errorInfo.errorCode = 0;
        } else if (i == -5) {
            errorInfo.extractFailedCount++;
        } else if (i == -12) {
            errorInfo.extractRetryFailedCount++;
        } else if (i == -101) {
            errorInfo.setVersionFailedCount++;
        }
    }

    public static boolean doPatch(String str, int i, int i2, int i3) {
        XWebLog.m21911i(TAG, "doPatch, pathZipPath:" + str + ", currentVersion:" + i + ", newVersion:" + i2);
        if (!new File(str).exists()) {
            XWebLog.m21909e(TAG, "doPatch, no patch zip file");
            return false;
        } else if (!XWebDecompressor.decompressDownloadByPatchType(str, XWebFileUtil.getPatchZipTempDecompressDir(i2), i3)) {
            XWebLog.m21909e(TAG, "doPatch, decompress error");
            WXWebReporter.idkeyReport(37, 1);
            return false;
        } else {
            ArrayList<PatchFileConfig> patchList = PatchFileConfigParser.getPatchList(i2, i3);
            if (patchList == null) {
                XWebLog.m21909e(TAG, "doPatch, patchFileConfigList = null");
                WXWebReporter.idkeyReport(38, 1);
                return false;
            } else if (!FileUtils.copyDirectory(XWebFileUtil.getExtractedCoreDir(i), XWebFileUtil.getExtractedCoreDir(i2), false)) {
                XWebLog.m21909e(TAG, "doPatch, copy all extracted file from current version error");
                WXWebReporter.idkeyReport(39, 1);
                return false;
            } else {
                XWebLog.m21911i(TAG, "doPatch, copy all extracted file finished");
                if (!doPatchAddFile(patchList, i2)) {
                    return false;
                }
                XWebLog.m21911i(TAG, "doPatch, add files finished");
                if (!doPatchRemoveFile(patchList, i2)) {
                    return false;
                }
                XWebLog.m21911i(TAG, "doPatch, remove files finished");
                if (!doPatchModifyFile(patchList, i2, i)) {
                    return false;
                }
                XWebLog.m21911i(TAG, "doPatch, patch files finished");
                return true;
            }
        }
    }

    private static boolean doPatchAddFile(ArrayList<PatchFileConfig> arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<PatchFileConfig> it = arrayList.iterator();
        while (it.hasNext()) {
            PatchFileConfig next = it.next();
            if (next.isTypeAdd()) {
                arrayList2.add(next);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            PatchFileConfig patchFileConfig = (PatchFileConfig) it4.next();
            if (!FileUtils.copyFile(XWebFileUtil.getPatchZipTempDecompressFilePath(i, patchFileConfig.originalFileName), XWebFileUtil.getExtractedCoreFile(i, patchFileConfig.originalFileName))) {
                XWebLog.m21909e(TAG, "doPatchAddFile, add file error:" + patchFileConfig);
                WXWebReporter.idkeyReport(40, 1);
                return false;
            }
            XWebLog.m21911i(TAG, "doPatchAddFile, add file:" + patchFileConfig);
        }
        return true;
    }

    private static boolean doPatchModifyFile(ArrayList<PatchFileConfig> arrayList, int i, int i2) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<PatchFileConfig> it = arrayList.iterator();
        while (it.hasNext()) {
            PatchFileConfig next = it.next();
            if (next.isTypeModify()) {
                arrayList2.add(next);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            PatchFileConfig patchFileConfig = (PatchFileConfig) it4.next();
            if (patchFileConfig.isExtractedFile()) {
                if (Patch.getInstance(patchFileConfig.patchAlgorithmType).doPatch(XWebFileUtil.getExtractedCoreFile(i2, patchFileConfig.originalFileName), XWebFileUtil.getPatchZipTempDecompressFilePath(i, patchFileConfig.patchFileName), XWebFileUtil.getExtractedCoreFile(i, patchFileConfig.originalFileName)) < 0) {
                    XWebLog.m21909e(TAG, "doPatchModifyFile, patch error file:" + patchFileConfig);
                    return false;
                }
                XWebLog.m21911i(TAG, "doPatchModifyFile, patch file:" + patchFileConfig);
            }
        }
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            PatchFileConfig patchFileConfig2 = (PatchFileConfig) it5.next();
            if (patchFileConfig2.isOriginalFileTypeApk()) {
                if (Patch.getInstance(patchFileConfig2.patchAlgorithmType).doPatch(XWebFileUtil.getDownloadApkPath(i2), XWebFileUtil.getPatchZipTempDecompressFilePath(i, patchFileConfig2.patchFileName), XWebFileUtil.getDownloadApkPath(i)) >= 0) {
                    return true;
                }
                XWebLog.m21909e(TAG, "doPatchModifyFile, apk patch error file:" + patchFileConfig2);
                return false;
            }
        }
        return true;
    }

    private static boolean doPatchRemoveFile(ArrayList<PatchFileConfig> arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<PatchFileConfig> it = arrayList.iterator();
        while (it.hasNext()) {
            PatchFileConfig next = it.next();
            if (next.isTypeRemove()) {
                arrayList2.add(next);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            PatchFileConfig patchFileConfig = (PatchFileConfig) it4.next();
            if (!FileUtils.deleteFile(XWebFileUtil.getExtractedCoreFile(i, patchFileConfig.originalFileName))) {
                XWebLog.m21909e(TAG, "doPatchRemoveFile, delete file error:" + patchFileConfig);
                WXWebReporter.idkeyReport(41, 1);
            } else {
                XWebLog.m21911i(TAG, "doPatchRemoveFile, delete file:" + patchFileConfig);
            }
        }
        return true;
    }

    public static int getLastTryEmbedInstallVersion(String str) {
        return XWebSharedPreferenceUtil.getMMKVSharedPreferencesForEmbedInstall(str).getInt(SP_KEY_INSTALLED_EMBED_VERSION, -1);
    }

    private ArrayList<Integer> getTryVersionList(UpdateConfig updateConfig) {
        String[] split;
        String cmd = CommandCfg.getInstance().getCmd(CommandDef.COMMAND_SHARE_CORE_LIST, XWalkEnvironment.MODULE_TOOLS);
        XWebLog.m21911i(TAG, "getTryVersionList, SHARE_CORE_LIST: " + cmd);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(updateConfig.apkVer));
        if (!TextUtils.isEmpty(cmd) && !XWalkEnvironment.hasInstalledAvailableVersion() && (split = cmd.split(";")) != null) {
            for (String str : split) {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str.trim())) {
                    try {
                        int parseInt = Integer.parseInt(str);
                        if (updateConfig.apkVer != parseInt) {
                            arrayList.add(Integer.valueOf(parseInt));
                        }
                    } catch (Throwable th) {
                        XWebLog.m21910e(TAG, "getTryVersionList failed, error", th);
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean isProviderExist(ContentResolver contentResolver, String str) {
        if (contentResolver == null || str == null || str.isEmpty()) {
            XWebLog.addInitializeLog(TAG, "isProviderExist, provider package is null");
            return false;
        }
        try {
            FileUtils.tryClose(contentResolver.openAssetFileDescriptor(XWebCoreContentProvider.buildUri(str, XWalkEnvironment.getPackageName(), 1, 0, ""), ""));
            return true;
        } catch (Throwable unused) {
            FileUtils.tryClose((Closeable) null);
            return false;
        }
    }

    private boolean tryCopyVersionFiles(ContentResolver contentResolver, String str, int i, Map<String, String> map, ErrorInfo errorInfo) {
        try {
            for (Map.Entry next : map.entrySet()) {
                String str2 = (String) next.getKey();
                String str3 = (String) next.getValue();
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(XWebCoreContentProvider.buildUri(str, XWalkEnvironment.getPackageName(), 2, i, str2), "");
                if (openAssetFileDescriptor == null) {
                    XWebLog.addInitializeLog(TAG, "tryCopyVersionFiles, file not exist, fileName:" + str2);
                    errorInfo.copyFailedCount = errorInfo.copyFailedCount + 1;
                    return false;
                }
                File file = XWebFileUtil.XWALK_CORE_APK_NAME.equals(str2) ? new File(XWebFileUtil.getDownloadApkPath(i)) : new File(XWebFileUtil.getExtractedCoreFile(i, str2));
                if (!FileUtils.copyFileDescriptorToFile(openAssetFileDescriptor, file)) {
                    XWebLog.addInitializeLog(TAG, "tryCopyVersionFiles, copy file error, fileName:" + str2);
                    errorInfo.copyFailedCount = errorInfo.copyFailedCount + 1;
                    return false;
                } else if (!MD5.checkMD5(file.getAbsolutePath(), str3)) {
                    XWebLog.addInitializeLog(TAG, "tryCopyVersionFiles, md5 error, fileName:" + str2);
                    errorInfo.md5FailedCount = errorInfo.md5FailedCount + 1;
                    if (file.exists()) {
                        file.delete();
                    }
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "tryCopyVersionFiles error", th);
            errorInfo.copyFailedCount++;
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: android.content.res.AssetFileDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: android.content.res.AssetFileDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: android.content.res.AssetFileDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: android.content.res.AssetFileDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.PrintWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: android.content.res.AssetFileDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: android.content.res.AssetFileDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.PrintWriter} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, java.lang.String> tryGetFileList(android.content.ContentResolver r10, java.lang.String r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "XWebRuntimeInstaller"
            java.lang.String r1 = "filelist.config"
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 0
            java.lang.String r4 = org.xwalk.core.XWalkEnvironment.getPackageName()     // Catch:{ all -> 0x009e }
            r5 = 2
            android.net.Uri r11 = com.tencent.xweb.XWebCoreContentProvider.buildUri(r11, r4, r5, r12, r1)     // Catch:{ all -> 0x009e }
            java.lang.String r4 = ""
            android.content.res.AssetFileDescriptor r10 = r10.openAssetFileDescriptor(r11, r4)     // Catch:{ all -> 0x009e }
            if (r10 != 0) goto L_0x002b
            java.lang.String r11 = "tryGetFileList, no filelist.config"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r11)     // Catch:{ all -> 0x009b }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            com.tencent.xweb.util.FileUtils.tryClose(r3)
        L_0x0027:
            com.tencent.xweb.util.FileUtils.tryClose(r10)
            return r2
        L_0x002b:
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x009b }
            java.lang.String r12 = com.tencent.xweb.util.XWebFileUtil.getExtractedCoreFile(r12, r1)     // Catch:{ all -> 0x009b }
            r11.<init>(r12)     // Catch:{ all -> 0x009b }
            boolean r12 = r11.exists()     // Catch:{ all -> 0x009b }
            if (r12 == 0) goto L_0x003d
            r11.delete()     // Catch:{ all -> 0x009b }
        L_0x003d:
            java.io.PrintWriter r12 = new java.io.PrintWriter     // Catch:{ all -> 0x009b }
            r12.<init>(r11)     // Catch:{ all -> 0x009b }
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ all -> 0x0097 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0097 }
            java.io.FileInputStream r4 = r10.createInputStream()     // Catch:{ all -> 0x0097 }
            r1.<init>(r4)     // Catch:{ all -> 0x0097 }
            r11.<init>(r1)     // Catch:{ all -> 0x0097 }
        L_0x0050:
            java.lang.String r1 = r11.readLine()     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x0087
            r12.println(r1)     // Catch:{ all -> 0x0091 }
            boolean r4 = r1.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0060
            goto L_0x0050
        L_0x0060:
            java.lang.String r4 = ":"
            java.lang.String[] r1 = r1.split(r4)     // Catch:{ all -> 0x0091 }
            int r4 = r1.length     // Catch:{ all -> 0x0091 }
            if (r4 != r5) goto L_0x0050
            r4 = 0
            r6 = r1[r4]     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x0050
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r6 != 0) goto L_0x0050
            r6 = 1
            r7 = r1[r6]     // Catch:{ all -> 0x0091 }
            if (r7 == 0) goto L_0x0050
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r7 != 0) goto L_0x0050
            r4 = r1[r4]     // Catch:{ all -> 0x0091 }
            r1 = r1[r6]     // Catch:{ all -> 0x0091 }
            r2.put(r4, r1)     // Catch:{ all -> 0x0091 }
            goto L_0x0050
        L_0x0087:
            r12.flush()     // Catch:{ all -> 0x0091 }
            com.tencent.xweb.util.FileUtils.tryClose(r12)
            com.tencent.xweb.util.FileUtils.tryClose(r11)
            goto L_0x0027
        L_0x0091:
            r1 = move-exception
            r8 = r12
            r12 = r11
            r11 = r1
            r1 = r8
            goto L_0x00a2
        L_0x0097:
            r11 = move-exception
            r1 = r12
            r12 = r3
            goto L_0x00a2
        L_0x009b:
            r11 = move-exception
            r12 = r3
            goto L_0x00a1
        L_0x009e:
            r11 = move-exception
            r10 = r3
            r12 = r10
        L_0x00a1:
            r1 = r12
        L_0x00a2:
            java.lang.String r2 = "tryGetFileList error"
            com.tencent.xweb.util.XWebLog.m21910e(r0, r2, r11)     // Catch:{ all -> 0x00b2 }
            com.tencent.xweb.util.FileUtils.tryClose(r1)
            com.tencent.xweb.util.FileUtils.tryClose(r12)
            com.tencent.xweb.util.FileUtils.tryClose(r10)
            return r3
        L_0x00b2:
            r11 = move-exception
            com.tencent.xweb.util.FileUtils.tryClose(r1)
            com.tencent.xweb.util.FileUtils.tryClose(r12)
            com.tencent.xweb.util.FileUtils.tryClose(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.updater.XWebRuntimeInstaller.tryGetFileList(android.content.ContentResolver, java.lang.String, int):java.util.Map");
    }

    private Integer tryInstallRuntimeInternal(int i, String str, String str2) {
        XWebLog.m21911i(TAG, "tryInstallRuntimeInternal, version:" + i + ", abi:" + str + ", versionDetail:" + str2);
        String extractedCoreDir = XWebFileUtil.getExtractedCoreDir(i);
        String[] resFileList = FileListMD5Checker.getResFileList(i);
        if (resFileList == null) {
            XWebLog.addInitializeLog(TAG, "reslist.config not exist");
            return -5;
        } else if (!XWebDecompressor.extractResource(XWebFileUtil.getDownloadApkPath(i), extractedCoreDir, resFileList)) {
            XWebLog.addInitializeLog(TAG, "extractResource failed");
            return -5;
        } else if (FileListMD5Checker.checkResFileListMd5(i, new File(XWebFileUtil.getDownloadResFileListConfig(i)))) {
            XWebLog.addInitializeLog(TAG, "checkAllResFileMd5 success");
            if (AbiUtil.getRuntimeAbi().equalsIgnoreCase(str) && !XWebClassLoaderWrapper.generateOptDex(i)) {
                WXWebReporter.idkeyReport(251, 1);
                XWebLog.addInitializeLog(TAG, "generate dex opt failed");
            }
            int installedNewstVersionForPredownAbi = XWalkEnvironment.getInstalledNewstVersionForPredownAbi();
            boolean versionInfo = XWebCoreInfo.setVersionInfo(i, str2, str);
            WXWebReporter.reportCoreInstalled();
            FrequentLimiter.resetCanDoTimeStamp(XWebCleaner.CHECK_FILES_MD5_TIME_KEY);
            if (AbiUtil.getRuntimeAbi().equalsIgnoreCase(str)) {
                FrequentLimiter.canDo(FrequentLimiter.KEY_CLEAR_OLD_APK, 86400000);
            } else if (installedNewstVersionForPredownAbi > 0 && !CommandCfg.getInstance().getCmdAsBoolean(CommandDef.COMMAND_NOT_CLEAR_PREVE_VER_IMEDEATLY, XWalkEnvironment.MODULE_TOOLS, false)) {
                XWebLog.addInitializeLog(TAG, "new runtime installed, clear pre version = " + installedNewstVersionForPredownAbi);
                XWebCleaner.clearVersion(installedNewstVersionForPredownAbi);
                WXWebReporter.idkeyReport(577, 65, 1);
            }
            if (!versionInfo) {
                XWebLog.addInitializeLog(TAG, "tryInstallRuntimeInternal, set runtime version failed");
                return -101;
            }
            XWalkEnvironment.refreshVersionInfo();
            XWebLog.addInitializeLog(TAG, "tryInstallRuntimeInternal success");
            return 0;
        } else if (mCurrentTimeForRetryRes < 1) {
            XWebLog.addInitializeLog(TAG, "checkAllResFileMd5 failed, retry install new runtime");
            mCurrentTimeForRetryRes++;
            return tryInstallRuntimeInternal(i, str, str2);
        } else {
            XWebLog.addInitializeLog(TAG, "checkAllResFileMd5 failed, can not retry install new runtime");
            return -12;
        }
    }

    private void updateRuntimeFromEmbedInternal() {
        KVReportForInstallRuntime kVReportForInstallRuntime = new KVReportForInstallRuntime();
        kVReportForInstallRuntime.setInstallType(1);
        kVReportForInstallRuntime.startInstallRuntime();
        try {
            boolean is64bitApp = AbiUtil.is64bitApp();
            SharedPreferences mMKVSharedPreferencesForEmbedInstall = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForEmbedInstall(AbiUtil.getRuntimeAbi());
            int installedNewstVersion = XWalkEnvironment.getInstalledNewstVersion(AbiUtil.getRuntimeAbi());
            if (installedNewstVersion >= 0) {
                XWebLog.addInitializeLog(TAG, "updateRuntimeFromEmbedInternal, this version(" + 0 + ") too old, installedNewstVersion:" + installedNewstVersion);
                mMKVSharedPreferencesForEmbedInstall.edit().putInt(SP_KEY_INSTALLED_EMBED_VERSION, 0).commit();
                mMKVSharedPreferencesForEmbedInstall.edit().putLong(SP_KEY_INSTALLED_EMBED_VERSION_TIME, System.currentTimeMillis()).commit();
                if (installedNewstVersion > 0) {
                    kVReportForInstallRuntime.setEmbedInstallApkVersion(installedNewstVersion, 0);
                    kVReportForInstallRuntime.finishInstallRuntime(-201);
                }
            } else if (getLastTryEmbedInstallVersion(AbiUtil.getRuntimeAbi()) == 0) {
                long j = mMKVSharedPreferencesForEmbedInstall.getLong(SP_KEY_INSTALLED_EMBED_VERSION_TIME, 0);
                XWebLog.addInitializeLog(TAG, "updateRuntimeFromEmbedInternal, this version(" + 0 + ") has tried, lastTryTime:" + j);
                kVReportForInstallRuntime.setEmbedInstallApkVersion(installedNewstVersion, 0);
                kVReportForInstallRuntime.finishInstallRuntime(-202);
            } else {
                XWebLog.addInitializeLog(TAG, "updateRuntimeFromEmbedInternal, install type:LIB, abi:" + AbiUtil.getRuntimeAbi() + ", version:" + 0 + ", versionDetail:" + "1.0.0_from_lib" + ", filename:" + "libxwebfullpack.so");
                LibUpdateConfig libUpdateConfig = new LibUpdateConfig(0);
                boolean copyPackageToLocal = libUpdateConfig.copyPackageToLocal("libxwebfullpack.so", "1");
                libUpdateConfig.isPatchUpdate = false;
                libUpdateConfig.nPatchTargetVersion = installedNewstVersion;
                libUpdateConfig.versionDetail = "1.0.0_from_lib";
                if (!copyPackageToLocal) {
                    WXWebReporter.idkeyReport(903, 126, 1);
                    XWebLog.addInitializeLog(TAG, "updateRuntimeFromEmbedInternal, copy failed");
                    kVReportForInstallRuntime.setEmbedInstallApkVersion(installedNewstVersion, 0);
                    kVReportForInstallRuntime.finishInstallRuntime(-203);
                    return;
                }
                try {
                    Integer tryInstallRuntimeWithReport = tryInstallRuntimeWithReport(libUpdateConfig, 1);
                    XWebLog.addInitializeLog(TAG, "updateRuntimeFromEmbedInternal, result:" + tryInstallRuntimeWithReport);
                    if (tryInstallRuntimeWithReport.intValue() == 0) {
                        WXWebReporter.idkeyReport(903, 127, 1);
                        XWalkRuntimeUpdater.sendBroadcast(IXWebBroadcastListener.STAGE_FINISHED, 0);
                        XWalkEnvironment.refreshVersionInfo();
                    }
                    mMKVSharedPreferencesForEmbedInstall.edit().putInt(SP_KEY_INSTALLED_EMBED_VERSION, 0).commit();
                    mMKVSharedPreferencesForEmbedInstall.edit().putLong(SP_KEY_INSTALLED_EMBED_VERSION_TIME, System.currentTimeMillis()).commit();
                } catch (Throwable th) {
                    th = th;
                    WXWebReporter.idkeyReport(903, 128, 1);
                    XWebLog.m21910e(TAG, "updateRuntimeFromEmbedInternal error", th);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            WXWebReporter.idkeyReport(903, 128, 1);
            XWebLog.m21910e(TAG, "updateRuntimeFromEmbedInternal error", th);
        }
    }

    public XWalkRuntimeUpdateListener getRuntimeUpdateListener() {
        return this.mRuntimeUpdateListener;
    }

    public Integer tryInstallRuntime(UpdateConfig updateConfig) {
        String downloadPath = updateConfig.getDownloadPath();
        String extractedCoreDir = XWebFileUtil.getExtractedCoreDir(updateConfig.apkVer);
        XWebLog.m21911i(TAG, "tryInstallRuntime, packageFile:" + downloadPath + ", extractDir:" + extractedCoreDir);
        if (!updateConfig.isMatchMd5 || MD5.checkMD5(downloadPath, updateConfig.downloadFileMd5)) {
            if (updateConfig.isPatchUpdate) {
                if (!doPatch(downloadPath, updateConfig.nPatchTargetVersion, updateConfig.apkVer, updateConfig.patchType)) {
                    XWebLog.addInitializeLog(TAG, "patch update mode, do patch error");
                    return -3;
                }
                if (updateConfig.isMatchMd5) {
                    int i = updateConfig.apkVer;
                    if (!FileListMD5Checker.checkFileListMd5(i, XWebFileUtil.getPatchFileListConfig(i))) {
                        XWebLog.addInitializeLog(TAG, "patch update mode, md5 not match");
                        WXWebReporter.idkeyReport(36, 1);
                        return -4;
                    }
                }
                XWebLog.addInitializeLog(TAG, "do patch update success");
            } else if (!XWebDecompressor.decompressDownloadZip(downloadPath, XWebFileUtil.getExtractedCoreDir(updateConfig.apkVer))) {
                XWebLog.addInitializeLog(TAG, "full update mode, decompress full zip error");
                WXWebReporter.idkeyReport(32, 1);
                return -5;
            } else {
                File file = new File(XWebFileUtil.getExtractedCoreFile(updateConfig.apkVer, XWebFileUtil.XWALK_CORE_APK_NAME));
                FileUtils.copyFile(file.getAbsolutePath(), XWebFileUtil.getDownloadApkPath(updateConfig.apkVer));
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
                if (updateConfig.isMatchMd5) {
                    int i2 = updateConfig.apkVer;
                    if (!FileListMD5Checker.checkFileListMd5(i2, XWebFileUtil.getDownloadZipFileListConfig(i2))) {
                        XWebLog.addInitializeLog(TAG, "full update mode, md5 not match");
                        WXWebReporter.idkeyReport(33, 1);
                        return -4;
                    }
                }
                XWebLog.addInitializeLog(TAG, "do full update success");
            }
            return tryInstallRuntimeInternal(updateConfig.apkVer, updateConfig.abi, updateConfig.versionDetail);
        }
        XWebLog.addInitializeLog(TAG, "downloaded zip md5 check failed");
        return -2;
    }

    public Integer tryInstallRuntimeWithReport(UpdateConfig updateConfig, int i) {
        KVReportForInstallRuntime kVReportForInstallRuntime = new KVReportForInstallRuntime();
        kVReportForInstallRuntime.setUpdateConfig(updateConfig);
        kVReportForInstallRuntime.setInstallType(i);
        kVReportForInstallRuntime.startInstallRuntime();
        int intValue = tryInstallRuntime(updateConfig).intValue();
        kVReportForInstallRuntime.finishInstallRuntime(intValue);
        return Integer.valueOf(intValue);
    }

    public boolean tryLoadLocalAssetRuntime(Context context, boolean z) {
        FileOutputStream fileOutputStream;
        XWebLog.m21911i(TAG, "tryLoadLocalAssetRuntime, isReplaceOld:" + z);
        if (z && XWalkEnvironment.getAvailableVersion() == 100000000) {
            XWebCleaner.clearVersion(XWalkEnvironment.TEST_APK_START_VERSION);
        }
        if (XWalkEnvironment.getAvailableVersion() == -1 || z) {
            InputStream inputStream = null;
            try {
                InputStream open = context.getAssets().open(XWalkEnvironment.LOCAL_TEST_ZIP_NAME);
                try {
                    File file = new File(XWebFileUtil.getDownloadZipPath(XWalkEnvironment.TEST_APK_START_VERSION));
                    if (file.exists()) {
                        file.delete();
                    }
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[1048576];
                        while (true) {
                            int read = open.read(bArr);
                            if (read != -1) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                fileOutputStream.flush();
                                updateRuntimeFromLocal();
                                XWalkEnvironment.reset();
                                XWalkEnvironment.init(context);
                                FileUtils.tryClose(open);
                                FileUtils.tryClose(fileOutputStream);
                                return true;
                            }
                        }
                    } catch (IOException e) {
                        e = e;
                        inputStream = open;
                        try {
                            XWebLog.m21910e(XWebViewProvider.TAG, "tryLoadLocalAssetRuntime, error", e);
                            FileUtils.tryClose(inputStream);
                            FileUtils.tryClose(fileOutputStream);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            FileUtils.tryClose(inputStream);
                            FileUtils.tryClose(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = open;
                        FileUtils.tryClose(inputStream);
                        FileUtils.tryClose(fileOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = null;
                    inputStream = open;
                    XWebLog.m21910e(XWebViewProvider.TAG, "tryLoadLocalAssetRuntime, error", e);
                    FileUtils.tryClose(inputStream);
                    FileUtils.tryClose(fileOutputStream);
                    return false;
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream = null;
                    inputStream = open;
                    FileUtils.tryClose(inputStream);
                    FileUtils.tryClose(fileOutputStream);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                fileOutputStream = null;
                XWebLog.m21910e(XWebViewProvider.TAG, "tryLoadLocalAssetRuntime, error", e);
                FileUtils.tryClose(inputStream);
                FileUtils.tryClose(fileOutputStream);
                return false;
            } catch (Throwable th6) {
                th = th6;
                fileOutputStream = null;
                FileUtils.tryClose(inputStream);
                FileUtils.tryClose(fileOutputStream);
                throw th;
            }
        }
        return false;
    }

    public boolean updateRuntime(UpdateConfig updateConfig) {
        if (XWebEmbedSetting.getForbidDownloadCode()) {
            XWebLog.addInitializeLog(TAG, "updateRuntime, turn off dynamic code");
            return false;
        } else if (XWebDownloader.isDownloading()) {
            XWebLog.addInitializeLog(TAG, "updateRuntime, in downloading process");
            return false;
        } else if (this.mRuntimeUpdateListener == null) {
            XWebLog.addInitializeLog(TAG, "updateRuntime, update listener is null");
            return false;
        } else if (updateConfig == null || !updateConfig.checkValid()) {
            XWebLog.addInitializeLog(TAG, "updateRuntime, updateConfig is invalid");
            WXWebReporter.onCheckUpdateConfigFailed();
            return false;
        } else {
            XWebLog.addInitializeLog(TAG, "updateRuntime, start download runtime");
            XWebDownloader.startDownload(new XWalkRuntimeDownloadListener(updateConfig, this), updateConfig);
            return true;
        }
    }

    public void updateRuntimeFromEmbed() {
        XWebLog.addInitializeLog(TAG, "updateRuntimeFromEmbed, SHOULD_EMEBED_XWEB_CORE is false");
    }

    public void updateRuntimeFromLocal() {
        if (!XWebEmbedSetting.getForbidDownloadCode()) {
            tryInstallRuntime(new UpdateConfig(XWalkEnvironment.LOCAL_TEST_ZIP_NAME, false, XWalkEnvironment.TEST_APK_START_VERSION, AbiUtil.getRuntimeAbi(), 0));
        } else {
            XWebLog.m21911i(TAG, "updateRuntimeFromLocal, turn off dynamic code");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017d, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.tencent.xweb.updater.XWebRuntimeInstaller.ErrorInfo updateRuntimeFromProvider(com.tencent.xweb.updater.XWebCoreScheduler r18) {
        /*
            r17 = this;
            r7 = r17
            monitor-enter(r17)
            com.tencent.xweb.util.SchedulerConfig r0 = r18.getCurSchedulerConfig()     // Catch:{ all -> 0x017e }
            java.lang.String r1 = "XWebRuntimeInstaller"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x017e }
            r2.<init>()     // Catch:{ all -> 0x017e }
            java.lang.String r3 = "updateFromProvider, target version:"
            r2.append(r3)     // Catch:{ all -> 0x017e }
            int r3 = r0.version     // Catch:{ all -> 0x017e }
            r2.append(r3)     // Catch:{ all -> 0x017e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x017e }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r2)     // Catch:{ all -> 0x017e }
            com.tencent.xweb.updater.XWebRuntimeInstaller$ErrorInfo r8 = new com.tencent.xweb.updater.XWebRuntimeInstaller$ErrorInfo     // Catch:{ all -> 0x017e }
            r8.<init>()     // Catch:{ all -> 0x017e }
            int r1 = r0.version     // Catch:{ all -> 0x017e }
            r8.targetVer = r1     // Catch:{ all -> 0x017e }
            boolean r1 = r0.bTryUseSharedCore     // Catch:{ all -> 0x017e }
            if (r1 != 0) goto L_0x003a
            java.lang.String r0 = "XWebRuntimeInstaller"
            java.lang.String r1 = "updateFromProvider, force download"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x017e }
            r0 = -6
            r8.errorCode = r0     // Catch:{ all -> 0x017e }
            monitor-exit(r17)
            return r8
        L_0x003a:
            int r1 = r0.nTryUseSharedCoreCount     // Catch:{ all -> 0x017e }
            r9 = 2
            if (r1 < r9) goto L_0x004c
            java.lang.String r0 = "XWebRuntimeInstaller"
            java.lang.String r1 = "updateFromProvider, exceed max count"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x017e }
            r0 = -7
            r8.errorCode = r0     // Catch:{ all -> 0x017e }
            monitor-exit(r17)
            return r8
        L_0x004c:
            android.content.ContentResolver r10 = org.xwalk.core.XWalkEnvironment.getContentResolver()     // Catch:{ all -> 0x017e }
            if (r10 != 0) goto L_0x005f
            java.lang.String r0 = "XWebRuntimeInstaller"
            java.lang.String r1 = "updateFromProvider, content resolver is null"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x017e }
            r0 = -8
            r8.errorCode = r0     // Catch:{ all -> 0x017e }
            monitor-exit(r17)
            return r8
        L_0x005f:
            r1 = r18
            com.tencent.xweb.updater.UpdateConfig r11 = r1.getUpdateConfig(r0)     // Catch:{ all -> 0x017e }
            java.lang.String[] r12 = com.tencent.xweb.XWebCoreContentProvider.XWALK_CORE_PROVIDER_LIST     // Catch:{ all -> 0x017e }
            int r13 = r12.length     // Catch:{ all -> 0x017e }
            r1 = 0
            r15 = 0
        L_0x006a:
            r16 = 1
            if (r15 >= r13) goto L_0x0146
            r3 = r12[r15]     // Catch:{ all -> 0x017e }
            boolean r2 = r7.isProviderExist(r10, r3)     // Catch:{ all -> 0x017e }
            if (r2 != 0) goto L_0x0078
            goto L_0x0141
        L_0x0078:
            java.lang.String r1 = "XWebRuntimeInstaller"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x017e }
            r2.<init>()     // Catch:{ all -> 0x017e }
            java.lang.String r4 = "updateFromProvider, find provider:"
            r2.append(r4)     // Catch:{ all -> 0x017e }
            r2.append(r3)     // Catch:{ all -> 0x017e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x017e }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r2)     // Catch:{ all -> 0x017e }
            java.util.ArrayList r1 = r7.getTryVersionList(r11)     // Catch:{ all -> 0x017e }
            r2 = 0
            r5 = 0
        L_0x0095:
            int r6 = r1.size()     // Catch:{ all -> 0x017e }
            if (r5 >= r6) goto L_0x00ee
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x017e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x017e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x017e }
            java.util.Map r6 = r7.tryGetFileList(r10, r3, r2)     // Catch:{ all -> 0x017e }
            if (r6 != 0) goto L_0x00c9
            java.lang.String r4 = "XWebRuntimeInstaller"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x017e }
            r14.<init>()     // Catch:{ all -> 0x017e }
            java.lang.String r9 = "updateFromProvider, read fileList failed, version:"
            r14.append(r9)     // Catch:{ all -> 0x017e }
            r14.append(r2)     // Catch:{ all -> 0x017e }
            java.lang.String r2 = r14.toString()     // Catch:{ all -> 0x017e }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r4, r2)     // Catch:{ all -> 0x017e }
            int r2 = r8.readFileListFailedCount     // Catch:{ all -> 0x017e }
            int r2 = r2 + 1
            r8.readFileListFailedCount = r2     // Catch:{ all -> 0x017e }
            goto L_0x00e6
        L_0x00c9:
            int r4 = r6.size()     // Catch:{ all -> 0x017e }
            if (r4 != 0) goto L_0x00eb
            java.lang.String r4 = "XWebRuntimeInstaller"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x017e }
            r9.<init>()     // Catch:{ all -> 0x017e }
            java.lang.String r14 = "updateFromProvider, no matched version, version:"
            r9.append(r14)     // Catch:{ all -> 0x017e }
            r9.append(r2)     // Catch:{ all -> 0x017e }
            java.lang.String r2 = r9.toString()     // Catch:{ all -> 0x017e }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r4, r2)     // Catch:{ all -> 0x017e }
        L_0x00e6:
            int r5 = r5 + 1
            r2 = r6
            r9 = 2
            goto L_0x0095
        L_0x00eb:
            r9 = r2
            r5 = r6
            goto L_0x00f0
        L_0x00ee:
            r5 = r2
            r9 = -1
        L_0x00f0:
            if (r9 >= 0) goto L_0x00f9
            int r1 = r8.noMatchedVersionCount     // Catch:{ all -> 0x017e }
            int r1 = r1 + 1
            r8.noMatchedVersionCount = r1     // Catch:{ all -> 0x017e }
            goto L_0x0140
        L_0x00f9:
            java.lang.String r1 = "XWebRuntimeInstaller"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x017e }
            r2.<init>()     // Catch:{ all -> 0x017e }
            java.lang.String r4 = "updateFromProvider, find share available version:"
            r2.append(r4)     // Catch:{ all -> 0x017e }
            r2.append(r9)     // Catch:{ all -> 0x017e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x017e }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r2)     // Catch:{ all -> 0x017e }
            r1 = r17
            r2 = r10
            r4 = r9
            r6 = r8
            boolean r1 = r1.tryCopyVersionFiles(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x017e }
            if (r1 != 0) goto L_0x011c
            goto L_0x0140
        L_0x011c:
            java.lang.String r1 = r11.abi     // Catch:{ all -> 0x017e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x017e }
            r2.<init>()     // Catch:{ all -> 0x017e }
            r2.append(r9)     // Catch:{ all -> 0x017e }
            java.lang.String r3 = "_install_from_share_mode"
            r2.append(r3)     // Catch:{ all -> 0x017e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x017e }
            java.lang.Integer r1 = r7.tryInstallRuntimeInternal(r9, r1, r2)     // Catch:{ all -> 0x017e }
            int r1 = r1.intValue()     // Catch:{ all -> 0x017e }
            r7.convertInstallRuntimeResultToErrorInfo(r8, r1)     // Catch:{ all -> 0x017e }
            int r1 = r8.errorCode     // Catch:{ all -> 0x017e }
            if (r1 != 0) goto L_0x0140
            monitor-exit(r17)
            return r8
        L_0x0140:
            r1 = 1
        L_0x0141:
            int r15 = r15 + 1
            r9 = 2
            goto L_0x006a
        L_0x0146:
            if (r1 != 0) goto L_0x0156
            java.lang.String r0 = "XWebRuntimeInstaller"
            java.lang.String r1 = "updateFromProvider failed, no provider"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x017e }
            r0 = -9
            r8.errorCode = r0     // Catch:{ all -> 0x017e }
            monitor-exit(r17)
            return r8
        L_0x0156:
            boolean r1 = org.xwalk.core.XWalkEnvironment.hasAvailableVersion()     // Catch:{ all -> 0x017e }
            if (r1 == 0) goto L_0x0170
            int r0 = r0.nTryUseSharedCoreCount     // Catch:{ all -> 0x017e }
            int r0 = r0 + 1
            r1 = 2
            if (r0 >= r1) goto L_0x0170
            java.lang.String r0 = "XWebRuntimeInstaller"
            java.lang.String r1 = "updateFromProvider failed, can try again"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x017e }
            r0 = -10
            r8.errorCode = r0     // Catch:{ all -> 0x017e }
            goto L_0x017c
        L_0x0170:
            java.lang.String r0 = "XWebRuntimeInstaller"
            java.lang.String r1 = "updateFromProvider failed, do not try again"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x017e }
            r0 = -11
            r8.errorCode = r0     // Catch:{ all -> 0x017e }
        L_0x017c:
            monitor-exit(r17)
            return r8
        L_0x017e:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.updater.XWebRuntimeInstaller.updateRuntimeFromProvider(com.tencent.xweb.updater.XWebCoreScheduler):com.tencent.xweb.updater.XWebRuntimeInstaller$ErrorInfo");
    }

    public XWebRuntimeInstaller(XWalkRuntimeUpdateListener xWalkRuntimeUpdateListener) {
        this.mRuntimeUpdateListener = xWalkRuntimeUpdateListener;
    }
}
