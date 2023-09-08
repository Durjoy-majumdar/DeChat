package yz2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: yz2.l0 */
public final class C53694l0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f150788d;

    public C53694l0(C32224a<C13598b0> aVar) {
        this.f150788d = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C32224a<C13598b0> aVar = this.f150788d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
