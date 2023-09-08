package e42;

import e42.C7594e;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: e42.i */
public abstract class C86430i<T extends C7594e> extends C86431j<T> {

    /* renamed from: c */
    public C32226l<? super C7596h, C13598b0> f251226c;

    /* renamed from: f */
    public final boolean mo120839f() {
        return false;
    }

    /* renamed from: o */
    public C86430i<T> mo71237o() {
        Object newInstance = getClass().newInstance();
        C87412m.m108593f(newInstance, "javaClass.newInstance()");
        return (C86430i) newInstance;
    }

    /* renamed from: p */
    public final C32226l<C7596h, C13598b0> mo120840p() {
        C32226l<? super C7596h, C13598b0> lVar = this.f251226c;
        if (lVar != null) {
            return lVar;
        }
        C87412m.m108603p("callback");
        throw null;
    }

    /* renamed from: q */
    public abstract void mo18q(C7596h hVar);
}
