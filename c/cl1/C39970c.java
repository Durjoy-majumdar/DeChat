package cl1;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import bl3.C39816f;
import fj1.C45794a;
import fj1.C45795b;
import gy3.C87412m;
import jp3.C46566c;
import jp3.C9486a;
import jp3.C9487b;

/* renamed from: cl1.c */
public abstract class C39970c<P extends C39816f> extends C39622i0 implements C9487b<C9486a> {

    /* renamed from: d */
    public C45795b f107146d;

    /* renamed from: e */
    public final C46566c<C9486a> f107147e = new C46566c<>();

    public C39970c(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f107146d = bVar;
    }

    public <T extends C39622i0> T business(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar = this.f107146d;
        C87412m.m108594g(bVar, "owner");
        T a = new C54209k0(bVar.getViewModelStore(), (C54209k0.C54210b) new C45794a(bVar)).mo75002a(cls);
        C87412m.m108593f(a, "LiveBuContext.of(liveContext).get(bu)");
        return a;
    }

    public void keep(C9486a aVar) {
        C87412m.m108594g(aVar, "target");
        this.f107147e.keep(aVar);
    }
}
