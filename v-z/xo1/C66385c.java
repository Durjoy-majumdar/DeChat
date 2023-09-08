package xo1;

import android.animation.Animator;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: xo1.c */
public final class C66385c implements Animator.AnimatorListener {

    /* renamed from: d */
    public boolean f191109d;

    /* renamed from: e */
    public final /* synthetic */ C66382b f191110e;

    public C66385c(C66382b bVar) {
        this.f191110e = bVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f191109d = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f191109d) {
            if (animator != null) {
                animator.start();
            }
            Log.m105918d(this.f191110e.f191095j, "restart animation");
            return;
        }
        Log.m105918d(this.f191110e.f191095j, "animation cancelled");
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
