package pu3;

import pu3.C25499u;
import ru3.C110658e;
import ru3.C26118c;

/* renamed from: pu3.e */
public final class C25470e extends C25499u.C25500a.C25501a<C25470e> {

    /* renamed from: e */
    public C25471a[] f72090e;

    /* renamed from: f */
    public C25471a[] f72091f;

    /* renamed from: g */
    public C25472b[] f72092g;

    /* renamed from: h */
    public C25472b[] f72093h;

    /* renamed from: pu3.e$a */
    public static class C25471a implements Comparable<C25471a> {

        /* renamed from: d */
        public int f72094d;

        /* renamed from: e */
        public int f72095e;

        public C25471a(int i, int i2) {
            this.f72094d = i;
            this.f72095e = i2;
        }

        public int compareTo(Object obj) {
            C25471a aVar = (C25471a) obj;
            int f = C26118c.m33548f(this.f72094d, aVar.f72094d);
            return f != 0 ? f : C26118c.m33545c(this.f72095e, aVar.f72095e);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C25471a)) {
                return false;
            }
            C25471a aVar = (C25471a) obj;
            int f = C26118c.m33548f(this.f72094d, aVar.f72094d);
            if (f == 0) {
                f = C26118c.m33545c(this.f72095e, aVar.f72095e);
            }
            return f == 0;
        }

        public int hashCode() {
            return C110658e.m150642a(Integer.valueOf(this.f72094d), Integer.valueOf(this.f72095e));
        }
    }

    /* renamed from: pu3.e$b */
    public static class C25472b implements Comparable<C25472b> {

        /* renamed from: d */
        public int f72096d;

        /* renamed from: e */
        public int f72097e;

        /* renamed from: f */
        public int f72098f;

        public C25472b(int i, int i2, int i3) {
            this.f72096d = i;
            this.f72097e = i2;
            this.f72098f = i3;
        }

        /* renamed from: a */
        public int compareTo(C25472b bVar) {
            int f = C26118c.m33548f(this.f72096d, bVar.f72096d);
            if (f != 0) {
                return f;
            }
            int c = C26118c.m33545c(this.f72097e, bVar.f72097e);
            return c != 0 ? c : C26118c.m33545c(this.f72098f, bVar.f72098f);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C25472b) && compareTo((C25472b) obj) == 0;
        }

        public int hashCode() {
            return C110658e.m150642a(Integer.valueOf(this.f72096d), Integer.valueOf(this.f72097e), Integer.valueOf(this.f72098f));
        }
    }

    public C25470e(int i, C25471a[] aVarArr, C25471a[] aVarArr2, C25472b[] bVarArr, C25472b[] bVarArr2) {
        super(i);
        this.f72090e = aVarArr;
        this.f72091f = aVarArr2;
        this.f72092g = bVarArr;
        this.f72093h = bVarArr2;
    }

    /* renamed from: a */
    public int compareTo(C25470e eVar) {
        int a = C26118c.m33543a(this.f72090e, eVar.f72090e);
        if (a != 0) {
            return a;
        }
        int a2 = C26118c.m33543a(this.f72091f, eVar.f72091f);
        if (a2 != 0) {
            return a2;
        }
        int a3 = C26118c.m33543a(this.f72092g, eVar.f72092g);
        return a3 != 0 ? a3 : C26118c.m33543a(this.f72093h, eVar.f72093h);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C25470e) && compareTo((C25470e) obj) == 0;
    }

    public int hashCode() {
        return C110658e.m150642a(this.f72090e, this.f72091f, this.f72092g, this.f72093h);
    }
}
