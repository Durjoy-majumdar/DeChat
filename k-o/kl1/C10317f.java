package kl1;

import android.animation.ValueAnimator;
import gy3.C87412m;
import org.libpag.PAGView;

/* renamed from: kl1.f */
public final class C10317f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C10305d f31435d;

    public C10317f(C10305d dVar) {
        this.f31435d = dVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        PAGView e = this.f31435d.f31408a.mo10633e();
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        e.setTranslationX(((Float) animatedValue).floatValue());
    }
}
