package p247u3;

import gy3.C8480h;
import z04.C66725r;

/* renamed from: u3.f2 */
public abstract class C65056f2 {

    /* renamed from: a */
    public final int f187252a;

    /* renamed from: b */
    public final int f187253b;

    /* renamed from: c */
    public final int f187254c;

    /* renamed from: d */
    public final int f187255d;

    /* renamed from: u3.f2$a */
    public static final class C65057a extends C65056f2 {

        /* renamed from: e */
        public final int f187256e;

        /* renamed from: f */
        public final int f187257f;

        public C65057a(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i3, i4, i5, i6, (C8480h) null);
            this.f187256e = i;
            this.f187257f = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C65057a)) {
                return false;
            }
            C65057a aVar = (C65057a) obj;
            return this.f187256e == aVar.f187256e && this.f187257f == aVar.f187257f && this.f187252a == aVar.f187252a && this.f187253b == aVar.f187253b && this.f187254c == aVar.f187254c && this.f187255d == aVar.f187255d;
        }

        public int hashCode() {
            return C65056f2.super.hashCode() + this.f187256e + this.f187257f;
        }

        public String toString() {
            return C66725r.m78729c("ViewportHint.Access(\n            |    pageOffset=" + this.f187256e + ",\n            |    indexInPage=" + this.f187257f + ",\n            |    presentedItemsBefore=" + this.f187252a + ",\n            |    presentedItemsAfter=" + this.f187253b + ",\n            |    originalPageOffsetFirst=" + this.f187254c + ",\n            |    originalPageOffsetLast=" + this.f187255d + ",\n            |)", (String) null, 1, (Object) null);
        }
    }

    /* renamed from: u3.f2$b */
    public static final class C65058b extends C65056f2 {
        public C65058b(int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4, (C8480h) null);
        }

        public String toString() {
            return C66725r.m78729c("ViewportHint.Initial(\n            |    presentedItemsBefore=" + this.f187252a + ",\n            |    presentedItemsAfter=" + this.f187253b + ",\n            |    originalPageOffsetFirst=" + this.f187254c + ",\n            |    originalPageOffsetLast=" + this.f187255d + ",\n            |)", (String) null, 1, (Object) null);
        }
    }

    public C65056f2(int i, int i2, int i3, int i4, C8480h hVar) {
        this.f187252a = i;
        this.f187253b = i2;
        this.f187254c = i3;
        this.f187255d = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65056f2)) {
            return false;
        }
        C65056f2 f2Var = (C65056f2) obj;
        return this.f187252a == f2Var.f187252a && this.f187253b == f2Var.f187253b && this.f187254c == f2Var.f187254c && this.f187255d == f2Var.f187255d;
    }

    public int hashCode() {
        return this.f187252a + this.f187253b + this.f187254c + this.f187255d;
    }
}
