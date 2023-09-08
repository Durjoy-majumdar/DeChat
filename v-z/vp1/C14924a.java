package vp1;

import gy3.C8480h;
import gy3.C87412m;
import te3.C51985xk0;

/* renamed from: vp1.a */
public final class C14924a {

    /* renamed from: a */
    public final int f40953a;

    /* renamed from: b */
    public final String f40954b;

    /* renamed from: c */
    public C51985xk0 f40955c;

    /* renamed from: d */
    public boolean f40956d;

    public C14924a(int i, String str, C51985xk0 xk02, boolean z, int i2, C8480h hVar) {
        z = (i2 & 8) != 0 ? false : z;
        C87412m.m108594g(str, "name");
        C87412m.m108594g(xk02, "page");
        this.f40953a = i;
        this.f40954b = str;
        this.f40955c = xk02;
        this.f40956d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14924a)) {
            return false;
        }
        C14924a aVar = (C14924a) obj;
        return this.f40953a == aVar.f40953a && C87412m.m108589b(this.f40954b, aVar.f40954b) && C87412m.m108589b(this.f40955c, aVar.f40955c) && this.f40956d == aVar.f40956d;
    }

    public int hashCode() {
        int hashCode = ((((this.f40953a * 31) + this.f40954b.hashCode()) * 31) + this.f40955c.hashCode()) * 31;
        boolean z = this.f40956d;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "CachePage(type=" + this.f40953a + ", name=" + this.f40954b + ", page=" + this.f40955c + ", read=" + this.f40956d + ')';
    }
}
