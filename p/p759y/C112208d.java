package p759y;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import gy3.C87412m;

/* renamed from: y.d */
public final class C112208d {

    /* renamed from: a */
    public static final C112208d f335949a = new C112208d();

    /* renamed from: a */
    public final EdgeEffect mo164025a(Context context, AttributeSet attributeSet) {
        C87412m.m108594g(context, "context");
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* renamed from: b */
    public final float mo164026b(EdgeEffect edgeEffect) {
        C87412m.m108594g(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* renamed from: c */
    public final float mo164027c(EdgeEffect edgeEffect, float f, float f2) {
        C87412m.m108594g(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
