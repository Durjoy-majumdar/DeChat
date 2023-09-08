package nk1;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: nk1.e */
public final class C61778e {

    /* renamed from: a */
    public String f175625a;

    /* renamed from: b */
    public int f175626b;

    /* renamed from: c */
    public int f175627c;

    public C61778e() {
        this((String) null, 0, 0, 7, (C8480h) null);
    }

    public C61778e(String str, int i, int i2, int i3, C8480h hVar) {
        str = (i3 & 1) != 0 ? "" : str;
        i = (i3 & 2) != 0 ? 0 : i;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        C87412m.m108594g(str, "key");
        this.f175625a = str;
        this.f175626b = i;
        this.f175627c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61778e)) {
            return false;
        }
        C61778e eVar = (C61778e) obj;
        return C87412m.m108589b(this.f175625a, eVar.f175625a) && this.f175626b == eVar.f175626b && this.f175627c == eVar.f175627c;
    }

    public int hashCode() {
        return (((this.f175625a.hashCode() * 31) + this.f175626b) * 31) + this.f175627c;
    }

    public String toString() {
        return "CachePair(key=" + this.f175625a + ", value=" + this.f175626b + ", times=" + this.f175627c + ')';
    }
}
