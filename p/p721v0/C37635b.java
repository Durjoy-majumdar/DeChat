package p721v0;

import gy3.C87412m;
import iy3.C60641c;
import p560i2.C33179k;
import p560i2.C33181m;
import p560i2.C33183o;
import p721v0.C111294a;

/* renamed from: v0.b */
public final class C37635b implements C111294a {

    /* renamed from: b */
    public final float f99773b;

    /* renamed from: c */
    public final float f99774c;

    /* renamed from: v0.b$a */
    public static final class C37636a implements C111294a.C37633b {

        /* renamed from: a */
        public final float f99775a;

        public C37636a(float f) {
            this.f99775a = f;
        }

        /* renamed from: a */
        public int mo61254a(int i, int i2, C33183o oVar) {
            C87412m.m108594g(oVar, "layoutDirection");
            return C60641c.m70921b((((float) (i2 - i)) / 2.0f) * (((float) 1) + (oVar == C33183o.Ltr ? this.f99775a : ((float) -1) * this.f99775a)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37636a) && C87412m.m108589b(Float.valueOf(this.f99775a), Float.valueOf(((C37636a) obj).f99775a));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f99775a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f99775a + ')';
        }
    }

    /* renamed from: v0.b$b */
    public static final class C37637b implements C111294a.C37634c {

        /* renamed from: a */
        public final float f99776a;

        public C37637b(float f) {
            this.f99776a = f;
        }

        /* renamed from: a */
        public int mo61255a(int i, int i2) {
            return C60641c.m70921b((((float) (i2 - i)) / 2.0f) * (((float) 1) + this.f99776a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37637b) && C87412m.m108589b(Float.valueOf(this.f99776a), Float.valueOf(((C37637b) obj).f99776a));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f99776a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f99776a + ')';
        }
    }

    public C37635b(float f, float f2) {
        this.f99773b = f;
        this.f99774c = f2;
    }

    /* renamed from: a */
    public long mo61256a(long j, long j2, C33183o oVar) {
        C87412m.m108594g(oVar, "layoutDirection");
        float f = ((float) (((int) (j2 >> 32)) - ((int) (j >> 32)))) / 2.0f;
        float b = ((float) (C33181m.m39966b(j2) - C33181m.m39966b(j))) / 2.0f;
        float f2 = (float) 1;
        return C33179k.m39964a(C60641c.m70921b(f * ((oVar == C33183o.Ltr ? this.f99773b : ((float) -1) * this.f99773b) + f2)), C60641c.m70921b(b * (f2 + this.f99774c)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37635b)) {
            return false;
        }
        C37635b bVar = (C37635b) obj;
        return C87412m.m108589b(Float.valueOf(this.f99773b), Float.valueOf(bVar.f99773b)) && C87412m.m108589b(Float.valueOf(this.f99774c), Float.valueOf(bVar.f99774c));
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f99773b) * 31) + Float.floatToIntBits(this.f99774c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f99773b + ", verticalBias=" + this.f99774c + ')';
    }
}
