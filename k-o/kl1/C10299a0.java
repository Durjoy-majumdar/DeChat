package kl1;

import android.animation.Animator;

/* renamed from: kl1.a0 */
public final class C10299a0 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C10301b0 f31391d;

    public C10299a0(C10301b0 b0Var) {
        this.f31391d = b0Var;
    }

    public void onAnimationCancel(Animator animator) {
        C10301b0 b0Var = this.f31391d;
        b0Var.f31398e = false;
        b0Var.f31394a.invalidate();
    }

    public void onAnimationEnd(Animator animator) {
        C10301b0 b0Var = this.f31391d;
        b0Var.f31398e = false;
        b0Var.f31394a.invalidate();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        C10301b0 b0Var = this.f31391d;
        b0Var.f31400g = 0.0f;
        b0Var.f31398e = true;
        b0Var.f31394a.invalidate();
    }
}
