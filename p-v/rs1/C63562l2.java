package rs1;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC;

/* renamed from: rs1.l2 */
public final class C63562l2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedMegaVideoBtnAnimUIC f180255d;

    /* renamed from: e */
    public final /* synthetic */ View f180256e;

    /* renamed from: f */
    public final /* synthetic */ View f180257f;

    /* renamed from: g */
    public final /* synthetic */ int f180258g;

    /* renamed from: h */
    public final /* synthetic */ int f180259h;

    public C63562l2(FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC, View view, View view2, int i, int i2) {
        this.f180255d = finderFeedMegaVideoBtnAnimUIC;
        this.f180256e = view;
        this.f180257f = view2;
        this.f180258g = i;
        this.f180259h = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.f180257f.getLayoutParams().width = (int) (((float) this.f180255d.f162497f) + (((float) (this.f180256e.getWidth() - this.f180255d.f162497f)) * animatedFraction));
        this.f180257f.requestLayout();
        this.f180257f.setBackgroundColor(FinderFeedMegaVideoBtnAnimUIC.m65389c3(this.f180255d, animatedFraction, this.f180258g, this.f180259h));
        if (animatedFraction > 0.5f) {
            ((TextView) this.f180256e.findViewById(C0966R.C0970id.g75)).setAlpha((animatedFraction - 0.5f) * ((float) 2));
        }
    }
}
