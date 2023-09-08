package wg1;

import ak1.C0073g0;
import ak1.C54108o;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import gy3.C87412m;
import ht1.C8777j5;
import org.json.JSONObject;

/* renamed from: wg1.b1 */
public final class C15257b1 {

    /* renamed from: a */
    public static final C15257b1 f41498a = new C15257b1();

    /* renamed from: a */
    public final void mo14159a(int i) {
        Class cls = C54108o.class;
        FinderLiveService.f159376d.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        boolean z = true;
        if (bVar == null || !((C54991o) bVar.mo71262a(C54991o.class)).mo75999e4()) {
            z = false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        if (z) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.AUDIO_BG_OPERATION, jSONObject.toString(), (String) null, 4, (Object) null);
            return;
        }
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c2, 35, jSONObject.toString(), (String) null, 4, (Object) null);
    }
}
