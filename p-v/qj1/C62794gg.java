package qj1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: qj1.gg */
public final class C62794gg extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C62777fg f178241d;

    public C62794gg(C62777fg fgVar) {
        this.f178241d = fgVar;
    }

    public void onAnimationEnd(Animator animator) {
        C62777fg.m73850a1(this.f178241d, false);
        this.f178241d.f178195B.mo85377e();
    }
}
