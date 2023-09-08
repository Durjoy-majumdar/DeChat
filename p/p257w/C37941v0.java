package p257w;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: w.v0 */
public final class C37941v0 {

    /* renamed from: a */
    public float f100380a;

    /* renamed from: b */
    public double f100381b = Math.sqrt(50.0d);

    /* renamed from: c */
    public boolean f100382c;

    /* renamed from: d */
    public double f100383d;

    /* renamed from: e */
    public double f100384e;

    /* renamed from: f */
    public double f100385f;

    /* renamed from: g */
    public float f100386g = 1.0f;

    public C37941v0(float f) {
        this.f100380a = f;
    }

    /* renamed from: a */
    public final long mo61436a(float f, float f2, long j) {
        double d;
        double d2;
        float f3 = f2;
        boolean z = false;
        if (!this.f100382c) {
            if (!(this.f100380a == Float.MAX_VALUE)) {
                float f4 = this.f100386g;
                double d3 = (double) f4;
                double d4 = d3 * d3;
                if (f4 > 1.0f) {
                    double d5 = this.f100381b;
                    double d6 = d4 - ((double) 1);
                    this.f100383d = (((double) (-f4)) * d5) + (d5 * Math.sqrt(d6));
                    double d7 = this.f100381b;
                    this.f100384e = (((double) (-this.f100386g)) * d7) - (d7 * Math.sqrt(d6));
                } else if (f4 >= 0.0f && f4 < 1.0f) {
                    this.f100385f = this.f100381b * Math.sqrt(((double) 1) - d4);
                }
                this.f100382c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        float f5 = f - this.f100380a;
        double d8 = ((double) j) / 1000.0d;
        float f6 = this.f100386g;
        if (f6 > 1.0f) {
            double d9 = (double) f5;
            double d15 = this.f100384e;
            double d16 = (double) f3;
            double d17 = this.f100383d;
            double d18 = d9 - (((d15 * d9) - d16) / (d15 - d17));
            double d19 = ((d9 * d15) - d16) / (d15 - d17);
            d2 = (Math.exp(d15 * d8) * d18) + (Math.exp(this.f100383d * d8) * d19);
            double d25 = this.f100384e;
            double exp = d18 * d25 * Math.exp(d25 * d8);
            double d26 = this.f100383d;
            d = exp + (d19 * d26 * Math.exp(d26 * d8));
        } else {
            if (f6 == 1.0f) {
                z = true;
            }
            if (z) {
                double d27 = (double) f3;
                double d28 = this.f100381b;
                double d29 = (double) f5;
                double d35 = d27 + (d28 * d29);
                double d36 = d29 + (d35 * d8);
                double exp2 = Math.exp((-d28) * d8) * d36;
                double exp3 = d36 * Math.exp((-this.f100381b) * d8);
                double d37 = this.f100381b;
                d2 = exp2;
                d = (exp3 * (-d37)) + (d35 * Math.exp((-d37) * d8));
            } else {
                double d38 = this.f100381b;
                double d39 = (double) f5;
                double d44 = (((double) 1) / this.f100385f) * ((((double) f6) * d38 * d39) + ((double) f3));
                double exp4 = Math.exp(((double) (-f6)) * d38 * d8) * ((Math.cos(this.f100385f * d8) * d39) + (Math.sin(this.f100385f * d8) * d44));
                double d45 = this.f100381b;
                float f7 = this.f100386g;
                double d46 = exp4;
                double d47 = (-d45) * exp4 * ((double) f7);
                double exp5 = Math.exp(((double) (-f7)) * d45 * d8);
                double d48 = this.f100385f;
                double d49 = d47;
                double sin = (-d48) * d39 * Math.sin(d48 * d8);
                double d54 = this.f100385f;
                d = d49 + (exp5 * (sin + (d44 * d54 * Math.cos(d54 * d8))));
                d2 = d46;
            }
        }
        return (((long) Float.floatToIntBits((float) d)) & Util.MAX_32BIT_VALUE) | (((long) Float.floatToIntBits((float) (d2 + ((double) this.f100380a)))) << 32);
    }
}
