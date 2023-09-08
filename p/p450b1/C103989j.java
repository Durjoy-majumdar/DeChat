package p450b1;

import gy3.C8480h;
import gy3.C87412m;
import my3.C61595o;

/* renamed from: b1.j */
public final class C103989j extends C103979c {

    /* renamed from: d */
    public static final float[] f307573d;

    /* renamed from: e */
    public static final float[] f307574e;

    /* renamed from: f */
    public static final float[] f307575f;

    /* renamed from: g */
    public static final float[] f307576g;

    static {
        float[] f = C103980d.m138718f(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, C103980d.m138714b(C103976a.f307528b.f307529a, new float[]{0.34567f / 0.3585f, 1.0f, ((1.0f - 0.34567f) - 0.3585f) / 0.3585f}, new float[]{0.31271f / 0.32902f, 1.0f, ((1.0f - 0.31271f) - 0.32902f) / 0.32902f}));
        f307573d = f;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f307574e = fArr;
        f307575f = C103980d.m138717e(f);
        f307576g = C103980d.m138717e(fArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103989j(String str, int i) {
        super(str, C103978b.f307532c, i, (C8480h) null);
        C87412m.m108594g(str, "name");
        int i2 = C103978b.f307534e;
    }

    /* renamed from: a */
    public float[] mo145584a(float[] fArr) {
        C87412m.m108594g(fArr, "v");
        C103980d.m138720h(f307573d, fArr);
        double d = (double) 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow((double) Math.abs(fArr[0]), d));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow((double) Math.abs(fArr[1]), d));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow((double) Math.abs(fArr[2]), d));
        C103980d.m138720h(f307574e, fArr);
        return fArr;
    }

    /* renamed from: b */
    public float mo145585b(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    /* renamed from: c */
    public float mo145586c(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    /* renamed from: e */
    public float[] mo145588e(float[] fArr) {
        C87412m.m108594g(fArr, "v");
        fArr[0] = C61595o.m72296d(fArr[0], 0.0f, 1.0f);
        fArr[1] = C61595o.m72296d(fArr[1], -0.5f, 0.5f);
        fArr[2] = C61595o.m72296d(fArr[2], -0.5f, 0.5f);
        C103980d.m138720h(f307576g, fArr);
        float f = fArr[0];
        fArr[0] = f * f * f;
        float f2 = fArr[1];
        fArr[1] = f2 * f2 * f2;
        float f3 = fArr[2];
        fArr[2] = f3 * f3 * f3;
        C103980d.m138720h(f307575f, fArr);
        return fArr;
    }
}
