package com.tencent.p014mm.plugin.wallet_core.p125ui.cashier;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierFingerprintDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.f */
public class C72369f extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WcPayCashierFingerprintDialog f210506g;

    public C72369f(WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog) {
        this.f210506g = wcPayCashierFingerprintDialog;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.WcPayCashierFingerprintDialog", "click switch payway");
        this.f210506g.dismiss();
        WcPayCashierFingerprintDialog.C72361d dVar = this.f210506g.f210474j;
        if (dVar != null) {
            C72368e eVar = (C72368e) dVar;
            eVar.getClass();
            Log.m105924i("MicroMsg.WcPayCashierDialog", "switch pay way");
            WcPayCashierDialog wcPayCashierDialog = eVar.f210505a;
            wcPayCashierDialog.f210425Q = true;
            wcPayCashierDialog.f210435d.setVisibility(0);
            WcPayCashierDialog wcPayCashierDialog2 = eVar.f210505a;
            wcPayCashierDialog2.f210414E = null;
            WcPayCashierDialog.m84669c(wcPayCashierDialog2);
        }
    }
}
