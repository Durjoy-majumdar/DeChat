package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.scanner.ui.k */
public class C5170k implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanCardUI f20601d;

    public C5170k(ScanCardUI scanCardUI) {
        this.f20601d = scanCardUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ScanCardUI scanCardUI = this.f20601d;
        scanCardUI.f20579g = true;
        scanCardUI.finish();
    }
}
