package ep2;

import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import jr2.C9510k;
import org.json.JSONObject;

/* renamed from: ep2.a */
public class C7773a extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        Class cls = C9510k.class;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
        if (!jSONObject2.has("canvasId") || !jSONObject2.has("uxInfo")) {
            Log.m105920e("LiteAppJsApiOpenAdCanvas", "data not has key canvasId or uxInfo");
            SnsMethodCalculate.markStartTimeMs("reportPreviewToSnsNativeWrongParams", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
            C115669n.INSTANCE.mo175911u(1706, 26);
            SnsMethodCalculate.markEndTimeMs("reportPreviewToSnsNativeWrongParams", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
            this.f19815f.mo5689a("data not has key canvasId or uxInfo");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
            return;
        }
        try {
            String nullAsNil = Util.nullAsNil(jSONObject2.getString("canvasId"));
            String nullAsNil2 = Util.nullAsNil(jSONObject2.getString("uxInfo"));
            if (Util.isNullOrNil(nullAsNil, nullAsNil2)) {
                Log.m105920e("LiteAppJsApiOpenAdCanvas", "canvasId or uxInfo is null or nil");
                SnsMethodCalculate.markStartTimeMs("reportPreviewToSnsNativeWrongParams", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
                C115669n.INSTANCE.mo175911u(1706, 26);
                SnsMethodCalculate.markEndTimeMs("reportPreviewToSnsNativeWrongParams", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
                this.f19815f.mo5689a("canvasId or uxInfo is null or nil");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
                return;
            }
            SnsMethodCalculate.markStartTimeMs("reportPreviewToSnsNativeUI", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
            C115669n.INSTANCE.mo175911u(1706, 27);
            SnsMethodCalculate.markEndTimeMs("reportPreviewToSnsNativeUI", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
            ((C9510k) C86312j.m106911c(cls)).mo10204lW(Util.safeParseLong(nullAsNil), ((C9510k) C86312j.m106911c(cls)).mo10203I9(nullAsNil2), "", 31);
            this.f19815f.mo5690b();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsApiOpenAdCanvas");
        } catch (Throwable th) {
            Log.printErrStackTrace("LiteAppJsApiOpenAdCanvas", th, "open ad canvas", new Object[0]);
        }
    }
}
