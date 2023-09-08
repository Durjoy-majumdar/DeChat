package wg1;

import ak1.C54067f0;
import ak1.C54116w;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gg1.C32444a;
import gy3.C87412m;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: wg1.r1 */
public final class C15346r1 {

    /* renamed from: a */
    public static final C15346r1 f41686a = new C15346r1();

    /* renamed from: a */
    public final void mo14181a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        C32444a aVar = C32444a.f86121a;
        jSONObject.put("msg_style", C32444a.f86067I2.mo60266n().intValue() == 0 ? 2 : 1);
        jSONObject.put("msg_id", str == null ? "" : str);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        Log.m105924i("FinderLiveGiftAllNotifyReportHelper", "[report] json: " + jSONObject);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.GIFT_ALL_NOTIFY, n, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }
}
