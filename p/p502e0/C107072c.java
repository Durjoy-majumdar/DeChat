package p502e0;

import com.google.android.gms.common.internal.Constants;
import gy3.C8480h;
import gy3.C87412m;
import p560i2.C108322d;
import p560i2.C108325f;

/* renamed from: e0.c */
public final class C107072c implements C31353b {

    /* renamed from: a */
    public final float f320493a;

    public C107072c(float f, C8480h hVar) {
        this.f320493a = f;
    }

    /* renamed from: a */
    public float mo58085a(long j, C108322d dVar) {
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        return dVar.mo143034T(this.f320493a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C107072c) && C108325f.m146734a(this.f320493a, ((C107072c) obj).f320493a);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f320493a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f320493a + ".dp)";
    }
}
