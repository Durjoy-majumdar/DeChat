package a33;

import android.animation.Animator;
import android.view.ViewGroup;
import gy3.C87412m;

/* renamed from: a33.b */
public final class C91948b implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C91950d f263233d;

    public C91948b(C91950d dVar) {
        this.f263233d = dVar;
    }

    public void onAnimationCancel(Animator animator) {
        C87412m.m108594g(animator, "animation");
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animation");
        ViewGroup a = this.f263233d.mo125802a();
        if (a != null) {
            a.requestLayout();
        }
    }

    public void onAnimationRepeat(Animator animator) {
        C87412m.m108594g(animator, "animation");
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animation");
    }
}
