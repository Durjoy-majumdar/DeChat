package lh2;

import android.animation.Animator;
import android.view.ViewGroup;
import gy3.C87412m;

/* renamed from: lh2.d0 */
public final class C109338d0 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C109339f0 f327321d;

    public C109338d0(C109339f0 f0Var) {
        this.f327321d = f0Var;
    }

    public void onAnimationCancel(Animator animator) {
        C87412m.m108594g(animator, "animation");
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animation");
        ViewGroup a = this.f327321d.mo160538a();
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
