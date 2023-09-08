package oo1;

import android.animation.ValueAnimator;
import gy3.C87412m;
import oo1.C11614d0;

/* renamed from: oo1.e0 */
public final class C11653e0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C11614d0.C11616b f34158d;

    /* renamed from: e */
    public final /* synthetic */ C11614d0.C11619d.C11620a f34159e;

    public C11653e0(C11614d0.C11616b bVar, C11614d0.C11619d.C11620a aVar) {
        this.f34158d = bVar;
        this.f34159e = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f34158d.mo11527b(((Float) animatedValue).floatValue(), this.f34159e);
    }
}
