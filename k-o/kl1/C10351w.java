package kl1;

import android.animation.Animator;

/* renamed from: kl1.w */
public final class C10351w implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C10346v f31530d;

    public C10351w(C10346v vVar) {
        this.f31530d = vVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        C10346v.m10277b(this.f31530d);
        C10346v.m10276a(this.f31530d);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.f31530d.f31512a.setVisibility(0);
    }
}
