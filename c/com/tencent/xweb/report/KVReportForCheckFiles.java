package com.tencent.xweb.report;

import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.WXWebReporter;

public class KVReportForCheckFiles {

    /* renamed from: ID */
    public static final int f57015ID = 24525;
    public static final int RESULT_FAIL = 2;
    public static final int RESULT_SUCCESS = 1;
    private static String sCheckFailedFile;
    private static String sCheckFailedRes;

    public static void report(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        sb.append(XWebSdk.getXWebSdkVersion());
        sb.append(",");
        sb.append(XWebSdk.getAvailableVersion());
        sb.append(",");
        int i = 1;
        sb.append(z ? 1 : 2);
        sb.append(",");
        sb.append(z2 ? 1 : 2);
        sb.append(",");
        if (!z3) {
            i = 2;
        }
        sb.append(i);
        sb.append(",");
        String str = sCheckFailedRes;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        sb.append(str);
        sb.append(",");
        String str3 = sCheckFailedFile;
        if (str3 != null) {
            str2 = str3;
        }
        sb.append(str2);
        WXWebReporter.setKVLog(f57015ID, sb.toString());
    }

    public static void reset() {
        sCheckFailedRes = null;
        sCheckFailedFile = null;
    }

    public static void setCheckFailedFile(String str) {
        sCheckFailedFile = str;
    }

    public static void setCheckFailedRes(String str) {
        sCheckFailedRes = str;
    }
}
