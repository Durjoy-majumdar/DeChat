package zo1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import gy3.C8477a0;
import kotlin.Result;
import wx3.C15601d;

/* renamed from: zo1.h0 */
public final class C16358h0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f43733d;

    /* renamed from: e */
    public final /* synthetic */ C15601d<Boolean> f43734e;

    public C16358h0(C8477a0 a0Var, C15601d<? super Boolean> dVar) {
        this.f43733d = a0Var;
        this.f43734e = dVar;
    }

    public void onAnimationEnd(Animator animator) {
        C8477a0 a0Var = this.f43733d;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            C15601d<Boolean> dVar = this.f43734e;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        }
    }
}
