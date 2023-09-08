package jy3;

import gy3.C87412m;
import ny3.C89104m;

/* renamed from: jy3.a */
public abstract class C88045a<V> implements C117370c<Object, V> {

    /* renamed from: a */
    public V f254677a;

    public C88045a(V v) {
        this.f254677a = v;
    }

    /* renamed from: a */
    public void mo117086a(C89104m<?> mVar, V v, V v2) {
        C87412m.m108594g(mVar, "property");
    }

    /* renamed from: b */
    public boolean mo36885b(C89104m<?> mVar, V v, V v2) {
        C87412m.m108594g(mVar, "property");
        return true;
    }

    /* renamed from: c */
    public V mo122486c(Object obj, C89104m<?> mVar) {
        C87412m.m108594g(mVar, "property");
        return this.f254677a;
    }

    /* renamed from: d */
    public void mo122487d(Object obj, C89104m<?> mVar, V v) {
        C87412m.m108594g(mVar, "property");
        V v2 = this.f254677a;
        if (mo36885b(mVar, v2, v)) {
            this.f254677a = v;
            mo117086a(mVar, v2, v);
        }
    }
}
