package ai0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ai0.k */
public class C79561k extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ Runnable f233303d;

    public C79561k(C79557i iVar, Runnable runnable) {
        this.f233303d = runnable;
    }

    public void onAnimationEnd(Animator animator) {
        Runnable runnable = this.f233303d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
