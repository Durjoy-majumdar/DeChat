package ir2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import vr2.C102259p;

/* renamed from: ir2.a */
public class C98784a {
    /* renamed from: a */
    public static String m128574a(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("appendScreenShotReportParams", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
        StringBuilder sb = new StringBuilder();
        String valueOf = String.valueOf(System.currentTimeMillis());
        String a = C102259p.m134828a(str2);
        sb.append(valueOf);
        sb.append(",");
        sb.append(str);
        sb.append(",");
        sb.append(a);
        sb.append(",");
        sb.append(",");
        sb.append(",");
        sb.append(",");
        sb.append(str3);
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("appendScreenShotReportParams", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
        return sb4;
    }

    /* renamed from: b */
    public static String m128575b(String str, String str2, String str3, String str4) {
        SnsMethodCalculate.markStartTimeMs("appendShareReportParams", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
        StringBuilder sb = new StringBuilder();
        String valueOf = String.valueOf(System.currentTimeMillis());
        String a = C102259p.m134828a(str3);
        sb.append(valueOf);
        sb.append(",");
        sb.append(str);
        sb.append(",");
        sb.append(str2);
        sb.append(",");
        sb.append(a);
        sb.append(",");
        sb.append(",");
        sb.append(",");
        sb.append(",");
        sb.append(str4);
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("appendShareReportParams", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
        return sb4;
    }

    /* renamed from: c */
    public static void m128576c(String str, String str2, String str3) {
        int i;
        SnsMethodCalculate.markStartTimeMs("doShareReport", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
        try {
            SnsMethodCalculate.markStartTimeMs("shareTo", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
            if (C72996z1.m85820U5(str)) {
                i = 2;
                SnsMethodCalculate.markEndTimeMs("shareTo", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
            } else {
                i = 1;
                SnsMethodCalculate.markEndTimeMs("shareTo", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
            }
            Log.m105924i("AntiCheatingReportUtils", "shareType = " + i);
            String b = m128575b(String.valueOf(i), str, str2, str3);
            Log.m105924i("AntiCheatingReportUtils", "reportScreenShotParams = " + b);
            C115669n.INSTANCE.kvStat(19214, b);
        } catch (Throwable th) {
            Log.m105920e("AntiCheatingReportUtils", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doShareReport", "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils");
    }
}
