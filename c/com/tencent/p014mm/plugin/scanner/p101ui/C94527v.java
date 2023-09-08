package com.tencent.p014mm.plugin.scanner.p101ui;

import android.animation.ValueAnimator;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;

/* renamed from: com.tencent.mm.plugin.scanner.ui.v */
public class C94527v implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ TranslationResultUI f273347d;

    public C94527v(TranslationResultUI translationResultUI) {
        this.f273347d = translationResultUI;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        TranslationResultUI translationResultUI = this.f273347d;
        MultiTouchImageView multiTouchImageView = translationResultUI.f273291p;
        if (multiTouchImageView != null) {
            float f = 1.0f - floatValue;
            multiTouchImageView.setTranslationX(translationResultUI.f273299x * f);
            TranslationResultUI translationResultUI2 = this.f273347d;
            translationResultUI2.f273291p.setTranslationY(translationResultUI2.f273300y * f);
            TranslationResultUI translationResultUI3 = this.f273347d;
            translationResultUI3.f273291p.setScaleX((translationResultUI3.f273297v * f) + floatValue);
            TranslationResultUI translationResultUI4 = this.f273347d;
            translationResultUI4.f273291p.setScaleY((f * translationResultUI4.f273298w) + floatValue);
        }
    }
}
