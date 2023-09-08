package p450b1;

import gy3.C8480h;
import gy3.C87412m;
import my3.C61595o;

/* renamed from: b1.i */
public final class C103988i extends C103979c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103988i(String str, int i) {
        super(str, C103978b.f307532c, i, (C8480h) null);
        C87412m.m108594g(str, "name");
        int i2 = C103978b.f307534e;
    }

    /* renamed from: a */
    public float[] mo145584a(float[] fArr) {
        C87412m.m108594g(fArr, "v");
        float f = fArr[0];
        float[] fArr2 = C103987h.f307572e;
        float f2 = f / fArr2[0];
        float f3 = fArr[1] / fArr2[1];
        float f4 = fArr[2] / fArr2[2];
        float pow = f2 > 0.008856452f ? (float) Math.pow((double) f2, (double) 0.33333334f) : (f2 * 7.787037f) + 0.13793103f;
        float pow2 = f3 > 0.008856452f ? (float) Math.pow((double) f3, (double) 0.33333334f) : (f3 * 7.787037f) + 0.13793103f;
        float pow3 = f4 > 0.008856452f ? (float) Math.pow((double) f4, (double) 0.33333334f) : (f4 * 7.787037f) + 0.13793103f;
        fArr[0] = C61595o.m72296d((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        fArr[1] = C61595o.m72296d((pow - pow2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = C61595o.m72296d((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    /* renamed from: b */
    public float mo145585b(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    /* renamed from: c */
    public float mo145586c(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    /* renamed from: e */
    public float[] mo145588e(float[] fArr) {
        C87412m.m108594g(fArr, "v");
        fArr[0] = C61595o.m72296d(fArr[0], 0.0f, 100.0f);
        fArr[1] = C61595o.m72296d(fArr[1], -128.0f, 128.0f);
        float d = C61595o.m72296d(fArr[2], -128.0f, 128.0f);
        fArr[2] = d;
        float f = (fArr[0] + 16.0f) / 116.0f;
        float f2 = (fArr[1] * 0.002f) + f;
        float f3 = f - (d * 0.005f);
        float f4 = f2 > 0.20689656f ? f2 * f2 * f2 : (f2 - 0.13793103f) * 0.12841855f;
        float f5 = f > 0.20689656f ? f * f * f : (f - 0.13793103f) * 0.12841855f;
        float f6 = f3 > 0.20689656f ? f3 * f3 * f3 : (f3 - 0.13793103f) * 0.12841855f;
        float[] fArr2 = C103987h.f307572e;
        fArr[0] = f4 * fArr2[0];
        fArr[1] = f5 * fArr2[1];
        fArr[2] = f6 * fArr2[2];
        return fArr;
    }
}
