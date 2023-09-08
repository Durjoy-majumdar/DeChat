package o14;

import gy3.C87412m;
import l14.C24954f;
import n14.C25217e;
import r14.C26105l;

/* renamed from: o14.b */
public abstract class C25345b implements C25350f, C25348d {
    public abstract void encodeString(String str);

    /* renamed from: g */
    public abstract void mo52501g(int i);

    /* renamed from: h */
    public final void mo52502h(C25217e eVar, int i, String str) {
        C87412m.m108594g(eVar, "descriptor");
        C87412m.m108594g(str, "value");
        mo52507u(eVar, i);
        encodeString(str);
    }

    /* renamed from: k */
    public final <T> void mo52503k(C25217e eVar, int i, C24954f<? super T> fVar, T t) {
        C87412m.m108594g(eVar, "descriptor");
        C87412m.m108594g(fVar, "serializer");
        mo52507u(eVar, i);
        C26105l lVar = (C26105l) this;
        if (t == null) {
            lVar.mo52533r();
        } else {
            lVar.mo52506t(fVar, t);
        }
    }

    /* renamed from: o */
    public final void mo52504o(C25217e eVar, int i, int i2) {
        C87412m.m108594g(eVar, "descriptor");
        mo52507u(eVar, i);
        mo52501g(i2);
    }

    /* renamed from: q */
    public final <T> void mo52505q(C25217e eVar, int i, C24954f<? super T> fVar, T t) {
        C87412m.m108594g(eVar, "descriptor");
        C87412m.m108594g(fVar, "serializer");
        mo52507u(eVar, i);
        mo52506t(fVar, t);
    }

    /* renamed from: t */
    public abstract <T> void mo52506t(C24954f<? super T> fVar, T t);

    /* renamed from: u */
    public abstract boolean mo52507u(C25217e eVar, int i);
}
