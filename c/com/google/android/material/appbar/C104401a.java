package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.google.android.material.appbar.a */
public class C104401a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ CoordinatorLayout f309109d;

    /* renamed from: e */
    public final /* synthetic */ AppBarLayout f309110e;

    /* renamed from: f */
    public final /* synthetic */ AppBarLayout.BaseBehavior f309111f;

    public C104401a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f309111f = baseBehavior;
        this.f309109d = coordinatorLayout;
        this.f309110e = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f309111f.mo146254E(this.f309109d, this.f309110e, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
