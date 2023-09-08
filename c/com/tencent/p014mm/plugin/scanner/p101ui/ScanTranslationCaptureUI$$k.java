package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.DialogInterface;
import di3.C86312j;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$k */
public class ScanTranslationCaptureUI$$k implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationCaptureUI f347090d;

    public ScanTranslationCaptureUI$$k(ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f347090d = scanTranslationCaptureUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f347090d.getContext());
        ScanTranslationCaptureUI scanTranslationCaptureUI = this.f347090d;
        scanTranslationCaptureUI.f347044B = true;
        scanTranslationCaptureUI.finish();
    }
}
