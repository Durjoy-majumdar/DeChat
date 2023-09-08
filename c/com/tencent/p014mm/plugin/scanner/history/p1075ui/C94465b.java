package com.tencent.p014mm.plugin.scanner.history.p1075ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.scanner.C71030z;

/* renamed from: com.tencent.mm.plugin.scanner.history.ui.b */
public class C94465b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScannerHistoryUI f273140d;

    public C94465b(ScannerHistoryUI scannerHistoryUI) {
        this.f273140d = scannerHistoryUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C71030z.vx0().wx0().f97478d.execSQL("ScanHistoryItem", "delete from ScanHistoryItem");
        ScannerHistoryUI scannerHistoryUI = this.f273140d;
        int i2 = ScannerHistoryUI.f273123i;
        scannerHistoryUI.mo129941H7();
        this.f273140d.f273126f.mo7991f();
    }
}
