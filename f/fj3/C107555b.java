package fj3;

import android.view.animation.CycleInterpolator;

/* renamed from: fj3.b */
public class C107555b extends CycleInterpolator {
    public C107555b(float f) {
        super(f);
    }

    public float getInterpolation(float f) {
        return (float) (1.0d - Math.pow((double) ((f * 2.0f) - 1.0f), 2.0d));
    }
}
