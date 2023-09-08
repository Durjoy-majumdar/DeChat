package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import di3.C86312j;
import ke3.C88144b;
import l20.C21388a;
import p327ct.C20362d;
import p327ct.C30914c;
import p626nv.C109759g;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$f0 */
public class WalletOfflineCoinPurseUI$$f0 extends WalletOfflineCoinPurseUI$$a0 {

    /* renamed from: g */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201949g;

    /* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$f0$a */
    public class C69980a extends C7089c0 {
        public C69980a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Class cls = C30914c.class;
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "click f2f lucky");
            WalletOfflineCoinPurseUI$$f0.this.f201949g.f201908w1 = false;
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(18);
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(14021, 4, Integer.valueOf(WalletOfflineCoinPurseUI$$f0.this.f201949g.f201891o1));
            C88144b.m109789g(WalletOfflineCoinPurseUI$$f0.this.f201949g.getContext(), "luckymoney", ".f2f.ui.LuckyMoneyF2FQRCodeUI");
            C20362d sM = ((C30914c) C86312j.m106911c(cls)).mo17862sM();
            C72994y1.C72995a aVar = C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_F2F_HB_STRING_SYNC;
            C72994y1.C72995a aVar2 = C72994y1.C72995a.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC;
            if (((C21388a) sM).mo33496d(aVar, aVar2)) {
                ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33501j(aVar, aVar2);
                WalletOfflineCoinPurseUI$$f0.this.f201934d.setVisibility(8);
                nVar.mo160131h(14396, 5);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletOfflineCoinPurseUI$$f0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(walletOfflineCoinPurseUI);
        this.f201949g = walletOfflineCoinPurseUI;
    }

    /* renamed from: a */
    public void mo96314a() {
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201949g;
        walletOfflineCoinPurseUI.f201860W = (LinearLayout) walletOfflineCoinPurseUI.findViewById(C0966R.C0970id.lhh);
        this.f201934d = (TextView) this.f201949g.f201860W.findViewById(C0966R.C0970id.cod);
        this.f201935e = (TextView) this.f201949g.f201860W.findViewById(C0966R.C0970id.cof);
        this.f201936f = (ImageView) this.f201949g.f201860W.findViewById(C0966R.C0970id.coe);
        this.f201949g.f201860W.setOnClickListener(new C69980a());
    }

    /* renamed from: e */
    public View mo64133e() {
        return this.f201949g.f201860W;
    }

    public String getPath() {
        return "f2fhongbaoreddot";
    }
}
