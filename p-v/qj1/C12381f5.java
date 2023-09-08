package qj1;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.finder.live.view.FinderMaxSizeLayout;
import gy3.C87412m;

/* renamed from: qj1.f5 */
public final class C12381f5 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C12322e5 f35642d;

    public C12381f5(C12322e5 e5Var) {
        this.f35642d = e5Var;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FinderMaxSizeLayout finderMaxSizeLayout = this.f35642d.f35530u;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        finderMaxSizeLayout.mo3347b(((Integer) animatedValue).intValue(), false);
        this.f35642d.f35530u.requestLayout();
    }
}
