package nl3;

import android.animation.ValueAnimator;
import android.view.View;
import gy3.C87412m;

/* renamed from: nl3.b */
public final class C11220b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f33077d;

    public C11220b(View view) {
        this.f33077d = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        View view = this.f33077d;
        if (view != null) {
            view.setTranslationY(floatValue);
        }
    }
}
