package p759y;

import gy3.C8480h;
import gy3.C87412m;
import p435a0.C103166l0;
import p435a0.C103177n0;
import p436a1.C103272w;
import p436a1.C103276y;
import rx3.C90109v;

/* renamed from: y.g0 */
public final class C112226g0 {

    /* renamed from: a */
    public final long f336013a;

    /* renamed from: b */
    public final boolean f336014b;

    /* renamed from: c */
    public final C103177n0 f336015c;

    public C112226g0(long j, boolean z, C103177n0 n0Var, int i, C8480h hVar) {
        j = (i & 1) != 0 ? C103276y.m136792c(4284900966L) : j;
        z = (i & 2) != 0 ? false : z;
        n0Var = (i & 4) != 0 ? C103166l0.m136517a(0.0f, 0.0f, 3, (Object) null) : n0Var;
        this.f336013a = j;
        this.f336014b = z;
        this.f336015c = n0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C87412m.m108589b(C112226g0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C112226g0 g0Var = (C112226g0) obj;
            return C103272w.m136781c(this.f336013a, g0Var.f336013a) && this.f336014b == g0Var.f336014b && C87412m.m108589b(this.f336015c, g0Var.f336015c);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.foundation.gestures.OverScrollConfiguration");
    }

    public int hashCode() {
        long j = this.f336013a;
        int i = C103272w.f304516h;
        return (((C90109v.m112737a(j) * 31) + (this.f336014b ? 1231 : 1237)) * 31) + this.f336015c.hashCode();
    }

    public String toString() {
        return "OverScrollConfiguration(glowColor=" + C103272w.m136787i(this.f336013a) + ", forceShowAlways=" + this.f336014b + ", drawPadding=" + this.f336015c + ')';
    }
}
