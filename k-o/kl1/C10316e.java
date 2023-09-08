package kl1;

import android.animation.Animator;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C8477a0;
import wx3.C15601d;

/* renamed from: kl1.e */
public final class C10316e implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C10305d f31432d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f31433e;

    /* renamed from: f */
    public final /* synthetic */ C15601d<Boolean> f31434f;

    public C10316e(C10305d dVar, C8477a0 a0Var, C15601d<? super Boolean> dVar2) {
        this.f31432d = dVar;
        this.f31433e = a0Var;
        this.f31434f = dVar2;
    }

    public void onAnimationCancel(Animator animator) {
        C10305d.m10260g(this.f31433e, this.f31434f, true);
    }

    public void onAnimationEnd(Animator animator) {
        C10305d.m10260g(this.f31433e, this.f31434f, true);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        if (C58739j4.f168176a.mo83692U()) {
            Log.m105924i(this.f31432d.f31410c, "lucianTest alphaOutAnim start!");
        }
    }
}
