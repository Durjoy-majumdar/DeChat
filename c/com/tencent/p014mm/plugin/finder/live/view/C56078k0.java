package com.tencent.p014mm.plugin.finder.live.view;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.live.view.k0 */
public final class C56078k0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveExtendReadingEditView f159912d;

    /* renamed from: e */
    public final /* synthetic */ ValueAnimator f159913e;

    public C56078k0(FinderLiveExtendReadingEditView finderLiveExtendReadingEditView, ValueAnimator valueAnimator) {
        this.f159912d = finderLiveExtendReadingEditView;
        this.f159913e = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        String str = this.f159912d.f159710d;
        Log.m105924i(str, "[animatedValue] " + this.f159913e.getAnimatedValue());
        View view = this.f159912d.f159721r;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ((Integer) animatedValue).intValue();
            View view2 = this.f159912d.f159721r;
            if (view2 != null) {
                view2.requestLayout();
            } else {
                C87412m.m108603p("contentView");
                throw null;
            }
        } else {
            C87412m.m108603p("contentView");
            throw null;
        }
    }
}
