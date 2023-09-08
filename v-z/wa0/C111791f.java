package wa0;

import gy3.C8480h;
import p560i2.C108325f;

/* renamed from: wa0.f */
public final class C111791f {

    /* renamed from: a */
    public final float f334755a;

    /* renamed from: b */
    public final float f334756b;

    public C111791f(float f, float f2, C8480h hVar) {
        this.f334755a = f;
        this.f334756b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111791f)) {
            return false;
        }
        C111791f fVar = (C111791f) obj;
        return C108325f.m146734a(this.f334755a, fVar.f334755a) && C108325f.m146734a(this.f334756b, fVar.f334756b);
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f334755a) * 31) + Float.floatToIntBits(this.f334756b);
    }

    public String toString() {
        return "TabPosition(left=" + C108325f.m146735b(this.f334755a) + ", right=" + C108325f.m146735b(this.f334755a + this.f334756b) + ", width=" + C108325f.m146735b(this.f334756b) + ')';
    }
}
