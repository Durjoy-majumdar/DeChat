package kj1;

import ak1.C54067f0;
import ak1.C54116w;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: kj1.d1 */
public final class C10119d1 {

    /* renamed from: a */
    public static final C10119d1 f30943a = new C10119d1();

    /* renamed from: a */
    public final void mo10530a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("element", i);
        jSONObject.put("type", i2);
        jSONObject.put("sub_element", i3);
        jSONObject.put("sub_type", i4);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.MENU_OPTION, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }
}
