package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.remittance.p098ui.C70900k;

/* renamed from: com.tencent.mm.plugin.remittance.ui.n */
public class C70925n implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70900k f205366d;

    public C70925n(C70900k kVar) {
        this.f205366d = kVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C70900k.C70904d dVar = this.f205366d.f205320b;
        if (dVar != null) {
            dVar.onCancel();
        }
    }
}
