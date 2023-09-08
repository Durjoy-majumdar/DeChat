package d50;

import gy3.C87412m;

/* renamed from: d50.j */
public final class C7170j {

    /* renamed from: a */
    public final String f25142a;

    /* renamed from: b */
    public int f25143b;

    /* renamed from: c */
    public String f25144c;

    public C7170j(String str, int i, String str2) {
        C87412m.m108594g(str, "url");
        this.f25142a = str;
        this.f25143b = i;
        this.f25144c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7170j)) {
            return false;
        }
        C7170j jVar = (C7170j) obj;
        return C87412m.m108589b(this.f25142a, jVar.f25142a) && this.f25143b == jVar.f25143b && C87412m.m108589b(this.f25144c, jVar.f25144c);
    }

    public int hashCode() {
        int hashCode = ((this.f25142a.hashCode() * 31) + this.f25143b) * 31;
        String str = this.f25144c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "url:" + this.f25142a + ", level:" + this.f25143b + ", desc:" + this.f25144c;
    }
}
