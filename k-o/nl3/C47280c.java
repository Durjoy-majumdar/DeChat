package nl3;

import android.animation.Animator;

/* renamed from: nl3.c */
public final class C47280c implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C47282e f126911d;

    /* renamed from: e */
    public final /* synthetic */ float f126912e;

    public C47280c(C47282e eVar, float f) {
        this.f126911d = eVar;
        this.f126912e = f;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f126911d.f126923d = this.f126912e;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
