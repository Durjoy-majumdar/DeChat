package p828wa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: wa.h */
public class C53103h extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ Runnable f148195d;

    public C53103h(C53104i iVar, Runnable runnable) {
        this.f148195d = runnable;
    }

    public void onAnimationEnd(Animator animator) {
        Runnable runnable = this.f148195d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
