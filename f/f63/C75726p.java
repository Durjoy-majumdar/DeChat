package f63;

import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierFingerprintDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: f63.p */
public class C75726p extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WcPayCashierFingerprintDialog f222324g;

    public C75726p(WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog) {
        this.f222324g = wcPayCashierFingerprintDialog;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.WcPayCashierFingerprintDialog", "click back icon");
        this.f222324g.cancel();
    }
}
