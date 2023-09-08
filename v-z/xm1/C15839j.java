package xm1;

import android.animation.ValueAnimator;
import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: xm1.j */
public final class C15839j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f42660d;

    /* renamed from: e */
    public final /* synthetic */ View f42661e;

    public C15839j(View view, View view2) {
        this.f42660d = view;
        this.f42661e = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f42660d;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(floatValue));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$animator$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$animator$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view2 = this.f42661e;
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = 1.0f - ((Float) animatedValue2).floatValue();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(floatValue2));
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$animator$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$renderTagView$startShow$animator$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
