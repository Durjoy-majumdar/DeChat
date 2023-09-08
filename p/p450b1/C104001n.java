package p450b1;

import gy3.C8480h;
import gy3.C87412m;
import my3.C61595o;

/* renamed from: b1.n */
public final class C104001n extends C103979c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104001n(String str, int i) {
        super(str, C103978b.f307531b, i, (C8480h) null);
        C87412m.m108594g(str, "name");
        int i2 = C103978b.f307534e;
    }

    /* renamed from: a */
    public float[] mo145584a(float[] fArr) {
        C87412m.m108594g(fArr, "v");
        fArr[0] = mo145600f(fArr[0]);
        fArr[1] = mo145600f(fArr[1]);
        fArr[2] = mo145600f(fArr[2]);
        return fArr;
    }

    /* renamed from: b */
    public float mo145585b(int i) {
        return 2.0f;
    }

    /* renamed from: c */
    public float mo145586c(int i) {
        return -2.0f;
    }

    /* renamed from: e */
    public float[] mo145588e(float[] fArr) {
        C87412m.m108594g(fArr, "v");
        fArr[0] = mo145600f(fArr[0]);
        fArr[1] = mo145600f(fArr[1]);
        fArr[2] = mo145600f(fArr[2]);
        return fArr;
    }

    /* renamed from: f */
    public final float mo145600f(float f) {
        return C61595o.m72296d(f, -2.0f, 2.0f);
    }
}
