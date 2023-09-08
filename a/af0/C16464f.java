package af0;

import android.view.animation.Interpolator;

/* renamed from: af0.f */
public class C16464f implements Interpolator {
    public float getInterpolation(float f) {
        if (f >= 0.9f) {
            return 1.0f - ((f - 0.9f) * 10.0f);
        }
        return 1.0f;
    }
}
