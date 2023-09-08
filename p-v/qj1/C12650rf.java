package qj1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import gy3.C8479f0;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: qj1.rf */
public final class C12650rf implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<ObjectAnimator> f36238d;

    /* renamed from: e */
    public final /* synthetic */ C12522mf f36239e;

    public C12650rf(C8479f0<ObjectAnimator> f0Var, C12522mf mfVar) {
        this.f36238d = f0Var;
        this.f36239e = mfVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        Object target = ((ObjectAnimator) this.f36238d.f27484d).getTarget();
        C87412m.m108592e(target, "null cannot be cast to non-null type android.view.View");
        View view = (View) target;
        this.f36239e.mo10792g(8);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTopCommentPlugin$outAnim$2$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTopCommentPlugin$outAnim$2$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        Object target = ((ObjectAnimator) this.f36238d.f27484d).getTarget();
        C87412m.m108592e(target, "null cannot be cast to non-null type android.view.View");
        View view = (View) target;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTopCommentPlugin$outAnim$2$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTopCommentPlugin$outAnim$2$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f36239e.mo10792g(0);
    }
}
