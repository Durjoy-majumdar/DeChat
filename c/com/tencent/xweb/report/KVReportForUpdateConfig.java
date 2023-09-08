package com.tencent.xweb.report;

import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.updater.XWebHttpTask;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebGrayValueUtil;
import org.xwalk.core.XWalkEnvironment;

public class KVReportForUpdateConfig {

    /* renamed from: ID */
    public static final int f57024ID = 15123;
    public static final int ID_FOR_WXA_SDK = 10124;
    public static final String TAG = "KVReportForUpdateConfig";

    public static void report(XWebHttpTask.ResultOut resultOut, String str, String str2) {
        String str3 = str2 + "," + XWebSdk.getXWebSdkVersion() + "," + resultOut.mRetCode + "," + resultOut.mNetWorkType + "," + resultOut.mRetryTimes + "," + resultOut.mCostTime + "," + resultOut.mTotalSize + "," + str + "," + resultOut.mUrl + "," + XWalkEnvironment.getApplicationContext().getPackageName() + "," + XWebGrayValueUtil.getGrayValue();
        if (!XWalkEnvironment.getBuildConfigThirdPartyRelease() || !CommandCfg.getInstance().getEnableThirdAppReport()) {
            WXWebReporter.setKVLog(15123, str3);
        } else {
            WXWebReporter.setKVLog(ID_FOR_WXA_SDK, str3);
        }
    }
}
