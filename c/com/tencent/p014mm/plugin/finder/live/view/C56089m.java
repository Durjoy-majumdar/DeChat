package com.tencent.p014mm.plugin.finder.live.view;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.live.view.m */
public final class C56089m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C56081l f159949d;

    public C56089m(C56081l lVar) {
        this.f159949d = lVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = this.f159949d.f159928j.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(((Integer) animatedValue).intValue());
        this.f159949d.f159928j.requestLayout();
    }
}
