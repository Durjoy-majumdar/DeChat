package de1;

import android.animation.ValueAnimator;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: de1.e */
public final class C7277e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C7292u f25352d;

    /* renamed from: e */
    public final /* synthetic */ float f25353e;

    public C7277e(C7292u uVar, float f) {
        this.f25352d = uVar;
        this.f25353e = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View bgView = this.f25352d.getBgView();
        float min = Math.min(this.f25353e, 1.0f - valueAnimator.getAnimatedFraction());
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(min));
        View view = bgView;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        bgView.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
