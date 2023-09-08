package de1;

import android.animation.Animator;
import android.view.ViewPropertyAnimator;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: de1.s */
public final class C7291s implements Animator.AnimatorListener {

    /* renamed from: d */
    public final ViewPropertyAnimator f25388d;

    /* renamed from: e */
    public final C32226l<Animator, C13598b0> f25389e;

    public C7291s(ViewPropertyAnimator viewPropertyAnimator, C32226l<? super Animator, C13598b0> lVar) {
        C87412m.m108594g(viewPropertyAnimator, "animator");
        C87412m.m108594g(lVar, "callback");
        this.f25388d = viewPropertyAnimator;
        this.f25389e = lVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "p0");
        this.f25389e.invoke(animator);
        this.f25388d.setListener((Animator.AnimatorListener) null);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
