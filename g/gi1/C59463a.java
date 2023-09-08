package gi1;

import al1.C54130j;
import gy3.C87412m;

/* renamed from: gi1.a */
public final class C59463a {

    /* renamed from: a */
    public C54130j f169894a;

    /* renamed from: b */
    public C59465f f169895b;

    public C59463a(C54130j jVar, C59465f fVar) {
        C87412m.m108594g(fVar, "layoutInfo");
        this.f169894a = jVar;
        this.f169895b = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f151997a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo84561a() {
        /*
            r1 = this;
            al1.j r0 = r1.f169894a
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.f151997a
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gi1.C59463a.mo84561a():java.lang.String");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59463a)) {
            return false;
        }
        C59463a aVar = (C59463a) obj;
        return C87412m.m108589b(this.f169894a, aVar.f169894a) && C87412m.m108589b(this.f169895b, aVar.f169895b);
    }

    public int hashCode() {
        C54130j jVar = this.f169894a;
        return ((jVar == null ? 0 : jVar.hashCode()) * 31) + this.f169895b.hashCode();
    }

    public String toString() {
        return "sdkUserId: " + mo84561a() + " layoutInfo: " + this.f169895b;
    }
}
