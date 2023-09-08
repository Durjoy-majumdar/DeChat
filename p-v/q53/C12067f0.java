package q53;

import android.animation.ValueAnimator;
import android.view.View;
import gy3.C87412m;
import qo3.C101218e0;

/* renamed from: q53.f0 */
public final class C12067f0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f35150d;

    public C12067f0(C101218e0 e0Var) {
        this.f35150d = e0Var;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f35150d.f296384g;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setPadding(0, 0, 0, ((Integer) animatedValue).intValue());
    }
}
