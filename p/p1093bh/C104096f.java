package p1093bh;

import android.animation.Animator;

/* renamed from: bh.f */
public class C104096f implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C104090d f307939d;

    public C104096f(C104090d dVar) {
        this.f307939d = dVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f307939d.f307929z = false;
        animator.removeAllListeners();
    }

    public void onAnimationEnd(Animator animator) {
        this.f307939d.f307929z = true;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        C104090d dVar = this.f307939d;
        dVar.f307908J = true;
        dVar.f307929z = true;
    }
}
