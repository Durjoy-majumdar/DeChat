package ni3;

import gy3.C87412m;

/* renamed from: ni3.b */
public final class C88945b {

    /* renamed from: a */
    public final String f256520a;

    /* renamed from: b */
    public final C88950f f256521b;

    /* renamed from: c */
    public final boolean f256522c;

    /* renamed from: d */
    public C88950f f256523d = new C88950f(0, 0);

    public C88945b(String str, C88950f fVar, boolean z) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(fVar, "range");
        this.f256520a = str;
        this.f256521b = fVar;
        this.f256522c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C88945b)) {
            return false;
        }
        C88945b bVar = (C88945b) obj;
        return C87412m.m108589b(this.f256520a, bVar.f256520a) && C87412m.m108589b(this.f256521b, bVar.f256521b) && this.f256522c == bVar.f256522c;
    }

    public int hashCode() {
        int hashCode = ((this.f256520a.hashCode() * 31) + this.f256521b.hashCode()) * 31;
        boolean z = this.f256522c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "ItemRan(path=" + this.f256520a + ", range=" + this.f256521b + ", isDeflateCompressed=" + this.f256522c + ')';
    }
}
