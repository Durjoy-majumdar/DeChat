package ve1;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.finder.view.FinderPostProgressView;
import gy3.C87412m;

/* renamed from: ve1.p1 */
public final class C14591p1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ FinderPostProgressView f40415d;

    public C14591p1(FinderPostProgressView finderPostProgressView) {
        this.f40415d = finderPostProgressView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FinderPostProgressView finderPostProgressView = this.f40415d;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        finderPostProgressView.setProgress(((Integer) animatedValue).intValue());
        this.f40415d.invalidate();
    }
}
