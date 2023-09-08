package yq2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.sns.p104ad.widget.dragad.AdDragViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: yq2.c */
public class C102901c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ AdDragViewContainer f303727d;

    public C102901c(AdDragViewContainer adDragViewContainer) {
        this.f303727d = adDragViewContainer;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$2");
        AdDragViewContainer.m120005a(this.f303727d).setY((float) ((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.f303727d.invalidate();
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$2");
    }
}
