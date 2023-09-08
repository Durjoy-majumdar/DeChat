package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.remittance.p098ui.C70900k;

/* renamed from: com.tencent.mm.plugin.remittance.ui.i */
public class C70895i implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70900k f205307d;

    public C70895i(C70900k kVar) {
        this.f205307d = kVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C70900k.C70904d dVar = this.f205307d.f205320b;
        if (dVar != null) {
            dVar.onCancel();
        }
    }
}
