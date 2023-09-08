package com.tencent.p014mm.plugin.scanner.p101ui;

import android.animation.ValueAnimator;
import android.widget.RelativeLayout;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$d */
public class ScanTranslationCaptureUI$$d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f248930d;

    public ScanTranslationCaptureUI$$d(ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f248930d = scanTranslationCaptureUI;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int height = this.f248930d.f347066j.getHeight() + ((RelativeLayout.LayoutParams) this.f248930d.f347066j.getLayoutParams()).bottomMargin;
        this.f248930d.f347066j.setTranslationY(((float) height) * floatValue);
        this.f248930d.f347072s.setTranslationY(floatValue * ((float) (height + this.f248930d.f347072s.getHeight() + ((RelativeLayout.LayoutParams) this.f248930d.f347072s.getLayoutParams()).bottomMargin)));
    }
}
