package p14;

import gy3.C87412m;
import n14.C25217e;
import n14.C25223i;

/* renamed from: p14.h0 */
public final class C25438h0 implements C25217e {

    /* renamed from: a */
    public final String f72039a;

    /* renamed from: b */
    public final C25217e f72040b;

    public C25438h0(C25217e eVar) {
        C87412m.m108594g(eVar, "original");
        this.f72040b = eVar;
        this.f72039a = eVar.mo52328j() + "?";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25438h0) && !(C87412m.m108589b(this.f72040b, ((C25438h0) obj).f72040b) ^ true);
    }

    /* renamed from: f */
    public C25223i mo52323f() {
        return this.f72040b.mo52323f();
    }

    /* renamed from: g */
    public boolean mo52324g() {
        return true;
    }

    /* renamed from: h */
    public int mo52325h() {
        return this.f72040b.mo52325h();
    }

    public int hashCode() {
        return this.f72040b.hashCode() * 31;
    }

    /* renamed from: i */
    public String mo52327i(int i) {
        return this.f72040b.mo52327i(i);
    }

    /* renamed from: j */
    public String mo52328j() {
        return this.f72039a;
    }

    /* renamed from: k */
    public int mo52329k(String str) {
        C87412m.m108594g(str, "name");
        return this.f72040b.mo52329k(str);
    }

    /* renamed from: l */
    public C25217e mo52330l(int i) {
        return this.f72040b.mo52330l(i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f72040b);
        sb.append('?');
        return sb.toString();
    }
}
