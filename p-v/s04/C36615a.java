package s04;

import gy3.C87412m;

/* renamed from: s04.a */
public final class C36615a<T> {

    /* renamed from: a */
    public final T f97346a;

    /* renamed from: b */
    public final T f97347b;

    public C36615a(T t, T t2) {
        this.f97346a = t;
        this.f97347b = t2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36615a)) {
            return false;
        }
        C36615a aVar = (C36615a) obj;
        return C87412m.m108589b(this.f97346a, aVar.f97346a) && C87412m.m108589b(this.f97347b, aVar.f97347b);
    }

    public int hashCode() {
        T t = this.f97346a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f97347b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f97346a + ", upper=" + this.f97347b + ')';
    }
}
