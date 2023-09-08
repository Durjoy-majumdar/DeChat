package yq2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.sns.p104ad.widget.dragad.AdDragViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: yq2.e */
public class C102903e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ AdDragViewContainer f303729d;

    public C102903e(AdDragViewContainer adDragViewContainer) {
        this.f303729d = adDragViewContainer;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$5");
        AdDragViewContainer.m120005a(this.f303729d).setY((float) ((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.f303729d.invalidate();
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$5");
    }
}
