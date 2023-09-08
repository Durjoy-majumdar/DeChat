package com.google.android.material.bottomappbar;

import android.animation.ValueAnimator;
import p1157t8.C110938c;

/* renamed from: com.google.android.material.bottomappbar.e */
public class C104415e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ BottomAppBar f309159d;

    public C104415e(BottomAppBar bottomAppBar) {
        this.f309159d = bottomAppBar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C110938c cVar = this.f309159d.f309143p0;
        cVar.f331815u = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cVar.invalidateSelf();
    }
}
