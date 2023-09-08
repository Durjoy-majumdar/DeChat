package vq1;

import gy3.C87412m;
import u60.C65220d;
import u60.C65234n;
import vq1.C65869y;

/* renamed from: vq1.h */
public final class C65856h extends C65220d {

    /* renamed from: f */
    public final C14961i f189379f;

    /* renamed from: g */
    public boolean f189380g;

    /* renamed from: vq1.h$a */
    public static final class C65857a implements C65869y.C65870a {

        /* renamed from: a */
        public final /* synthetic */ C65856h f189381a;

        public C65857a(C65856h hVar) {
            this.f189381a = hVar;
        }

        /* renamed from: a */
        public void mo14006a(C65234n nVar, boolean z) {
            C87412m.m108594g(nVar, "status");
            C65856h hVar = this.f189381a;
            hVar.f189380g = z;
            hVar.mo11853b(nVar);
        }
    }

    public C65856h(C14961i iVar) {
        C87412m.m108594g(iVar, "action");
        this.f189379f = iVar;
    }

    /* renamed from: a */
    public void mo11852a() {
        this.f189379f.mo14007a(new C65857a(this));
    }

    /* renamed from: d */
    public String mo11854d() {
        return this.f189379f.mo14008c();
    }
}
