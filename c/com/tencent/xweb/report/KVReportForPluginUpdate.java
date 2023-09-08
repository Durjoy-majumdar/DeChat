package com.tencent.xweb.report;

import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.XWebDownloader;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.updater.XWebHttpTask;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import com.tencent.xweb.xwalk.plugin.XWalkPluginManager;
import org.xwalk.core.XWalkEnvironment;

public class KVReportForPluginUpdate {
    public static final int PLUGIN_ERRCODE_CONFIG_UPDATE_FAILED = -1;
    public static final int PLUGIN_ERRCODE_EMBED_PREPARE_FAILED = -4;
    public static final int PLUGIN_ERRCODE_NONE = 0;
    public static final int PLUGIN_ERRCODE_PLUGIN_DOWNLOAD_FAILED = -2;
    public static final int PLUGIN_ERRCODE_PLUGIN_INSTALL_FAILED = -3;
    private static final String TAG = "KVReportForPluginUpdate";

    public static class ConfigReportData {
        public String checkType = "";
        public XWebHttpTask.ResultOut configDownloadResult = null;
        public int configErrCode = 0;
        public String configUrl = "";
        public String configVersion = "";
        public StringBuilder pluginList = new StringBuilder();
        public String singlePlugin = "";
    }

    public static class PluginReportData {
        public ConfigReportData configReportData = null;
        public int pluginBizType = -1;
        public XWebDownloader.DownloadInfo pluginDownloadResult = null;
        public long pluginDownloadTime = -1;
        public int pluginErrCode = 0;
        public int pluginInstallRet = 0;
        public long pluginInstallTimeEnd = -1;
        public long pluginInstallTimeStart = -1;
        public String pluginName = "";
        public String pluginUrl = "";
        public int pluginVersion = -1;
        public int targetPluginVersion = -1;
    }

    public static void reportPluginConfigUpdate(ConfigReportData configReportData) {
        String str;
        if (configReportData == null) {
            try {
                XWebLog.m21909e(TAG, "reportPluginConfigUpdate error, data is null");
            } catch (Exception e) {
                XWebLog.m21909e(TAG, "reportPluginConfigUpdate error: " + e.getMessage());
            }
        } else if (WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY.equals(configReportData.checkType)) {
            XWebLog.m21911i(TAG, "reportPluginConfigUpdate, checkType is config only, skip report");
        } else {
            String str2 = "";
            if (configReportData.configDownloadResult == null) {
                XWebHttpTask.ResultOut resultOut = new XWebHttpTask.ResultOut();
                configReportData.configDownloadResult = resultOut;
                resultOut.mUrl = str2;
                resultOut.mFilePath = str2;
                resultOut.mRetCode = 0;
                resultOut.mNetWorkType = -1;
                resultOut.mErrMsg = str2;
                resultOut.mRetryTimes = -1;
                resultOut.mCostTime = -1;
                resultOut.mTotalSize = -1;
                resultOut.mIsResume = -1;
            }
            String packageName = XWalkEnvironment.getApplicationContext() != null ? XWalkEnvironment.getApplicationContext().getPackageName() : str2;
            StringBuilder sb = new StringBuilder();
            sb.append(configReportData.configErrCode);
            sb.append(",");
            if (packageName == null) {
                packageName = str2;
            }
            sb.append(packageName);
            sb.append(",");
            sb.append(XWebSdk.getXWebSdkVersion());
            sb.append(",");
            String str3 = configReportData.checkType;
            if (str3 == null) {
                str3 = str2;
            }
            sb.append(str3);
            sb.append(",");
            String str4 = configReportData.singlePlugin;
            if (str4 == null) {
                str4 = str2;
            }
            sb.append(str4);
            sb.append(",");
            String str5 = configReportData.configVersion;
            if (str5 == null) {
                str5 = str2;
            }
            sb.append(str5);
            sb.append(",");
            String str6 = configReportData.configUrl;
            if (str6 == null) {
                str6 = str2;
            }
            sb.append(str6);
            sb.append(",");
            sb.append(configReportData.configDownloadResult.mRetCode);
            sb.append(",");
            sb.append(configReportData.configDownloadResult.mNetWorkType);
            sb.append(",");
            sb.append(configReportData.configDownloadResult.mRetryTimes);
            sb.append(",");
            sb.append(configReportData.configDownloadResult.mCostTime);
            sb.append(",");
            sb.append(configReportData.configDownloadResult.mTotalSize);
            sb.append(",");
            sb.append(configReportData.configDownloadResult.mIsResume);
            sb.append(",");
            StringBuilder sb4 = configReportData.pluginList;
            if (sb4 != null) {
                str2 = sb4.toString();
            }
            sb.append(str2);
            String sb5 = sb.toString();
            XWebLog.m21911i(TAG, "reportPluginConfigUpdate, key = 26264, value = " + sb5);
            WXWebReporter.setKVLog(WXWebReporter.WXWEB_KV_PLUGIN_CONFIG_UPDATE, sb5);
            if (configReportData.configErrCode != 0 && (str = configReportData.singlePlugin) != null && !str.isEmpty()) {
                XWebLog.m21911i(TAG, "reportPluginConfigUpdate, config error, single plugin is not empty, try reportPluginUpdate");
                PluginReportData pluginReportData = new PluginReportData();
                pluginReportData.configReportData = configReportData;
                String str7 = configReportData.singlePlugin;
                pluginReportData.pluginName = str7;
                XWalkPlugin plugin = XWalkPluginManager.getPlugin(str7);
                if (plugin != null) {
                    pluginReportData.pluginVersion = plugin.getAvailableVersion();
                }
                pluginReportData.pluginErrCode = -1;
                reportPluginUpdate(pluginReportData);
            }
        }
    }

    public static void reportPluginUpdate(PluginReportData pluginReportData) {
        if (pluginReportData == null) {
            try {
                XWebLog.m21909e(TAG, "reportPluginUpdate error, data is null");
            } catch (Exception e) {
                XWebLog.m21909e(TAG, "reportPluginUpdate error: " + e.getMessage());
            }
        } else {
            ConfigReportData configReportData = pluginReportData.configReportData;
            if (configReportData == null) {
                XWebLog.m21909e(TAG, "reportPluginUpdate error, configReportData is null");
            } else if (WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY.equals(configReportData.checkType)) {
                XWebLog.m21911i(TAG, "reportPluginUpdate, checkType is config only, skip report");
            } else {
                XWebDownloader.DownloadInfo downloadInfo = pluginReportData.pluginDownloadResult;
                long j = -1;
                int i = 0;
                int i2 = -1;
                String str = "";
                if (downloadInfo == null) {
                    XWebDownloader.DownloadInfo downloadInfo2 = new XWebDownloader.DownloadInfo();
                    pluginReportData.pluginDownloadResult = downloadInfo2;
                    downloadInfo2.mDownloadType = -1;
                    downloadInfo2.mUrl = str;
                    downloadInfo2.mSavePath = str;
                    downloadInfo2.mStartTimestamp = -1;
                    downloadInfo2.mNetWorkType = -1;
                    downloadInfo2.mIsDownloadResume = false;
                    downloadInfo2.mFileTotalSize = -1;
                    downloadInfo2.mIsRuntime = false;
                    downloadInfo2.mBizType = -1;
                    downloadInfo2.mRetryTimes = -1;
                } else {
                    if (downloadInfo.mIsDownloadResume) {
                        i = 1;
                    }
                    i2 = i;
                }
                long j2 = pluginReportData.pluginInstallTimeEnd;
                long j3 = pluginReportData.pluginInstallTimeStart;
                if (j2 > j3 && j3 > 0) {
                    j = j2 - j3;
                }
                String packageName = XWalkEnvironment.getApplicationContext() != null ? XWalkEnvironment.getApplicationContext().getPackageName() : str;
                StringBuilder sb = new StringBuilder();
                sb.append(pluginReportData.pluginErrCode);
                sb.append(",");
                if (packageName == null) {
                    packageName = str;
                }
                sb.append(packageName);
                sb.append(",");
                sb.append(XWebSdk.getXWebSdkVersion());
                sb.append(",");
                String str2 = pluginReportData.pluginName;
                if (str2 == null) {
                    str2 = str;
                }
                sb.append(str2);
                sb.append(",");
                sb.append(pluginReportData.pluginVersion);
                sb.append(",");
                sb.append(pluginReportData.targetPluginVersion);
                sb.append(",");
                sb.append(pluginReportData.pluginBizType);
                sb.append(",");
                String str3 = pluginReportData.pluginUrl;
                if (str3 == null) {
                    str3 = str;
                }
                sb.append(str3);
                sb.append(",");
                String str4 = pluginReportData.configReportData.checkType;
                if (str4 == null) {
                    str4 = str;
                }
                sb.append(str4);
                sb.append(",");
                String str5 = pluginReportData.configReportData.singlePlugin;
                if (str5 == null) {
                    str5 = str;
                }
                sb.append(str5);
                sb.append(",");
                String str6 = pluginReportData.configReportData.configVersion;
                if (str6 == null) {
                    str6 = str;
                }
                sb.append(str6);
                sb.append(",");
                String str7 = pluginReportData.configReportData.configUrl;
                if (str7 != null) {
                    str = str7;
                }
                sb.append(str);
                sb.append(",");
                sb.append(pluginReportData.configReportData.configErrCode);
                sb.append(",");
                sb.append(pluginReportData.pluginDownloadResult.mErrorCode);
                sb.append(",");
                sb.append(pluginReportData.pluginDownloadResult.mDownloadType);
                sb.append(",");
                sb.append(pluginReportData.pluginDownloadResult.mNetWorkType);
                sb.append(",");
                sb.append(pluginReportData.pluginDownloadResult.mRetryTimes);
                sb.append(",");
                sb.append(pluginReportData.pluginDownloadTime);
                sb.append(",");
                sb.append(pluginReportData.pluginDownloadResult.mFileTotalSize);
                sb.append(",");
                sb.append(i2);
                sb.append(",");
                sb.append(pluginReportData.pluginInstallRet);
                sb.append(",");
                sb.append(j);
                String sb4 = sb.toString();
                XWebLog.m21911i(TAG, "reportPluginUpdate, key = 26265, value = " + sb4);
                WXWebReporter.setKVLog(WXWebReporter.WXWEB_KV_PLUGIN_UPDATE_NEW, sb4);
            }
        }
    }
}
