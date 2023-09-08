package jh1;

import android.animation.Animator;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: jh1.i */
public final class C9405i implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f29356d;

    public C9405i(C32224a<C13598b0> aVar) {
        this.f29356d = aVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        C32224a<C13598b0> aVar = this.f29356d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
