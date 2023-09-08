package uh1;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import gy3.C87412m;

/* renamed from: uh1.e */
public final class C65371e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C65362c f188155d;

    public C65371e(C65362c cVar) {
        this.f188155d = cVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FrameLayout frameLayout = this.f188155d.f181118s;
        if (frameLayout != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            frameLayout.setBackgroundColor(((Integer) animatedValue).intValue());
        }
    }
}
