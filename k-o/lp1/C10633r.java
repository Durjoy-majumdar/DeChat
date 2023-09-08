package lp1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: lp1.r */
public final class C10633r extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C10628q f32044d;

    public C10633r(C10628q qVar) {
        this.f32044d = qVar;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        View view = this.f32044d.f31970d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC$hide$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC$hide$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
