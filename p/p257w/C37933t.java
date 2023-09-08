package p257w;

/* renamed from: w.t */
public final class C37933t implements C37950z {

    /* renamed from: a */
    public final float f100349a;

    /* renamed from: b */
    public final float f100350b;

    /* renamed from: c */
    public final float f100351c;

    /* renamed from: d */
    public final float f100352d;

    public C37933t(float f, float f2, float f3, float f4) {
        this.f100349a = f;
        this.f100350b = f2;
        this.f100351c = f3;
        this.f100352d = f4;
    }

    /* renamed from: a */
    public float mo61380a(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            float f3 = 1.0f;
            if (f < 1.0f) {
                while (true) {
                    float f4 = (f2 + f3) / ((float) 2);
                    float f5 = (float) 3;
                    float f6 = ((float) 1) - f4;
                    float f7 = f4 * f4 * f4;
                    float f8 = (this.f100349a * f5 * f6 * f6 * f4) + (this.f100351c * f5 * f6 * f4 * f4) + f7;
                    if (Math.abs(f - f8) < 0.001f) {
                        return (this.f100350b * f5 * f6 * f6 * f4) + (f5 * this.f100352d * f6 * f4 * f4) + f7;
                    } else if (f8 < f) {
                        f2 = f4;
                    } else {
                        f3 = f4;
                    }
                }
            }
        }
        return f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C37933t) {
            C37933t tVar = (C37933t) obj;
            if (this.f100349a == tVar.f100349a) {
                if (this.f100350b == tVar.f100350b) {
                    if (this.f100351c == tVar.f100351c) {
                        if (this.f100352d == tVar.f100352d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f100349a) * 31) + Float.floatToIntBits(this.f100350b)) * 31) + Float.floatToIntBits(this.f100351c)) * 31) + Float.floatToIntBits(this.f100352d);
    }
}
