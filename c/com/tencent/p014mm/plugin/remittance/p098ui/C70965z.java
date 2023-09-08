package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import android.os.Bundle;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.remittance.ui.z */
public class C70965z implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RemittanceBaseUI f205422d;

    public C70965z(RemittanceBaseUI remittanceBaseUI) {
        this.f205422d = remittanceBaseUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C79143a.m95772k(this.f205422d, "order", "ShowOrdersInfoProcess", (Bundle) null, (C79148e.C79149a) null);
    }
}
