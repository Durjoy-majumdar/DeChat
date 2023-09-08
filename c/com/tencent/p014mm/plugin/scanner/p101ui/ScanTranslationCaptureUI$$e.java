package com.tencent.p014mm.plugin.scanner.p101ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$e */
public class ScanTranslationCaptureUI$$e extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f347085d;

    public ScanTranslationCaptureUI$$e(ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f347085d = scanTranslationCaptureUI;
    }

    public void onAnimationEnd(Animator animator) {
        ScanTranslationCaptureUI scanTranslationCaptureUI = this.f347085d;
        scanTranslationCaptureUI.f347052J = false;
        scanTranslationCaptureUI.f347043A.setVisibility(8);
    }
}
