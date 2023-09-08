package zo1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.tencent.p014mm.sdk.platformtools.Log;
import sx3.C64197v;

/* renamed from: zo1.e0 */
public final class C16354e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C16344b0 f43719d;

    /* renamed from: zo1.e0$a */
    public static final class C16355a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C16344b0 f43720d;

        public C16355a(C16344b0 b0Var) {
            this.f43720d = b0Var;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C16344b0 b0Var = this.f43720d;
            C16344b0.m15193e1(b0Var, b0Var.mo14823b1(), "...", C64197v.m75537f("", ".", "..", "..."), 0, 8, (Object) null);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public C16354e0(C16344b0 b0Var) {
        this.f43719d = b0Var;
    }

    public final void run() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f43719d.mo14825d1(), "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f43719d.mo14824c1(), "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f43719d.mo14823b1(), "alpha", new float[]{0.0f, 1.0f});
        this.f43719d.mo14823b1().setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        C16344b0 b0Var = this.f43719d;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.addListener(new C16355a(b0Var));
        animatorSet.start();
        Log.m105924i(b0Var.f43699r, "start title fade animator!");
    }
}
