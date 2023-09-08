package fj2;

import gy3.C87412m;
import te3.C64563mr3;
import zb2.C66777a;

/* renamed from: fj2.c */
public final class C59106c extends C66777a<C59106c> {

    /* renamed from: d */
    public final int f169067d;

    /* renamed from: e */
    public int f169068e;

    /* renamed from: f */
    public final C64563mr3 f169069f;

    /* renamed from: g */
    public String f169070g;

    public C59106c(int i, int i2, C64563mr3 mr32, String str) {
        C87412m.m108594g(mr32, "item");
        C87412m.m108594g(str, "value");
        this.f169067d = i;
        this.f169068e = i2;
        this.f169069f = mr32;
        this.f169070g = str;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return this.f169069f.f184380d + '-' + this.f169068e;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f169068e;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C59106c cVar = (C59106c) obj;
        C87412m.m108594g(cVar, "other");
        int i = C87412m.m108596i(this.f169068e, cVar.f169068e);
        return i == 0 ? C87412m.m108596i(this.f169067d, cVar.f169067d) : i;
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C59106c cVar = (C59106c) obj;
        C87412m.m108594g(cVar, "other");
        return this.f169067d == cVar.f169067d && C87412m.m108589b(this.f169069f, cVar.f169069f) && C87412m.m108589b(this.f169070g, cVar.f169070g);
    }
}
