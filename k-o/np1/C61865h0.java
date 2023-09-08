package np1;

import ak1.C0073g0;
import ak1.C54108o;
import cl1.C54979h1;
import cl1.C55001u;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import gy3.C87412m;
import ht1.C8777j5;
import org.json.JSONObject;
import p185kq.C10383h;
import t91.C64208c;

/* renamed from: np1.h0 */
public final class C61865h0 {

    /* renamed from: a */
    public static final C61865h0 f175908a = new C61865h0();

    /* renamed from: a */
    public final void mo86790a(C45795b bVar, boolean z) {
        Class cls = C54108o.class;
        C87412m.m108594g(bVar, "buContext");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", z ? 11 : 12);
        ((C54108o) C86312j.m106911c(cls)).getClass();
        jSONObject.put("sessionid", C54108o.f151869h.f151475s);
        jSONObject.put("appid", ((C54979h1) bVar.mo71262a(C54979h1.class)).f154151z);
        long j = ((C55001u) bVar.mo71262a(C55001u.class)).f154420q.f182392d;
        if (j < 0) {
            jSONObject.put("liveid", "");
        } else {
            jSONObject.put("liveid", ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(j));
        }
        C64208c.C64209a aVar = C64208c.f181951a;
        jSONObject.put("clickid", C64208c.f181967q);
        C64208c.f181967q = "";
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_ACTION_COMMERCE, jSONObject.toString(), (String) null, 4, (Object) null);
    }
}
