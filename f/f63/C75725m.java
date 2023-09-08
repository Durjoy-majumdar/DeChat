package f63;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: f63.m */
public class C75725m extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WcPayCashierDialog f222323g;

    public C75725m(WcPayCashierDialog wcPayCashierDialog) {
        this.f222323g = wcPayCashierDialog;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105918d("MicroMsg.WcPayCashierDialog", "click pay way btn");
        WcPayCashierDialog.m84669c(this.f222323g);
    }
}
