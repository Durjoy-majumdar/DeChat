package vq1;

import gy3.C87412m;
import u60.C65220d;
import u60.C65234n;
import vq1.C65869y;

/* renamed from: vq1.d0 */
public final class C14955d0 extends C65220d {

    /* renamed from: f */
    public final C14961i f41004f;

    /* renamed from: g */
    public boolean f41005g;

    /* renamed from: vq1.d0$a */
    public static final class C14956a implements C65869y.C65870a {

        /* renamed from: a */
        public final /* synthetic */ C14955d0 f41006a;

        public C14956a(C14955d0 d0Var) {
            this.f41006a = d0Var;
        }

        /* renamed from: a */
        public void mo14006a(C65234n nVar, boolean z) {
            C87412m.m108594g(nVar, "status");
            C14955d0 d0Var = this.f41006a;
            d0Var.f41005g = z;
            d0Var.mo11853b(nVar);
        }
    }

    public C14955d0(C14961i iVar) {
        C87412m.m108594g(iVar, "action");
        this.f41004f = iVar;
    }

    /* renamed from: a */
    public void mo11852a() {
        this.f41004f.mo14007a(new C14956a(this));
    }

    /* renamed from: d */
    public String mo11854d() {
        return this.f41004f.mo14008c();
    }
}
