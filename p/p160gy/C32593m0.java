package p160gy;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import mp2.C34628a;
import org.json.JSONObject;
import p166hy.C33128g0;

@C86522b
/* renamed from: gy.m0 */
public class C32593m0 extends C86301e implements C33128g0 {
    /* renamed from: UR */
    public String mo58701UR(long j, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureService");
        String str3 = "";
        SnsMethodCalculate.markStartTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", Util.nullAsNil(str));
            jSONObject.put("canvasId", j == 0 ? str3 : String.valueOf(j));
            jSONObject.put("uxInfo", Util.nullAsNil(str2));
            str3 = jSONObject.toString();
            SnsMethodCalculate.markEndTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        }
        SnsMethodCalculate.markEndTimeMs("getOpenCanvasAdExtraInfo", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureService");
        return str3;
    }

    public void oa0(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("reportOpenCanvas", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureService");
        C34628a.m40411d(str, i);
        SnsMethodCalculate.markEndTimeMs("reportOpenCanvas", "com.tencent.mm.feature.sns.OpenSdkAdHelperFeatureService");
    }
}
