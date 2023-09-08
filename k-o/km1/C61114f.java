package km1;

import android.animation.ValueAnimator;
import android.widget.RelativeLayout;
import gy3.C87412m;

/* renamed from: km1.f */
public final class C61114f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C61117j f173988d;

    public C61114f(C61117j jVar) {
        this.f173988d = jVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        RelativeLayout relativeLayout = this.f173988d.f173998h;
        if (relativeLayout != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            relativeLayout.setBackgroundColor(((Integer) animatedValue).intValue());
        }
    }
}
