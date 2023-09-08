package com.google.android.material.bottomappbar;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.bottomappbar.b */
public class C104412b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ BottomAppBar f309152d;

    public C104412b(BottomAppBar bottomAppBar) {
        this.f309152d = bottomAppBar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f309152d.f309144x0.f309164e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f309152d.f309143p0.invalidateSelf();
    }
}
