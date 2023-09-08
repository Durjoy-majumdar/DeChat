package sp1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: sp1.m0 */
public final class C64105m0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C64100l0 f181765d;

    public C64105m0(C64100l0 l0Var) {
        this.f181765d = l0Var;
    }

    public void onAnimationEnd(Animator animator) {
        this.f181765d.f181745d.setTranslationY(0.0f);
    }
}
