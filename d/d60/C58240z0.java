package d60;

import android.animation.Animator;
import android.view.ViewPropertyAnimator;

/* renamed from: d60.z0 */
public final class C58240z0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C58229y0 f166775d;

    public C58240z0(C58229y0 y0Var) {
        this.f166775d = y0Var;
    }

    public final void run() {
        ViewPropertyAnimator translationY = this.f166775d.f166750n.animate().translationY(0.0f);
        translationY.setListener((Animator.AnimatorListener) null);
        translationY.start();
    }
}
