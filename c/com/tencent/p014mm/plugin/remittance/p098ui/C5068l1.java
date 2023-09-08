package com.tencent.p014mm.plugin.remittance.p098ui;

import android.animation.ValueAnimator;
import android.view.View;
import gy3.C87412m;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.l1 */
public final class C5068l1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f20422d;

    public C5068l1(C101218e0 e0Var) {
        this.f20422d = e0Var;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f20422d.f296384g;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setPadding(0, 0, 0, ((Integer) animatedValue).intValue());
    }
}
