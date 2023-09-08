package rx0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import gy3.C87412m;

/* renamed from: rx0.l */
public final class C77586l extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C77587m f226188d;

    public C77586l(C77587m mVar) {
        this.f226188d = mVar;
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animation");
        AnimatorListenerAdapter animatorListenerAdapter = this.f226188d.f226198p;
        if (!(animatorListenerAdapter == null || animatorListenerAdapter == null)) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
        this.f226188d.setVisibility(8);
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animation");
        AnimatorListenerAdapter animatorListenerAdapter = this.f226188d.f226198p;
        if (animatorListenerAdapter != null && animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }
}
