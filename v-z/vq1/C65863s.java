package vq1;

import gy3.C87412m;
import u60.C65220d;
import u60.C65234n;
import vq1.C65869y;

/* renamed from: vq1.s */
public final class C65863s extends C65220d {

    /* renamed from: f */
    public final C14961i f189401f;

    /* renamed from: g */
    public boolean f189402g;

    /* renamed from: vq1.s$a */
    public static final class C65864a implements C65869y.C65870a {

        /* renamed from: a */
        public final /* synthetic */ C65863s f189403a;

        public C65864a(C65863s sVar) {
            this.f189403a = sVar;
        }

        /* renamed from: a */
        public void mo14006a(C65234n nVar, boolean z) {
            C87412m.m108594g(nVar, "status");
            C65863s sVar = this.f189403a;
            sVar.f189402g = z;
            sVar.mo11853b(nVar);
        }
    }

    public C65863s(C14961i iVar) {
        C87412m.m108594g(iVar, "action");
        this.f189401f = iVar;
    }

    /* renamed from: a */
    public void mo11852a() {
        this.f189401f.mo14007a(new C65864a(this));
    }

    /* renamed from: d */
    public String mo11854d() {
        return this.f189401f.mo14008c();
    }
}
