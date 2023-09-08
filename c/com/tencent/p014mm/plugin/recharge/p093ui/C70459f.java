package com.tencent.p014mm.plugin.recharge.p093ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.recharge.ui.f */
public class C70459f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f203618d;

    /* renamed from: e */
    public final /* synthetic */ PhoneRechargeUI f203619e;

    public C70459f(PhoneRechargeUI phoneRechargeUI, String str) {
        this.f203619e = phoneRechargeUI;
        this.f203618d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String K7 = PhoneRechargeUI.m82987K7(this.f203619e, this.f203618d);
        Log.m105919d("MicroMsg.PhoneRechargeUI", "go to h5: %s", K7);
        PhoneRechargeUI phoneRechargeUI = this.f203619e;
        PhoneRechargeUI.m82988L7(phoneRechargeUI, K7, phoneRechargeUI.getString(C0966R.string.l78), "");
    }
}
