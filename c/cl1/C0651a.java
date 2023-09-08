package cl1;

import fj1.C45795b;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: cl1.a */
public final class C0651a extends C39970c<C45795b> {

    /* renamed from: f */
    public String f1538f = "";

    /* renamed from: g */
    public String f1539g = "";

    /* renamed from: h */
    public long f1540h = -1;

    /* renamed from: i */
    public boolean f1541i;

    /* renamed from: cl1.a$a */
    public static final class C0652a {
        public C0652a(C8480h hVar) {
        }
    }

    static {
        new C0652a((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0651a(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: c3 */
    public final String mo622c3() {
        boolean z = true;
        if (C32444a.f86203u1.mo60266n().intValue() != 1) {
            z = false;
        }
        return z ? "debug_id" : this.f1539g;
    }

    public void onCleared() {
        this.f1539g = "";
        this.f1540h = -1;
    }
}
