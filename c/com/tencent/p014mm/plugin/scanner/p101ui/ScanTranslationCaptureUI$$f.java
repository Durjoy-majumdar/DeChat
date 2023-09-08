package com.tencent.p014mm.plugin.scanner.p101ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.autogen.events.PlayScanTranslateAnimEvent;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$f */
public class ScanTranslationCaptureUI$$f extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f347086d;

    public ScanTranslationCaptureUI$$f(ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f347086d = scanTranslationCaptureUI;
    }

    public void onAnimationEnd(Animator animator) {
        PlayScanTranslateAnimEvent playScanTranslateAnimEvent = new PlayScanTranslateAnimEvent();
        playScanTranslateAnimEvent.f343590d.f343591a = 3;
        playScanTranslateAnimEvent.publish();
        ScanTranslationCaptureUI scanTranslationCaptureUI = this.f347086d;
        scanTranslationCaptureUI.f347052J = false;
        scanTranslationCaptureUI.mo175940H7();
        this.f347086d.finish();
    }
}
