package rs1;

import android.animation.ValueAnimator;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rs1.c4 */
public final class C13137c4 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f37379d;

    public C13137c4(View view) {
        this.f37379d = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f37379d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf((valueAnimator.getAnimatedFraction() * 0.7f) + 0.1f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout$showSpeedPlayAnim$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHDRVideoOrientationUIC$HDRHorizontalVideoPreviewLayout$showSpeedPlayAnim$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
