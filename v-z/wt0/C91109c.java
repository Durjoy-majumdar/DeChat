package wt0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: wt0.c */
public class C91109c extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C91106a f261298d;

    public C91109c(C91106a aVar) {
        this.f261298d = aVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f261298d.f261295h = null;
    }

    public void onAnimationEnd(Animator animator) {
        this.f261298d.setVisibility(8);
        this.f261298d.f261295h = null;
    }
}
