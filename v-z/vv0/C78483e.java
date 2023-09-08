package vv0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13601g;

/* renamed from: vv0.e */
public final class C78483e extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ AnimatorListenerAdapter f229912d;

    /* renamed from: e */
    public final /* synthetic */ int f229913e;

    /* renamed from: f */
    public final /* synthetic */ View f229914f;

    public C78483e(AnimatorListenerAdapter animatorListenerAdapter, int i, View view) {
        this.f229912d = animatorListenerAdapter;
        this.f229913e = i;
        this.f229914f = view;
    }

    public void onAnimationCancel(Animator animator) {
        C13601g gVar = C15010c.f41136a;
        AnimatorListenerAdapter animatorListenerAdapter = this.f229912d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel(animator);
        }
        if (this.f229913e == 2) {
            View view = this.f229914f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public void onAnimationEnd(Animator animator) {
        AnimatorListenerAdapter animatorListenerAdapter = this.f229912d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
        if (this.f229913e == 2) {
            View view = this.f229914f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator$handlePageAnimation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public void onAnimationPause(Animator animator) {
        AnimatorListenerAdapter animatorListenerAdapter = this.f229912d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationPause(animator);
        }
    }

    public void onAnimationRepeat(Animator animator) {
        AnimatorListenerAdapter animatorListenerAdapter = this.f229912d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationRepeat(animator);
        }
    }

    public void onAnimationResume(Animator animator) {
        AnimatorListenerAdapter animatorListenerAdapter = this.f229912d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationResume(animator);
        }
    }

    public void onAnimationStart(Animator animator) {
        Log.m105920e("MicroMsg.FloatBallPageAnimator", "handlePageAnimation start onAnimationStart");
        AnimatorListenerAdapter animatorListenerAdapter = this.f229912d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }
}
