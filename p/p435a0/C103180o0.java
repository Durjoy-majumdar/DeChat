package p435a0;

import gy3.C8480h;
import gy3.C87412m;
import p560i2.C108325f;
import p560i2.C33183o;

/* renamed from: a0.o0 */
public final class C103180o0 implements C103177n0 {

    /* renamed from: a */
    public final float f304343a;

    /* renamed from: b */
    public final float f304344b;

    /* renamed from: c */
    public final float f304345c;

    /* renamed from: d */
    public final float f304346d;

    public C103180o0(float f, float f2, float f3, float f4, C8480h hVar) {
        this.f304343a = f;
        this.f304344b = f2;
        this.f304345c = f3;
        this.f304346d = f4;
    }

    /* renamed from: a */
    public float mo142919a(C33183o oVar) {
        C87412m.m108594g(oVar, "layoutDirection");
        return oVar == C33183o.Ltr ? this.f304343a : this.f304345c;
    }

    /* renamed from: b */
    public float mo142920b(C33183o oVar) {
        C87412m.m108594g(oVar, "layoutDirection");
        return oVar == C33183o.Ltr ? this.f304345c : this.f304343a;
    }

    /* renamed from: c */
    public float mo142921c() {
        return this.f304346d;
    }

    /* renamed from: d */
    public float mo142922d() {
        return this.f304344b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C103180o0)) {
            return false;
        }
        C103180o0 o0Var = (C103180o0) obj;
        return C108325f.m146734a(this.f304343a, o0Var.f304343a) && C108325f.m146734a(this.f304344b, o0Var.f304344b) && C108325f.m146734a(this.f304345c, o0Var.f304345c) && C108325f.m146734a(this.f304346d, o0Var.f304346d);
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f304343a) * 31) + Float.floatToIntBits(this.f304344b)) * 31) + Float.floatToIntBits(this.f304345c)) * 31) + Float.floatToIntBits(this.f304346d);
    }

    public String toString() {
        return "PaddingValues(start=" + C108325f.m146735b(this.f304343a) + ", top=" + C108325f.m146735b(this.f304344b) + ", end=" + C108325f.m146735b(this.f304345c) + ", bottom=" + C108325f.m146735b(this.f304346d) + ')';
    }
}
