package jq2;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: jq2.c */
public class C60887c {
    /* renamed from: a */
    public static void m71300a(SnsInfo snsInfo, String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("reportFollowResult", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdFinderFollowReportHelper");
        try {
            m71301b(C102236a0.m134765q0(snsInfo.field_snsId), snsInfo.getUxinfo(), snsInfo.getAdXml().adExtInfo, str, i, i2);
        } catch (Exception e) {
            Log.m105920e("FinderFollowReportHelper", "reportFollowResult, exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportFollowResult", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdFinderFollowReportHelper");
    }

    /* renamed from: b */
    public static void m71301b(String str, String str2, String str3, String str4, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("reportFollowResult", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdFinderFollowReportHelper");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("snsid", str);
            jSONObject.put("uxinfo", str2);
            jSONObject.put("adExtInfo", str3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("finderUsername", str4);
            jSONObject2.put("result", i);
            jSONObject2.put(FirebaseAnalytics.C113379b.SOURCE, i2);
            jSONObject.put("extInfo", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            Log.m105918d("FinderFollowReportHelper", "reportFollowResult:" + jSONObject3);
            C102260r.m134858a("sns_ad_finder_follow_result", jSONObject3);
        } catch (Exception e) {
            Log.m105920e("FinderFollowReportHelper", "reportFollowResult, exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportFollowResult", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdFinderFollowReportHelper");
    }
}
