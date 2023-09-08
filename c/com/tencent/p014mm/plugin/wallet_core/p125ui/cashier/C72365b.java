package com.tencent.p014mm.plugin.wallet_core.p125ui.cashier;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.C72362a;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.b */
public class C72365b implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C72362a f210501d;

    public C72365b(C72362a aVar) {
        this.f210501d = aVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C72362a.C72364b bVar = this.f210501d.f210498v;
        if (bVar != null) {
            WcPayCashierDialog.C72352e eVar = (WcPayCashierDialog.C72352e) bVar;
            Log.m105924i("MicroMsg.WcPayCashierDialog", "on bankcard dialog cancel");
            WcPayCashierDialog wcPayCashierDialog = WcPayCashierDialog.this;
            ((ArrayList) wcPayCashierDialog.f210454x0).remove(wcPayCashierDialog.f210415F.f210499w);
            WcPayCashierDialog wcPayCashierDialog2 = WcPayCashierDialog.this;
            wcPayCashierDialog2.f210415F = null;
            if (eVar.f210463b) {
                wcPayCashierDialog2.show();
            } else {
                wcPayCashierDialog2.show();
            }
        }
    }
}
