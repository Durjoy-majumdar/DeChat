package com.tencent.xweb.report;

import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.updater.UpdateConfig;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebGrayValueUtil;
import com.tencent.xweb.util.XWebLog;
import org.xwalk.core.XWalkEnvironment;

public class KVReportForInstallRuntime {

    /* renamed from: ID */
    public static final int f57019ID = 24763;
    public static final int ID_FOR_WXA_SDK = 10126;
    public static final int INSTALL_TYPE_DOWNLOAD = 2;
    public static final int INSTALL_TYPE_EMBED = 1;
    public static final String TAG = "KVReportForInstallRuntime";
    private String downloadUrl = null;
    private int fromApkVersion = -1;
    private long installRuntimeCostTime = -1;
    private long installRuntimeFinishTime = -1;
    private int installRuntimeResultCode = 0;
    private long installRuntimeStartTime = -1;
    private int installType = -1;
    private boolean isPatchUpdate = false;
    private int patchType = 1;
    private int toApkVersion = -1;

    private void report() {
        StringBuilder sb = new StringBuilder();
        sb.append(XWebSdk.getXWebSdkVersion());
        sb.append(",");
        String str = "1";
        sb.append(this.isPatchUpdate ? str : "0");
        sb.append(",");
        sb.append(this.fromApkVersion);
        sb.append(",");
        sb.append(this.toApkVersion);
        sb.append(",");
        sb.append(this.installRuntimeStartTime);
        sb.append(",");
        sb.append(this.installRuntimeFinishTime);
        sb.append(",");
        sb.append(this.installRuntimeCostTime);
        sb.append(",");
        sb.append(this.installRuntimeResultCode);
        sb.append(",");
        sb.append(this.downloadUrl);
        sb.append(",");
        sb.append(this.installType);
        sb.append(",");
        sb.append(XWalkEnvironment.dumpAppInfo());
        sb.append(",");
        sb.append(XWalkEnvironment.getApplicationContext().getPackageName());
        sb.append(",");
        sb.append(XWebGrayValueUtil.getGrayValue());
        sb.append(",");
        if (this.patchType != 1) {
            str = "2";
        }
        sb.append(str);
        String sb4 = sb.toString();
        XWebLog.m21911i(TAG, "report:" + sb4);
        if (!XWalkEnvironment.getBuildConfigThirdPartyRelease() || !CommandCfg.getInstance().getEnableThirdAppReport()) {
            WXWebReporter.setKVLog(f57019ID, sb4);
        } else {
            WXWebReporter.setKVLog(ID_FOR_WXA_SDK, sb4);
        }
    }

    public void finishInstallRuntime(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.installRuntimeFinishTime = currentTimeMillis;
        this.installRuntimeCostTime = currentTimeMillis - this.installRuntimeStartTime;
        this.installRuntimeResultCode = i;
        report();
    }

    public void setEmbedInstallApkVersion(int i, int i2) {
        this.fromApkVersion = i;
        this.toApkVersion = i2;
    }

    public void setInstallType(int i) {
        this.installType = i;
    }

    public void setUpdateConfig(UpdateConfig updateConfig) {
        this.isPatchUpdate = updateConfig.isPatchUpdate;
        this.fromApkVersion = updateConfig.nPatchTargetVersion;
        this.toApkVersion = updateConfig.apkVer;
        this.downloadUrl = updateConfig.downUrl;
        this.patchType = updateConfig.patchType;
    }

    public void startInstallRuntime() {
        this.installRuntimeStartTime = System.currentTimeMillis();
    }
}
