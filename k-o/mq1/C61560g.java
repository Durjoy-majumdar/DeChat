package mq1;

import gy3.C87412m;
import u60.C65220d;
import u60.C65234n;

/* renamed from: mq1.g */
public final class C61560g extends C65220d {

    /* renamed from: f */
    public final C61552a f174971f;

    /* renamed from: g */
    public boolean f174972g;

    /* renamed from: mq1.g$a */
    public interface C61561a {
        /* renamed from: a */
        void mo86497a(C65234n nVar, boolean z);
    }

    /* renamed from: mq1.g$b */
    public static final class C61562b implements C61561a {

        /* renamed from: a */
        public final /* synthetic */ C61560g f174973a;

        public C61562b(C61560g gVar) {
            this.f174973a = gVar;
        }

        /* renamed from: a */
        public void mo86497a(C65234n nVar, boolean z) {
            C87412m.m108594g(nVar, "status");
            C61560g gVar = this.f174973a;
            gVar.f174972g = z;
            gVar.mo11853b(nVar);
        }
    }

    public C61560g(C61552a aVar) {
        C87412m.m108594g(aVar, "action");
        this.f174971f = aVar;
    }

    /* renamed from: a */
    public void mo11852a() {
        this.f174971f.mo86488a(new C61562b(this));
    }

    /* renamed from: d */
    public String mo11854d() {
        return this.f174971f.mo86489b();
    }
}
