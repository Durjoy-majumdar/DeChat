package vq1;

import gy3.C87412m;
import u60.C65220d;
import u60.C65234n;

/* renamed from: vq1.y */
public final class C65869y extends C65220d {

    /* renamed from: f */
    public final C14961i f189417f;

    /* renamed from: g */
    public boolean f189418g;

    /* renamed from: vq1.y$a */
    public interface C65870a {
        /* renamed from: a */
        void mo14006a(C65234n nVar, boolean z);
    }

    /* renamed from: vq1.y$b */
    public static final class C65871b implements C65870a {

        /* renamed from: a */
        public final /* synthetic */ C65869y f189419a;

        public C65871b(C65869y yVar) {
            this.f189419a = yVar;
        }

        /* renamed from: a */
        public void mo14006a(C65234n nVar, boolean z) {
            C87412m.m108594g(nVar, "status");
            C65869y yVar = this.f189419a;
            yVar.f189418g = z;
            yVar.mo11853b(nVar);
        }
    }

    public C65869y(C14961i iVar) {
        C87412m.m108594g(iVar, "action");
        this.f189417f = iVar;
    }

    /* renamed from: a */
    public void mo11852a() {
        this.f189417f.mo14007a(new C65871b(this));
    }

    /* renamed from: d */
    public String mo11854d() {
        return this.f189417f.mo14008c();
    }
}
