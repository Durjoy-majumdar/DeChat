package p175j0;

import gy3.C87412m;

/* renamed from: j0.n0 */
public final class C9270n0 {

    /* renamed from: a */
    public final Object f29020a;

    /* renamed from: b */
    public final Object f29021b;

    public C9270n0(Object obj, Object obj2) {
        this.f29020a = obj;
        this.f29021b = obj2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9270n0)) {
            return false;
        }
        C9270n0 n0Var = (C9270n0) obj;
        return C87412m.m108589b(this.f29020a, n0Var.f29020a) && C87412m.m108589b(this.f29021b, n0Var.f29021b);
    }

    public int hashCode() {
        Object obj = this.f29020a;
        int i = 0;
        int ordinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f29021b;
        if (obj2 instanceof Enum) {
            i = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i = obj2.hashCode();
        }
        return ordinal + i;
    }

    public String toString() {
        return "JoinedKey(left=" + this.f29020a + ", right=" + this.f29021b + ')';
    }
}
