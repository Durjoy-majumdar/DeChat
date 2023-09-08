package n14;

import gy3.C87412m;
import ny3.C25235d;

/* renamed from: n14.b */
public final class C25204b implements C25217e {

    /* renamed from: a */
    public final String f71668a;

    /* renamed from: b */
    public final C25217e f71669b;

    /* renamed from: c */
    public final C25235d<?> f71670c;

    public C25204b(C25217e eVar, C25235d<?> dVar) {
        C87412m.m108594g(eVar, "original");
        C87412m.m108594g(dVar, "kClass");
        this.f71669b = eVar;
        this.f71670c = dVar;
        this.f71668a = eVar.mo52328j() + '<' + dVar.mo51264h() + '>';
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C25204b)) {
            obj = null;
        }
        C25204b bVar = (C25204b) obj;
        return bVar != null && C87412m.m108589b(this.f71669b, bVar.f71669b) && C87412m.m108589b(bVar.f71670c, this.f71670c);
    }

    /* renamed from: f */
    public C25223i mo52323f() {
        return this.f71669b.mo52323f();
    }

    /* renamed from: g */
    public boolean mo52324g() {
        return this.f71669b.mo52324g();
    }

    /* renamed from: h */
    public int mo52325h() {
        return this.f71669b.mo52325h();
    }

    public int hashCode() {
        return (this.f71670c.hashCode() * 31) + this.f71668a.hashCode();
    }

    /* renamed from: i */
    public String mo52327i(int i) {
        return this.f71669b.mo52327i(i);
    }

    /* renamed from: j */
    public String mo52328j() {
        return this.f71668a;
    }

    /* renamed from: k */
    public int mo52329k(String str) {
        C87412m.m108594g(str, "name");
        return this.f71669b.mo52329k(str);
    }

    /* renamed from: l */
    public C25217e mo52330l(int i) {
        return this.f71669b.mo52330l(i);
    }
}
