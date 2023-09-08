package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.scanner.ui.n */
public class C115691n implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f347142d;

    public C115691n(ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f347142d = scanTranslationCaptureUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ScanTranslationCaptureUI scanTranslationCaptureUI = this.f347142d;
        int i2 = ScanTranslationCaptureUI.f347042S;
        scanTranslationCaptureUI.mo175940H7();
        this.f347142d.finish();
        this.f347142d.overridePendingTransition(0, 0);
    }
}
