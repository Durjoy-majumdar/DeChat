package com.tencent.xweb.report;

import android.os.Looper;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebGrayValueUtil;
import com.tencent.xweb.util.XWebLog;
import org.xwalk.core.XWalkEnvironment;

public class KVReportForWebViewCore {
    public static final int FINISH_ERROR = 2;
    public static final int FINISH_SUCCESS = 1;

    /* renamed from: ID */
    public static final int f57026ID = 24761;
    public static final int ID_FOR_WXA_SDK = 10127;
    public static final String TAG = "KVReportForWebViewCore";
    private long initWebViewCoreCostTime = -1;
    private long initWebViewCoreFinishTime = -1;
    private int initWebViewCoreResultCode = 1;
    private long initWebViewCoreStartTime = -1;
    private String module = "";
    private int webViewKind = -1;

    public void finishInitWebViewCore(boolean z, int i, String str) {
        this.module = str;
        this.webViewKind = i;
        long currentTimeMillis = System.currentTimeMillis();
        this.initWebViewCoreFinishTime = currentTimeMillis;
        this.initWebViewCoreCostTime = currentTimeMillis - this.initWebViewCoreStartTime;
        this.initWebViewCoreResultCode = z ? 1 : 2;
        report();
    }

    public long getInitWebViewCoreCostTime() {
        return this.initWebViewCoreCostTime;
    }

    public void report() {
        StringBuilder sb = new StringBuilder();
        sb.append(XWebSdk.getXWebSdkVersion());
        sb.append(",");
        sb.append(XWebSdk.getAvailableVersion());
        sb.append(",");
        sb.append(this.module);
        sb.append(",");
        sb.append(this.webViewKind);
        sb.append(",");
        sb.append(this.initWebViewCoreStartTime);
        sb.append(",");
        sb.append(this.initWebViewCoreFinishTime);
        sb.append(",");
        sb.append(this.initWebViewCoreCostTime);
        sb.append(",");
        sb.append(this.initWebViewCoreResultCode);
        sb.append(",");
        sb.append(XWalkEnvironment.getApplicationContext().getPackageName());
        sb.append(",");
        sb.append(Looper.myLooper() == Looper.getMainLooper() ? 1 : 0);
        sb.append(",");
        sb.append(XWebGrayValueUtil.getGrayValue());
        String sb4 = sb.toString();
        XWebLog.m21911i(TAG, "report:" + sb4);
        if (!XWalkEnvironment.getBuildConfigThirdPartyRelease() || !CommandCfg.getInstance().getEnableThirdAppReport()) {
            WXWebReporter.setKVLog(f57026ID, sb4);
        } else {
            WXWebReporter.setKVLog(ID_FOR_WXA_SDK, sb4);
        }
    }

    public void startInitWebViewCore() {
        this.initWebViewCoreStartTime = System.currentTimeMillis();
    }
}
