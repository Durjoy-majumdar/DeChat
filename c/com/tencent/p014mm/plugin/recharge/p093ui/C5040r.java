package com.tencent.p014mm.plugin.recharge.p093ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.plugin.recharge.ui.r */
public class C5040r implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f20372d;

    public C5040r(PhoneRechargeUI phoneRechargeUI, int i) {
        this.f20372d = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            C115669n.INSTANCE.mo160131h(17623, Integer.valueOf(this.f20372d), 2);
        }
    }
}
