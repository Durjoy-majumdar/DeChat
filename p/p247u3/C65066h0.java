package p247u3;

import gy3.C87412m;
import p247u3.C65060g0;
import rx3.C13603j;

/* renamed from: u3.h0 */
public final class C65066h0 {

    /* renamed from: d */
    public static final C65066h0 f187268d;

    /* renamed from: a */
    public final C65060g0 f187269a;

    /* renamed from: b */
    public final C65060g0 f187270b;

    /* renamed from: c */
    public final C65060g0 f187271c;

    static {
        C65060g0.C65063c cVar = C65060g0.C65063c.f187265c;
        f187268d = new C65066h0(cVar, cVar, cVar);
    }

    public C65066h0(C65060g0 g0Var, C65060g0 g0Var2, C65060g0 g0Var3) {
        C87412m.m108594g(g0Var, "refresh");
        C87412m.m108594g(g0Var2, "prepend");
        C87412m.m108594g(g0Var3, "append");
        this.f187269a = g0Var;
        this.f187270b = g0Var2;
        this.f187271c = g0Var3;
    }

    /* renamed from: a */
    public static C65066h0 m76680a(C65066h0 h0Var, C65060g0 g0Var, C65060g0 g0Var2, C65060g0 g0Var3, int i, Object obj) {
        if ((i & 1) != 0) {
            g0Var = h0Var.f187269a;
        }
        if ((i & 2) != 0) {
            g0Var2 = h0Var.f187270b;
        }
        if ((i & 4) != 0) {
            g0Var3 = h0Var.f187271c;
        }
        h0Var.getClass();
        C87412m.m108594g(g0Var, "refresh");
        C87412m.m108594g(g0Var2, "prepend");
        C87412m.m108594g(g0Var3, "append");
        return new C65066h0(g0Var, g0Var2, g0Var3);
    }

    /* renamed from: b */
    public final C65060g0 mo89264b(C65069i0 i0Var) {
        C87412m.m108594g(i0Var, "loadType");
        int ordinal = i0Var.ordinal();
        if (ordinal == 0) {
            return this.f187269a;
        }
        if (ordinal == 1) {
            return this.f187270b;
        }
        if (ordinal == 2) {
            return this.f187271c;
        }
        throw new C13603j();
    }

    /* renamed from: c */
    public final C65066h0 mo89265c(C65069i0 i0Var, C65060g0 g0Var) {
        C87412m.m108594g(i0Var, "loadType");
        C87412m.m108594g(g0Var, "newState");
        int ordinal = i0Var.ordinal();
        if (ordinal == 0) {
            return m76680a(this, g0Var, (C65060g0) null, (C65060g0) null, 6, (Object) null);
        }
        if (ordinal == 1) {
            return m76680a(this, (C65060g0) null, g0Var, (C65060g0) null, 5, (Object) null);
        }
        if (ordinal == 2) {
            return m76680a(this, (C65060g0) null, (C65060g0) null, g0Var, 3, (Object) null);
        }
        throw new C13603j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65066h0)) {
            return false;
        }
        C65066h0 h0Var = (C65066h0) obj;
        return C87412m.m108589b(this.f187269a, h0Var.f187269a) && C87412m.m108589b(this.f187270b, h0Var.f187270b) && C87412m.m108589b(this.f187271c, h0Var.f187271c);
    }

    public int hashCode() {
        C65060g0 g0Var = this.f187269a;
        int i = 0;
        int hashCode = (g0Var != null ? g0Var.hashCode() : 0) * 31;
        C65060g0 g0Var2 = this.f187270b;
        int hashCode2 = (hashCode + (g0Var2 != null ? g0Var2.hashCode() : 0)) * 31;
        C65060g0 g0Var3 = this.f187271c;
        if (g0Var3 != null) {
            i = g0Var3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "LoadStates(refresh=" + this.f187269a + ", prepend=" + this.f187270b + ", append=" + this.f187271c + ")";
    }
}
