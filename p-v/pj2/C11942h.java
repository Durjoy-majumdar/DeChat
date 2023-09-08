package pj2;

import android.animation.ValueAnimator;
import android.view.View;
import gy3.C87412m;
import jq3.C60905o;

/* renamed from: pj2.h */
public final class C11942h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f34876d;

    public C11942h(C60905o oVar) {
        this.f34876d = oVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f34876d.f44854d;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setBackgroundColor(((Integer) animatedValue).intValue());
    }
}
