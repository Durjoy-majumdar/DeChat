package rs1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rs1.ea */
public final class C13221ea extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ View f37558d;

    public C13221ea(View view) {
        this.f37558d = view;
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f37558d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$hideSpeedControlArea$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$hideSpeedControlArea$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f37558d.animate().setListener((Animator.AnimatorListener) null).cancel();
    }
}
