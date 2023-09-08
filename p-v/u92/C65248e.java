package u92;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import gy3.C87412m;
import iy3.C60641c;

/* renamed from: u92.e */
public final class C65248e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ View f187840d;

    /* renamed from: e */
    public final /* synthetic */ View f187841e;

    public C65248e(View view, View view2) {
        this.f187840d = view;
        this.f187841e = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = this.f187840d.getLayoutParams();
        MultiTaskUIC.C115597a aVar = MultiTaskUIC.f346667E;
        layoutParams.height = C60641c.m70921b(((float) (intValue - MultiTaskUIC.f346672J)) * MultiTaskUIC.f346683S0);
        this.f187841e.getLayoutParams().width = intValue;
        this.f187841e.getLayoutParams().height = C60641c.m70921b(((float) intValue) * MultiTaskUIC.f346681R0);
        this.f187841e.requestLayout();
    }
}
