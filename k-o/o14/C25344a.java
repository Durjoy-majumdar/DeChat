package o14;

import gy3.C87412m;
import l14.C24950a;
import n14.C25217e;

/* renamed from: o14.a */
public abstract class C25344a implements C25349e, C25346c {
    /* renamed from: d */
    public abstract Void mo52491d();

    /* renamed from: g */
    public final <T> T mo52492g(C25217e eVar, int i, C24950a<T> aVar, T t) {
        C87412m.m108594g(eVar, "descriptor");
        C87412m.m108594g(aVar, "deserializer");
        if (mo52499w()) {
            return mo52498v(aVar);
        }
        mo52491d();
        return null;
    }

    /* renamed from: i */
    public final int mo52493i(C25217e eVar, int i) {
        C87412m.m108594g(eVar, "descriptor");
        return mo52497s();
    }

    /* renamed from: p */
    public abstract String mo52494p();

    /* renamed from: q */
    public final <T> T mo52495q(C25217e eVar, int i, C24950a<T> aVar, T t) {
        C87412m.m108594g(eVar, "descriptor");
        C87412m.m108594g(aVar, "deserializer");
        return mo52498v(aVar);
    }

    /* renamed from: r */
    public final String mo52496r(C25217e eVar, int i) {
        C87412m.m108594g(eVar, "descriptor");
        return mo52494p();
    }

    /* renamed from: s */
    public abstract int mo52497s();

    /* renamed from: v */
    public abstract <T> T mo52498v(C24950a<T> aVar);

    /* renamed from: w */
    public abstract boolean mo52499w();
}
