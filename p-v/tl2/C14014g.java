package tl2;

import android.animation.ValueAnimator;
import android.view.View;
import gy3.C87412m;

/* renamed from: tl2.g */
public final class C14014g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f39369d;

    public C14014g(View view) {
        this.f39369d = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f39369d.setRotation(360.0f - Math.abs(((Float) animatedValue).floatValue()));
    }
}
