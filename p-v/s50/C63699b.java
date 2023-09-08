package s50;

import gy3.C87412m;

/* renamed from: s50.b */
public final class C63699b {

    /* renamed from: a */
    public int f180566a;

    /* renamed from: b */
    public String f180567b;

    /* renamed from: c */
    public int f180568c;

    public C63699b(int i, String str, int i2) {
        this.f180566a = i;
        this.f180567b = str;
        this.f180568c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63699b)) {
            return false;
        }
        C63699b bVar = (C63699b) obj;
        return this.f180566a == bVar.f180566a && C87412m.m108589b(this.f180567b, bVar.f180567b) && this.f180568c == bVar.f180568c;
    }

    public int hashCode() {
        int i = this.f180566a * 31;
        String str = this.f180567b;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.f180568c;
    }

    public String toString() {
        return "FilterConfig(filterKey=" + this.f180566a + ", filterPath=" + this.f180567b + ", filterValue=" + this.f180568c + ')';
    }
}
