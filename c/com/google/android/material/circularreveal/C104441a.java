package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.C104444c;

/* renamed from: com.google.android.material.circularreveal.a */
public final class C104441a {
    /* renamed from: a */
    public static Animator m139619a(C104444c cVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, C104444c.C104446b.f309363a, C104444c.C104445a.f309361b, new C104444c.C104448d[]{new C104444c.C104448d(f, f2, f3)});
        C104444c.C104448d revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f, (int) f2, revealInfo.f309367c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
