package vr2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URLEncoder;

/* renamed from: vr2.p */
public class C102259p {
    /* renamed from: a */
    public static String m134828a(String str) {
        SnsMethodCalculate.markStartTimeMs("encodeParams", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("encodeParams", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
            return "";
        }
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            Log.m105920e("SnsAdReportAnalyseUtils", e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("encodeParams", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        return str;
    }

    /* renamed from: b */
    public static void m134829b(int i, long j, ADInfo aDInfo, ADXml aDXml) {
        int i2;
        SnsMethodCalculate.markStartTimeMs("reportAdDel", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        switch (i) {
            case -1:
                SnsMethodCalculate.markEndTimeMs("reportAdDel", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
                return;
            case 0:
                i2 = 2;
                break;
            case 1:
                i2 = 3;
                break;
            case 2:
                i2 = 4;
                break;
            case 3:
                i2 = 5;
                break;
            case 4:
                i2 = 6;
                break;
            case 5:
                i2 = 7;
                break;
            case 6:
                i2 = 9;
                break;
            case 7:
                i2 = 10;
                break;
            default:
                i2 = -1;
                break;
        }
        try {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1907, i2);
            String a = aDInfo != null ? m134828a(aDInfo.uxInfo) : "";
            String nullAsNil = aDXml != null ? Util.nullAsNil(aDXml.adExtInfo) : "";
            Log.m105924i("SnsAdReportAnalyseUtils", "reportAdDel: snsId = " + C102236a0.m134765q0(j) + ", uxInfo = " + a + ", adExtInfo = " + nullAsNil + ", reportType = " + i2 + ", extInfo = " + "");
            nVar.mo160131h(19553, Long.valueOf(j), a, nullAsNil, Integer.valueOf(i2), "");
        } catch (Throwable th) {
            Log.m105920e("SnsAdReportAnalyseUtils", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportAdDel", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
    }

    /* renamed from: c */
    public static void m134830c(long j, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("reportAdPull", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        try {
            ADInfo aDInfo = new ADInfo(str);
            ADXml aDXml = new ADXml(str2);
            String a = m134828a(aDInfo.uxInfo);
            String nullAsNil = Util.nullAsNil(aDXml.adExtInfo);
            Log.m105924i("SnsAdReportAnalyseUtils", "reportAdPull: snsId = " + j + ", uxInfo = " + a + ", adExtInfo = " + nullAsNil + ", reportType = " + 1 + ", extInfo = " + "");
            C115669n.INSTANCE.mo160131h(19553, Long.valueOf(j), a, nullAsNil, 1, "");
        } catch (Throwable th) {
            Log.m105920e("SnsAdReportAnalyseUtils", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportAdPull", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
    }

    /* renamed from: d */
    public static void m134831d(String str, String str2, int i, int i2, String str3, String str4, int i3) {
        SnsMethodCalculate.markStartTimeMs("reportOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
        try {
            Log.m105924i("SnsAdReportAnalyseUtils", "snsId = " + str + ", uxInfo = " + str3 + ", adExtInfo = " + str4 + ", appId = " + str2 + ", reportType = " + i + ", reportScene = " + i2 + ", reportOrigin = " + i3);
            C115669n.INSTANCE.mo160131h(19693, Long.valueOf(System.currentTimeMillis()), str, m134828a(str3), str4, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        } catch (Throwable th) {
            Log.m105920e("SnsAdReportAnalyseUtils", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportOpenApp", "com.tencent.mm.plugin.sns.data.SnsAdReportAnalyseUtils");
    }
}
