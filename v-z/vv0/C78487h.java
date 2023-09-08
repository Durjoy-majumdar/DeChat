package vv0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: vv0.h */
public class C78487h extends AnimatorListenerAdapter {

    /* renamed from: d */
    public View f229923d;

    /* renamed from: e */
    public AnimatorListenerAdapter f229924e;

    public C78487h(View view, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f229923d = view;
        this.f229924e = animatorListenerAdapter;
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        View view = this.f229923d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ball/animation/ShowAnimatorListenerAdapter", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/ball/animation/ShowAnimatorListenerAdapter", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        AnimatorListenerAdapter animatorListenerAdapter = this.f229924e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel(animator);
        }
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        View view = this.f229923d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ball/animation/ShowAnimatorListenerAdapter", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/ball/animation/ShowAnimatorListenerAdapter", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        AnimatorListenerAdapter animatorListenerAdapter = this.f229924e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
    }

    public void onAnimationPause(Animator animator) {
        super.onAnimationPause(animator);
        AnimatorListenerAdapter animatorListenerAdapter = this.f229924e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationPause(animator);
        }
    }

    public void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        AnimatorListenerAdapter animatorListenerAdapter = this.f229924e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationRepeat(animator);
        }
    }

    public void onAnimationResume(Animator animator) {
        super.onAnimationResume(animator);
        AnimatorListenerAdapter animatorListenerAdapter = this.f229924e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationResume(animator);
        }
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        AnimatorListenerAdapter animatorListenerAdapter = this.f229924e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }
}
