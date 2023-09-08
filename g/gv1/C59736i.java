package gv1;

import ev1.C58838a;
import java.util.List;
import sx3.C110818d0;

/* renamed from: gv1.i */
public final class C59736i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List<C58838a> f170628d;

    /* renamed from: e */
    public final /* synthetic */ C59712c f170629e;

    public C59736i(List<? extends C58838a> list, C59712c cVar) {
        this.f170628d = list;
        this.f170629e = cVar;
    }

    public final void run() {
        List<T> h0 = C110818d0.m150936h0(this.f170628d);
        C59712c cVar = this.f170629e;
        for (T j : h0) {
            cVar.mo84692j(j, false);
        }
    }
}
