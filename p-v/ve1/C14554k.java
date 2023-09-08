package ve1;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.finder.view.FinderPostProgressView;
import gy3.C87412m;

/* renamed from: ve1.k */
public final class C14554k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ FinderPostProgressView f40331d;

    public C14554k(FinderPostProgressView finderPostProgressView) {
        this.f40331d = finderPostProgressView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FinderPostProgressView finderPostProgressView = this.f40331d;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        finderPostProgressView.setProgress(((Integer) animatedValue).intValue());
        this.f40331d.invalidate();
    }
}
