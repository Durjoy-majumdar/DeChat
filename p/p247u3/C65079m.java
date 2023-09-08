package p247u3;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C8480h;
import gy3.C87412m;
import p247u3.C65060g0;

/* renamed from: u3.m */
public final class C65079m {

    /* renamed from: a */
    public final C65060g0 f187304a;

    /* renamed from: b */
    public final C65060g0 f187305b;

    /* renamed from: c */
    public final C65060g0 f187306c;

    /* renamed from: d */
    public final C65066h0 f187307d;

    /* renamed from: e */
    public final C65066h0 f187308e;

    static {
        C65060g0.C65063c cVar = C65060g0.C65063c.f187265c;
        C65066h0 h0Var = C65066h0.f187268d;
        new C65079m(cVar, cVar, cVar, C65066h0.f187268d, (C65066h0) null, 16, (C8480h) null);
    }

    public C65079m(C65060g0 g0Var, C65060g0 g0Var2, C65060g0 g0Var3, C65066h0 h0Var, C65066h0 h0Var2) {
        C87412m.m108594g(g0Var, "refresh");
        C87412m.m108594g(g0Var2, "prepend");
        C87412m.m108594g(g0Var3, "append");
        C87412m.m108594g(h0Var, FirebaseAnalytics.C113379b.SOURCE);
        this.f187304a = g0Var;
        this.f187305b = g0Var2;
        this.f187306c = g0Var3;
        this.f187307d = h0Var;
        this.f187308e = h0Var2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C87412m.m108589b(C65079m.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C65079m mVar = (C65079m) obj;
            return !(C87412m.m108589b(this.f187304a, mVar.f187304a) ^ true) && !(C87412m.m108589b(this.f187305b, mVar.f187305b) ^ true) && !(C87412m.m108589b(this.f187306c, mVar.f187306c) ^ true) && !(C87412m.m108589b(this.f187307d, mVar.f187307d) ^ true) && !(C87412m.m108589b(this.f187308e, mVar.f187308e) ^ true);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
    }

    public int hashCode() {
        int hashCode = ((((((this.f187304a.hashCode() * 31) + this.f187305b.hashCode()) * 31) + this.f187306c.hashCode()) * 31) + this.f187307d.hashCode()) * 31;
        C65066h0 h0Var = this.f187308e;
        return hashCode + (h0Var != null ? h0Var.hashCode() : 0);
    }

    public String toString() {
        return "CombinedLoadStates(refresh=" + this.f187304a + ", prepend=" + this.f187305b + ", append=" + this.f187306c + ", " + "source=" + this.f187307d + ", mediator=" + this.f187308e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C65079m(C65060g0 g0Var, C65060g0 g0Var2, C65060g0 g0Var3, C65066h0 h0Var, C65066h0 h0Var2, int i, C8480h hVar) {
        this(g0Var, g0Var2, g0Var3, h0Var, (i & 16) != 0 ? null : h0Var2);
    }
}
