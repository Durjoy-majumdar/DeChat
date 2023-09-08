package q14;

import gy3.C24560g0;
import gy3.C87412m;
import r14.C89864m;

/* renamed from: q14.j */
public final class C25542j extends C25544m {

    /* renamed from: d */
    public final String f72232d;

    /* renamed from: e */
    public final boolean f72233e;

    public C25542j(Object obj, boolean z) {
        C87412m.m108594g(obj, "body");
        this.f72233e = z;
        this.f72232d = obj.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!C87412m.m108589b(C24560g0.m30725a(C25542j.class), C24560g0.m30725a(obj.getClass())))) {
            return false;
        }
        C25542j jVar = (C25542j) obj;
        return this.f72233e == jVar.f72233e && !(C87412m.m108589b(this.f72232d, jVar.f72232d) ^ true);
    }

    /* renamed from: f */
    public String mo52780f() {
        return this.f72232d;
    }

    public int hashCode() {
        return (Boolean.valueOf(this.f72233e).hashCode() * 31) + this.f72232d.hashCode();
    }

    public String toString() {
        if (!this.f72233e) {
            return this.f72232d;
        }
        StringBuilder sb = new StringBuilder();
        C89864m.m112379a(sb, this.f72232d);
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}
