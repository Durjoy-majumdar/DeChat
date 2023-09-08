package p246u1;

import gy3.C8480h;
import gy3.C87412m;
import my3.C109647f;
import my3.C34689e;

/* renamed from: u1.g */
public final class C37320g {

    /* renamed from: d */
    public static final C37320g f98708d = new C37320g(0.0f, new C34689e(0.0f, 0.0f), 0, 4, (C8480h) null);

    /* renamed from: a */
    public final float f98709a;

    /* renamed from: b */
    public final C109647f<Float> f98710b;

    /* renamed from: c */
    public final int f98711c;

    public C37320g(float f, C109647f fVar, int i, int i2, C8480h hVar) {
        i = (i2 & 4) != 0 ? 0 : i;
        C87412m.m108594g(fVar, "range");
        this.f98709a = f;
        this.f98710b = fVar;
        this.f98711c = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37320g)) {
            return false;
        }
        C37320g gVar = (C37320g) obj;
        return ((this.f98709a > gVar.f98709a ? 1 : (this.f98709a == gVar.f98709a ? 0 : -1)) == 0) && C87412m.m108589b(this.f98710b, gVar.f98710b) && this.f98711c == gVar.f98711c;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f98709a) * 31) + this.f98710b.hashCode()) * 31) + this.f98711c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f98709a + ", range=" + this.f98710b + ", steps=" + this.f98711c + ')';
    }
}
