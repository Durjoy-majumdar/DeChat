package aq3;

import android.animation.ValueAnimator;
import gy3.C87412m;

/* renamed from: aq3.l */
public final class C54299l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C92075j f152408d;

    /* renamed from: e */
    public final /* synthetic */ int f152409e;

    public C54299l(C92075j jVar, int i) {
        this.f152408d = jVar;
        this.f152409e = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        if (floatValue <= 0.1f) {
            this.f152408d.mo126063e3().setAlpha(((float) 10) * floatValue);
        } else if (floatValue >= 0.9f) {
            this.f152408d.mo126063e3().setAlpha((1.0f - floatValue) * ((float) 10));
        }
        this.f152408d.mo126063e3().setTranslationY(floatValue * ((float) (this.f152409e - this.f152408d.mo126063e3().getHeight())));
    }
}
