package fj3;

import android.view.animation.BounceInterpolator;

/* renamed from: fj3.a */
public class C75768a extends BounceInterpolator {
    public float getInterpolation(float f) {
        double d;
        double d2;
        double d3;
        double d4 = (double) f;
        if (d4 < 0.36363636363636365d) {
            d3 = 7.5625d * d4 * d4;
        } else {
            if (d4 < 0.7272727272727273d) {
                double d5 = (double) ((float) (d4 - 0.5454545454545454d));
                d = 7.5625d * d5 * d5;
                d2 = 0.75d;
            } else {
                double d6 = (double) ((float) (d4 - 0.8181818181818182d));
                d = 7.5625d * d6 * d6;
                d2 = 0.9375d;
            }
            d3 = d + d2;
        }
        return (float) d3;
    }
}
