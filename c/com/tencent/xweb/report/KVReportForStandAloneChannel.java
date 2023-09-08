package com.tencent.xweb.report;

import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;
import org.xwalk.core.XWalkEnvironment;

public class KVReportForStandAloneChannel {
    public static final int ERROR_GET_CLASSLOADER_FAIL = 3;
    public static final int ERROR_INIT_CORE_BRIDGE_FAIL = 4;
    public static final int ERROR_INIT_LOG_CHANNEL_FAIL = 8;
    public static final int ERROR_INIT_NOTIFY_CHANNEL_FAIL = 6;
    public static final int ERROR_INIT_RUNTIME_TO_SDK_CHANNEL_FAIL = 7;
    public static final int ERROR_INVALID_VERSION = 2;
    public static final int ERROR_LOAD_NATIVE_LIBRARY_FAIL = 5;
    public static final int FINISH_SUCCESS = 1;

    /* renamed from: ID */
    public static final int f57023ID = 26318;
    public static final String TAG = "KVReportForStandAloneChannel";
    private int apkVersion;
    private long firstGetClassLoaderCostTime = -1;
    private long getClassLoaderCostTime = -1;
    private long initChannelCostTime = -1;
    private long initChannelFinishTime = -1;
    private int initChannelResultCode = 1;
    private long initChannelStartTime = -1;
    private long initCorBridgeCostTime = -1;
    private boolean isStandAloneMode;
    private long loadLibraryCostTime = -1;
    private long logChannelCostTime = -1;
    private long notifyChannelCostTime = -1;
    private long runtimeToSdkChannelCostTime = -1;
    private int webViewKind = -1;

    public void finishInitChannels(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.initChannelFinishTime = currentTimeMillis;
        this.initChannelCostTime = currentTimeMillis - this.initChannelStartTime;
        this.initChannelResultCode = i;
        report();
    }

    public long getInitChannelsCostTime() {
        return this.initChannelCostTime;
    }

    public void report() {
        StringBuilder sb = new StringBuilder();
        sb.append(XWebSdk.getXWebSdkVersion());
        sb.append(",");
        sb.append(this.apkVersion);
        sb.append(",");
        sb.append(WebView.getModuleName());
        sb.append(",");
        sb.append(this.webViewKind);
        sb.append(",");
        sb.append(this.isStandAloneMode ? 1 : 2);
        sb.append(",");
        sb.append(this.initChannelStartTime);
        sb.append(",");
        sb.append(this.initChannelFinishTime);
        sb.append(",");
        sb.append(this.initChannelCostTime);
        sb.append(",");
        sb.append(this.initChannelResultCode);
        sb.append(",");
        sb.append(this.getClassLoaderCostTime);
        sb.append(",");
        sb.append(this.initCorBridgeCostTime);
        sb.append(",");
        sb.append(this.loadLibraryCostTime);
        sb.append(",");
        sb.append(this.notifyChannelCostTime);
        sb.append(",");
        sb.append(this.runtimeToSdkChannelCostTime);
        sb.append(",");
        sb.append(this.logChannelCostTime);
        sb.append(",");
        sb.append(this.firstGetClassLoaderCostTime);
        sb.append(",");
        sb.append(XWalkEnvironment.getApplicationContext().getPackageName());
        String sb4 = sb.toString();
        XWebLog.m21911i(TAG, "report:" + sb4);
        WXWebReporter.setKVLog(f57023ID, sb4);
    }

    public void setApkVersion(int i) {
        this.apkVersion = i;
    }

    public void setFirstGetClassLoaderCostTime(long j) {
        this.firstGetClassLoaderCostTime = j;
    }

    public void setGetClassLoaderCostTime(long j) {
        this.getClassLoaderCostTime = j;
    }

    public void setInitCoreBridgeCostTime(long j) {
        this.initCorBridgeCostTime = j;
    }

    public void setLoadLibraryCostTime(long j) {
        this.loadLibraryCostTime = j;
    }

    public void setLogChannelCostTime(long j) {
        this.logChannelCostTime = j;
    }

    public void setNotifyChannelCostTime(long j) {
        this.notifyChannelCostTime = j;
    }

    public void setRuntimeToSdkChannelCostTime(long j) {
        this.runtimeToSdkChannelCostTime = j;
    }

    public void setStandAloneMode(boolean z) {
        this.isStandAloneMode = z;
    }

    public void setWebViewKind(int i) {
        this.webViewKind = i;
    }

    public void startInitChannels() {
        this.initChannelStartTime = System.currentTimeMillis();
    }
}
