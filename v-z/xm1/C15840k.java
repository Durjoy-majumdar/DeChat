package xm1;

import android.animation.Animator;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: xm1.k */
public final class C15840k implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ View f42662d;

    /* renamed from: e */
    public final /* synthetic */ View f42663e;

    public C15840k(View view, View view2) {
        this.f42662d = view;
        this.f42663e = view2;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.f42662d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$animator$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$animator$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view2 = this.f42663e;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$animator$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$animator$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        View view = this.f42662d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$animator$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$animator$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view2 = this.f42662d;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$animator$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$animator$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
