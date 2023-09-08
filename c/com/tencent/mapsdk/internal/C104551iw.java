package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.iw */
public final class C104551iw {
    /* renamed from: a */
    public static double m139972a(long j, float f) {
        float f2 = ((float) j) / 5000.0f;
        return (double) (((-f) * f2 * (f2 - 2.0f)) + 0.0f);
    }

    /* renamed from: a */
    public static double m139973a(long j, float f, float f2, long j2) {
        return (double) (((f2 * ((float) j)) / ((float) j2)) + f);
    }

    /* renamed from: b */
    private static double m139974b(long j, float f, float f2, long j2) {
        float f3 = ((float) j) / ((float) j2);
        return (double) ((f2 * f3 * f3) + f);
    }

    /* renamed from: c */
    private static double m139975c(long j, float f, float f2, long j2) {
        float f3;
        float f4;
        long j3 = (long) (((float) j) / (((float) j2) / 2.0f));
        if (j3 < 1) {
            f4 = (float) j3;
            f3 = (f2 / 2.0f) * f4;
        } else {
            f3 = (-f2) / 2.0f;
            long j4 = j3 - 1;
            f4 = (float) ((j4 * (j4 - 2)) - 1);
        }
        return (double) ((f3 * f4) + f);
    }

    /* renamed from: d */
    private static double m139976d(long j, float f, float f2, long j2) {
        return (((double) f2) * Math.pow((double) (j / j2), 3.0d)) + ((double) f);
    }

    /* renamed from: e */
    private static double m139977e(long j, float f, float f2, long j2) {
        return (((double) f2) * (Math.pow((double) ((((float) j) / ((float) j2)) - 1.0f), 3.0d) + 1.0d)) + ((double) f);
    }

    /* renamed from: f */
    private static double m139978f(long j, float f, float f2, long j2) {
        long j3 = j / (j2 / 2);
        return j3 < 1 ? (((double) (f2 / 2.0f)) * Math.pow((double) j3, 3.0d)) + ((double) f) : (((double) (f2 / 2.0f)) * (Math.pow((double) (j3 - 2), 3.0d) + 2.0d)) + ((double) f);
    }

    /* renamed from: g */
    private static double m139979g(long j, float f, float f2, long j2) {
        float f3 = ((float) j) / ((float) j2);
        return (double) ((f2 * f3 * f3 * f3 * f3) + f);
    }

    /* renamed from: h */
    private static double m139980h(long j, float f, float f2, long j2) {
        float f3 = (float) (j / (j2 - 1));
        return (double) (((-f2) * ((((f3 * f3) * f3) * f3) - 1.0f)) + f);
    }

    /* renamed from: i */
    private static double m139981i(long j, float f, float f2, long j2) {
        float f3;
        float f4;
        long j3 = j / (j2 / 2);
        if (j3 < 1) {
            f4 = (float) j3;
            f3 = (f2 / 2.0f) * f4 * f4 * f4;
        } else {
            f3 = (-f2) / 2.0f;
            long j4 = j3 - 2;
            f4 = (float) ((((j4 * j4) * j4) * j4) - 2);
        }
        return (double) ((f3 * f4) + f);
    }

    /* renamed from: j */
    private static double m139982j(long j, float f, float f2, long j2) {
        float f3 = (float) (j / j2);
        return (double) ((f2 * f3 * f3 * f3 * f3 * f3) + f);
    }

    /* renamed from: k */
    private static double m139983k(long j, float f, float f2, long j2) {
        long j3 = (j / j2) - 1;
        return (double) ((f2 * ((float) ((j3 * j3 * j3 * j3 * j3) + 1))) + f);
    }

    /* renamed from: l */
    private static double m139984l(long j, float f, float f2, long j2) {
        float f3;
        float f4;
        long j3 = j / (j2 / 2);
        if (j3 < 1) {
            f4 = (float) j3;
            f3 = (f2 / 2.0f) * f4 * f4 * f4 * f4;
        } else {
            f3 = f2 / 2.0f;
            long j4 = j3 - 2;
            f4 = (float) ((j4 * j4 * j4 * j4 * j4) + 2);
        }
        return (double) ((f3 * f4) + f);
    }

    /* renamed from: m */
    private static double m139985m(long j, float f, float f2, long j2) {
        return (((double) f2) * (1.0d - Math.cos(((double) (j / j2)) * 1.5707963267948966d))) + ((double) f);
    }

    /* renamed from: n */
    private static double m139986n(long j, float f, float f2, long j2) {
        return (((double) f2) * Math.sin(((double) (j / j2)) * 1.5707963267948966d)) + ((double) f);
    }

    /* renamed from: o */
    private static double m139987o(long j, float f, float f2, long j2) {
        return (((double) (f2 / 2.0f)) * (1.0d - Math.cos((((double) j) * 3.141592653589793d) / ((double) j2)))) + ((double) f);
    }

    /* renamed from: p */
    private static double m139988p(long j, float f, float f2, long j2) {
        return (((double) f2) * Math.pow(2.0d, (double) (((j / j2) - 1) * 10))) + ((double) f);
    }

    /* renamed from: q */
    private static double m139989q(long j, float f, float f2, long j2) {
        return (((double) f2) * ((-Math.pow(2.0d, (double) ((j * -10) / j2))) + 1.0d)) + ((double) f);
    }

    /* renamed from: r */
    private static double m139990r(long j, float f, float f2, long j2) {
        long j3 = j / j2;
        return (((double) f2) * (1.0d - Math.sqrt((double) (1 - (j3 * j3))))) + ((double) f);
    }

    /* renamed from: s */
    private static double m139991s(long j, float f, float f2, long j2) {
        long j3 = j / (j2 - 1);
        return (((double) f2) * Math.sqrt((double) (1 - (j3 * j3)))) + ((double) f);
    }

    /* renamed from: t */
    private static double m139992t(long j, float f, float f2, long j2) {
        long j3 = j / (j2 / 2);
        if (j3 < 1) {
            return (((double) (f2 / 2.0f)) * (1.0d - Math.sqrt((double) (1 - (j3 * j3))))) + ((double) f);
        }
        long j4 = j3 - 2;
        return (((double) (f2 / 2.0f)) * (Math.sqrt((double) (1 - (j4 * j4))) + 1.0d)) + ((double) f);
    }

    /* renamed from: u */
    private static double m139993u(long j, float f, float f2, long j2) {
        float f3;
        float f4;
        long j3 = j / (j2 / 2);
        if (j3 < 1) {
            f3 = f2 / 2.0f;
            f4 = (float) (j3 * j3 * ((j3 * 4) - 3));
        } else {
            f3 = f2 / 2.0f;
            long j4 = j3 - 2;
            f4 = (float) ((j4 * j4 * ((j4 * 4) + 3)) + 2);
        }
        return (double) ((f3 * f4) + f);
    }

    /* renamed from: v */
    private static double m139994v(long j, float f, float f2, long j2) {
        long j3 = j / j2;
        float f3 = (float) j3;
        return (double) ((f2 * f3 * f3 * ((float) ((j3 * 21) - 20))) + f);
    }

    /* renamed from: w */
    private static double m139995w(long j, float f, float f2, long j2) {
        long j3 = (j / j2) - 1;
        return (double) ((f2 * ((float) ((j3 * j3 * ((j3 * 21) + 20)) + 1))) + f);
    }
}
