package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71642m1;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import lp3.C88633e;
import lp3.C88643g;
import qo3.C101218e0;
import te3.C77969n9;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.k2 */
public class C71805k2 implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C101218e0 f208337a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtSaveFetchUI f208338b;

    public C71805k2(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C101218e0 e0Var) {
        this.f208338b = walletLqtSaveFetchUI;
        this.f208337a = e0Var;
    }

    /* renamed from: a */
    public void mo2001a() {
        Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "click fetch");
        WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208338b;
        int i = WalletLqtSaveFetchUI.f208151m1;
        walletLqtSaveFetchUI.getClass();
        Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "beginSlowRedeemProcess()");
        int S7 = walletLqtSaveFetchUI.mo98980S7(walletLqtSaveFetchUI.f208199i.getText(), "100");
        if (S7 > 0) {
            walletLqtSaveFetchUI.hideWcKb();
            if (walletLqtSaveFetchUI.f208173T == 2) {
                Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "click fetch lqt");
                if (!walletLqtSaveFetchUI.mo98988a8(C71654w.f207659q.f207674m)) {
                    C77969n9 n9Var = null;
                    Bankcard bankcard = walletLqtSaveFetchUI.f208177V;
                    if (bankcard != null && !bankcard.mo99388n2()) {
                        n9Var = new C77969n9();
                        Bankcard bankcard2 = walletLqtSaveFetchUI.f208177V;
                        n9Var.f227883f = bankcard2.field_bankName;
                        n9Var.f227882e = bankcard2.field_bankcardType;
                        n9Var.f227881d = bankcard2.field_bindSerial;
                        n9Var.f227884g = bankcard2.field_bankcardTail;
                    }
                    C71642m1.C71643a aVar = walletLqtSaveFetchUI.f208195g.f207644c;
                    int i2 = walletLqtSaveFetchUI.f208208p0;
                    aVar.getClass();
                    ((C88633e) C88643g.m110550h(Integer.valueOf(S7), Integer.valueOf(i2), 1, n9Var)).mo123061d(aVar).mo123062e(new C71816o2(walletLqtSaveFetchUI, S7)).mo123065b(new C71813n2(walletLqtSaveFetchUI));
                }
            }
        }
        this.f208337a.mo140680z();
        C115669n.INSTANCE.mo160131h(20287, 6);
    }
}
