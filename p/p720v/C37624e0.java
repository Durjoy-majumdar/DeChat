package p720v;

import com.google.android.gms.common.internal.Constants;
import gy3.C87412m;
import p560i2.C108322d;

/* renamed from: v.e0 */
public final class C37624e0 {

    /* renamed from: a */
    public final float f99755a;

    /* renamed from: b */
    public final C108322d f99756b;

    /* renamed from: c */
    public final float f99757c;

    /* renamed from: v.e0$a */
    public static final class C37625a {

        /* renamed from: a */
        public final float f99758a;

        /* renamed from: b */
        public final float f99759b;

        /* renamed from: c */
        public final long f99760c;

        public C37625a(float f, float f2, long j) {
            this.f99758a = f;
            this.f99759b = f2;
            this.f99760c = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37625a)) {
                return false;
            }
            C37625a aVar = (C37625a) obj;
            return C87412m.m108589b(Float.valueOf(this.f99758a), Float.valueOf(aVar.f99758a)) && C87412m.m108589b(Float.valueOf(this.f99759b), Float.valueOf(aVar.f99759b)) && this.f99760c == aVar.f99760c;
        }

        public int hashCode() {
            long j = this.f99760c;
            return (((Float.floatToIntBits(this.f99758a) * 31) + Float.floatToIntBits(this.f99759b)) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f99758a + ", distance=" + this.f99759b + ", duration=" + this.f99760c + ')';
        }
    }

    public C37624e0(float f, C108322d dVar) {
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        this.f99755a = f;
        this.f99756b = dVar;
        float density = dVar.getDensity();
        float f2 = C37626f0.f99761a;
        this.f99757c = density * 386.0878f * 160.0f * 0.84f;
    }

    /* renamed from: a */
    public final C37625a mo61238a(float f) {
        double b = mo61239b(f);
        float f2 = C37626f0.f99761a;
        double d = ((double) f2) - 1.0d;
        return new C37625a(f, (float) (((double) (this.f99755a * this.f99757c)) * Math.exp((((double) f2) / d) * b)), (long) (Math.exp(b / d) * 1000.0d));
    }

    /* renamed from: b */
    public final double mo61239b(float f) {
        C37621a aVar = C37621a.f99749a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f99755a * this.f99757c)));
    }
}
