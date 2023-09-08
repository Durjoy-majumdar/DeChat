package com.tencent.p014mm.view;

import android.animation.Animator;

/* renamed from: com.tencent.mm.view.p */
public class C106866p implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ Animator.AnimatorListener f319969d;

    public C106866p(Animator.AnimatorListener animatorListener) {
        this.f319969d = animatorListener;
    }

    public void onAnimationCancel(Animator animator) {
        Animator.AnimatorListener animatorListener = this.f319969d;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    public void onAnimationEnd(Animator animator) {
        Animator.AnimatorListener animatorListener = this.f319969d;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
    }

    public void onAnimationRepeat(Animator animator) {
        Animator.AnimatorListener animatorListener = this.f319969d;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animator);
        }
    }

    public void onAnimationStart(Animator animator) {
        Animator.AnimatorListener animatorListener = this.f319969d;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }
}
