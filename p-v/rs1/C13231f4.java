package rs1;

import android.animation.ValueAnimator;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rs1.f4 */
public final class C13231f4 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f37580d;

    public C13231f4(View view) {
        this.f37580d = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f37580d;
        float animatedFraction = 0.8f - (valueAnimator.getAnimatedFraction() * 0.7f);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(animatedFraction));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout$showSpeedPlayAnim$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout$showSpeedPlayAnim$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
