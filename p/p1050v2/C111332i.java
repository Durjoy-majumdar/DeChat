package p1050v2;

/* renamed from: v2.i */
public final class C111332i {

    /* renamed from: k */
    public static final C111332i f333312k;

    /* renamed from: a */
    public final float f333313a;

    /* renamed from: b */
    public final float f333314b;

    /* renamed from: c */
    public final float f333315c;

    /* renamed from: d */
    public final float f333316d;

    /* renamed from: e */
    public final float f333317e;

    /* renamed from: f */
    public final float f333318f;

    /* renamed from: g */
    public final float[] f333319g;

    /* renamed from: h */
    public final float f333320h;

    /* renamed from: i */
    public final float f333321i;

    /* renamed from: j */
    public final float f333322j;

    static {
        float[] fArr = C111316b.f333282c;
        float c = (float) ((((double) C111316b.m151799c(50.0f)) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = C111316b.f333280a;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = (fArr3[0] * f) + (fArr3[1] * f2) + (fArr3[2] * f3);
        float[] fArr4 = fArr2[1];
        float f5 = (fArr4[0] * f) + (fArr4[1] * f2) + (fArr4[2] * f3);
        float[] fArr5 = fArr2[2];
        float f6 = (f * fArr5[0]) + (f2 * fArr5[1]) + (f3 * fArr5[2]);
        float f7 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float f8 = c;
        float exp = (1.0f - (((float) Math.exp((double) (((-c) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d = (double) exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f4) * exp) + 1.0f) - exp, (((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * f8) + 1.0f);
        float f15 = f9 * f9 * f9 * f9;
        float f16 = 1.0f - f15;
        float cbrt = (0.1f * f16 * f16 * ((float) Math.cbrt(((double) f8) * 5.0d))) + (f15 * f8);
        float c2 = C111316b.m151799c(50.0f) / fArr[1];
        double d2 = (double) c2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((double) ((fArr6[2] * cbrt) * f6)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f4)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f5)) / 100.0d, 0.42d), pow2};
        float f17 = fArr7[0];
        float f18 = (f17 * 400.0f) / (f17 + 27.13f);
        float f19 = fArr7[1];
        f333312k = new C111332i(c2, ((f18 * 2.0f) + ((f19 * 400.0f) / (f19 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, f7, 1.0f, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public C111332i(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f333318f = f;
        this.f333313a = f2;
        this.f333314b = f3;
        this.f333315c = f4;
        this.f333316d = f5;
        this.f333317e = f6;
        this.f333319g = fArr;
        this.f333320h = f7;
        this.f333321i = f8;
        this.f333322j = f9;
    }
}
