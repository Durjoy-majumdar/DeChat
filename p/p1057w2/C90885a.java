package p1057w2;

import android.graphics.Color;

/* renamed from: w2.a */
public final class C90885a {

    /* renamed from: a */
    public static final ThreadLocal<double[]> f260864a = new ThreadLocal<>();

    /* renamed from: a */
    public static void m113996a(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        float f3 = ((float) i) / 255.0f;
        float f4 = ((float) i2) / 255.0f;
        float f5 = ((float) i3) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            f = max == f3 ? ((f4 - f5) / f6) % 6.0f : max == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            f2 = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = 360.0f;
        float f9 = (f * 60.0f) % 360.0f;
        if (f9 < 0.0f) {
            f9 += 360.0f;
        }
        if (f9 < 0.0f) {
            f8 = 0.0f;
        } else if (f9 <= 360.0f) {
            f8 = f9;
        }
        fArr[0] = f8;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        fArr[2] = f7;
    }

    /* renamed from: b */
    public static void m113997b(int i, int i2, int i3, double[] dArr) {
        double[] dArr2 = dArr;
        if (dArr2.length == 3) {
            double d = ((double) i) / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = ((double) i2) / 255.0d;
            double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = ((double) i3) / 255.0d;
            double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            dArr2[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr2[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr2[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: c */
    public static int m113998c(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + (-1.5372d * d2)) + (-0.4986d * d3)) / 100.0d;
        double d5 = (((-0.9689d * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + (-0.204d * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(m114005j((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, 255), m114005j((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), m114005j((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255));
    }

    /* renamed from: d */
    public static int m113999d(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: e */
    public static double m114000e(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = m114003h(i, i2);
            }
            double f = m114001f(i) + 0.05d;
            double f2 = m114001f(i2) + 0.05d;
            return Math.max(f, f2) / Math.min(f, f2);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    /* renamed from: f */
    public static double m114001f(int i) {
        ThreadLocal<double[]> threadLocal = f260864a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        m113997b(Color.red(i), Color.green(i), Color.blue(i), dArr);
        return dArr[1] / 100.0d;
    }

    /* renamed from: g */
    public static int m114002g(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (m114000e(m114007l(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (m114000e(m114007l(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    /* renamed from: h */
    public static int m114003h(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
        return Color.argb(i3, m114004i(Color.red(i), alpha2, Color.red(i2), alpha, i3), m114004i(Color.green(i), alpha2, Color.green(i2), alpha, i3), m114004i(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    /* renamed from: i */
    public static int m114004i(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: j */
    public static int m114005j(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: k */
    public static double m114006k(double d) {
        return d > 0.008856d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.3d) + 16.0d) / 116.0d;
    }

    /* renamed from: l */
    public static int m114007l(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
