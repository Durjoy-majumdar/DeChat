package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$l */
public class ScanTranslationCaptureUI$$l implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f347091d;

    public ScanTranslationCaptureUI$$l(ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f347091d = scanTranslationCaptureUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ScanTranslationCaptureUI scanTranslationCaptureUI = this.f347091d;
        scanTranslationCaptureUI.f347044B = true;
        scanTranslationCaptureUI.finish();
    }
}
