package ou0;

import di3.C7335d;
import di3.C86312j;
import eg3.C107271c;
import fy3.C32224a;
import gy3.C87412m;
import java.util.List;
import oa1.C117731d;
import p329d3.C86165a;
import p492dn.C107054l;

/* renamed from: ou0.f */
public final class C110076f {

    /* renamed from: a */
    public final C86165a<C107054l.C107055a> f329375a;

    /* renamed from: b */
    public final boolean f329376b;

    public C110076f(C86165a<C107054l.C107055a> aVar) {
        C87412m.m108594g(aVar, "audioRouteConsumer");
        this.f329375a = aVar;
        this.f329376b = C117731d.m166007c().mo182440a(new C107271c()) != 1 ? false : true;
        ((C107054l) C86312j.m106911c(C107054l.class)).mo157462Kq(aVar);
    }

    /* renamed from: a */
    public final List<C107054l.C107055a> mo161493a() {
        return ((C107054l) C86312j.m106911c(C107054l.class)).mo157467bJ();
    }

    /* renamed from: b */
    public final void mo161494b() {
        Class cls = C107054l.class;
        if (this.f329376b) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IAudioRouteService::class.java)");
            C107054l.C107056b.m144939a((C107054l) c, 0, (C32224a) null, 2, (Object) null);
        }
        ((C107054l) C86312j.m106911c(cls)).mo157468gQ(this.f329375a);
        ((C107054l) C86312j.m106911c(cls)).release();
    }

    /* renamed from: c */
    public final boolean mo161495c(int i) {
        Class cls = C107054l.class;
        if (this.f329376b) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IAudioRouteService::class.java)");
            C107054l.C107056b.m144939a((C107054l) c, 3, (C32224a) null, 2, (Object) null);
        }
        return ((C107054l) C86312j.m106911c(cls)).Jv0(i, true);
    }
}
