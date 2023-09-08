package p853i4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;
import p1042u.C111055b;

/* renamed from: i4.k */
public class C108349k extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C111055b f324385d;

    /* renamed from: e */
    public final /* synthetic */ Transition f324386e;

    public C108349k(Transition transition, C111055b bVar) {
        this.f324386e = transition;
        this.f324385d = bVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f324385d.remove(animator);
        this.f324386e.f306731y.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.f324386e.f306731y.add(animator);
    }
}
