package pu3;

import pu3.C25499u;
import ru3.C110658e;
import ru3.C26118c;

/* renamed from: pu3.f */
public final class C25473f extends C25499u.C25500a.C25501a<C25473f> {

    /* renamed from: e */
    public int f72099e;

    /* renamed from: f */
    public int f72100f;

    /* renamed from: g */
    public int f72101g;

    /* renamed from: h */
    public int f72102h;

    /* renamed from: i */
    public int f72103i;

    /* renamed from: j */
    public int f72104j;

    /* renamed from: n */
    public int f72105n;

    /* renamed from: o */
    public int f72106o;

    public C25473f(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        super(i);
        this.f72099e = i2;
        this.f72100f = i3;
        this.f72101g = i4;
        this.f72102h = i5;
        this.f72103i = i6;
        this.f72104j = i7;
        this.f72105n = i8;
        this.f72106o = i9;
    }

    /* renamed from: a */
    public int compareTo(C25473f fVar) {
        int f = C26118c.m33548f(this.f72099e, fVar.f72099e);
        if (f != 0) {
            return f;
        }
        int c = C26118c.m33545c(this.f72100f, fVar.f72100f);
        if (c != 0) {
            return c;
        }
        int f2 = C26118c.m33548f(this.f72101g, fVar.f72101g);
        if (f2 != 0) {
            return f2;
        }
        int c2 = C26118c.m33545c(this.f72102h, fVar.f72102h);
        if (c2 != 0) {
            return c2;
        }
        int f3 = C26118c.m33548f(this.f72103i, fVar.f72103i);
        if (f3 != 0) {
            return f3;
        }
        int c3 = C26118c.m33545c(this.f72104j, fVar.f72104j);
        if (c3 != 0) {
            return c3;
        }
        int c4 = C26118c.m33545c(this.f72105n, fVar.f72105n);
        return c4 != 0 ? c4 : C26118c.m33545c(this.f72106o, fVar.f72106o);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C25473f) && compareTo((C25473f) obj) == 0;
    }

    public int hashCode() {
        return C110658e.m150642a(Integer.valueOf(this.f72099e), Integer.valueOf(this.f72100f), Integer.valueOf(this.f72101g), Integer.valueOf(this.f72102h), Integer.valueOf(this.f72103i), Integer.valueOf(this.f72104j), Integer.valueOf(this.f72105n), Integer.valueOf(this.f72106o));
    }
}
