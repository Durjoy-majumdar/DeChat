package ui1;

import ak1.C54067f0;
import ak1.C54116w;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: ui1.b */
public final class C14195b {

    /* renamed from: a */
    public static final C14195b f39649a = new C14195b();

    /* renamed from: a */
    public final void mo13576a(int i, long j) {
        int i2 = i;
        long j2 = j;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", i2);
        if (j2 > 0 && i2 == 4) {
            jSONObject.put("intercom_duration", j2);
        }
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        Log.m105924i("LiveMicIntercomUtil", "reportMicIntercomLive json: " + jSONObject);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.LIVE_MIC_INTERCOM, n, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }
}
