package qj1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: qj1.hg */
public final class C62811hg extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C62777fg f178286d;

    public C62811hg(C62777fg fgVar) {
        this.f178286d = fgVar;
    }

    public void onAnimationEnd(Animator animator) {
        C62777fg.m73850a1(this.f178286d, false);
        this.f178286d.f178194A.mo85383g();
    }
}
