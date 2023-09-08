package i60;

import gy3.C87412m;

/* renamed from: i60.j */
public final class C33210j {

    /* renamed from: a */
    public String f90104a;

    /* renamed from: b */
    public int f90105b;

    public C33210j(String str, int i) {
        C87412m.m108594g(str, "username");
        this.f90104a = str;
        this.f90105b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33210j)) {
            return false;
        }
        C33210j jVar = (C33210j) obj;
        return C87412m.m108589b(this.f90104a, jVar.f90104a) && this.f90105b == jVar.f90105b;
    }

    public int hashCode() {
        return (this.f90104a.hashCode() * 31) + this.f90105b;
    }

    public String toString() {
        return "ShareRoomItem(username=" + this.f90104a + ", memberCount=" + this.f90105b + ')';
    }
}
