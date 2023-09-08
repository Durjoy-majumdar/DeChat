package yq2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.sns.p104ad.widget.dragad.AdDragViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: yq2.b */
public class C102900b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ AdDragViewContainer f303726d;

    public C102900b(AdDragViewContainer adDragViewContainer) {
        this.f303726d = adDragViewContainer;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$1");
        AdDragViewContainer.m120005a(this.f303726d).setX((float) ((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.f303726d.invalidate();
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$1");
    }
}
