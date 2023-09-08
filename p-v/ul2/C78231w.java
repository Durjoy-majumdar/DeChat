package ul2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ul2.w */
public final class C78231w extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ View f229193d;

    /* renamed from: e */
    public final /* synthetic */ boolean f229194e;

    /* renamed from: f */
    public final /* synthetic */ AnimatorListenerAdapter f229195f;

    public C78231w(View view, boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f229193d = view;
        this.f229194e = z;
        this.f229195f = animatorListenerAdapter;
    }

    public void onAnimationCancel(Animator animator) {
        AnimatorListenerAdapter animatorListenerAdapter = this.f229195f;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel(animator);
        }
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f229193d;
        int i = this.f229194e ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$animateViewAlpha$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView$animateViewAlpha$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        AnimatorListenerAdapter animatorListenerAdapter = this.f229195f;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
    }

    public void onAnimationPause(Animator animator) {
        AnimatorListenerAdapter animatorListenerAdapter = this.f229195f;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationPause(animator);
        }
    }

    public void onAnimationRepeat(Animator animator) {
        AnimatorListenerAdapter animatorListenerAdapter = this.f229195f;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationRepeat(animator);
        }
    }

    public void onAnimationResume(Animator animator) {
        AnimatorListenerAdapter animatorListenerAdapter = this.f229195f;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationResume(animator);
        }
    }

    public void onAnimationStart(Animator animator) {
        AnimatorListenerAdapter animatorListenerAdapter = this.f229195f;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }
}
