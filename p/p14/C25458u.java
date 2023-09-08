package p14;

import gy3.C8480h;
import gy3.C87412m;
import n14.C25217e;
import n14.C25223i;
import n14.C25226j;
import z04.C66731x;

/* renamed from: p14.u */
public abstract class C25458u implements C25217e {

    /* renamed from: a */
    public final int f72066a = 1;

    /* renamed from: b */
    public final C25217e f72067b;

    public C25458u(C25217e eVar, C8480h hVar) {
        this.f72067b = eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25458u)) {
            return false;
        }
        C25458u uVar = (C25458u) obj;
        return C87412m.m108589b(this.f72067b, uVar.f72067b) && C87412m.m108589b(mo52328j(), uVar.mo52328j());
    }

    /* renamed from: f */
    public C25223i mo52323f() {
        return C25226j.C25228b.f71697a;
    }

    /* renamed from: g */
    public boolean mo52324g() {
        return false;
    }

    /* renamed from: h */
    public int mo52325h() {
        return this.f72066a;
    }

    public int hashCode() {
        return (this.f72067b.hashCode() * 31) + mo52328j().hashCode();
    }

    /* renamed from: i */
    public String mo52327i(int i) {
        return String.valueOf(i);
    }

    /* renamed from: k */
    public int mo52329k(String str) {
        C87412m.m108594g(str, "name");
        Integer e = C66731x.m78731e(str);
        if (e != null) {
            return e.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid list index");
    }

    /* renamed from: l */
    public C25217e mo52330l(int i) {
        if (i >= 0) {
            return this.f72067b;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo52328j() + " expects only non-negative indices").toString());
    }
}
