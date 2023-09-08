package com.tencent.p014mm.plugin.scanner.p101ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$u */
public class ScanTranslationCaptureUI$$u extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f347101d;

    public ScanTranslationCaptureUI$$u(ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f347101d = scanTranslationCaptureUI;
    }

    public void onAnimationEnd(Animator animator) {
        this.f347101d.f347073t.setAlpha(0.0f);
    }

    public void onAnimationStart(Animator animator) {
        this.f347101d.f347073t.setAlpha(0.0f);
    }
}
