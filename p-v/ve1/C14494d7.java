package ve1;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.finder.view.FinderPostProgressView;
import gy3.C87412m;

/* renamed from: ve1.d7 */
public final class C14494d7 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C14506e7 f40182d;

    public C14494d7(C14506e7 e7Var) {
        this.f40182d = e7Var;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FinderPostProgressView p = this.f40182d.mo13768p();
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        p.setProgress(((Integer) animatedValue).intValue());
        this.f40182d.mo13768p().invalidate();
    }
}
