package f63;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: f63.h */
public class C75720h extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WcPayCashierDialog f222318g;

    public C75720h(WcPayCashierDialog wcPayCashierDialog) {
        this.f222318g = wcPayCashierDialog;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.WcPayCashierDialog", "click close icon");
        this.f222318g.cancel();
    }
}
