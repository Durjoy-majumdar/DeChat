package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import di3.C86312j;
import ie3.C76324c;
import ke3.C88144b;
import p626nv.C109759g;
import xi2.C78843b;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$d0 */
public class WalletOfflineCoinPurseUI$$d0 extends WalletOfflineCoinPurseUI$$a0 {

    /* renamed from: g */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201943g;

    /* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$d0$a */
    public class C69977a extends C7089c0 {
        public C69977a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            WalletOfflineCoinPurseUI$$d0.this.f201943g.f201908w1 = false;
            WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new WCPayTransferToPhoneActionReportStruct();
            wCPayTransferToPhoneActionReportStruct.f194684d = 3;
            wCPayTransferToPhoneActionReportStruct.mo86054n();
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(20);
            WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = WalletOfflineCoinPurseUI$$d0.this.f201943g;
            int i = walletOfflineCoinPurseUI.f201858V0;
            if (i == 1) {
                C78843b.f231662a = 1;
            } else if (i != 2) {
                C78843b.f231662a = 0;
            } else {
                C78843b.f231662a = 21;
            }
            if (walletOfflineCoinPurseUI.f201898r1) {
                C88144b.m109789g(walletOfflineCoinPurseUI.getContext(), "remittance", ".mobile.ui.BankMobileRemittanceChooseUI");
            } else if (!((C76324c) C86312j.m106911c(C76324c.class)).tryStartTransferToBankUseCase((String) null, (C76324c.C76325a) null)) {
                C88144b.m109789g(WalletOfflineCoinPurseUI$$d0.this.f201943g.getContext(), "remittance", ".bankcard.ui.BankRemitBankcardInputUI");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletOfflineCoinPurseUI$$d0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(walletOfflineCoinPurseUI);
        this.f201943g = walletOfflineCoinPurseUI;
    }

    /* renamed from: a */
    public void mo96314a() {
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201943g;
        walletOfflineCoinPurseUI.f201864Y = (LinearLayout) walletOfflineCoinPurseUI.findViewById(C0966R.C0970id.lhd);
        this.f201934d = (TextView) this.f201943g.f201864Y.findViewById(C0966R.C0970id.a66);
        this.f201935e = (TextView) this.f201943g.f201864Y.findViewById(C0966R.C0970id.a69);
        this.f201936f = (ImageView) this.f201943g.f201864Y.findViewById(C0966R.C0970id.a68);
        this.f201943g.f201864Y.setOnClickListener(new C69977a());
    }

    /* renamed from: e */
    public View mo64133e() {
        return this.f201943g.f201864Y;
    }

    public String getPath() {
        return "transfertoreddot";
    }
}
