package com.tencent.p014mm.plugin.wallet_core.p125ui.cashier;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.C72362a;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.d */
public class C72367d extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C72362a f210504g;

    public C72367d(C72362a aVar) {
        this.f210504g = aVar;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105918d("MicroMsg.WcPayCashierBankcardDialog", "click bind new card");
        this.f210504g.dismiss();
        C72362a.C72364b bVar = this.f210504g.f210498v;
        if (bVar != null) {
            WcPayCashierDialog.C72352e eVar = (WcPayCashierDialog.C72352e) bVar;
            Log.m105924i("MicroMsg.WcPayCashierDialog", "on click add new bankcard");
            WcPayCashierDialog wcPayCashierDialog = WcPayCashierDialog.this;
            ((ArrayList) wcPayCashierDialog.f210454x0).remove(wcPayCashierDialog.f210415F.f210499w);
            WcPayCashierDialog wcPayCashierDialog2 = WcPayCashierDialog.this;
            wcPayCashierDialog2.f210415F = null;
            WcPayCashierDialog.C72356i iVar = wcPayCashierDialog2.f210445p0;
            if (iVar != null) {
                iVar.mo98829a();
            }
            WcPayCashierDialog.this.dismiss();
        }
    }
}
