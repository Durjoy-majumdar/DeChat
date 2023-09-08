package kl1;

import android.animation.Animator;
import gy3.C8477a0;
import kotlin.Result;
import wx3.C15601d;

/* renamed from: kl1.h */
public final class C10319h implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f31439d;

    /* renamed from: e */
    public final /* synthetic */ C15601d<Boolean> f31440e;

    public C10319h(C8477a0 a0Var, C15601d<? super Boolean> dVar) {
        this.f31439d = a0Var;
        this.f31440e = dVar;
    }

    public void onAnimationCancel(Animator animator) {
        C8477a0 a0Var = this.f31439d;
        C15601d<Boolean> dVar = this.f31440e;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        }
    }

    public void onAnimationEnd(Animator animator) {
        C8477a0 a0Var = this.f31439d;
        C15601d<Boolean> dVar = this.f31440e;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
