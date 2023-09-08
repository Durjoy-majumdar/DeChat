package com.tencent.p014mm.plugin.finder.p056ui;

import android.animation.ValueAnimator;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.d1 */
public final class C93773d1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ MultiTouchImageView f270657d;

    /* renamed from: e */
    public final /* synthetic */ FinderImagePreviewUI f270658e;

    public C93773d1(MultiTouchImageView multiTouchImageView, FinderImagePreviewUI finderImagePreviewUI) {
        this.f270657d = multiTouchImageView;
        this.f270658e = finderImagePreviewUI;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C87412m.m108594g(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        float f = ((float) 1) - floatValue;
        this.f270657d.setTranslationX(this.f270658e.f270647y * f);
        this.f270657d.setTranslationY(this.f270658e.f270648z * f);
        this.f270657d.setScaleX((this.f270658e.f270645w * f) + floatValue);
        this.f270657d.setScaleY((f * this.f270658e.f270646x) + floatValue);
    }
}
