package f92;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import gy3.C87412m;

/* renamed from: f92.f */
public final class C107528f extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C107529g f321713d;

    public C107528f(C107529g gVar) {
        this.f321713d = gVar;
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animation");
        AnimatorListenerAdapter animatorListenerAdapter = this.f321713d.f321730w;
        if (!(animatorListenerAdapter == null || animatorListenerAdapter == null)) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
        this.f321713d.setVisibility(8);
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animation");
        AnimatorListenerAdapter animatorListenerAdapter = this.f321713d.f321730w;
        if (animatorListenerAdapter != null && animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }
}
