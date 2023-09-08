package ve1;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.finder.view.FinderPostProgressView;
import gy3.C87412m;

/* renamed from: ve1.h3 */
public final class C14538h3 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ FinderPostProgressView f40291d;

    public C14538h3(FinderPostProgressView finderPostProgressView) {
        this.f40291d = finderPostProgressView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FinderPostProgressView finderPostProgressView = this.f40291d;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        finderPostProgressView.setProgress(((Integer) animatedValue).intValue());
        this.f40291d.invalidate();
    }
}
