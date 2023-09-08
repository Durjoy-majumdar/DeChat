package p503e1;

import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import java.util.List;

/* renamed from: e1.l */
public final class C107123l extends C107126n implements Iterable<C107126n>, C33145a {

    /* renamed from: d */
    public final String f320662d;

    /* renamed from: e */
    public final float f320663e;

    /* renamed from: f */
    public final float f320664f;

    /* renamed from: g */
    public final float f320665g;

    /* renamed from: h */
    public final float f320666h;

    /* renamed from: i */
    public final float f320667i;

    /* renamed from: j */
    public final float f320668j;

    /* renamed from: n */
    public final float f320669n;

    /* renamed from: o */
    public final List<C31381e> f320670o;

    /* renamed from: p */
    public final List<C107126n> f320671p;

    /* renamed from: e1.l$a */
    public static final class C107124a implements Iterator<C107126n>, C33145a {

        /* renamed from: d */
        public final Iterator<C107126n> f320672d;

        public C107124a(C107123l lVar) {
            this.f320672d = lVar.f320671p.iterator();
        }

        public boolean hasNext() {
            return this.f320672d.hasNext();
        }

        public Object next() {
            return this.f320672d.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C107123l(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends C31381e> list, List<? extends C107126n> list2) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(list, "clipPathData");
        C87412m.m108594g(list2, "children");
        this.f320662d = str;
        this.f320663e = f;
        this.f320664f = f2;
        this.f320665g = f3;
        this.f320666h = f4;
        this.f320667i = f5;
        this.f320668j = f6;
        this.f320669n = f7;
        this.f320670o = list;
        this.f320671p = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C107123l)) {
            return false;
        }
        C107123l lVar = (C107123l) obj;
        if (!C87412m.m108589b(this.f320662d, lVar.f320662d)) {
            return false;
        }
        if (!(this.f320663e == lVar.f320663e)) {
            return false;
        }
        if (!(this.f320664f == lVar.f320664f)) {
            return false;
        }
        if (!(this.f320665g == lVar.f320665g)) {
            return false;
        }
        if (!(this.f320666h == lVar.f320666h)) {
            return false;
        }
        if (!(this.f320667i == lVar.f320667i)) {
            return false;
        }
        if (!(this.f320668j == lVar.f320668j)) {
            return false;
        }
        return ((this.f320669n > lVar.f320669n ? 1 : (this.f320669n == lVar.f320669n ? 0 : -1)) == 0) && C87412m.m108589b(this.f320670o, lVar.f320670o) && C87412m.m108589b(this.f320671p, lVar.f320671p);
    }

    public int hashCode() {
        return (((((((((((((((((this.f320662d.hashCode() * 31) + Float.floatToIntBits(this.f320663e)) * 31) + Float.floatToIntBits(this.f320664f)) * 31) + Float.floatToIntBits(this.f320665g)) * 31) + Float.floatToIntBits(this.f320666h)) * 31) + Float.floatToIntBits(this.f320667i)) * 31) + Float.floatToIntBits(this.f320668j)) * 31) + Float.floatToIntBits(this.f320669n)) * 31) + this.f320670o.hashCode()) * 31) + this.f320671p.hashCode();
    }

    public Iterator<C107126n> iterator() {
        return new C107124a(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C107123l() {
        /*
            r11 = this;
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r8 = 0
            int r0 = p503e1.C107125m.f320673a
            sx3.f0 r10 = sx3.C64186f0.f181907d
            java.lang.String r1 = ""
            r0 = r11
            r9 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p503e1.C107123l.<init>():void");
    }
}
