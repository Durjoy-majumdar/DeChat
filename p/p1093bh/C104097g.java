package p1093bh;

import android.animation.Animator;

/* renamed from: bh.g */
public class C104097g implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C104090d f307940d;

    public C104097g(C104090d dVar) {
        this.f307940d = dVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f307940d.f307901C.f332394l = null;
    }

    public void onAnimationEnd(Animator animator) {
        C104090d dVar = this.f307940d;
        dVar.f307901C.f332394l = null;
        dVar.mo145722E();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
