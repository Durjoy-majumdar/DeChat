package com.tencent.p014mm.plugin.appbrand;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;

/* renamed from: com.tencent.mm.plugin.appbrand.f3 */
public final class C81833f3 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ObjectAnimator f240099d;

    /* renamed from: e */
    public final /* synthetic */ C81931i3 f240100e;

    public C81833f3(ObjectAnimator objectAnimator, C81931i3 i3Var) {
        this.f240099d = objectAnimator;
        this.f240100e = i3Var;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f240099d.cancel();
        this.f240100e.f240304g = false;
    }
}
