package kl1;

import android.animation.Animator;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C8477a0;
import wx3.C15601d;

/* renamed from: kl1.g */
public final class C10318g implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C10305d f31436d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f31437e;

    /* renamed from: f */
    public final /* synthetic */ C15601d<Boolean> f31438f;

    public C10318g(C10305d dVar, C8477a0 a0Var, C15601d<? super Boolean> dVar2) {
        this.f31436d = dVar;
        this.f31437e = a0Var;
        this.f31438f = dVar2;
    }

    public void onAnimationCancel(Animator animator) {
        C10305d.m10261j(this.f31437e, this.f31438f, true);
    }

    public void onAnimationEnd(Animator animator) {
        C10305d.m10261j(this.f31437e, this.f31438f, true);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        if (C58739j4.f168176a.mo83692U()) {
            Log.m105924i(this.f31436d.f31410c, "lucianTest scaleBackAnim start!");
        }
    }
}
