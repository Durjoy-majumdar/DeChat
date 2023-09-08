package z04;

import gy3.C87412m;
import my3.C61594j;

/* renamed from: z04.e */
public final class C39297e {

    /* renamed from: a */
    public final String f105665a;

    /* renamed from: b */
    public final C61594j f105666b;

    public C39297e(String str, C61594j jVar) {
        C87412m.m108594g(str, "value");
        C87412m.m108594g(jVar, "range");
        this.f105665a = str;
        this.f105666b = jVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39297e)) {
            return false;
        }
        C39297e eVar = (C39297e) obj;
        return C87412m.m108589b(this.f105665a, eVar.f105665a) && C87412m.m108589b(this.f105666b, eVar.f105666b);
    }

    public int hashCode() {
        return (this.f105665a.hashCode() * 31) + this.f105666b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f105665a + ", range=" + this.f105666b + ')';
    }
}
