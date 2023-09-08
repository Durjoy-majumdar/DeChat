package p759y;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import gy3.C87412m;

/* renamed from: y.a0 */
public final class C112193a0 {

    /* renamed from: a */
    public static final C112193a0 f335896a = new C112193a0();

    /* renamed from: a */
    public final EdgeEffect mo163999a(Context context, AttributeSet attributeSet) {
        C87412m.m108594g(context, "context");
        return Build.VERSION.SDK_INT >= 31 ? C112208d.f335949a.mo164025a(context, attributeSet) : new EdgeEffect(context);
    }

    /* renamed from: b */
    public final float mo164000b(EdgeEffect edgeEffect) {
        C87412m.m108594g(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C112208d.f335949a.mo164026b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public final float mo164001c(EdgeEffect edgeEffect, float f, float f2) {
        C87412m.m108594g(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C112208d.f335949a.mo164027c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }
}
