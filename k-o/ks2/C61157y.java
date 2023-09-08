package ks2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: ks2.y */
public final class C61157y {
    /* renamed from: a */
    public static final String m71719a(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("toReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporterKt");
        C87412m.m108594g(jSONObject, "<this>");
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "this.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        SnsMethodCalculate.markEndTimeMs("toReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporterKt");
        return n;
    }
}
