package com.tencent.xweb.xwalk.plugin;

import android.os.AsyncTask;
import com.tencent.xweb.CommandCfgPlugin;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.XWebDownloader;
import com.tencent.xweb.XWebEmbedSetting;
import com.tencent.xweb.report.KVReportForPluginUpdate;
import com.tencent.xweb.updater.IXWebHttpTaskCallback;
import com.tencent.xweb.updater.LibPluginUpdateConfig;
import com.tencent.xweb.updater.XWalkRuntimeUpdater;
import com.tencent.xweb.updater.XWebHttpTask;
import com.tencent.xweb.util.ConfigDef;
import com.tencent.xweb.util.ConfigParser;
import com.tencent.xweb.util.FrequentLimiter;
import com.tencent.xweb.util.NetworkUtil;
import com.tencent.xweb.util.Scheduler;
import com.tencent.xweb.util.SchedulerConfig;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebFileUtil;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebUpdateConfigUtil;
import com.tencent.xweb.xwalk.plugin.XFileSchedulerFactory;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class XWalkPluginUpdaterChecker extends AsyncTask<String, Integer, Integer> {
    private static final int STATUS_DOWNLOAD = 3;
    private static final int STATUS_FETCH_CONFIG = 2;
    private static final int STATUS_FINISHED = 5;
    private static final int STATUS_NOT_STARTED = 0;
    private static final int STATUS_START_PREPARE = 1;
    private static final int STATUS_USER_CANCEL = 4;
    private static final String TAG = "XWalkPluginUpdaterChecker";
    private static final int TASK_TYPE_CDN = 2;
    private static final int TASK_TYPE_HTTP = 1;
    private boolean isAllFinished = false;
    private final String mConfigDownloadUrl = XWebUpdateConfigUtil.getPluginConfigUrl();
    /* access modifiers changed from: private */
    public final KVReportForPluginUpdate.ConfigReportData mConfigReportData = new KVReportForPluginUpdate.ConfigReportData();
    private final Object mLocker = new Object();
    /* access modifiers changed from: private */
    public String mNotifyType = "0";
    /* access modifiers changed from: private */
    public String mSinglePluginToUpdate = "";
    private XWalkPluginUpdateListener mSingleUpdateListener = null;
    private final StatusInfo mStatusInfo = new StatusInfo();
    private int mTaskCancelledCount = 0;
    private int mTaskCount = 0;
    private int mTaskDownloadFailedCount = 0;
    private int mTaskInstallFailedCount = 0;
    private final Map<String, TaskInfo> mTaskMap = new HashMap();
    private int mTaskSuccessCount = 0;

    public static class StatusInfo {
        public int curStatus = 0;
        public int errCode = 0;
    }

    public static class TaskInfo {
        public AsyncTask task = null;
        public boolean taskFinished = false;
        public int type = 1;
    }

    private void doFetchPluginUpdateConfig() {
        if (!NetworkUtil.isNetworkAvailable()) {
            XWebLog.addInitializeLog(TAG, "doFetchPluginUpdateConfig network not available");
            KVReportForPluginUpdate.ConfigReportData configReportData = this.mConfigReportData;
            configReportData.configErrCode = -2;
            KVReportForPluginUpdate.reportPluginConfigUpdate(configReportData);
            updateStatus(5, -2);
        } else if (!updateStatus(2)) {
            XWebLog.addInitializeLog(TAG, "status change to fetch config failed");
            KVReportForPluginUpdate.ConfigReportData configReportData2 = this.mConfigReportData;
            configReportData2.configErrCode = -1;
            KVReportForPluginUpdate.reportPluginConfigUpdate(configReportData2);
            updateStatus(5, -1);
        } else {
            XWebHttpTask.ParaIn paraIn = new XWebHttpTask.ParaIn();
            paraIn.mUrl = this.mConfigDownloadUrl;
            paraIn.mFilePath = XWebFileUtil.getPluginUpdateConfigFilePath();
            paraIn.mUseHttps = true;
            XWebHttpTask.addNewTask(paraIn, new IXWebHttpTaskCallback() {
                private ConfigDef.Patch findAvailablePatch(ConfigDef.PluginInfo pluginInfo, int i) {
                    ConfigDef.Patch[] patchArr;
                    if (!(pluginInfo == null || (patchArr = pluginInfo.patches) == null || patchArr.length == 0)) {
                        for (ConfigDef.Patch patch : patchArr) {
                            if (patch.nTargetVersion == i) {
                                return patch;
                            }
                        }
                    }
                    return null;
                }

                private ConfigDef.PluginInfo findMatchedPluginInfo(ConfigDef.PluginConfig pluginConfig, String str, int i, boolean z) {
                    ConfigDef.PluginInfo[] pluginInfoArr;
                    if (pluginConfig == null || (pluginInfoArr = pluginConfig.plugins) == null || pluginInfoArr.length == 0 || str == null || str.isEmpty()) {
                        XWebLog.m21909e(XWalkPluginUpdaterChecker.TAG, "findMatchedPluginInfo params error");
                        return null;
                    }
                    for (ConfigDef.PluginInfo pluginInfo : pluginConfig.plugins) {
                        if (str.equals(pluginInfo.strName) && pluginInfo.version > i && pluginInfo.filter.checkMatch(z, true, XWalkPluginUpdaterChecker.TAG)) {
                            return pluginInfo;
                        }
                    }
                    return null;
                }

                public void onTaskFailed(XWebHttpTask.ResultOut resultOut) {
                    XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "plugin config download failed: " + resultOut.mRetCode);
                    WXWebReporter.onPluginConfigDownloadFailed();
                    XWalkPluginUpdaterChecker.this.mConfigReportData.configDownloadResult = resultOut;
                    XWalkPluginUpdaterChecker.this.mConfigReportData.configErrCode = -5;
                    KVReportForPluginUpdate.reportPluginConfigUpdate(XWalkPluginUpdaterChecker.this.mConfigReportData);
                    boolean unused = XWalkPluginUpdaterChecker.this.updateStatus(5, -5);
                }

                public void onTaskProgressChanged(XWebHttpTask.Progress progress) {
                }

                public void onTaskStarted() {
                    WXWebReporter.onPluginConfigDownload();
                }

                public void onTaskSucceed(XWebHttpTask.ResultOut resultOut) {
                    ConfigDef.PluginConfig pluginConfig;
                    XWebHttpTask.ResultOut resultOut2 = resultOut;
                    XWalkPluginUpdaterChecker.this.mConfigReportData.configDownloadResult = resultOut2;
                    WXWebReporter.onPluginConfigDownloadSuccess();
                    ConfigDef.PluginConfig parsePluginConfig = ConfigParser.parsePluginConfig(resultOut2.mFilePath);
                    if (parsePluginConfig == null) {
                        XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "parse plugin config failed");
                        WXWebReporter.onPluginConfigParseFailed();
                        XWalkPluginUpdaterChecker.this.mConfigReportData.configErrCode = -6;
                        KVReportForPluginUpdate.reportPluginConfigUpdate(XWalkPluginUpdaterChecker.this.mConfigReportData);
                        boolean unused = XWalkPluginUpdaterChecker.this.updateStatus(5, -6);
                        return;
                    }
                    XWebLog.m21911i(XWalkPluginUpdaterChecker.TAG, "onTaskSucceed, costTime:" + resultOut2.mCostTime + "ms, configVersion:" + parsePluginConfig.strConfigVer + ", commands:" + Arrays.toString(parsePluginConfig.commands));
                    KVReportForPluginUpdate.ConfigReportData access$000 = XWalkPluginUpdaterChecker.this.mConfigReportData;
                    String str = parsePluginConfig.strConfigVer;
                    access$000.configVersion = str;
                    boolean z = false;
                    WXWebReporter.onCfgDownload(str, false);
                    CommandCfgPlugin.getInstance().applyCommand(parsePluginConfig.commands, parsePluginConfig.strConfigVer);
                    XWalkRuntimeUpdater.sendBroadcast(IXWebBroadcastListener.STAGE_PLUGINCFG_UPDATE, 0);
                    ConfigDef.PluginInfo[] pluginInfoArr = parsePluginConfig.plugins;
                    if (pluginInfoArr == null || pluginInfoArr.length == 0) {
                        XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "onTaskSucceed, plugin config contains no plugin");
                        XWalkPluginUpdaterChecker.this.mConfigReportData.configErrCode = -7;
                        KVReportForPluginUpdate.reportPluginConfigUpdate(XWalkPluginUpdaterChecker.this.mConfigReportData);
                        boolean unused2 = XWalkPluginUpdaterChecker.this.updateStatus(5, -7);
                    } else if (WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY.equals(XWalkPluginUpdaterChecker.this.mNotifyType)) {
                        XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "onTaskSucceed, check update plugin config only");
                        XWalkPluginUpdaterChecker.this.mConfigReportData.configErrCode = 0;
                        KVReportForPluginUpdate.reportPluginConfigUpdate(XWalkPluginUpdaterChecker.this.mConfigReportData);
                        boolean unused3 = XWalkPluginUpdaterChecker.this.updateStatus(5, 0);
                    } else {
                        HashMap hashMap = new HashMap();
                        for (XWalkPlugin next : XWalkPluginManager.getAllPlugins()) {
                            if (next == null) {
                                XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "process plugin null");
                            } else {
                                XFileSchedulerFactory.XFileScheduler scheduler = XFileSchedulerFactory.getScheduler(next.getPluginName());
                                if (XWalkPluginUpdaterChecker.this.isSetSinglePluginToUpdate() && !XWalkPluginUpdaterChecker.this.mSinglePluginToUpdate.equals(next.getPluginName())) {
                                    XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "set only update " + XWalkPluginUpdaterChecker.this.mSinglePluginToUpdate + ", skip " + next.getPluginName());
                                } else if (!XWebEmbedSetting.getForbidDownloadCode() || next.isIgnoreForbidDownloadCode()) {
                                    int availableVersion = next.getAvailableVersion(true);
                                    if (XWalkPluginUpdaterChecker.this.isSetSinglePluginToUpdate() || next.isDownloadImmediately() || availableVersion != -1) {
                                        ConfigDef.PluginInfo findMatchedPluginInfo = findMatchedPluginInfo(parsePluginConfig, next.getPluginName(), availableVersion, XWalkPluginUpdaterChecker.this.isSetSinglePluginToUpdate());
                                        if (findMatchedPluginInfo == null) {
                                            XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "no matched plugin version, skip " + next.getPluginName());
                                            scheduler.saveSchedulerConfig((SchedulerConfig) null);
                                        } else {
                                            SchedulerConfig schedulerConfig = new SchedulerConfig();
                                            schedulerConfig.version = findMatchedPluginInfo.version;
                                            schedulerConfig.timeHourStart = findMatchedPluginInfo.updateStartTime;
                                            schedulerConfig.timeHourEnd = findMatchedPluginInfo.updateEndTime;
                                            schedulerConfig.skipSubFileMD5Check = z;
                                            ConfigDef.Patch findAvailablePatch = findAvailablePatch(findMatchedPluginInfo, availableVersion);
                                            if (findAvailablePatch == null || !next.canDownloadPatch(findMatchedPluginInfo.versionId)) {
                                                schedulerConfig.strUrl = findMatchedPluginInfo.strUrl;
                                                schedulerConfig.strMd5 = findMatchedPluginInfo.strMd5;
                                                schedulerConfig.path = next.getDownloadFullPath(schedulerConfig.version, z);
                                                schedulerConfig.bCanUseCellular = findMatchedPluginInfo.bCanUseCellular;
                                                schedulerConfig.bUseCdn = findMatchedPluginInfo.bUseCdn;
                                                schedulerConfig.bIsPatchUpdate = z;
                                                schedulerConfig.versionId = findMatchedPluginInfo.versionId;
                                                schedulerConfig.updateSpeedConfig = findMatchedPluginInfo.UPDATE_SPEED_CONFIG;
                                                schedulerConfig.updateForwardSpeedConfig = findMatchedPluginInfo.UPDATE_FORWARD_SPEED_CONFIG;
                                                schedulerConfig.updateScheduleTimeRangeBind = findMatchedPluginInfo.UPDATE_SCHEDULE_TIME_RANGE_BIND;
                                            } else {
                                                schedulerConfig.strUrl = findAvailablePatch.strUrl;
                                                schedulerConfig.strMd5 = findAvailablePatch.strMd5;
                                                schedulerConfig.path = next.getDownloadFullPath(schedulerConfig.version, true);
                                                schedulerConfig.bCanUseCellular = findAvailablePatch.bCanUseCellular;
                                                schedulerConfig.bUseCdn = findAvailablePatch.bUseCdn;
                                                schedulerConfig.bIsPatchUpdate = true;
                                                schedulerConfig.versionId = findMatchedPluginInfo.versionId;
                                                schedulerConfig.updateSpeedConfig = findMatchedPluginInfo.UPDATE_SPEED_CONFIG;
                                                schedulerConfig.updateForwardSpeedConfig = findMatchedPluginInfo.UPDATE_FORWARD_SPEED_CONFIG;
                                                schedulerConfig.updateScheduleTimeRangeBind = findMatchedPluginInfo.UPDATE_SCHEDULE_TIME_RANGE_BIND;
                                            }
                                            String str2 = schedulerConfig.path;
                                            if (str2 == null || str2.isEmpty()) {
                                                pluginConfig = parsePluginConfig;
                                                XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "download path is empty, skip " + next.getPluginName());
                                                scheduler.saveSchedulerConfig((SchedulerConfig) null);
                                            } else {
                                                schedulerConfig.nTimeToUpdate = Scheduler.getUpdateTimeFromVersion(findMatchedPluginInfo, next.getPluginName());
                                                SchedulerConfig onUpdateScheduleConfig = scheduler.onUpdateScheduleConfig(schedulerConfig);
                                                if (XWalkPluginUpdaterChecker.this.isSetSinglePluginToUpdate() || scheduler.isTimeToUpdate(true)) {
                                                    pluginConfig = parsePluginConfig;
                                                    WXWebReporter.idkeyReport(903, (long) (scheduler.getIdkeyOffsetFromDefault() + 160), 1);
                                                    if (!XWalkPluginUpdaterChecker.this.isSetSinglePluginToUpdate() && !NetworkUtil.isNetworkAvailable()) {
                                                        XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "network is not available, skip " + next.getPluginName());
                                                    } else if (XWalkPluginUpdaterChecker.this.isSetSinglePluginToUpdate() || onUpdateScheduleConfig.bCanUseCellular || NetworkUtil.isWifiAvailable()) {
                                                        TaskInfo taskInfo = new TaskInfo();
                                                        XWalkPluginUpdaterChecker xWalkPluginUpdaterChecker = XWalkPluginUpdaterChecker.this;
                                                        XWalkPluginDownloadListener xWalkPluginDownloadListener = new XWalkPluginDownloadListener(xWalkPluginUpdaterChecker, next, onUpdateScheduleConfig, xWalkPluginUpdaterChecker.mConfigReportData);
                                                        XWebDownloader.WXFileDownloaderTask wXFileDownloaderTask = new XWebDownloader.WXFileDownloaderTask(false, xWalkPluginDownloadListener, onUpdateScheduleConfig.strUrl, onUpdateScheduleConfig.path, onUpdateScheduleConfig.bIsPatchUpdate ? 2 : 1);
                                                        if (!onUpdateScheduleConfig.bUseCdn || !wXFileDownloaderTask.isValid()) {
                                                            XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "use default file downloader, plugin:" + next.getPluginName() + ", isPatch:" + onUpdateScheduleConfig.bIsPatchUpdate + ", version:" + onUpdateScheduleConfig.version);
                                                            taskInfo.task = new XWebDownloader.HttpDownloadTask(false, xWalkPluginDownloadListener, onUpdateScheduleConfig.strUrl, onUpdateScheduleConfig.path);
                                                            taskInfo.type = 1;
                                                        } else {
                                                            XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "use wx file downloader, plugin:" + next.getPluginName() + ", isPatch:" + onUpdateScheduleConfig.bIsPatchUpdate + ", version:" + onUpdateScheduleConfig.version);
                                                            taskInfo.task = wXFileDownloaderTask;
                                                            taskInfo.type = 2;
                                                        }
                                                        hashMap.put(next.getPluginName(), taskInfo);
                                                        StringBuilder sb = XWalkPluginUpdaterChecker.this.mConfigReportData.pluginList;
                                                        sb.append(next.getPluginName());
                                                        sb.append("_");
                                                        sb.append(onUpdateScheduleConfig.version);
                                                        sb.append(" ");
                                                        if (onUpdateScheduleConfig.bIsPatchUpdate) {
                                                            next.recordPatchDownloadInfo(findMatchedPluginInfo.versionId);
                                                        }
                                                    } else {
                                                        XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "can not use cellular, skip " + next.getPluginName());
                                                    }
                                                    parsePluginConfig = pluginConfig;
                                                    z = false;
                                                }
                                            }
                                            parsePluginConfig = pluginConfig;
                                            z = false;
                                        }
                                    } else {
                                        XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "not installed before, do not need download now, skip " + next.getPluginName());
                                    }
                                } else {
                                    XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "forbid download code, skip " + next.getPluginName());
                                    scheduler.saveSchedulerConfig((SchedulerConfig) null);
                                }
                            }
                        }
                        XWalkPluginUpdaterChecker.this.mConfigReportData.configErrCode = 0;
                        KVReportForPluginUpdate.reportPluginConfigUpdate(XWalkPluginUpdaterChecker.this.mConfigReportData);
                        if (hashMap.size() == 0) {
                            XWebLog.addInitializeLog(XWalkPluginUpdaterChecker.TAG, "no available update, no task");
                            boolean unused4 = XWalkPluginUpdaterChecker.this.updateStatus(5, -8);
                            return;
                        }
                        boolean unused5 = XWalkPluginUpdaterChecker.this.updateStatus(3, (Map<String, TaskInfo>) hashMap);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public boolean isSetSinglePluginToUpdate() {
        String str = this.mSinglePluginToUpdate;
        return (str == null || str.isEmpty() || this.mSingleUpdateListener == null) ? false : true;
    }

    private void processAfterStatusUpdate(int i, int i2, int i3) {
        if (i2 <= i) {
            XWebLog.addInitializeLog(TAG, "status not changed, return");
            return;
        }
        XWebLog.addInitializeLog(TAG, "change status from " + i + " to " + i2 + ", errcode:" + i3);
        if (isSetSinglePluginToUpdate()) {
            if (i == 0 && i2 == 1) {
                this.mSingleUpdateListener.onXWalkPluginUpdateStarted();
            } else if (i != 0 && i2 == 5) {
                this.mSingleUpdateListener.onXWalkPluginUpdateCompleted(i3);
            }
        }
        if (i2 == 5) {
            WXWebReporter.setKVLog(WXWebReporter.WXWEB_KV_PLUGIN_UPDATE, this.mStatusInfo.errCode + "," + this.mTaskCount + "," + this.mTaskCancelledCount + "," + this.mTaskDownloadFailedCount + "," + this.mTaskInstallFailedCount + "," + this.mTaskSuccessCount);
            XWalkPluginUpdater.markPluginUpdateFinishedInProcess();
            this.isAllFinished = true;
        }
    }

    private void tryInstallEmbedPlugins() {
        for (XWalkPlugin next : XWalkPluginManager.getAllPlugins()) {
            if (next != null) {
                try {
                    if (next.hasEmbed()) {
                        if (!isSetSinglePluginToUpdate() || this.mSinglePluginToUpdate.equals(next.getPluginName())) {
                            int embedVersion = next.getEmbedVersion();
                            int availableVersion = next.getAvailableVersion(true);
                            XWebLog.addInitializeLog(TAG, "tryInstallEmbedPlugins process " + next.getPluginName() + ", curVersion " + availableVersion + ", embedVersion " + embedVersion);
                            if (availableVersion >= embedVersion) {
                                XWebLog.addInitializeLog(TAG, "tryInstallEmbedPlugins no need to install embed, skip");
                            } else {
                                KVReportForPluginUpdate.PluginReportData pluginReportData = new KVReportForPluginUpdate.PluginReportData();
                                pluginReportData.pluginName = next.getPluginName();
                                pluginReportData.pluginVersion = availableVersion;
                                pluginReportData.targetPluginVersion = embedVersion;
                                pluginReportData.pluginBizType = 1;
                                pluginReportData.pluginUrl = "embed";
                                pluginReportData.configReportData = this.mConfigReportData;
                                pluginReportData.pluginInstallTimeStart = System.currentTimeMillis();
                                String embedFileMD5 = next.getEmbedFileMD5();
                                String embedFileName = next.getEmbedFileName();
                                if (!(embedFileMD5 == null || embedFileMD5.isEmpty() || embedFileName == null)) {
                                    if (!embedFileName.isEmpty()) {
                                        LibPluginUpdateConfig libPluginUpdateConfig = new LibPluginUpdateConfig(next.getPluginName(), embedVersion);
                                        if (!libPluginUpdateConfig.copyPackageToLocal(embedFileName, embedFileMD5)) {
                                            XWebLog.addInitializeLog(TAG, "tryInstallEmbedPlugins copy failed, skip");
                                            pluginReportData.pluginInstallTimeEnd = System.currentTimeMillis();
                                            pluginReportData.pluginInstallRet = -6;
                                            pluginReportData.pluginErrCode = -4;
                                            KVReportForPluginUpdate.reportPluginUpdate(pluginReportData);
                                        } else {
                                            SchedulerConfig schedulerConfig = new SchedulerConfig();
                                            schedulerConfig.version = embedVersion;
                                            schedulerConfig.path = libPluginUpdateConfig.getDownloadPath();
                                            schedulerConfig.strMd5 = embedFileMD5;
                                            schedulerConfig.bIsPatchUpdate = false;
                                            schedulerConfig.skipSubFileMD5Check = false;
                                            int performInstall = next.performInstall(schedulerConfig);
                                            XWebLog.addInitializeLog(TAG, "tryInstallEmbedPlugins install ret = " + performInstall);
                                            pluginReportData.pluginInstallTimeEnd = System.currentTimeMillis();
                                            pluginReportData.pluginInstallRet = performInstall;
                                            if (performInstall == 0) {
                                                pluginReportData.pluginErrCode = 0;
                                            } else {
                                                pluginReportData.pluginErrCode = -3;
                                            }
                                            KVReportForPluginUpdate.reportPluginUpdate(pluginReportData);
                                        }
                                    }
                                }
                                XWebLog.addInitializeLog(TAG, "tryInstallEmbedPlugins embedFileName or embedFileMD5 is empty, skip");
                                pluginReportData.pluginInstallTimeEnd = System.currentTimeMillis();
                                pluginReportData.pluginInstallRet = -5;
                                pluginReportData.pluginErrCode = -4;
                                KVReportForPluginUpdate.reportPluginUpdate(pluginReportData);
                            }
                        } else {
                            XWebLog.addInitializeLog(TAG, "tryInstallEmbedPlugins set only " + this.mSinglePluginToUpdate + ", skip " + next.getPluginName());
                        }
                    }
                } catch (Throwable th) {
                    XWebLog.addInitializeLog(TAG, "tryInstallEmbedPlugins error: " + th.getMessage());
                }
            }
        }
    }

    private boolean updateStatus(int i) {
        return updateStatus(i, 1, (Map<String, TaskInfo>) null);
    }

    public boolean isBusy() {
        return !this.isAllFinished;
    }

    public void onNotifyProgress(String str, int i) {
        if (this.mStatusInfo.curStatus == 3 && isSetSinglePluginToUpdate() && this.mSinglePluginToUpdate.equals(str)) {
            this.mSingleUpdateListener.onXWalkPluginUpdateProgress(i);
        }
    }

    public void onNotifyResult(String str, int i) {
        XWebLog.addInitializeLog(TAG, "onNotifyResult: " + str + " install retCode: " + i);
        synchronized (this.mLocker) {
            if (this.mStatusInfo.curStatus != 5) {
                boolean z = true;
                if (i == -3) {
                    this.mTaskCancelledCount++;
                } else if (i == -1) {
                    this.mTaskDownloadFailedCount++;
                } else if (i == -2) {
                    this.mTaskInstallFailedCount++;
                } else if (i == 0) {
                    this.mTaskSuccessCount++;
                }
                this.mTaskMap.get(str).taskFinished = true;
                Iterator<Map.Entry<String, TaskInfo>> it = this.mTaskMap.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        TaskInfo taskInfo = (TaskInfo) it.next().getValue();
                        if (taskInfo != null && !taskInfo.taskFinished) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                int i2 = this.mStatusInfo.curStatus;
                if (z) {
                    this.mTaskMap.clear();
                    StatusInfo statusInfo = this.mStatusInfo;
                    statusInfo.curStatus = 5;
                    int i3 = this.mTaskDownloadFailedCount;
                    if (i3 > 0 && this.mTaskInstallFailedCount == 0) {
                        statusInfo.errCode = -10;
                    } else if (i3 == 0 && this.mTaskInstallFailedCount > 0) {
                        statusInfo.errCode = -11;
                    } else if (i3 > 0 || this.mTaskInstallFailedCount > 0) {
                        statusInfo.errCode = -9;
                    }
                }
                StatusInfo statusInfo2 = this.mStatusInfo;
                int i4 = statusInfo2.curStatus;
                int i5 = statusInfo2.errCode;
                processAfterStatusUpdate(i2, i4, i5);
            }
        }
    }

    public void onPreExecute() {
        updateStatus(1);
        super.onPreExecute();
    }

    public void setParams(HashMap<String, String> hashMap, String str, XWalkPluginUpdateListener xWalkPluginUpdateListener) {
        if (hashMap != null) {
            String str2 = hashMap.get(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE);
            this.mNotifyType = str2;
            if (str2 == null || str2.isEmpty()) {
                XWebLog.m21911i(TAG, "setParams, not set type, use default type: timer");
                this.mNotifyType = "0";
            }
        }
        this.mSinglePluginToUpdate = str;
        this.mSingleUpdateListener = xWalkPluginUpdateListener;
        KVReportForPluginUpdate.ConfigReportData configReportData = this.mConfigReportData;
        configReportData.checkType = this.mNotifyType;
        configReportData.singlePlugin = isSetSinglePluginToUpdate() ? this.mSinglePluginToUpdate : "";
        this.mConfigReportData.configUrl = this.mConfigDownloadUrl;
        XWebLog.addInitializeLog(TAG, "create XWalkPluginUpdaterChecker, singlePlugin:" + this.mSinglePluginToUpdate + ", notifyType:" + this.mNotifyType + " [0:timer/1:notify/2:force/4:embed/5:config]");
    }

    public void tryCancelUpdate() {
        updateStatus(4, -1);
    }

    /* access modifiers changed from: private */
    public boolean updateStatus(int i, int i2) {
        return updateStatus(i, i2, (Map<String, TaskInfo>) null);
    }

    public Integer doInBackground(String... strArr) {
        if ("1".equals(this.mNotifyType)) {
            XWebLog.addInitializeLog(TAG, "check type is notify, ignore time limit and update check time");
            XWalkPluginUpdater.setLastCheckPluginUpdateTime(System.currentTimeMillis());
        } else if (WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN.equals(this.mNotifyType)) {
            XWebLog.addInitializeLog(TAG, "check type is only install embed, ignore time limit");
        } else if (!XWalkPluginUpdater.isNeedCheckPluginUpdate()) {
            XWebLog.addInitializeLog(TAG, "too close, no need to check update");
            return -3;
        } else {
            XWalkPluginUpdater.setLastCheckPluginUpdateTime(System.currentTimeMillis());
        }
        if (XWalkPluginUpdater.isPluginUpdatingByOtherProcess()) {
            XWebLog.addInitializeLog(TAG, "is updating by others, return");
            return -4;
        }
        XWalkPluginUpdater.markPluginUpdateStartedInProcess();
        if (FrequentLimiter.canDo("plugin_clear_old_versions", 86400000)) {
            XWebLog.addInitializeLog(TAG, "try clear old plugin versions");
            XWalkPluginManager.clearOldVersions();
        } else {
            XWebLog.addInitializeLog(TAG, "no need to clear old plugin versions");
        }
        if (FrequentLimiter.canDo("plugin_check_files", 43200000)) {
            XWebLog.addInitializeLog(TAG, "try check plugin files");
            XWalkPluginManager.checkFiles();
        } else {
            XWebLog.addInitializeLog(TAG, "no need to check plugin files");
        }
        tryInstallEmbedPlugins();
        return 0;
    }

    public void onPostExecute(Integer num) {
        if (num.intValue() == -3) {
            updateStatus(5, num.intValue());
        } else if (num.intValue() == -4) {
            this.mConfigReportData.configErrCode = num.intValue();
            KVReportForPluginUpdate.reportPluginConfigUpdate(this.mConfigReportData);
            updateStatus(5, num.intValue());
        } else if (WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN.equals(this.mNotifyType)) {
            XWebLog.addInitializeLog(TAG, "check type is only install embed plugin, skip download");
            updateStatus(5, 0);
        } else {
            XWebLog.addInitializeLog(TAG, "doFetchPluginUpdateConfig start");
            doFetchPluginUpdateConfig();
        }
        super.onPostExecute(num);
    }

    /* access modifiers changed from: private */
    public boolean updateStatus(int i, Map<String, TaskInfo> map) {
        return updateStatus(i, 1, map);
    }

    private boolean updateStatus(int i, int i2, Map<String, TaskInfo> map) {
        int i3;
        int i4;
        int i5;
        synchronized (this.mLocker) {
            StatusInfo statusInfo = this.mStatusInfo;
            i3 = statusInfo.curStatus;
            if (i > i3) {
                statusInfo.curStatus = i;
                if (i2 != 1) {
                    statusInfo.errCode = i2;
                }
                if (i == 4) {
                    if (this.mTaskMap.size() == 0) {
                        this.mStatusInfo.curStatus = 5;
                    } else {
                        for (Map.Entry<String, TaskInfo> value : this.mTaskMap.entrySet()) {
                            TaskInfo taskInfo = (TaskInfo) value.getValue();
                            if (taskInfo != null && !taskInfo.taskFinished) {
                                taskInfo.task.cancel(true);
                            }
                        }
                    }
                } else if (i == 3 && map != null) {
                    for (Map.Entry next : map.entrySet()) {
                        String str = (String) next.getKey();
                        TaskInfo taskInfo2 = (TaskInfo) next.getValue();
                        this.mTaskMap.put(str, taskInfo2);
                        int i6 = taskInfo2.type;
                        if (i6 == 1) {
                            ((XWebDownloader.HttpDownloadTask) taskInfo2.task).execute(new Void[0]);
                        } else if (i6 == 2) {
                            ((XWebDownloader.WXFileDownloaderTask) taskInfo2.task).execute(new Void[0]);
                        } else {
                            this.mTaskMap.remove(str);
                        }
                    }
                    this.mTaskCount = this.mTaskMap.size();
                }
            }
            StatusInfo statusInfo2 = this.mStatusInfo;
            i4 = statusInfo2.curStatus;
            i5 = statusInfo2.errCode;
        }
        processAfterStatusUpdate(i3, i4, i5);
        if (i4 > i3) {
            return true;
        }
        return false;
    }
}
