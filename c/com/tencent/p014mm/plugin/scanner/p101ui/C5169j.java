package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.DialogInterface;
import di3.C86312j;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.scanner.ui.j */
public class C5169j implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanCardUI f20600d;

    public C5169j(ScanCardUI scanCardUI) {
        this.f20600d = scanCardUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f20600d.getContext());
        ScanCardUI scanCardUI = this.f20600d;
        scanCardUI.f20579g = true;
        scanCardUI.finish();
    }
}
