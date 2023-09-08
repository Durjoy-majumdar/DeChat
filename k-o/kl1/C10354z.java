package kl1;

import android.animation.ValueAnimator;
import gy3.C87412m;

/* renamed from: kl1.z */
public final class C10354z implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C10301b0 f31534d;

    public C10354z(C10301b0 b0Var) {
        this.f31534d = b0Var;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C10301b0 b0Var = this.f31534d;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        b0Var.f31400g = ((Float) animatedValue).floatValue();
        C10301b0 b0Var2 = this.f31534d;
        if (((double) b0Var2.f31400g) >= b0Var2.f31397d) {
            b0Var2.mo10610a().cancel();
        }
        this.f31534d.f31394a.invalidate();
    }
}
