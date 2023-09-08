package tr1;

import android.view.animation.Interpolator;

/* renamed from: tr1.a */
public final class C14062a implements Interpolator {
    public C14062a(float f) {
    }

    public float getInterpolation(float f) {
        double d;
        double d2 = (double) f;
        if (d2 < 0.5d) {
            d = (((double) 1.0f) - Math.pow(1.0d - ((double) (((float) 2) * f)), ((double) 0.6f) * 2.0d)) / ((double) 2);
        } else {
            double d3 = (double) 2;
            d = (Math.pow((d2 - 0.5d) * d3, ((double) 0.6f) * 2.0d) / d3) + ((double) 0.5f);
        }
        return (float) d;
    }
}
