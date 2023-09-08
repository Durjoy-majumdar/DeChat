package wj1;

import ak1.C54067f0;
import ak1.C54116w;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import er1.C7859p5;
import gy3.C87412m;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: wj1.c */
public final class C15419c {

    /* renamed from: a */
    public static final C15419c f41825a = new C15419c();

    /* renamed from: a */
    public final void mo14214a(C7859p5 p5Var, long j) {
        C7859p5 p5Var2 = p5Var;
        C87412m.m108594g(p5Var2, "report");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", p5Var2.f26458d);
        jSONObject.put("remind_amount", j);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        Log.m105924i("QuotaReportUtil", "reportExpose json: " + jSONObject);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.QUOTA_CONSUME, n, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }
}
