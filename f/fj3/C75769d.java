package fj3;

import android.view.animation.DecelerateInterpolator;

/* renamed from: fj3.d */
public class C75769d extends DecelerateInterpolator {
    public float getInterpolation(float f) {
        if (((double) f) <= 0.5d) {
            return super.getInterpolation(f * 2.0f);
        }
        return 1.0f;
    }
}
