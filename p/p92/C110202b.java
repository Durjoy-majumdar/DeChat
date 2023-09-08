package p92;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import gy3.C87412m;

/* renamed from: p92.b */
public final class C110202b extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C110204d f329683d;

    public C110202b(C110204d dVar) {
        this.f329683d = dVar;
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animation");
        this.f329683d.mo161609a();
    }
}
