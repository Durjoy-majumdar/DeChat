package com.tencent.xweb.updater;

import android.os.AsyncTask;
import com.tencent.xweb.XWebDownloadListener;
import com.tencent.xweb.XWebDownloader;
import com.tencent.xweb.report.KVReportForDownloadRuntime;
import com.tencent.xweb.util.Scheduler;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;

public class XWalkRuntimeDownloadListener implements XWebDownloadListener {
    public static final String TAG = "XWalkRuntimeDownloadListener";
    /* access modifiers changed from: private */
    public final UpdateConfig mConfig;
    /* access modifiers changed from: private */
    public final XWebRuntimeInstaller mXWebRuntimeInstaller;

    public XWalkRuntimeDownloadListener(UpdateConfig updateConfig, XWebRuntimeInstaller xWebRuntimeInstaller) {
        this.mConfig = updateConfig;
        this.mXWebRuntimeInstaller = xWebRuntimeInstaller;
    }

    public void onDownloadCancelled() {
        XWebLog.m21911i(TAG, "onDownloadCancelled");
        if (this.mXWebRuntimeInstaller.getRuntimeUpdateListener() != null) {
            this.mXWebRuntimeInstaller.getRuntimeUpdateListener().onXWalkUpdateCancelled();
        }
    }

    public void onDownloadCompleted(XWebDownloader.DownloadInfo downloadInfo) {
        XWebLog.m21911i(TAG, "onDownloadCompleted, apkver:" + this.mConfig.apkVer);
        if (this.mConfig.isPatchUpdate) {
            WXWebReporter.onPatchDownloadSuccess(System.currentTimeMillis() - downloadInfo.mStartTimestamp);
        } else {
            WXWebReporter.onRuntimeDownloadSuccess(System.currentTimeMillis() - downloadInfo.mStartTimestamp);
        }
        KVReportForDownloadRuntime.report(downloadInfo, this.mConfig);
        new AsyncTask<Void, Void, Integer>() {
            public Integer doInBackground(Void... voidArr) {
                if (XWalkRuntimeDownloadListener.this.mXWebRuntimeInstaller != null) {
                    return XWalkRuntimeDownloadListener.this.mXWebRuntimeInstaller.tryInstallRuntimeWithReport(XWalkRuntimeDownloadListener.this.mConfig, 2);
                }
                return -1;
            }

            public void onPostExecute(Integer num) {
                if (num.intValue() != 0) {
                    if (XWalkRuntimeDownloadListener.this.mXWebRuntimeInstaller.getRuntimeUpdateListener() != null) {
                        XWalkRuntimeDownloadListener.this.mXWebRuntimeInstaller.getRuntimeUpdateListener().onXWalkUpdateFailed(num.intValue(), XWalkRuntimeDownloadListener.this.mConfig.scheduler);
                    }
                } else if (XWalkRuntimeDownloadListener.this.mXWebRuntimeInstaller.getRuntimeUpdateListener() != null) {
                    XWalkRuntimeDownloadListener.this.mXWebRuntimeInstaller.getRuntimeUpdateListener().onXWalkUpdateCompleted(XWalkRuntimeDownloadListener.this.mConfig.scheduler);
                }
            }
        }.execute(new Void[0]);
    }

    public void onDownloadFailed(XWebDownloader.DownloadInfo downloadInfo) {
        XWebLog.m21911i(TAG, "onDownloadFailed");
        if (this.mConfig.isPatchUpdate) {
            WXWebReporter.onPatchDownloadFailed();
        } else {
            WXWebReporter.onRuntimeDownloadFailed();
        }
        KVReportForDownloadRuntime.report(downloadInfo, this.mConfig);
        Scheduler scheduler = this.mConfig.scheduler;
        if (scheduler != null) {
            scheduler.onUpdateFailed(-1);
        }
        if (this.mXWebRuntimeInstaller.getRuntimeUpdateListener() != null) {
            this.mXWebRuntimeInstaller.getRuntimeUpdateListener().onXWalkUpdateFailed(-1, this.mConfig.scheduler);
        }
    }

    public void onDownloadStarted(int i) {
        XWebLog.m21911i(TAG, "onDownloadStarted, type:" + i + ", config:" + this.mConfig.getLogString());
        if (this.mConfig.isPatchUpdate) {
            WXWebReporter.onPatchDownload();
        } else {
            WXWebReporter.onRuntimeDownload();
        }
        if (this.mXWebRuntimeInstaller.getRuntimeUpdateListener() != null) {
            this.mXWebRuntimeInstaller.getRuntimeUpdateListener().onXWalkUpdateStarted(this.mConfig.scheduler);
        }
    }

    public void onDownloadUpdated(int i) {
        if (this.mXWebRuntimeInstaller.getRuntimeUpdateListener() != null) {
            this.mXWebRuntimeInstaller.getRuntimeUpdateListener().onXWalkUpdateProgress(i);
        }
    }
}
