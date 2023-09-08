package vv0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: vv0.g */
public class C78486g extends AnimatorListenerAdapter {

    /* renamed from: d */
    public View f229921d;

    /* renamed from: e */
    public AnimatorListenerAdapter f229922e;

    public C78486g(View view, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f229921d = view;
        this.f229922e = animatorListenerAdapter;
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        View view = this.f229921d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ball/animation/HideAnimatorListenerAdapter", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/ball/animation/HideAnimatorListenerAdapter", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        AnimatorListenerAdapter animatorListenerAdapter = this.f229922e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel(animator);
        }
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        View view = this.f229921d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ball/animation/HideAnimatorListenerAdapter", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/ball/animation/HideAnimatorListenerAdapter", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        AnimatorListenerAdapter animatorListenerAdapter = this.f229922e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
    }

    public void onAnimationPause(Animator animator) {
        super.onAnimationPause(animator);
        AnimatorListenerAdapter animatorListenerAdapter = this.f229922e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationPause(animator);
        }
    }

    public void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        AnimatorListenerAdapter animatorListenerAdapter = this.f229922e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationRepeat(animator);
        }
    }

    public void onAnimationResume(Animator animator) {
        super.onAnimationResume(animator);
        AnimatorListenerAdapter animatorListenerAdapter = this.f229922e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationResume(animator);
        }
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        AnimatorListenerAdapter animatorListenerAdapter = this.f229922e;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }
}
