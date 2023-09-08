package p1156t;

import android.graphics.drawable.Drawable;

/* renamed from: t.e */
public class C110833e extends Drawable {

    /* renamed from: a */
    public static final double f331580a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    public static final /* synthetic */ int f331581b = 0;

    /* renamed from: a */
    public static float m151026a(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f331580a) * ((double) f2))) : f * 1.5f;
    }
}
