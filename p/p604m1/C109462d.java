package p604m1;

import gy3.C87412m;

/* renamed from: m1.d */
public final class C109462d {

    /* renamed from: a */
    public final int f327627a;

    /* renamed from: b */
    public final Float[] f327628b;

    public C109462d(int i) {
        this.f327627a = i;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        this.f327628b = fArr;
    }

    /* renamed from: a */
    public final float mo160697a(C109462d dVar) {
        C87412m.m108594g(dVar, "a");
        int i = this.f327627a;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += this.f327628b[i2].floatValue() * dVar.f327628b[i2].floatValue();
        }
        return f;
    }
}
