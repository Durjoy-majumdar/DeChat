package ek1;

import ak1.C54067f0;
import ak1.C54116w;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: ek1.a */
public final class C7728a {

    /* renamed from: a */
    public static final C7728a f26169a = new C7728a();

    /* renamed from: a */
    public final void mo8843a(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        Log.m105924i("LiveScrollReportUtils", "onScrollTipsExposeReport json: " + jSONObject);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.LIVE_SCROLL_SQUARE, n, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }
}
