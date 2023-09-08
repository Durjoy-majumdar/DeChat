package il1;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import gy3.C87412m;

/* renamed from: il1.z8 */
public final class C60568z8 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C60351b9 f172644d;

    public C60568z8(C60351b9 b9Var) {
        this.f172644d = b9Var;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f172644d.f172022c;
        Drawable background = view != null ? view.getBackground() : null;
        if (background != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            background.setAlpha((int) (((Float) animatedValue).floatValue() * ((float) 255)));
        }
    }
}
