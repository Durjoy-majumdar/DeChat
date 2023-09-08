package com.tencent.p014mm.p136ui;

import android.animation.Animator;
import android.view.View;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.v0 */
public final class C7036v0 implements Animator.AnimatorListener {

    /* renamed from: d */
    public View f24804d;

    /* renamed from: e */
    public C32224a<C13598b0> f24805e;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        C13598b0 b0Var;
        View view = this.f24804d;
        if (view != null) {
            view.setTranslationX(0.0f);
        }
        C32224a<C13598b0> aVar = this.f24805e;
        if (aVar != null) {
            aVar.invoke();
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C85975v4.m106306c("WeUISlideAnimHelper", "HorizontalAnimationListener onAnimationEnd onAnimationEnd：" + this.f24805e, new Object[0]);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
