package pu3;

import pu3.C25499u;
import ru3.C110658e;
import ru3.C26118c;

/* renamed from: pu3.g */
public final class C25474g extends C25499u.C25500a.C25501a<C25474g> {

    /* renamed from: e */
    public int f72107e;

    /* renamed from: f */
    public int f72108f;

    /* renamed from: g */
    public int f72109g;

    /* renamed from: h */
    public int f72110h;

    /* renamed from: i */
    public short[] f72111i;

    /* renamed from: j */
    public C25476b[] f72112j;

    /* renamed from: n */
    public C25475a[] f72113n;

    /* renamed from: pu3.g$a */
    public static class C25475a implements Comparable<C25475a> {

        /* renamed from: d */
        public int[] f72114d;

        /* renamed from: e */
        public int[] f72115e;

        /* renamed from: f */
        public int f72116f;

        /* renamed from: g */
        public int f72117g;

        public C25475a(int[] iArr, int[] iArr2, int i, int i2) {
            this.f72114d = iArr;
            this.f72115e = iArr2;
            this.f72116f = i;
            this.f72117g = i2;
        }

        public int compareTo(Object obj) {
            C25475a aVar = (C25475a) obj;
            int b = C26118c.m33544b(this.f72114d, aVar.f72114d);
            if (b != 0) {
                return b;
            }
            int b2 = C26118c.m33544b(this.f72115e, aVar.f72115e);
            return b2 != 0 ? b2 : C26118c.m33545c(this.f72116f, aVar.f72116f);
        }
    }

    /* renamed from: pu3.g$b */
    public static class C25476b implements Comparable<C25476b> {

        /* renamed from: d */
        public int f72118d;

        /* renamed from: e */
        public int f72119e;

        /* renamed from: f */
        public int f72120f;

        public C25476b(int i, int i2, int i3) {
            this.f72118d = i;
            this.f72119e = i2;
            this.f72120f = i3;
        }

        public int compareTo(Object obj) {
            C25476b bVar = (C25476b) obj;
            int c = C26118c.m33545c(this.f72118d, bVar.f72118d);
            if (c != 0) {
                return c;
            }
            int c2 = C26118c.m33545c(this.f72119e, bVar.f72119e);
            return c2 != 0 ? c2 : C26118c.m33545c(this.f72120f, bVar.f72120f);
        }
    }

    public C25474g(int i, int i2, int i3, int i4, int i5, short[] sArr, C25476b[] bVarArr, C25475a[] aVarArr) {
        super(i);
        this.f72107e = i2;
        this.f72108f = i3;
        this.f72109g = i4;
        this.f72110h = i5;
        this.f72111i = sArr;
        this.f72112j = bVarArr;
        this.f72113n = aVarArr;
    }

    /* renamed from: a */
    public int compareTo(C25474g gVar) {
        int c = C26118c.m33545c(this.f72107e, gVar.f72107e);
        if (c != 0) {
            return c;
        }
        int c2 = C26118c.m33545c(this.f72108f, gVar.f72108f);
        if (c2 != 0) {
            return c2;
        }
        int c3 = C26118c.m33545c(this.f72109g, gVar.f72109g);
        if (c3 != 0) {
            return c3;
        }
        int c4 = C26118c.m33545c(this.f72110h, gVar.f72110h);
        if (c4 != 0) {
            return c4;
        }
        int e = C26118c.m33547e(this.f72111i, gVar.f72111i);
        if (e != 0) {
            return e;
        }
        int a = C26118c.m33543a(this.f72112j, gVar.f72112j);
        return a != 0 ? a : C26118c.m33543a(this.f72113n, gVar.f72113n);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C25474g) && compareTo((C25474g) obj) == 0;
    }

    public int hashCode() {
        return C110658e.m150642a(Integer.valueOf(this.f72107e), Integer.valueOf(this.f72108f), Integer.valueOf(this.f72109g), Integer.valueOf(this.f72110h), this.f72111i, this.f72112j, this.f72113n);
    }
}
