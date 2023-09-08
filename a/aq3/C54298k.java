package aq3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import gy3.C87412m;

/* renamed from: aq3.k */
public final class C54298k extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C92075j f152407d;

    public C54298k(C92075j jVar) {
        this.f152407d = jVar;
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animation");
        this.f152407d.mo126063e3().setAlpha(0.0f);
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animation");
        this.f152407d.mo126063e3().setAlpha(0.0f);
    }
}
