package it0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: it0.e */
public final class C76373e extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ AnimatorListenerAdapter f223655d;

    /* renamed from: e */
    public final /* synthetic */ HalfScreenManger f223656e;

    public C76373e(AnimatorListenerAdapter animatorListenerAdapter, HalfScreenManger halfScreenManger) {
        this.f223655d = animatorListenerAdapter;
        this.f223656e = halfScreenManger;
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        AnimatorListenerAdapter animatorListenerAdapter = this.f223655d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel(animator);
        }
        this.f223656e.getClass();
        for (C32224a<C13598b0> invoke : this.f223656e.f247575h) {
            invoke.invoke();
        }
        this.f223656e.f247575h.clear();
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        AnimatorListenerAdapter animatorListenerAdapter = this.f223655d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
        this.f223656e.getClass();
        for (C32224a<C13598b0> invoke : this.f223656e.f247575h) {
            invoke.invoke();
        }
        this.f223656e.f247575h.clear();
    }

    public void onAnimationPause(Animator animator) {
        super.onAnimationPause(animator);
        AnimatorListenerAdapter animatorListenerAdapter = this.f223655d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationPause(animator);
        }
    }

    public void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        AnimatorListenerAdapter animatorListenerAdapter = this.f223655d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationRepeat(animator);
        }
    }

    public void onAnimationResume(Animator animator) {
        super.onAnimationResume(animator);
        AnimatorListenerAdapter animatorListenerAdapter = this.f223655d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationResume(animator);
        }
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        AnimatorListenerAdapter animatorListenerAdapter = this.f223655d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
        this.f223656e.getClass();
    }
}
