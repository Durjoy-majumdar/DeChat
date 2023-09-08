package p502e0;

import com.google.android.gms.common.internal.Constants;
import gy3.C87412m;
import p560i2.C108322d;

/* renamed from: e0.e */
public final class C31355e implements C31353b {

    /* renamed from: a */
    public final float f83918a;

    public C31355e(float f) {
        this.f83918a = f;
    }

    /* renamed from: a */
    public float mo58085a(long j, C108322d dVar) {
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        return this.f83918a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31355e) && C87412m.m108589b(Float.valueOf(this.f83918a), Float.valueOf(((C31355e) obj).f83918a));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f83918a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f83918a + ".px)";
    }
}
