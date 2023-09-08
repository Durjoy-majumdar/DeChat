package com.google.android.material.appbar;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.appbar.b */
public class C104402b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ CollapsingToolbarLayout f309112d;

    public C104402b(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f309112d = collapsingToolbarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f309112d.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
