package com.tencent.xweb.report;

import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.XWebDownloader;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.updater.UpdateConfig;
import com.tencent.xweb.updater.XWebCoreScheduler;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebGrayValueUtil;
import org.xwalk.core.XWalkEnvironment;

public class KVReportForDownloadRuntime {

    /* renamed from: ID */
    public static final int f57018ID = 15124;
    public static final int ID_FOR_WXA_SDK = 10125;
    public static final String TAG = "KVReportForDownloadRuntime";

    public static void report(XWebDownloader.DownloadInfo downloadInfo, UpdateConfig updateConfig) {
        boolean z = updateConfig.scheduler != null ? !XWebCoreScheduler.getXWebCoreScheduler().getScheduleType().equalsIgnoreCase(updateConfig.scheduler.getScheduleType()) : false;
        StringBuilder sb = new StringBuilder();
        sb.append(updateConfig.isPatchUpdate ? 2 : 1);
        sb.append(",");
        sb.append(XWebSdk.getAvailableVersion());
        sb.append(",");
        sb.append(updateConfig.apkVer);
        sb.append(",");
        sb.append(XWebSdk.getXWebSdkVersion());
        sb.append(",");
        sb.append(downloadInfo.mErrorCode);
        sb.append(",");
        sb.append(downloadInfo.mNetWorkType);
        sb.append(",");
        sb.append(downloadInfo.mRetryTimes);
        sb.append(",");
        sb.append(System.currentTimeMillis() - downloadInfo.mStartTimestamp);
        sb.append(",");
        sb.append(downloadInfo.mFileTotalSize);
        sb.append(",");
        sb.append(downloadInfo.mDownloadType);
        sb.append(",");
        sb.append(downloadInfo.mIsDownloadResume ? 1 : 0);
        sb.append(",");
        sb.append(downloadInfo.mUrl);
        sb.append(",");
        sb.append(z ? 1 : 0);
        sb.append(",");
        sb.append(XWalkEnvironment.dumpAppInfo());
        sb.append(",");
        sb.append(XWalkEnvironment.getApplicationContext().getPackageName());
        sb.append(",");
        sb.append(XWebGrayValueUtil.getGrayValue());
        sb.append(",");
        sb.append(updateConfig.patchType == 1 ? "1" : "2");
        String sb4 = sb.toString();
        if (!XWalkEnvironment.getBuildConfigThirdPartyRelease() || !CommandCfg.getInstance().getEnableThirdAppReport()) {
            WXWebReporter.setKVLog(15124, sb4);
        } else {
            WXWebReporter.setKVLog(ID_FOR_WXA_SDK, sb4);
        }
    }
}
