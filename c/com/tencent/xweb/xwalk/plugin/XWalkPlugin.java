package com.tencent.xweb.xwalk.plugin;

import android.content.SharedPreferences;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.FileUtils;
import com.tencent.xweb.util.MD5;
import com.tencent.xweb.util.Patch;
import com.tencent.xweb.util.SchedulerConfig;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebFileUtil;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import com.tencent.xweb.xwalk.plugin.XWalkPluginPatchConfigParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.xwalk.core.XWalkEnvironment;

public abstract class XWalkPlugin {
    public static final String EXTRACTED_DIR_NAME = "extracted";
    public static final String FILELIST_CONFIG_NAME = "filelist.config";
    public static final int INSTALL_ERROR_CODE_CONFIG_ERROR = -1;
    public static final int INSTALL_ERROR_CODE_DO_PATCH_ERROR = -3;
    public static final int INSTALL_ERROR_CODE_EMBED_COPY_ERROR = -6;
    public static final int INSTALL_ERROR_CODE_EMBED_INFO_ERROR = -5;
    public static final int INSTALL_ERROR_CODE_EXCEPTION = -4;
    public static final int INSTALL_ERROR_CODE_NONE = 0;
    public static final int INSTALL_ERROR_CODE_UNZIP_AND_CHECK_ERROR = -2;
    public static final String PATCH_CONFIG_NAME = "patch.config";
    public static final String PATCH_DIR_NAME = "patch_temp";
    public static final String PRIVATE_CACHE_DIR_NAME = "cache";
    private int mAvailableVersion = -1;
    private String mEmbedFileMD5 = "";
    private String mEmbedFileName = "";
    private int mEmbedVersion = -1;

    public XWalkPlugin() {
        loadVersionFromSharedPreference();
    }

    private void loadVersionFromSharedPreference() {
        if (XWalkEnvironment.getApplicationContext() == null) {
            XWebLog.m21909e(getPluginName(), "loadVer, context is null");
            return;
        }
        SharedPreferences sharedPreferencesForPluginVersionInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginVersionInfo(getPluginName());
        if (sharedPreferencesForPluginVersionInfo == null) {
            XWebLog.m21909e(getPluginName(), "loadVer, sp is null");
            return;
        }
        int i = this.mAvailableVersion;
        int i2 = sharedPreferencesForPluginVersionInfo.getInt(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_AVAILABLE_VERSION, -1);
        this.mAvailableVersion = i2;
        if (i2 == i) {
            return;
        }
        if (i == -1) {
            String pluginName = getPluginName();
            XWebLog.m21911i(pluginName, "loadVer, version = " + this.mAvailableVersion);
            return;
        }
        String pluginName2 = getPluginName();
        XWebLog.m21911i(pluginName2, "loadVer, old version = " + i + ", new version = " + this.mAvailableVersion);
    }

    public boolean canDownloadPatch(int i) {
        if (XWalkEnvironment.getApplicationContext() == null) {
            XWebLog.m21909e(getPluginName(), "canDownloadPatch, context is null");
            return false;
        }
        SharedPreferences sharedPreferencesForPluginVersionInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginVersionInfo(getPluginName());
        if (sharedPreferencesForPluginVersionInfo == null) {
            XWebLog.m21909e(getPluginName(), "canDownloadPatch, sp is null");
            return false;
        }
        if (sharedPreferencesForPluginVersionInfo.getInt(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_PATCH_DOWNLOAD_COUNT_PREFIX + i, 0) <= 1) {
            XWebLog.m21911i(getPluginName(), "canDownloadPatch, ret = true");
            return true;
        }
        XWebLog.m21911i(getPluginName(), "canDownloadPatch, ret = false");
        return false;
    }

    public boolean checkFileListConfig(int i, boolean z) {
        String str;
        String str2;
        String pluginName = getPluginName();
        XWebLog.m21911i(pluginName, "checkFileListConfig, version = " + i);
        if (i < 0) {
            XWebLog.m21911i(getPluginName(), "checkFileListConfig, version invalid");
            return false;
        }
        File file = new File(getExtractFile(i, "filelist.config"));
        if (file.exists()) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            XWebLog.m21911i(getPluginName(), "checkFileListConfig success");
                            FileUtils.tryClose(bufferedReader2);
                            return true;
                        } else if (!readLine.isEmpty()) {
                            String[] split = readLine.split(XVFSFile.PATH_SEPARATOR);
                            if (split.length == 2 && (str = split[0]) != null && !str.isEmpty() && (str2 = split[1]) != null && !str2.isEmpty()) {
                                String str3 = split[0];
                                if (!MD5.checkMD5(getExtractFile(i, str3), split[1])) {
                                    String pluginName2 = getPluginName();
                                    XWebLog.m21909e(pluginName2, "checkFileListConfig, md5 not match: " + str3);
                                    FileUtils.tryClose(bufferedReader2);
                                    return false;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        try {
                            String pluginName3 = getPluginName();
                            XWebLog.m21909e(pluginName3, "checkFileListConfig error: " + th);
                            return false;
                        } finally {
                            FileUtils.tryClose(bufferedReader);
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                String pluginName32 = getPluginName();
                XWebLog.m21909e(pluginName32, "checkFileListConfig error: " + th);
                return false;
            }
        } else if (z) {
            XWebLog.m21911i(getPluginName(), "checkFileListConfig, no filelist.config, skip");
            return true;
        } else {
            XWebLog.m21909e(getPluginName(), "checkFileListConfig, no filelist.config, return");
            return false;
        }
    }

    public abstract void checkFiles();

    public boolean clearPatchDownloadInfo() {
        if (XWalkEnvironment.getApplicationContext() == null) {
            XWebLog.m21909e(getPluginName(), "clearPatchDownloadInfo, context is null");
            return false;
        }
        SharedPreferences sharedPreferencesForPluginVersionInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginVersionInfo(getPluginName());
        if (sharedPreferencesForPluginVersionInfo == null) {
            XWebLog.m21909e(getPluginName(), "clearPatchDownloadInfo, sp is null");
            return false;
        }
        Map<String, ?> all = sharedPreferencesForPluginVersionInfo.getAll();
        if (all == null || all.size() == 0) {
            return true;
        }
        SharedPreferences.Editor edit = sharedPreferencesForPluginVersionInfo.edit();
        for (String next : all.keySet()) {
            if (next != null && next.startsWith(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_PATCH_DOWNLOAD_COUNT_PREFIX)) {
                String pluginName = getPluginName();
                XWebLog.m21911i(pluginName, "clearPatchDownloadInfo, remove key " + next);
                edit.remove(next);
            }
        }
        return edit.commit();
    }

    public boolean doPatch(SchedulerConfig schedulerConfig) {
        int availableVersion = getAvailableVersion();
        String pluginName = getPluginName();
        XWebLog.m21911i(pluginName, "doPatch current version = " + availableVersion + ", new version = " + schedulerConfig.version);
        if (availableVersion < 0) {
            XWebLog.m21909e(getPluginName(), "doPatch, current version invalid");
            return false;
        } else if (!schedulerConfig.bIsPatchUpdate) {
            XWebLog.m21909e(getPluginName(), "doPatch, current download config is not patch");
            return false;
        } else {
            File file = new File(getPatchFile(schedulerConfig.version, PATCH_CONFIG_NAME));
            if (!file.exists()) {
                XWebLog.m21909e(getPluginName(), "doPatch, can not find patch config file");
                return false;
            }
            List<XWalkPluginPatchConfigParser.PluginPatchConfig> pluginPatchConfigList = XWalkPluginPatchConfigParser.getPluginPatchConfigList(file);
            if (pluginPatchConfigList == null || pluginPatchConfigList.size() == 0) {
                XWebLog.m21909e(getPluginName(), "doPatch, patchConfigList = null");
                return false;
            } else if (!FileUtils.copyDirectory(getExtractDir(availableVersion), getExtractDir(schedulerConfig.version), false)) {
                XWebLog.m21909e(getPluginName(), "doPatch, copy files failed");
                return false;
            } else {
                for (XWalkPluginPatchConfigParser.PluginPatchConfig next : pluginPatchConfigList) {
                    if (next.isTypeAdd()) {
                        if (!FileUtils.copyFile(getPatchFile(schedulerConfig.version, next.originalFileName), getExtractFile(schedulerConfig.version, next.originalFileName))) {
                            String pluginName2 = getPluginName();
                            XWebLog.m21909e(pluginName2, "doPatch, add file error: " + next);
                            return false;
                        }
                        String pluginName3 = getPluginName();
                        XWebLog.m21911i(pluginName3, "doPatch, add file:" + next);
                    } else if (next.isTypeRemove()) {
                        if (!FileUtils.deleteFile(getExtractFile(schedulerConfig.version, next.originalFileName))) {
                            String pluginName4 = getPluginName();
                            XWebLog.m21909e(pluginName4, "doPatch, delete file error:" + next);
                        } else {
                            String pluginName5 = getPluginName();
                            XWebLog.m21911i(pluginName5, "doPatch, delete file:" + next);
                        }
                    } else if (!next.isTypeModify()) {
                        String pluginName6 = getPluginName();
                        XWebLog.m21909e(pluginName6, "doPatch, unknown op" + next);
                        return false;
                    } else if (Patch.getInstance(1).doPatch(getExtractFile(schedulerConfig.version, next.originalFileName), getPatchFile(schedulerConfig.version, next.patchFileName), getExtractFile(schedulerConfig.version, next.originalFileName)) < 0) {
                        String pluginName7 = getPluginName();
                        XWebLog.m21909e(pluginName7, "doPatch, patch file error:" + next);
                        return false;
                    } else {
                        String pluginName8 = getPluginName();
                        XWebLog.m21911i(pluginName8, "doPatch, patch file:" + next);
                    }
                }
                FileUtils.deleteFile(getExtractFile(schedulerConfig.version, "filelist.config"));
                if (!FileUtils.copyFile(getPatchFile(schedulerConfig.version, "filelist.config"), getExtractFile(schedulerConfig.version, "filelist.config"))) {
                    XWebLog.m21909e(getPluginName(), "doPatch, copy filelist.config error");
                    return false;
                } else if (!checkFileListConfig(schedulerConfig.version, false)) {
                    XWebLog.m21909e(getPluginName(), "doPatch, check md5 failed");
                    return false;
                } else {
                    String patchDir = getPatchDir(schedulerConfig.version);
                    if (!patchDir.isEmpty()) {
                        FileUtils.deleteAll(patchDir);
                    }
                    return true;
                }
            }
        }
    }

    public int getAvailableVersion() {
        return this.mAvailableVersion;
    }

    public abstract String getDownloadFullPath(int i, boolean z);

    public String getEmbedFileMD5() {
        return this.mEmbedFileMD5;
    }

    public String getEmbedFileName() {
        return this.mEmbedFileName;
    }

    public int getEmbedVersion() {
        return this.mEmbedVersion;
    }

    public String getExtractDir(int i) {
        String versionDir = getVersionDir(i);
        if (versionDir.isEmpty()) {
            XWebLog.m21909e(getPluginName(), "getExtractDir, versionDir is empty");
            return "";
        }
        String str = versionDir + File.separator + EXTRACTED_DIR_NAME;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public String getExtractFile(int i, String str) {
        if (str == null || str.isEmpty()) {
            XWebLog.m21909e(getPluginName(), "getExtractFile, fileName is empty");
            return "";
        }
        String extractDir = getExtractDir(i);
        if (extractDir.isEmpty()) {
            XWebLog.m21909e(getPluginName(), "getExtractFile, extractDir is empty");
            return "";
        }
        return extractDir + File.separator + str;
    }

    public String getPatchDir(int i) {
        String versionDir = getVersionDir(i);
        if (versionDir.isEmpty()) {
            XWebLog.m21909e(getPluginName(), "getPatchDir, versionDir is empty");
            return "";
        }
        String str = versionDir + File.separator + PATCH_DIR_NAME;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public String getPatchFile(int i, String str) {
        if (str == null || str.isEmpty()) {
            XWebLog.m21909e(getPluginName(), "getPatchFile, fileName is empty");
            return "";
        }
        String patchDir = getPatchDir(i);
        if (patchDir.isEmpty()) {
            XWebLog.m21909e(getPluginName(), "getPatchFile, patchDir is null");
            return "";
        }
        return patchDir + File.separator + str;
    }

    public abstract String getPluginName();

    public String getPrivateCacheDir(int i) {
        String versionDir = getVersionDir(i);
        if (versionDir == null || versionDir.isEmpty()) {
            XWebLog.m21909e(getPluginName(), "getPrivateCacheDir, versionDir is empty");
            return "";
        }
        String str = versionDir + File.separator + PRIVATE_CACHE_DIR_NAME;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public String getVersionDir(int i) {
        if (XWalkEnvironment.getApplicationContext() == null) {
            XWebLog.m21909e(getPluginName(), "getVersionDir, context is null");
            return "";
        }
        String pluginBaseDir = XWebFileUtil.getPluginBaseDir();
        if (pluginBaseDir.isEmpty()) {
            XWebLog.m21909e(getPluginName(), "getVersionDir, pluginBaseDir is null");
            return "";
        }
        String str = pluginBaseDir + File.separator + getPluginName() + "_" + i;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.mEmbedFileName;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r0 = r1.mEmbedFileMD5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasEmbed() {
        /*
            r1 = this;
            int r0 = r1.mEmbedVersion
            if (r0 <= 0) goto L_0x001a
            java.lang.String r0 = r1.mEmbedFileName
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = r1.mEmbedFileMD5
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.xwalk.plugin.XWalkPlugin.hasEmbed():boolean");
    }

    public abstract boolean isDownloadImmediately();

    public abstract boolean isIgnoreForbidDownloadCode();

    public abstract int performInstall(SchedulerConfig schedulerConfig);

    public boolean recordPatchDownloadInfo(int i) {
        if (XWalkEnvironment.getApplicationContext() == null) {
            XWebLog.m21909e(getPluginName(), "recordPatchDownloadInfo, context is null");
            return false;
        }
        SharedPreferences sharedPreferencesForPluginVersionInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginVersionInfo(getPluginName());
        if (sharedPreferencesForPluginVersionInfo == null) {
            XWebLog.m21909e(getPluginName(), "recordPatchDownloadInfo, sp is null");
            return false;
        }
        String str = XWebSharedPreferenceUtil.SP_KEY_PLUGIN_PATCH_DOWNLOAD_COUNT_PREFIX + i;
        int i2 = sharedPreferencesForPluginVersionInfo.getInt(str, 0);
        SharedPreferences.Editor edit = sharedPreferencesForPluginVersionInfo.edit();
        edit.putInt(str, i2 + 1);
        return edit.commit();
    }

    public void reportUsingVersion(int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        if (i5 <= 0) {
            XWebLog.m21909e(getPluginName(), "reportUsingVersion, reportVersion invalid");
            return;
        }
        SharedPreferences sharedPreferencesForPluginVersionInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginVersionInfo(getPluginName());
        if (sharedPreferencesForPluginVersionInfo == null) {
            XWebLog.m21909e(getPluginName(), "reportUsingVersion, sp is null");
            return;
        }
        int i7 = sharedPreferencesForPluginVersionInfo.getInt(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_LAST_REPORT_VERSION, -1);
        String string = sharedPreferencesForPluginVersionInfo.getString(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_LAST_REPORT_DATE, "");
        try {
            String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
            if (i7 != i5 || !string.equals(format)) {
                int i8 = i3 + (i5 % (i4 - i3));
                String pluginName = getPluginName();
                XWebLog.m21908d(pluginName, "reportUsingVersion, id:" + i6 + ", key:" + i8);
                WXWebReporter.idkeyReport((long) i6, (long) i8, 1);
                SharedPreferences.Editor edit = sharedPreferencesForPluginVersionInfo.edit();
                if (edit != null) {
                    edit.putInt(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_LAST_REPORT_VERSION, i5);
                    edit.putString(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_LAST_REPORT_DATE, format);
                    edit.commit();
                    return;
                }
                XWebLog.m21909e(getPluginName(), "reportUsingVersion, editor is null");
            }
        } catch (Throwable th) {
            String pluginName2 = getPluginName();
            XWebLog.m21909e(pluginName2, "reportUsingVersion, get cur date error: " + th);
        }
    }

    public boolean setAvailableVersion(int i, boolean z) {
        if (XWalkEnvironment.getApplicationContext() == null) {
            XWebLog.m21909e(getPluginName(), "setVer, context is null");
            return false;
        }
        SharedPreferences sharedPreferencesForPluginVersionInfo = XWebSharedPreferenceUtil.getSharedPreferencesForPluginVersionInfo(getPluginName());
        if (sharedPreferencesForPluginVersionInfo == null) {
            XWebLog.m21909e(getPluginName(), "setVer, sp is null");
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferencesForPluginVersionInfo.edit();
        edit.putInt(XWebSharedPreferenceUtil.SP_KEY_PLUGIN_AVAILABLE_VERSION, i);
        boolean commit = edit.commit();
        if (commit && z) {
            this.mAvailableVersion = i;
        }
        String pluginName = getPluginName();
        XWebLog.m21911i(pluginName, "setVer, version = " + i + ", isNow = " + z + ", ret = " + commit);
        return commit;
    }

    public void setEmbedInfo(int i, String str, String str2) {
        this.mEmbedVersion = i;
        this.mEmbedFileName = str;
        this.mEmbedFileMD5 = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0122 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean unZipAndCheck(com.tencent.xweb.util.SchedulerConfig r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.getPluginName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unZipAndCheck version "
            r1.append(r2)
            int r2 = r9.version
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.xweb.util.XWebLog.m21911i(r0, r1)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r9.path
            r0.<init>(r1)
            r1 = 0
            r2 = 0
            java.lang.String r3 = r9.path     // Catch:{ all -> 0x00ff }
            java.lang.String r4 = r9.strMd5     // Catch:{ all -> 0x00ff }
            boolean r3 = com.tencent.xweb.util.MD5.checkMD5(r3, r4)     // Catch:{ all -> 0x00ff }
            if (r3 != 0) goto L_0x0045
            java.lang.String r9 = r8.getPluginName()     // Catch:{ all -> 0x00ff }
            java.lang.String r3 = "unZipAndCheck failed, zip md5 not match"
            com.tencent.xweb.util.XWebLog.m21911i(r9, r3)     // Catch:{ all -> 0x00ff }
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            boolean r9 = r0.exists()
            if (r9 == 0) goto L_0x0044
            r0.delete()
        L_0x0044:
            return r1
        L_0x0045:
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch:{ all -> 0x00ff }
            java.lang.String r4 = r9.path     // Catch:{ all -> 0x00ff }
            r3.<init>(r4)     // Catch:{ all -> 0x00ff }
            java.util.Enumeration r2 = r3.entries()     // Catch:{ all -> 0x00fc }
        L_0x0050:
            boolean r4 = r2.hasMoreElements()     // Catch:{ all -> 0x00fc }
            if (r4 == 0) goto L_0x00b9
            java.lang.Object r4 = r2.nextElement()     // Catch:{ all -> 0x00fc }
            java.util.zip.ZipEntry r4 = (java.util.zip.ZipEntry) r4     // Catch:{ all -> 0x00fc }
            java.lang.String r5 = r4.getName()     // Catch:{ all -> 0x00fc }
            java.lang.String r6 = "UTF-8"
            java.lang.String r5 = java.net.URLEncoder.encode(r5, r6)     // Catch:{ all -> 0x00fc }
            java.lang.String r6 = "../"
            boolean r6 = r5.contains(r6)     // Catch:{ all -> 0x00fc }
            if (r6 != 0) goto L_0x0050
            java.lang.String r6 = "..\\"
            boolean r6 = r5.contains(r6)     // Catch:{ all -> 0x00fc }
            if (r6 != 0) goto L_0x0050
            boolean r6 = r4.isDirectory()     // Catch:{ all -> 0x00fc }
            if (r6 == 0) goto L_0x007d
            goto L_0x0050
        L_0x007d:
            java.io.InputStream r4 = r3.getInputStream(r4)     // Catch:{ all -> 0x00fc }
            boolean r6 = r9.bIsPatchUpdate     // Catch:{ all -> 0x00fc }
            if (r6 == 0) goto L_0x0091
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x00fc }
            int r7 = r9.version     // Catch:{ all -> 0x00fc }
            java.lang.String r5 = r8.getPatchFile(r7, r5)     // Catch:{ all -> 0x00fc }
            r6.<init>(r5)     // Catch:{ all -> 0x00fc }
            goto L_0x009c
        L_0x0091:
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x00fc }
            int r7 = r9.version     // Catch:{ all -> 0x00fc }
            java.lang.String r5 = r8.getExtractFile(r7, r5)     // Catch:{ all -> 0x00fc }
            r6.<init>(r5)     // Catch:{ all -> 0x00fc }
        L_0x009c:
            boolean r4 = com.tencent.xweb.util.FileUtils.copyStreamToFile(r4, r6)     // Catch:{ all -> 0x00fc }
            if (r4 != 0) goto L_0x0050
            java.lang.String r9 = r8.getPluginName()     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = "unZipAndCheck error, return"
            com.tencent.xweb.util.XWebLog.m21909e(r9, r2)     // Catch:{ all -> 0x00fc }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            boolean r9 = r0.exists()
            if (r9 == 0) goto L_0x00b8
            r0.delete()
        L_0x00b8:
            return r1
        L_0x00b9:
            boolean r2 = r9.skipSubFileMD5Check     // Catch:{ all -> 0x00fc }
            r4 = 1
            if (r2 != 0) goto L_0x00ef
            boolean r2 = r9.bIsPatchUpdate     // Catch:{ all -> 0x00fc }
            if (r2 == 0) goto L_0x00c3
            goto L_0x00ef
        L_0x00c3:
            int r9 = r9.version     // Catch:{ all -> 0x00fc }
            boolean r9 = r8.checkFileListConfig(r9, r1)     // Catch:{ all -> 0x00fc }
            if (r9 != 0) goto L_0x00e2
            java.lang.String r9 = r8.getPluginName()     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = "unZipAndCheck md5 check failed"
            com.tencent.xweb.util.XWebLog.m21909e(r9, r2)     // Catch:{ all -> 0x00fc }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            boolean r9 = r0.exists()
            if (r9 == 0) goto L_0x00e1
            r0.delete()
        L_0x00e1:
            return r1
        L_0x00e2:
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            boolean r9 = r0.exists()
            if (r9 == 0) goto L_0x00ee
            r0.delete()
        L_0x00ee:
            return r4
        L_0x00ef:
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            boolean r9 = r0.exists()
            if (r9 == 0) goto L_0x00fb
            r0.delete()
        L_0x00fb:
            return r4
        L_0x00fc:
            r9 = move-exception
            r2 = r3
            goto L_0x0100
        L_0x00ff:
            r9 = move-exception
        L_0x0100:
            java.lang.String r3 = r8.getPluginName()     // Catch:{ all -> 0x0126 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0126 }
            r4.<init>()     // Catch:{ all -> 0x0126 }
            java.lang.String r5 = "unZipAndCheck error: "
            r4.append(r5)     // Catch:{ all -> 0x0126 }
            r4.append(r9)     // Catch:{ all -> 0x0126 }
            java.lang.String r9 = r4.toString()     // Catch:{ all -> 0x0126 }
            com.tencent.xweb.util.XWebLog.m21909e(r3, r9)     // Catch:{ all -> 0x0126 }
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            boolean r9 = r0.exists()
            if (r9 == 0) goto L_0x0125
            r0.delete()
        L_0x0125:
            return r1
        L_0x0126:
            r9 = move-exception
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0133
            r0.delete()
        L_0x0133:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.xwalk.plugin.XWalkPlugin.unZipAndCheck(com.tencent.xweb.util.SchedulerConfig):boolean");
    }

    public int getAvailableVersion(boolean z) {
        if (z) {
            loadVersionFromSharedPreference();
        }
        return this.mAvailableVersion;
    }
}
