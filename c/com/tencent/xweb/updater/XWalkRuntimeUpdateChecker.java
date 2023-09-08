package com.tencent.xweb.updater;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.AsyncTask;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.XWebCoreContentProvider;
import com.tencent.xweb.XWebEmbedSetting;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.internal.IXWebUpdateListener;
import com.tencent.xweb.report.KVReportForUpdateConfig;
import com.tencent.xweb.updater.XWebHttpTask;
import com.tencent.xweb.updater.XWebRuntimeInstaller;
import com.tencent.xweb.util.ConfigDef;
import com.tencent.xweb.util.ConfigParser;
import com.tencent.xweb.util.NetworkUtil;
import com.tencent.xweb.util.SchedulerConfig;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebFileUtil;
import com.tencent.xweb.util.XWebGrayValueUtil;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebUpdateConfigUtil;
import java.util.Arrays;
import java.util.HashMap;
import nu3.C117640b;
import org.xwalk.core.XWalkEnvironment;

public class XWalkRuntimeUpdateChecker extends AsyncTask<Void, Integer, Integer> {
    private static final int CHECK_RET_FETCH_CONFIG = 1;
    private static final int CHECK_RET_NONE = 0;
    private static final String TAG = "XWalkRuntimeUpdateChecker";
    /* access modifiers changed from: private */
    public String mNotifyType = "0";

    public XWalkRuntimeUpdateChecker(HashMap<String, String> hashMap) {
        if (hashMap != null) {
            String str = hashMap.get(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE);
            this.mNotifyType = str;
            if (str == null || !str.equals("1")) {
                String str2 = this.mNotifyType;
                if (str2 == null || !str2.equals("2")) {
                    String str3 = this.mNotifyType;
                    if (str3 == null || !str3.equals("3")) {
                        String str4 = this.mNotifyType;
                        if (str4 == null || !str4.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY)) {
                            this.mNotifyType = "0";
                        }
                    } else {
                        XWebCoreScheduler.getXWebCoreScheduler().getCurSchedulerConfig().bCanUseCellular = true;
                        WXWebReporter.idkeyReport(94, 1);
                    }
                } else {
                    XWebCoreScheduler.getXWebCoreScheduler().resetLastUpdateTime();
                    WXWebReporter.idkeyReport(93, 1);
                }
            } else {
                XWebCoreScheduler.getXWebCoreScheduler().resetLastUpdateTime();
            }
        }
        XWebLog.m21911i(TAG, "create XWalkRuntimeUpdateChecker, notifyType:" + this.mNotifyType + " [0:timer/1:notify/2:force/4:embed/5:config]");
    }

    public static boolean checkNeedFetchConfig() {
        if (!NetworkUtil.isNetworkAvailable()) {
            XWebLog.m21911i(TAG, "checkNeedFetchConfig, no network");
            return false;
        } else if (!XWalkEnvironment.hasInstalledAvailableVersion() && !XWebCoreScheduler.getXWebCoreScheduler().hasScheduler()) {
            XWebLog.m21911i(TAG, "checkNeedFetchConfig, true because no scheduler and no availableVersion");
            return true;
        } else if (!XWebCoreScheduler.getXWebCoreScheduler().checkNeedFetchConfig() || XWalkUpdateLocker.isInUpdatingProgress()) {
            boolean isTimeToUpdate = XWebCoreScheduler.getXWebCoreScheduler().isTimeToUpdate(false);
            boolean isTimeToUpdate2 = XWebCorePredownScheduler.getXWebCorePredownScheduler().isTimeToUpdate(false);
            if (!isTimeToUpdate && !isTimeToUpdate2) {
                return false;
            }
            XWebLog.m21911i(TAG, "checkNeedFetchConfig, true because needUpdateRuntime:" + isTimeToUpdate + ", needUpdatePredownRuntime:" + isTimeToUpdate2);
            return true;
        } else {
            XWebLog.m21911i(TAG, "checkNeedFetchConfig, true because not in updating process and need fetch config");
            return true;
        }
    }

    /* access modifiers changed from: private */
    public void checkNeedUpdateRuntime() {
        String str = this.mNotifyType;
        if (str != null && str.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY)) {
            XWebLog.m21913w(TAG, "checkNeedUpdateRuntime, check config update only, return");
        } else if (XWebCoreScheduler.getXWebCoreScheduler().isTimeToUpdate(true)) {
            if (!XWebEmbedSetting.getForbidDownloadCode()) {
                startUpdateRuntime(XWebCoreScheduler.getXWebCoreScheduler());
                return;
            }
            XWebLog.m21913w(TAG, "checkNeedUpdateRuntime, XWebCoreScheduler turn off dynamic code");
            notifyUpdateCancelled();
        } else if (!XWebCorePredownScheduler.getXWebCorePredownScheduler().isTimeToUpdate(true)) {
            XWebLog.m21913w(TAG, "checkNeedUpdateRuntime, no scheduler is time to update");
            notifyUpdateCancelled();
            XWalkRuntimeUpdater.sendBroadcast(IXWebBroadcastListener.STAGE_FINISHED, -5);
        } else if (!XWebEmbedSetting.getForbidDownloadCode()) {
            startUpdateRuntime(XWebCorePredownScheduler.getXWebCorePredownScheduler());
        } else {
            XWebLog.m21913w(TAG, "checkNeedUpdateRuntime, XWebCorePredownScheduler turn off dynamic code");
            notifyUpdateCancelled();
        }
    }

    private boolean doStartUpdateRuntime(XWebCoreScheduler xWebCoreScheduler) {
        if (XWebEmbedSetting.getForbidDownloadCode()) {
            XWebLog.m21913w(TAG, "doStartUpdateRuntime, turn off dynamic code");
            notifyUpdateCancelled();
            return false;
        } else if (XWalkUpdateLocker.isInUpdatingProgress()) {
            XWebLog.m21913w(TAG, "doStartUpdateRuntime, already in updating process");
            notifyUpdateCancelled();
            return false;
        } else {
            XWebRuntimeInstaller xWebRuntimeInstaller = new XWebRuntimeInstaller(new XWalkRuntimeUpdateListenerImpl());
            if (!XWebCoreContentProvider.isSelfProvider()) {
                XWebLog.m21911i(TAG, "doStartUpdateRuntime, not self provider");
                if (XWalkUpdateLocker.startUpdatingProgress()) {
                    XWebLog.m21911i(TAG, "doStartUpdateRuntime, from provider, start updating process");
                    XWebRuntimeInstaller.ErrorInfo updateRuntimeFromProvider = xWebRuntimeInstaller.updateRuntimeFromProvider(xWebCoreScheduler);
                    try {
                        String packageName = XWalkEnvironment.getPackageName();
                        String str = updateRuntimeFromProvider.errorCode + "," + packageName + "," + updateRuntimeFromProvider.targetVer + "," + updateRuntimeFromProvider.readFileListFailedCount + "," + updateRuntimeFromProvider.noMatchedVersionCount + "," + updateRuntimeFromProvider.copyFailedCount + "," + updateRuntimeFromProvider.md5FailedCount + "," + updateRuntimeFromProvider.extractFailedCount + "," + updateRuntimeFromProvider.setVersionFailedCount + "," + updateRuntimeFromProvider.extractRetryFailedCount + "," + XWebSdk.getXWebSdkVersion() + "," + XWebSdk.getAvailableVersion();
                        ContentResolver contentResolver = XWalkEnvironment.getContentResolver();
                        if (contentResolver != null) {
                            Uri buildUri = XWebCoreContentProvider.buildUri("com.tencent.mm", packageName, 3, 0, "");
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(String.valueOf(WXWebReporter.WXWEB_KV_CORE_UPDATE_FROM_PROVIDER), str);
                            contentResolver.insert(buildUri, contentValues);
                        }
                    } catch (Throwable th) {
                        XWebLog.m21911i(TAG, "doStartUpdateRuntime, report error:" + th);
                    }
                    int i = updateRuntimeFromProvider.errorCode;
                    if (i == 0) {
                        XWalkUpdateLocker.finishUpdatingProcess();
                        XWalkRuntimeUpdater.sendBroadcast(IXWebBroadcastListener.STAGE_FINISHED, 0);
                        if (xWebCoreScheduler != null) {
                            xWebCoreScheduler.saveSchedulerConfig((SchedulerConfig) null);
                        }
                        notifyUpdateCompleted();
                        return true;
                    } else if (i == -10) {
                        XWalkUpdateLocker.finishUpdatingProcess();
                        if (xWebCoreScheduler != null) {
                            xWebCoreScheduler.onUpdateFailed(updateRuntimeFromProvider.errorCode);
                        }
                        notifyUpdateFailed(updateRuntimeFromProvider.errorCode);
                        return false;
                    } else {
                        XWalkUpdateLocker.finishUpdatingProcess();
                    }
                } else {
                    XWebLog.m21911i(TAG, "doStartUpdateRuntime, from provider, start updating process failed");
                }
            }
            XWebLog.m21911i(TAG, "doStartUpdateRuntime, continue try update runtime from remote");
            if (!NetworkUtil.isNetworkAvailable()) {
                XWebLog.m21911i(TAG, "doStartUpdateRuntime, no network");
                notifyUpdateCancelled();
                return false;
            }
            SchedulerConfig curSchedulerConfig = xWebCoreScheduler.getCurSchedulerConfig();
            if (curSchedulerConfig.bCanUseCellular || NetworkUtil.isWifiAvailable()) {
                if (XWalkUpdateLocker.startUpdatingProgress()) {
                    XWebLog.m21911i(TAG, "doStartUpdateRuntime, start updating process");
                    if (xWebRuntimeInstaller.updateRuntime(xWebCoreScheduler.getUpdateConfig(curSchedulerConfig))) {
                        return true;
                    }
                    XWebLog.m21911i(TAG, "doStartUpdateRuntime, update runtime failed");
                    XWalkUpdateLocker.finishUpdatingProcess();
                    notifyUpdateFailed(4);
                } else {
                    XWebLog.m21911i(TAG, "doStartUpdateRuntime, start updating process failed");
                }
                return false;
            }
            XWebLog.m21911i(TAG, "doStartUpdateRuntime, not wifi and scheduler not support mobile data");
            notifyUpdateCancelled();
            return false;
        }
    }

    private void fetchConfig() {
        XWebHttpTask.ParaIn paraIn = new XWebHttpTask.ParaIn();
        paraIn.mUrl = XWebUpdateConfigUtil.getBaseConfigUrl();
        paraIn.mFilePath = XWebFileUtil.getUpdateConfigFullPath();
        paraIn.mUseHttps = true;
        XWebLog.m21911i(TAG, "fetchConfig start, url:" + paraIn.mUrl + ", path:" + paraIn.mFilePath);
        XWebHttpTask.addNewTask(paraIn, new IXWebHttpTaskCallback() {
            public void onTaskFailed(XWebHttpTask.ResultOut resultOut) {
                XWebLog.m21911i(XWalkRuntimeUpdateChecker.TAG, "fetchConfig onTaskFailed, get config fail, retCode:" + resultOut.mRetCode);
                XWalkRuntimeUpdateChecker.this.notifyCheckFailed();
                WXWebReporter.idkeyReport(35, 1);
                WXWebReporter.onConfigDownloadFailed();
                KVReportForUpdateConfig.report(resultOut, XWalkRuntimeUpdateChecker.this.mNotifyType, "0");
            }

            public void onTaskProgressChanged(XWebHttpTask.Progress progress) {
            }

            public void onTaskStarted() {
                XWebLog.m21911i(XWalkRuntimeUpdateChecker.TAG, "fetchConfig onTaskStarted");
                XWebCoreScheduler.getXWebCoreScheduler().onStartFetchConfig();
                WXWebReporter.onConfigDownload();
            }

            public void onTaskSucceed(final XWebHttpTask.ResultOut resultOut) {
                C117640b.f351893a.execute(new Runnable() {
                    public void run() {
                        ConfigDef.Config parse = ConfigParser.parse(resultOut.mFilePath);
                        if (parse == null) {
                            XWebLog.m21911i(XWalkRuntimeUpdateChecker.TAG, "fetchConfig onTaskSucceed, parse config failed, retCode:" + resultOut.mRetCode);
                            XWalkRuntimeUpdateChecker.this.notifyCheckFailed();
                            WXWebReporter.idkeyReport(35, 1);
                            WXWebReporter.onConfigDownloadFailed();
                            XWebHttpTask.ResultOut resultOut = resultOut;
                            resultOut.mRetCode = -10006;
                            KVReportForUpdateConfig.report(resultOut, XWalkRuntimeUpdateChecker.this.mNotifyType, "0");
                            return;
                        }
                        XWebLog.m21911i(XWalkRuntimeUpdateChecker.TAG, "fetchConfig onTaskSucceed, costTime:" + resultOut.mCostTime + "ms, configVersion:" + parse.strConfigVer + ", commands:" + Arrays.toString(parse.commands));
                        WXWebReporter.onCfgDownload(parse.strConfigVer, true);
                        XWebGrayValueUtil.resetGrayValue();
                        try {
                            CommandCfg.getInstance().applyCommand(parse.commands, parse.strConfigVer);
                            XWalkRuntimeUpdater.sendBroadcast(IXWebBroadcastListener.STAGE_MAINCFG_UPDATE, 0);
                        } catch (Throwable th) {
                            XWebLog.m21910e(XWalkRuntimeUpdateChecker.TAG, "fetchConfig onTaskSucceed, apply command error", th);
                        }
                        WXWebReporter.onConfigDownloadSuccess(resultOut.mCostTime);
                        KVReportForUpdateConfig.report(resultOut, XWalkRuntimeUpdateChecker.this.mNotifyType, parse.strConfigVer);
                        XWebCoreScheduler.getXWebCoreScheduler().onConfigDownLoaded(parse);
                        XWebCorePredownScheduler.getXWebCorePredownScheduler().onConfigDownLoaded(parse);
                        XWalkRuntimeUpdateChecker.this.checkNeedUpdateRuntime();
                    }
                });
            }
        });
    }

    /* access modifiers changed from: private */
    public void notifyCheckFailed() {
        notifyUpdateFailed(1);
    }

    private void notifyNeedDownload() {
        IXWebUpdateListener xWebUpdateListener = XWebSdk.getXWebUpdateListener();
        if (xWebUpdateListener != null) {
            xWebUpdateListener.onNeedDownload();
        }
    }

    private void notifyUpdateCancelled() {
        IXWebUpdateListener xWebUpdateListener = XWebSdk.getXWebUpdateListener();
        if (xWebUpdateListener != null) {
            xWebUpdateListener.onUpdateCancelled();
        }
    }

    private void notifyUpdateCompleted() {
        IXWebUpdateListener xWebUpdateListener = XWebSdk.getXWebUpdateListener();
        if (xWebUpdateListener != null) {
            xWebUpdateListener.onUpdateCompleted();
        }
    }

    private void notifyUpdateFailed(int i) {
        IXWebUpdateListener xWebUpdateListener = XWebSdk.getXWebUpdateListener();
        if (xWebUpdateListener != null) {
            xWebUpdateListener.onUpdateFailed(i);
        }
    }

    private void startUpdateRuntime(XWebCoreScheduler xWebCoreScheduler) {
        if (XWalkUpdateLocker.isInUpdatingProgress()) {
            XWebLog.m21911i(TAG, "startUpdateRuntime, already in updating process");
            notifyUpdateCancelled();
            return;
        }
        XWebLog.m21911i(TAG, "startUpdateRuntime, scheduler config:" + xWebCoreScheduler.toString());
        WXWebReporter.reportWithLog(903, 160, 1);
        notifyNeedDownload();
        doStartUpdateRuntime(xWebCoreScheduler);
    }

    public Integer doInBackground(Void... voidArr) {
        if (checkNeedFetchConfig()) {
            return 1;
        }
        return 0;
    }

    public void onPostExecute(Integer num) {
        if (num.intValue() == 1) {
            fetchConfig();
        } else {
            notifyCheckFailed();
        }
    }
}
