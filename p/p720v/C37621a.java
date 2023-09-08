package p720v;

import gy3.C87412m;

/* renamed from: v.a */
public final class C37621a {

    /* renamed from: a */
    public static final C37621a f99749a = new C37621a();

    /* renamed from: b */
    public static final float[] f99750b;

    /* renamed from: v.a$a */
    public static final class C37622a {

        /* renamed from: a */
        public final float f99751a;

        /* renamed from: b */
        public final float f99752b;

        public C37622a(float f, float f2) {
            this.f99751a = f;
            this.f99752b = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37622a)) {
                return false;
            }
            C37622a aVar = (C37622a) obj;
            return C87412m.m108589b(Float.valueOf(this.f99751a), Float.valueOf(aVar.f99751a)) && C87412m.m108589b(Float.valueOf(this.f99752b), Float.valueOf(aVar.f99752b));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f99751a) * 31) + Float.floatToIntBits(this.f99752b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f99751a + ", velocityCoefficient=" + this.f99752b + ')';
        }
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float[] fArr = new float[101];
        f99750b = fArr;
        float[] fArr2 = new float[101];
        float f9 = 0.0f;
        float f15 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f16 = ((float) i) / ((float) 100);
            float f17 = 1.0f;
            while (true) {
                f = ((f17 - f9) / 2.0f) + f9;
                f2 = 1.0f - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f18 = (((f2 * 0.175f) + (f * 0.35000002f)) * f3) + f4;
                if (((double) Math.abs(f18 - f16)) < 1.0E-5d) {
                    break;
                } else if (f18 > f16) {
                    f17 = f;
                } else {
                    f9 = f;
                }
            }
            float f19 = 0.5f;
            fArr[i] = (f3 * ((f2 * 0.5f) + f)) + f4;
            float f25 = 1.0f;
            while (true) {
                f5 = ((f25 - f15) / 2.0f) + f15;
                f6 = 1.0f - f5;
                f7 = f5 * 3.0f * f6;
                f8 = f5 * f5 * f5;
                float f26 = (((f6 * f19) + f5) * f7) + f8;
                if (((double) Math.abs(f26 - f16)) < 1.0E-5d) {
                    break;
                }
                if (f26 > f16) {
                    f25 = f5;
                } else {
                    f15 = f5;
                }
                f19 = 0.5f;
            }
            fArr2[i] = (f7 * ((f6 * 0.175f) + (f5 * 0.35000002f))) + f8;
        }
        fArr[100] = 1.0f;
    }

    /* renamed from: a */
    public final C37622a mo61231a(float f) {
        float f2;
        float f3;
        float f4 = (float) 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = ((float) i) / f4;
            int i2 = i + 1;
            float f6 = ((float) i2) / f4;
            float[] fArr = f99750b;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = f7 + ((f - f5) * f3);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return new C37622a(f2, f3);
    }
}
