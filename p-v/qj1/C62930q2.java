package qj1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* renamed from: qj1.q2 */
public final class C62930q2 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C62905o2 f178565d;

    public C62930q2(C62905o2 o2Var) {
        this.f178565d = o2Var;
    }

    public void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        if (this.f178565d.f178521y.getVisibility() == 0 && (animatorSet = this.f178565d.f178509A) != null) {
            animatorSet.start();
        }
    }
}
