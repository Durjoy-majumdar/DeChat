package p1136n3;

import android.view.animation.Interpolator;

/* renamed from: n3.d */
public abstract class C109680d implements Interpolator {

    /* renamed from: a */
    public final float[] f328320a;

    /* renamed from: b */
    public final float f328321b;

    public C109680d(float[] fArr) {
        this.f328320a = fArr;
        this.f328321b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f328320a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f328321b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f328320a;
        float f4 = fArr2[min];
        return f4 + (f3 * (fArr2[min + 1] - f4));
    }
}
