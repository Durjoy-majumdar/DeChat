package u60;

import gy3.C87412m;
import u60.C65235o;

/* renamed from: u60.d */
public abstract class C65220d {

    /* renamed from: d */
    public C101960c f187739d;

    /* renamed from: e */
    public C65235o.C65236a f187740e;

    /* renamed from: a */
    public abstract void mo11852a();

    /* renamed from: b */
    public void mo11853b(C65234n nVar) {
        C87412m.m108594g(nVar, "status");
        C65235o.C65236a aVar = this.f187740e;
        if (aVar != null) {
            aVar.mo89355a(this, nVar);
        } else {
            C87412m.m108603p("watch");
            throw null;
        }
    }

    /* renamed from: c */
    public boolean mo89346c(C65220d dVar) {
        C87412m.m108594g(dVar, "newTask");
        return true;
    }

    /* renamed from: d */
    public abstract String mo11854d();
}
