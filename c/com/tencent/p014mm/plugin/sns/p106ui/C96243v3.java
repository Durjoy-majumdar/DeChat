package com.tencent.p014mm.plugin.sns.p106ui;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.v3 */
public class C96243v3 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ int f281229d;

    /* renamed from: e */
    public final /* synthetic */ SnsBaseGalleryUI f281230e;

    public C96243v3(SnsBaseGalleryUI snsBaseGalleryUI, int i) {
        this.f281230e = snsBaseGalleryUI;
        this.f281229d = i;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$8");
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.1f) {
            SnsBaseGalleryUI.m121912J7(this.f281230e).setAlpha(10.0f * floatValue);
        } else if (floatValue >= 0.9f) {
            SnsBaseGalleryUI.m121912J7(this.f281230e).setAlpha((1.0f - floatValue) * 10.0f);
        }
        SnsBaseGalleryUI.m121912J7(this.f281230e).setTranslationY(floatValue * ((float) (this.f281229d - SnsBaseGalleryUI.m121912J7(this.f281230e).getHeight())));
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$8");
    }
}
