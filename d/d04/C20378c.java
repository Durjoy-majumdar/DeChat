package d04;

import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import w04.C22843b;
import wy3.C26436b;

/* renamed from: d04.c */
public final class C20378c extends C22843b.C22845b<C26436b, C26436b> {

    /* renamed from: a */
    public final /* synthetic */ C8479f0<C26436b> f57102a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<C26436b, Boolean> f57103b;

    public C20378c(C8479f0<C26436b> f0Var, C32226l<? super C26436b, Boolean> lVar) {
        this.f57102a = f0Var;
        this.f57103b = lVar;
    }

    /* renamed from: a */
    public Object mo31877a() {
        return (C26436b) this.f57102a.f27484d;
    }

    /* renamed from: b */
    public boolean mo31878b(Object obj) {
        C87412m.m108594g((C26436b) obj, "current");
        return this.f57102a.f27484d == null;
    }

    /* renamed from: c */
    public void mo31879c(Object obj) {
        T t = (C26436b) obj;
        C87412m.m108594g(t, "current");
        if (this.f57102a.f27484d == null && this.f57103b.invoke(t).booleanValue()) {
            this.f57102a.f27484d = t;
        }
    }
}
