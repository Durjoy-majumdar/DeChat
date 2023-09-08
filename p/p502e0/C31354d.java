package p502e0;

import com.google.android.gms.common.internal.Constants;
import gy3.C87412m;
import p1166z0.C112545k;
import p560i2.C108322d;

/* renamed from: e0.d */
public final class C31354d implements C31353b {

    /* renamed from: a */
    public final float f83917a;

    public C31354d(float f) {
        this.f83917a = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    /* renamed from: a */
    public float mo58085a(long j, C108322d dVar) {
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        return C112545k.m153757c(j) * (this.f83917a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31354d) && C87412m.m108589b(Float.valueOf(this.f83917a), Float.valueOf(((C31354d) obj).f83917a));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f83917a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f83917a + "%)";
    }
}
