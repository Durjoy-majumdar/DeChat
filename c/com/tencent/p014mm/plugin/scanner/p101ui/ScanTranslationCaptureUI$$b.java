package com.tencent.p014mm.plugin.scanner.p101ui;

import android.animation.ValueAnimator;
import android.widget.ImageView;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$b */
public class ScanTranslationCaptureUI$$b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f347084d;

    public ScanTranslationCaptureUI$$b(ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f347084d = scanTranslationCaptureUI;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.1f) {
            this.f347084d.f347073t.setAlpha(10.0f * floatValue);
        } else if (floatValue >= 0.9f) {
            this.f347084d.f347073t.setAlpha((1.0f - floatValue) * 10.0f);
        }
        ScanTranslationCaptureUI scanTranslationCaptureUI = this.f347084d;
        ImageView imageView = scanTranslationCaptureUI.f347073t;
        imageView.setTranslationY(floatValue * ((float) (scanTranslationCaptureUI.f347048F - imageView.getHeight())));
    }
}
