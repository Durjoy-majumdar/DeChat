package bw0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: bw0.v */
public class C104180v extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C104181w f308424d;

    public C104180v(C104181w wVar) {
        this.f308424d = wVar;
    }

    public void onAnimationEnd(Animator animator) {
        AnimatorListenerAdapter animatorListenerAdapter = this.f308424d.f308440v;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
        this.f308424d.setVisibility(8);
    }
}
