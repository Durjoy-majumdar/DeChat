package com.tencent.p014mm.p136ui;

import android.animation.ValueAnimator;

/* renamed from: com.tencent.mm.ui.n1 */
public class C74799n1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ MMActivityController f219930d;

    public C74799n1(MMActivityController mMActivityController) {
        this.f219930d = mMActivityController;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f219930d.mo177084l0(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
    }
}
