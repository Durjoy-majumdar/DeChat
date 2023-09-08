package p853i4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;

/* renamed from: i4.l */
public class C108350l extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ Transition f324387d;

    public C108350l(Transition transition) {
        this.f324387d = transition;
    }

    public void onAnimationEnd(Animator animator) {
        this.f324387d.mo145336q();
        animator.removeListener(this);
    }
}
