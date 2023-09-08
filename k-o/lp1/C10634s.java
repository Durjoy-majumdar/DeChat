package lp1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewTreeObserver;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: lp1.s */
public final class C10634s extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C10628q f32045d;

    public C10634s(C10628q qVar) {
        this.f32045d = qVar;
    }

    public void onAnimationEnd(Animator animator, boolean z) {
        ViewTreeObserver viewTreeObserver;
        super.onAnimationEnd(animator, z);
        View view = this.f32045d.f31970d;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f32045d.f32035u);
        }
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        View view = this.f32045d.f31970d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC$innerShow$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC$innerShow$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
