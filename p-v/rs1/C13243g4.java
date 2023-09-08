package rs1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import rs1.C13539y3;

/* renamed from: rs1.g4 */
public final class C13243g4 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C13539y3.C13540a f37603d;

    public C13243g4(C13539y3.C13540a aVar) {
        this.f37603d = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.f37603d.f38412B.getVisibility() == 0) {
            AnimatorSet animatorSet = this.f37603d.f38413C;
            if (animatorSet != null) {
                animatorSet.setStartDelay(300);
            }
            AnimatorSet animatorSet2 = this.f37603d.f38413C;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
    }
}
