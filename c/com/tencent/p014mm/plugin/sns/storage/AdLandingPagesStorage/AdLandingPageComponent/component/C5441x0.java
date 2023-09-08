package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.animation.ObjectAnimator;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x0 */
public final class C5441x0 {
    /* renamed from: a */
    public static final ObjectAnimator m5359a(WeakReference weakReference) {
        SnsMethodCalculate.markStartTimeMs("access$startAnimEnter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
        SnsMethodCalculate.markStartTimeMs("startAnimEnter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
        ObjectAnimator objectAnimator = null;
        try {
            View view = (View) weakReference.get();
            if (view == null) {
                SnsMethodCalculate.markEndTimeMs("startAnimEnter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
            } else {
                view.clearAnimation();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(1000);
                ofFloat.start();
                SnsMethodCalculate.markEndTimeMs("startAnimEnter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                objectAnimator = ofFloat;
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Sns.AdLandingPageFloatLinearBtnsLayout", "startAnimEnter error", e);
            SnsMethodCalculate.markEndTimeMs("startAnimEnter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
        }
        SnsMethodCalculate.markEndTimeMs("access$startAnimEnter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
        return objectAnimator;
    }
}
