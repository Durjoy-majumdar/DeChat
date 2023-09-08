package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i */
public class C95107i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C95094h f276024d;

    public C95107i(C95094h hVar) {
        this.f276024d = hVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp$3");
        if (this.f276024d.f276000u != null) {
            ViewGroup.LayoutParams layoutParams = this.f276024d.f276000u.getLayoutParams();
            layoutParams.width = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f276024d.f276000u.setLayoutParams(layoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp$3");
    }
}
