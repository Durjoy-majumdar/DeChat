package if2;

import gy3.C8480h;
import gy3.C87412m;
import te3.C50132ki;
import zb2.C66777a;

/* renamed from: if2.b */
public final class C46243b extends C66777a<C46243b> {

    /* renamed from: d */
    public final C50132ki f124654d;

    /* renamed from: e */
    public final int f124655e;

    public C46243b() {
        this((C50132ki) null, 0, 3, (C8480h) null);
    }

    public C46243b(C50132ki kiVar, int i, int i2, C8480h hVar) {
        kiVar = (i2 & 1) != 0 ? new C50132ki() : kiVar;
        i = (i2 & 2) != 0 ? 0 : i;
        C87412m.m108594g(kiVar, "recordInfo");
        this.f124654d = kiVar;
        this.f124655e = i;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return String.valueOf(this.f124654d.hashCode());
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f124655e;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C87412m.m108594g((C46243b) obj, "other");
        return 0;
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C46243b bVar = (C46243b) obj;
        C87412m.m108594g(bVar, "other");
        return this.f124654d.f136800e == bVar.f124654d.f136800e;
    }
}
