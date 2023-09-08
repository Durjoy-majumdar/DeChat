package zl3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: zl3.e */
public final class C16296e extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f43596d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f43597e;

    public C16296e(C32224a<C13598b0> aVar, ViewPropertyAnimator viewPropertyAnimator) {
        this.f43596d = aVar;
        this.f43597e = viewPropertyAnimator;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C32224a<C13598b0> aVar = this.f43596d;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f43597e.setListener((Animator.AnimatorListener) null);
    }
}
