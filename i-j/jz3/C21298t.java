package jz3;

import fy3.C32226l;
import g04.C20770i;
import gy3.C87412m;
import java.util.Collection;
import java.util.Set;
import rx3.C13598b0;
import w04.C22843b;
import wy3.C26447e;

/* renamed from: jz3.t */
public final class C21298t extends C22843b.C22845b<C26447e, C13598b0> {

    /* renamed from: a */
    public final /* synthetic */ C26447e f60154a;

    /* renamed from: b */
    public final /* synthetic */ Set<Object> f60155b;

    /* renamed from: c */
    public final /* synthetic */ C32226l<C20770i, Collection<Object>> f60156c;

    public C21298t(C26447e eVar, Set<Object> set, C32226l<? super C20770i, ? extends Collection<Object>> lVar) {
        this.f60154a = eVar;
        this.f60155b = set;
        this.f60156c = lVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo31877a() {
        return C13598b0.f38549a;
    }

    /* renamed from: b */
    public boolean mo31878b(Object obj) {
        C26447e eVar = (C26447e) obj;
        C87412m.m108594g(eVar, "current");
        if (eVar == this.f60154a) {
            return true;
        }
        C20770i Q = eVar.mo51793Q();
        C87412m.m108593f(Q, "current.staticScope");
        if (!(Q instanceof C24850u)) {
            return true;
        }
        this.f60155b.addAll(this.f60156c.invoke(Q));
        return false;
    }
}
