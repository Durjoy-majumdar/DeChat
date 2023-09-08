package us2;

import android.content.Context;
import com.tencent.p014mm.autogen.events.SnsAdShowFloatCompEvent;
import com.tencent.p014mm.plugin.sns.p106ui.C96067m3;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32227p;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import qs2.C101271i0;
import rx3.C13598b0;
import us2.C37576d;
import vr2.C102260r;

/* renamed from: us2.e */
public final class C102076e implements C37576d.C37577a {

    /* renamed from: a */
    public static final C102076e f300590a = new C102076e();

    /* renamed from: a */
    public void mo61213a(JSONObject jSONObject, Context context, C32227p<? super String, ? super Map<String, ? extends Object>, C13598b0> pVar) {
        SnsMethodCalculate.markStartTimeMs("process", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.FloatCompJsApi");
        C87412m.m108594g(jSONObject, "paramsJson");
        C87412m.m108594g(pVar, "jsCallback");
        SnsAdShowFloatCompEvent snsAdShowFloatCompEvent = new SnsAdShowFloatCompEvent();
        String str = "show";
        boolean z = !C87412m.m108589b(jSONObject.optString("action"), str);
        SnsAdShowFloatCompEvent.C92573a aVar = snsAdShowFloatCompEvent.f265132d;
        if (aVar != null) {
            aVar.f265133a = z ? 1 : 0;
        }
        if (aVar != null) {
            aVar.f265134b = context;
        }
        if (context instanceof C96067m3) {
            C101271i0 T0 = ((C96067m3) context).mo132511T0();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("snsid", T0.mo140740g());
            jSONObject2.put("uxinfo", T0.mo140745l());
            jSONObject2.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, T0.mo140742i());
            JSONObject jSONObject3 = new JSONObject();
            if (z) {
                str = "hide";
            }
            jSONObject3.put("action", str);
            jSONObject3.put("result", "success");
            jSONObject2.put("extInfo", jSONObject3);
            String jSONObject4 = jSONObject2.toString();
            C87412m.m108593f(jSONObject4, "obj.toString()");
            C102260r.m134858a("sns_ad_h5_js_control_float_component", jSONObject4);
        }
        snsAdShowFloatCompEvent.publish();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ret", "0");
        linkedHashMap.put("err_msg", "ok");
        pVar.invoke("ok", linkedHashMap);
        SnsMethodCalculate.markEndTimeMs("process", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.FloatCompJsApi");
    }
}
