package rs1;

import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rs1.p2 */
public final class C63613p2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f180371d;

    /* renamed from: e */
    public final /* synthetic */ FinderFeedMegaVideoBtnAnimUIC f180372e;

    /* renamed from: f */
    public final /* synthetic */ View f180373f;

    /* renamed from: g */
    public final /* synthetic */ int f180374g;

    /* renamed from: h */
    public final /* synthetic */ int f180375h;

    public C63613p2(View view, FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC, View view2, int i, int i2) {
        this.f180371d = view;
        this.f180372e = finderFeedMegaVideoBtnAnimUIC;
        this.f180373f = view2;
        this.f180374g = i;
        this.f180375h = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.f180373f.getLayoutParams().width = (int) (((float) this.f180371d.getWidth()) - (((float) (this.f180371d.getWidth() - this.f180372e.f162497f)) * animatedFraction));
        this.f180373f.requestLayout();
        this.f180373f.setBackgroundColor(FinderFeedMegaVideoBtnAnimUIC.m65389c3(this.f180372e, animatedFraction, this.f180374g, this.f180375h));
        if (animatedFraction >= 1.0f) {
            View view = this.f180371d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$startDisappearAnim$1$2$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$startDisappearAnim$1$2$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
