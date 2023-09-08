package bl1;

import gy3.C87412m;
import pe3.C89349b;

/* renamed from: bl1.v */
public final class C28333v {

    /* renamed from: a */
    public boolean f77956a;

    /* renamed from: b */
    public C89349b f77957b;

    public C28333v(boolean z, C89349b bVar) {
        this.f77956a = z;
        this.f77957b = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28333v)) {
            return false;
        }
        C28333v vVar = (C28333v) obj;
        return this.f77956a == vVar.f77956a && C87412m.m108589b(this.f77957b, vVar.f77957b);
    }

    public int hashCode() {
        boolean z = this.f77956a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        C89349b bVar = this.f77957b;
        return i + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "BoxRedDotInfo(hasRedDot=" + this.f77956a + ", lastBuffer=" + this.f77957b + ')';
    }
}
