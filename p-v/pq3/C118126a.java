package pq3;

import android.view.animation.Interpolator;

/* renamed from: pq3.a */
public final class C118126a implements Interpolator {

    /* renamed from: a */
    public static float f353130a;

    /* renamed from: b */
    public static float f353131b;

    public C118126a(int i) {
        float a = 1.0f / mo182933a(1.0f);
        f353130a = a;
        f353131b = 1.0f - (a * mo182933a(1.0f));
    }

    /* renamed from: a */
    public final float mo182933a(float f) {
        float f2 = f * 8.0f;
        return f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-((double) f2)))) : ((1.0f - ((float) Math.exp((double) (1.0f - f2)))) * 0.63212055f) + 0.36787945f;
    }

    public float getInterpolation(float f) {
        float a = f353130a * mo182933a(f);
        return a > 0.0f ? a + f353131b : a;
    }
}
