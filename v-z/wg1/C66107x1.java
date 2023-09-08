package wg1;

import ak1.C0073g0;
import ak1.C54108o;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: wg1.x1 */
public final class C66107x1 {

    /* renamed from: a */
    public static final C66107x1 f190022a = new C66107x1();

    /* renamed from: a */
    public final void mo90147a(boolean z, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i2));
        mo90148b(z, i, arrayList);
    }

    /* renamed from: b */
    public final void mo90148b(boolean z, int i, ArrayList<Integer> arrayList) {
        Class cls = C54108o.class;
        C87412m.m108594g(arrayList, "songIdList");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        jSONObject.put("music_id", arrayList);
        if (!z) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c, 21, jSONObject.toString(), (String) null, 4, (Object) null);
            return;
        }
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.ANCHOR_MUSIC, jSONObject.toString(), (String) null, 4, (Object) null);
    }
}
