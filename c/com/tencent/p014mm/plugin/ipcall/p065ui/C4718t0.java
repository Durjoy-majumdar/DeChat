package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.t0 */
public class C4718t0 implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ IPCallRechargeUI f19724a;

    public C4718t0(IPCallRechargeUI iPCallRechargeUI) {
        this.f19724a = iPCallRechargeUI;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        if (i == 0) {
            Log.m105924i("MicroMsg.IPCallRechargeUI", "start restore");
            this.f19724a.f19525r.mo11893d();
            C115669n.INSTANCE.idkeyStat(257, 14, 1, true);
            Intent intent = new Intent();
            intent.putExtra("key_action_type", 200002);
            intent.putExtra("key_force_google", true);
            C88144b.m109795m(this.f19724a, "wallet_index", ".ui.WalletIapUI", intent, 2002);
            IPCallRechargeUI iPCallRechargeUI = this.f19724a;
            if (iPCallRechargeUI.isFinishing()) {
                Log.m105924i("MicroMsg.IPCallRechargeUI", "[showLoadingDialog] acitivity is finished.");
            } else {
                iPCallRechargeUI.f19529v = C76879j.m92723Q(iPCallRechargeUI.getContext(), iPCallRechargeUI.getString(C0966R.string.a3h), iPCallRechargeUI.getString(C0966R.string.fug), true, false, (DialogInterface.OnCancelListener) null);
            }
        }
    }
}
