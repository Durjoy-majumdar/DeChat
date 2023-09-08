package tl2;

import android.animation.Animator;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: tl2.k */
public final class C14015k implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f39370d;

    public C14015k(C32224a<C13598b0> aVar) {
        this.f39370d = aVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f39370d.invoke();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
