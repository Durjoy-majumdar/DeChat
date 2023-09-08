package yq2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.sns.p104ad.widget.dragad.AdDragViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: yq2.d */
public class C102902d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ AdDragViewContainer f303728d;

    public C102902d(AdDragViewContainer adDragViewContainer) {
        this.f303728d = adDragViewContainer;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$3");
        AdDragViewContainer.m120005a(this.f303728d).setX((float) ((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.f303728d.invalidate();
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$3");
    }
}
