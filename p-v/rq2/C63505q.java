package rq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import vr2.C102260r;

/* renamed from: rq2.q */
public final class C63505q {

    /* renamed from: rq2.q$a */
    public interface C63506a {
        String getChannel();

        String getContent();
    }

    /* renamed from: rq2.q$b */
    public static abstract class C63507b implements C63506a {
        /* renamed from: a */
        public abstract void mo75423a(JSONObject jSONObject);

        /* renamed from: b */
        public abstract void mo75424b(JSONObject jSONObject);

        public String getContent() {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
            try {
                SnsMethodCalculate.markStartTimeMs("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                jSONObject = null;
                jSONObject2 = new JSONObject();
                mo75423a(jSONObject2);
                SnsMethodCalculate.markEndTimeMs("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
            } catch (Throwable unused) {
            }
            if (jSONObject2 != null) {
                SnsMethodCalculate.markStartTimeMs("extJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    mo75424b(jSONObject3);
                    SnsMethodCalculate.markEndTimeMs("extJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                    jSONObject = jSONObject3;
                } catch (Throwable unused2) {
                    SnsMethodCalculate.markEndTimeMs("extJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                }
                if (jSONObject != null) {
                    jSONObject2.putOpt("extInfo", jSONObject);
                }
                String jSONObject4 = jSONObject2.toString();
                SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
                return jSONObject4;
            }
            SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
            return "";
        }
    }

    /* renamed from: a */
    public static void m74842a(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter");
        try {
            Log.m105918d("SnsAdChannelReporter", "Channel: " + str + "; Content: " + str2);
            C102260r.m134858a(str, str2);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter");
    }

    /* renamed from: b */
    public static void m74843b(C63506a aVar) {
        SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter");
        if (aVar != null) {
            try {
                m74842a(aVar.getChannel(), aVar.getContent());
            } catch (Throwable unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter");
    }
}
