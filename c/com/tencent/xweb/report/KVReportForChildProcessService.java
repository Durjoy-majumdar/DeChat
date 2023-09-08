package com.tencent.xweb.report;

import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;

public class KVReportForChildProcessService {

    /* renamed from: ID */
    public static final int f122404ID = 26129;
    public static final String TAG = "KVReportForChildProcessService";

    public static void report(int i, boolean z, String str, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        StringBuilder sb = new StringBuilder();
        sb.append(XWebSdk.getXWebSdkVersion());
        sb.append(",");
        int i2 = i;
        sb.append(i);
        sb.append(",");
        String str3 = str;
        sb.append(str);
        sb.append(",");
        boolean z2 = z;
        sb.append(z ? 1 : 0);
        sb.append(",");
        String str4 = str2;
        sb.append(str2);
        sb.append(",");
        long j9 = j;
        sb.append(j);
        sb.append(",");
        long j15 = j2;
        sb.append(j2);
        sb.append(",");
        long j16 = j3;
        sb.append(j3);
        sb.append(",");
        long j17 = j4;
        sb.append(j4);
        sb.append(",");
        sb.append(j5);
        sb.append(",");
        sb.append(j6);
        sb.append(",");
        sb.append(j7);
        sb.append(",");
        sb.append(j8);
        String sb4 = sb.toString();
        XWebLog.m21911i(TAG, "report:" + sb4);
        WXWebReporter.setKVLog(f122404ID, sb4);
    }
}
