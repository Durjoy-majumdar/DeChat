package p14;

import gy3.C8480h;
import gy3.C87412m;
import n14.C25217e;
import n14.C25223i;
import n14.C25226j;
import z04.C66731x;

/* renamed from: p14.y */
public abstract class C25464y implements C25217e {

    /* renamed from: a */
    public final int f72076a = 2;

    /* renamed from: b */
    public final String f72077b;

    /* renamed from: c */
    public final C25217e f72078c;

    /* renamed from: d */
    public final C25217e f72079d;

    public C25464y(String str, C25217e eVar, C25217e eVar2, C8480h hVar) {
        this.f72077b = str;
        this.f72078c = eVar;
        this.f72079d = eVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25464y)) {
            return false;
        }
        C25464y yVar = (C25464y) obj;
        return !(C87412m.m108589b(this.f72077b, yVar.f72077b) ^ true) && !(C87412m.m108589b(this.f72078c, yVar.f72078c) ^ true) && !(C87412m.m108589b(this.f72079d, yVar.f72079d) ^ true);
    }

    /* renamed from: f */
    public C25223i mo52323f() {
        return C25226j.C25229c.f71698a;
    }

    /* renamed from: g */
    public boolean mo52324g() {
        return false;
    }

    /* renamed from: h */
    public int mo52325h() {
        return this.f72076a;
    }

    public int hashCode() {
        return (((this.f72077b.hashCode() * 31) + this.f72078c.hashCode()) * 31) + this.f72079d.hashCode();
    }

    /* renamed from: i */
    public String mo52327i(int i) {
        return String.valueOf(i);
    }

    /* renamed from: j */
    public String mo52328j() {
        return this.f72077b;
    }

    /* renamed from: k */
    public int mo52329k(String str) {
        C87412m.m108594g(str, "name");
        Integer e = C66731x.m78731e(str);
        if (e != null) {
            return e.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    /* renamed from: l */
    public C25217e mo52330l(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 == 0) {
                return this.f72078c;
            }
            if (i2 == 1) {
                return this.f72079d;
            }
            throw new IllegalStateException("Unreached".toString());
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + this.f72077b + " expects only non-negative indices").toString());
    }
}
