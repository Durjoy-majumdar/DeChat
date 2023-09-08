package sx3;

import gy3.C87412m;

/* renamed from: sx3.i0 */
public final class C64188i0<T> {

    /* renamed from: a */
    public final int f181909a;

    /* renamed from: b */
    public final T f181910b;

    public C64188i0(int i, T t) {
        this.f181909a = i;
        this.f181910b = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64188i0)) {
            return false;
        }
        C64188i0 i0Var = (C64188i0) obj;
        return this.f181909a == i0Var.f181909a && C87412m.m108589b(this.f181910b, i0Var.f181910b);
    }

    public int hashCode() {
        int i = this.f181909a * 31;
        T t = this.f181910b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f181909a + ", value=" + this.f181910b + ')';
    }
}
