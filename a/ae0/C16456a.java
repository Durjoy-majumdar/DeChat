package ae0;

import android.view.animation.Interpolator;

/* renamed from: ae0.a */
public final class C16456a implements Interpolator {
    public float getInterpolation(float f) {
        if (f < 0.5f) {
            float f2 = f * 2.0f;
            return 0.5f * f2 * f2 * f2 * f2 * f2;
        }
        float f3 = (float) 1;
        float f4 = ((f - 0.5f) * ((float) 2)) - f3;
        return (0.5f * f4 * f4 * f4 * f4 * f4) + f3;
    }
}
