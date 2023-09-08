package jh1;

import android.animation.Animator;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: jh1.h */
public final class C9404h implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f29355d;

    public C9404h(C32224a<C13598b0> aVar) {
        this.f29355d = aVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        C32224a<C13598b0> aVar = this.f29355d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
