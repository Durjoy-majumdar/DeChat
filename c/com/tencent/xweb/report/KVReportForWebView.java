package com.tencent.xweb.report;

import android.os.Looper;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebGrayValueUtil;
import com.tencent.xweb.util.XWebLog;
import org.xwalk.core.XWalkEnvironment;

public class KVReportForWebView {
    public static final int FINISH_ERROR = 2;
    public static final int FINISH_SUCCESS = 1;

    /* renamed from: ID */
    public static final int f57025ID = 24340;
    public static final int ID_FOR_WXA_SDK = 10128;
    public static final String TAG = "KVReportForWebView";
    public static boolean hasCreatedWebView;
    private long createOtherWebViewCostTime = -1;
    private long createOtherWebViewFinishTime = -1;
    private int createOtherWebViewResultCode = 1;
    private long createOtherWebViewStartTime = -1;
    private long createPreferredWebViewCostTime = -1;
    private long createPreferredWebViewFinishTime = -1;
    private int createPreferredWebViewResultCode = 1;
    private long createPreferredWebViewStartTime = -1;
    private long createWebViewCostTime = -1;
    private long createWebViewFinishTime = -1;
    private int createWebViewResultCode = 1;
    private long createWebViewStartTime = -1;
    private String downgradeReason = "others";
    private int finalWebViewKind = -1;
    private boolean hasInitedWebView = false;
    private boolean hasInitedWebViewCore = true;
    private long initFinalWebViewCostTime = -1;
    private long initFinalWebViewFinishTime = -1;
    private long initFinalWebViewStartTime = -1;
    private boolean isFirstCreatedWebView = false;
    private String module = "";
    private int otherWebViewKind = -1;
    private int preferredWebViewKind = -1;
    private long preferredWebViewKindCostTime = -1;

    public void finishCreateOtherWebView(int i, int i2) {
        this.otherWebViewKind = i2;
        long currentTimeMillis = System.currentTimeMillis();
        this.createOtherWebViewFinishTime = currentTimeMillis;
        this.createOtherWebViewCostTime = currentTimeMillis - this.createOtherWebViewStartTime;
        this.createOtherWebViewResultCode = i;
    }

    public void finishCreatePreferredWebView(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.createPreferredWebViewFinishTime = currentTimeMillis;
        this.createPreferredWebViewCostTime = currentTimeMillis - this.createPreferredWebViewStartTime;
        this.createPreferredWebViewResultCode = i;
    }

    public void finishCreateWebView(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.createWebViewFinishTime = currentTimeMillis;
        this.createWebViewCostTime = currentTimeMillis - this.createWebViewStartTime;
        this.createWebViewResultCode = i;
        if (i == 1 && !hasCreatedWebView) {
            hasCreatedWebView = true;
            this.isFirstCreatedWebView = true;
        }
        XWebLog.m21911i(TAG, "finishCreateWebView, isFirstCreatedWebView:" + this.isFirstCreatedWebView);
        report();
    }

    public void finishInitFinalWebView() {
        long currentTimeMillis = System.currentTimeMillis();
        this.initFinalWebViewFinishTime = currentTimeMillis;
        this.initFinalWebViewCostTime = currentTimeMillis - this.initFinalWebViewStartTime;
    }

    public long getCreateWebViewCostTime() {
        return this.createWebViewCostTime;
    }

    public void report() {
        StringBuilder sb = new StringBuilder();
        sb.append(XWebSdk.getXWebSdkVersion());
        sb.append(",");
        sb.append(XWebSdk.getAvailableVersion());
        sb.append(",");
        String str = "1";
        sb.append(this.hasInitedWebView ? str : "0");
        sb.append(",");
        sb.append(this.hasInitedWebViewCore ? str : "0");
        sb.append(",");
        sb.append(this.module);
        sb.append(",");
        sb.append(this.createWebViewStartTime);
        sb.append(",");
        sb.append(this.createWebViewFinishTime);
        sb.append(",");
        sb.append(this.createWebViewCostTime);
        sb.append(",");
        sb.append(this.createWebViewResultCode);
        sb.append(",");
        sb.append(this.preferredWebViewKindCostTime);
        sb.append(",");
        sb.append(this.preferredWebViewKind);
        sb.append(",");
        sb.append(this.createPreferredWebViewStartTime);
        sb.append(",");
        sb.append(this.createPreferredWebViewFinishTime);
        sb.append(",");
        sb.append(this.createPreferredWebViewCostTime);
        sb.append(",");
        sb.append(this.createPreferredWebViewResultCode);
        sb.append(",");
        sb.append(this.otherWebViewKind);
        sb.append(",");
        sb.append(this.createOtherWebViewStartTime);
        sb.append(",");
        sb.append(this.createOtherWebViewFinishTime);
        sb.append(",");
        sb.append(this.createOtherWebViewCostTime);
        sb.append(",");
        sb.append(this.createOtherWebViewResultCode);
        sb.append(",");
        sb.append(this.finalWebViewKind);
        sb.append(",");
        sb.append(this.initFinalWebViewStartTime);
        sb.append(",");
        sb.append(this.initFinalWebViewFinishTime);
        sb.append(",");
        sb.append(this.initFinalWebViewCostTime);
        sb.append(",");
        if (!this.isFirstCreatedWebView) {
            str = "0";
        }
        sb.append(str);
        sb.append(",");
        sb.append(XWalkEnvironment.getApplicationContext().getPackageName());
        sb.append(",");
        sb.append(Looper.myLooper() == Looper.getMainLooper() ? 1 : 0);
        sb.append(",");
        sb.append(XWebGrayValueUtil.getGrayValue());
        sb.append(",");
        sb.append(this.downgradeReason);
        String sb4 = sb.toString();
        XWebLog.m21911i(TAG, "report:" + sb4);
        if (!XWalkEnvironment.getBuildConfigThirdPartyRelease() || !CommandCfg.getInstance().getEnableThirdAppReport()) {
            WXWebReporter.setKVLog(f57025ID, sb4);
        } else {
            WXWebReporter.setKVLog(ID_FOR_WXA_SDK, sb4);
        }
    }

    public void setDowngradeReason(String str) {
        this.downgradeReason = str;
    }

    public void setHasInitedWebView(boolean z) {
        this.hasInitedWebView = z;
    }

    public void setHasInitedWebViewCore(boolean z) {
        this.hasInitedWebViewCore = z;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public void startCreateOtherWebView() {
        this.createOtherWebViewStartTime = System.currentTimeMillis();
    }

    public void startCreatePreferredWebView(int i) {
        this.preferredWebViewKind = i;
        long currentTimeMillis = System.currentTimeMillis();
        this.createPreferredWebViewStartTime = currentTimeMillis;
        this.preferredWebViewKindCostTime = currentTimeMillis - this.createWebViewStartTime;
    }

    public void startCreateWebView() {
        this.createWebViewStartTime = System.currentTimeMillis();
    }

    public void startInitFinalWebView(int i) {
        this.finalWebViewKind = i;
        this.initFinalWebViewStartTime = System.currentTimeMillis();
    }
}
