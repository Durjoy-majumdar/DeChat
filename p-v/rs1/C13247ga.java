package rs1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rs1.ga */
public final class C13247ga extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ View f37608d;

    public C13247ga(View view) {
        this.f37608d = view;
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f37608d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedControlArea$3$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedControlArea$3$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f37608d;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(1.0f));
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedControlArea$3$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedControlArea$3$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f37608d.animate().setListener((Animator.AnimatorListener) null).cancel();
    }
}
