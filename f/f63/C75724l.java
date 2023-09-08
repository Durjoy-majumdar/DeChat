package f63;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.C72368e;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierFingerprintDialog;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import pv2.C77290d;
import st1.C77781t;

/* renamed from: f63.l */
public class C75724l extends C30870z1 {

    /* renamed from: e */
    public final /* synthetic */ WcPayCashierDialog f222322e;

    public C75724l(WcPayCashierDialog wcPayCashierDialog) {
        this.f222322e = wcPayCashierDialog;
    }

    /* renamed from: a */
    public void mo57772a(View view) {
        Log.m105925i("MicroMsg.WcPayCashierDialog", "click pay btn: %s", Integer.valueOf(this.f222322e.f210419J));
        PayInfo payInfo = this.f222322e.f210421L;
        C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 20, "");
        this.f222322e.mo99694E();
        WcPayCashierDialog wcPayCashierDialog = this.f222322e;
        int i = wcPayCashierDialog.f210419J;
        if (i == 1) {
            wcPayCashierDialog.getClass();
            Log.m105924i("MicroMsg.WcPayCashierDialog", "go to verify fingerprint");
            WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog = wcPayCashierDialog.f210414E;
            if (wcPayCashierFingerprintDialog != null) {
                wcPayCashierFingerprintDialog.dismiss();
            }
            C77290d.m93104b();
            wcPayCashierDialog.f210425Q = false;
            wcPayCashierDialog.f210414E = new WcPayCashierFingerprintDialog(wcPayCashierDialog.getContext());
            String str = wcPayCashierDialog.f210421L.f212604y;
            if (Util.isNullOrNil(str)) {
                str = wcPayCashierDialog.f210422M.f209539J;
            }
            WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog2 = wcPayCashierDialog.f210414E;
            String str2 = wcPayCashierDialog.f210421L.f212592j;
            wcPayCashierFingerprintDialog2.getClass();
            Log.m105925i("MicroMsg.WcPayCashierFingerprintDialog", "set view data: %s", str2);
            WcPayCashierFingerprintDialog.C72360c cVar = wcPayCashierFingerprintDialog2.f210473i;
            cVar.f210477a = str2;
            cVar.f210478b = str;
            wcPayCashierDialog.f210414E.f210474j = new C72368e(wcPayCashierDialog);
            ((MMActivity) wcPayCashierDialog.f210417H).getLifecycle().addObserver(wcPayCashierDialog.f210414E);
            wcPayCashierDialog.f210414E.show();
            wcPayCashierDialog.f210435d.setVisibility(8);
            C75228t.m90243e0(9, 1);
        } else if (i == 2) {
            wcPayCashierDialog.getClass();
            Log.m105924i("MicroMsg.WcPayCashierDialog", "go to verify faceid");
            C115669n.INSTANCE.mo160131h(15817, 3);
            wcPayCashierDialog.f210425Q = false;
            C77290d.m93104b();
            Bundle bundle = new Bundle();
            bundle.putInt("face_auth_scene", 1);
            ((C77781t) C86312j.m106911c(C77781t.class)).d60((MMActivity) wcPayCashierDialog.f210417H, new C75719g(wcPayCashierDialog), bundle);
            wcPayCashierDialog.f210435d.setVisibility(8);
        } else {
            Log.m105924i("MicroMsg.WcPayCashierDialog", "wrong mode, switch pwd");
            this.f222322e.mo99693D(true);
        }
    }
}
