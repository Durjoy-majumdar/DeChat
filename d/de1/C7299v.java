package de1;

import android.animation.ValueAnimator;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: de1.v */
public final class C7299v implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C7292u f25401d;

    public C7299v(C7292u uVar) {
        this.f25401d = uVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View bgView = this.f25401d.getBgView();
        float max = Math.max(this.f25401d.getBgView().getAlpha(), valueAnimator.getAnimatedFraction());
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(max));
        View view = bgView;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout$onTouchCancel$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        bgView.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout$onTouchCancel$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
