package com.tencent.p014mm.plugin.recharge.p093ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import y43.C79037y;

/* renamed from: com.tencent.mm.plugin.recharge.ui.q */
public class C70471q implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79037y f203664d;

    /* renamed from: e */
    public final /* synthetic */ int f203665e;

    /* renamed from: f */
    public final /* synthetic */ PhoneRechargeUI f203666f;

    public C70471q(PhoneRechargeUI phoneRechargeUI, C79037y yVar, int i) {
        this.f203666f = phoneRechargeUI;
        this.f203664d = yVar;
        this.f203665e = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        PhoneRechargeUI.m82985I7(this.f203666f, this.f203664d);
        C115669n.INSTANCE.mo160131h(17623, Integer.valueOf(this.f203665e), 1);
    }
}
