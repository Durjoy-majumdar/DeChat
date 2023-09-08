package qj1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: qj1.jg */
public final class C62836jg extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C62777fg f178332d;

    public C62836jg(C62777fg fgVar) {
        this.f178332d = fgVar;
    }

    public void onAnimationEnd(Animator animator) {
        C62777fg.m73850a1(this.f178332d, false);
        this.f178332d.f178196C.mo85431d();
    }
}
