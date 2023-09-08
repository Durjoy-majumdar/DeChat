package com.tencent.xweb.xwalk.plugin;

import android.os.AsyncTask;
import com.tencent.xweb.XWebDownloadListener;
import com.tencent.xweb.XWebDownloader;
import com.tencent.xweb.report.KVReportForPluginUpdate;
import com.tencent.xweb.util.SchedulerConfig;
import com.tencent.xweb.util.WXWebReporter;

public class XWalkPluginDownloadListener implements XWebDownloadListener {
    public static final int RETCODE_CANCELLED = -3;
    public static final int RETCODE_DOWNLOAD_FAILED = -1;
    public static final int RETCODE_INSTALL_FAILED = -2;
    public static final int RETCODE_SUCCESS = 0;
    /* access modifiers changed from: private */
    public final SchedulerConfig mDownloadCfg;
    private final boolean mIsPatch;
    /* access modifiers changed from: private */
    public final KVReportForPluginUpdate.PluginReportData mPluginReportData;
    /* access modifiers changed from: private */
    public final XWalkPluginUpdaterChecker mUpdaterChecker;
    /* access modifiers changed from: private */
    public final XWalkPlugin mXWalkPlugin;

    public XWalkPluginDownloadListener(XWalkPluginUpdaterChecker xWalkPluginUpdaterChecker, XWalkPlugin xWalkPlugin, SchedulerConfig schedulerConfig, KVReportForPluginUpdate.ConfigReportData configReportData) {
        KVReportForPluginUpdate.PluginReportData pluginReportData = new KVReportForPluginUpdate.PluginReportData();
        this.mPluginReportData = pluginReportData;
        this.mUpdaterChecker = xWalkPluginUpdaterChecker;
        this.mXWalkPlugin = xWalkPlugin;
        this.mDownloadCfg = schedulerConfig;
        pluginReportData.configReportData = configReportData;
        if (xWalkPlugin != null) {
            pluginReportData.pluginName = xWalkPlugin.getPluginName();
            pluginReportData.pluginVersion = xWalkPlugin.getAvailableVersion();
        }
        if (schedulerConfig != null) {
            pluginReportData.targetPluginVersion = schedulerConfig.version;
            boolean z = schedulerConfig.bIsPatchUpdate;
            pluginReportData.pluginBizType = z ? 2 : 1;
            pluginReportData.pluginUrl = schedulerConfig.strUrl;
            this.mIsPatch = z;
            return;
        }
        this.mIsPatch = false;
    }

    public void onDownloadCancelled() {
        this.mUpdaterChecker.onNotifyResult(this.mXWalkPlugin.getPluginName(), -3);
        WXWebReporter.onPluginDownloadFailed(this.mXWalkPlugin.getPluginName(), this.mIsPatch);
        XFileSchedulerFactory.getScheduler(this.mXWalkPlugin.getPluginName()).saveSchedulerConfig((SchedulerConfig) null);
    }

    public void onDownloadCompleted(XWebDownloader.DownloadInfo downloadInfo) {
        KVReportForPluginUpdate.PluginReportData pluginReportData = this.mPluginReportData;
        pluginReportData.pluginDownloadResult = downloadInfo;
        if (downloadInfo != null && downloadInfo.mStartTimestamp > 0) {
            pluginReportData.pluginDownloadTime = System.currentTimeMillis() - downloadInfo.mStartTimestamp;
        }
        WXWebReporter.onPluginDownloadSuccess(this.mXWalkPlugin.getPluginName(), this.mIsPatch);
        XFileSchedulerFactory.getScheduler(this.mXWalkPlugin.getPluginName()).saveSchedulerConfig((SchedulerConfig) null);
        new AsyncTask<Void, Void, Integer>() {
            public Integer doInBackground(Void... voidArr) {
                XWalkPluginDownloadListener.this.mPluginReportData.pluginInstallTimeStart = System.currentTimeMillis();
                if (XWalkPluginDownloadListener.this.mXWalkPlugin == null || XWalkPluginDownloadListener.this.mDownloadCfg == null) {
                    return -1;
                }
                return Integer.valueOf(XWalkPluginDownloadListener.this.mXWalkPlugin.performInstall(XWalkPluginDownloadListener.this.mDownloadCfg));
            }

            public void onPostExecute(Integer num) {
                XWalkPluginDownloadListener.this.mPluginReportData.pluginInstallTimeEnd = System.currentTimeMillis();
                XWalkPluginDownloadListener.this.mPluginReportData.pluginInstallRet = num.intValue();
                if (num.intValue() == 0) {
                    XWalkPluginDownloadListener.this.mPluginReportData.pluginErrCode = 0;
                    KVReportForPluginUpdate.reportPluginUpdate(XWalkPluginDownloadListener.this.mPluginReportData);
                    XWalkPluginDownloadListener.this.mUpdaterChecker.onNotifyResult(XWalkPluginDownloadListener.this.mXWalkPlugin.getPluginName(), 0);
                    return;
                }
                XWalkPluginDownloadListener.this.mPluginReportData.pluginErrCode = -3;
                KVReportForPluginUpdate.reportPluginUpdate(XWalkPluginDownloadListener.this.mPluginReportData);
                XWalkPluginDownloadListener.this.mUpdaterChecker.onNotifyResult(XWalkPluginDownloadListener.this.mXWalkPlugin.getPluginName(), -2);
            }
        }.execute(new Void[0]);
    }

    public void onDownloadFailed(XWebDownloader.DownloadInfo downloadInfo) {
        this.mUpdaterChecker.onNotifyResult(this.mXWalkPlugin.getPluginName(), -1);
        KVReportForPluginUpdate.PluginReportData pluginReportData = this.mPluginReportData;
        pluginReportData.pluginDownloadResult = downloadInfo;
        if (downloadInfo != null && downloadInfo.mStartTimestamp > 0) {
            pluginReportData.pluginDownloadTime = System.currentTimeMillis() - downloadInfo.mStartTimestamp;
        }
        KVReportForPluginUpdate.PluginReportData pluginReportData2 = this.mPluginReportData;
        pluginReportData2.pluginErrCode = -2;
        KVReportForPluginUpdate.reportPluginUpdate(pluginReportData2);
        WXWebReporter.onPluginDownloadFailed(this.mXWalkPlugin.getPluginName(), this.mIsPatch);
        XFileSchedulerFactory.getScheduler(this.mXWalkPlugin.getPluginName()).saveSchedulerConfig((SchedulerConfig) null);
    }

    public void onDownloadStarted(int i) {
        WXWebReporter.onPluginDownload(this.mXWalkPlugin.getPluginName(), this.mIsPatch);
    }

    public void onDownloadUpdated(int i) {
        this.mUpdaterChecker.onNotifyProgress(this.mXWalkPlugin.getPluginName(), i);
    }
}
