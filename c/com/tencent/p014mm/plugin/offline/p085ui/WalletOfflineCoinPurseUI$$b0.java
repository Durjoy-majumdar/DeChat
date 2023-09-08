package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.Intent;
import android.os.Bundle;
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

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$b0 */
public class WalletOfflineCoinPurseUI$$b0 extends WalletOfflineCoinPurseUI$$a0 {

    /* renamed from: g */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201939g;

    /* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$b0$a */
    public class C69974a extends C7089c0 {
        public C69974a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Class cls = C30914c.class;
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "click aa");
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(16);
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(14021, 3, Integer.valueOf(WalletOfflineCoinPurseUI$$b0.this.f201939g.f201891o1));
            Intent intent = new Intent();
            int i = WalletOfflineCoinPurseUI$$b0.this.f201939g.f201858V0;
            if (i == 1) {
                intent.putExtra("enter_scene", 2);
            } else if (i == 2) {
                intent.putExtra("enter_scene", 4);
            } else {
                Log.m105929w("MicroMsg.WalletOfflineCoinPurseUI", "unknown scene: %s", Integer.valueOf(i));
            }
            C88144b.m109791i(WalletOfflineCoinPurseUI$$b0.this.f201939g.getContext(), "aa", ".ui.AAEntranceUI", intent, (Bundle) null);
            WalletOfflineCoinPurseUI$$b0.this.f201939g.f201908w1 = false;
            C20362d sM = ((C30914c) C86312j.m106911c(cls)).mo17862sM();
            C72994y1.C72995a aVar = C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_GROUP_PAY_STRING_SYNC;
            C72994y1.C72995a aVar2 = C72994y1.C72995a.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC;
            if (((C21388a) sM).mo33496d(aVar, aVar2)) {
                ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33501j(aVar, aVar2);
                WalletOfflineCoinPurseUI$$b0.this.f201934d.setVisibility(8);
                nVar.mo160131h(14396, 4);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletOfflineCoinPurseUI$$b0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(walletOfflineCoinPurseUI);
        this.f201939g = walletOfflineCoinPurseUI;
    }

    /* renamed from: a */
    public void mo96314a() {
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201939g;
        walletOfflineCoinPurseUI.f201857V = (LinearLayout) walletOfflineCoinPurseUI.findViewById(C0966R.C0970id.lhc);
        this.f201934d = (TextView) this.f201939g.f201857V.findViewById(C0966R.C0970id.f5267af);
        this.f201935e = (TextView) this.f201939g.f201857V.findViewById(C0966R.C0970id.f5278aq);
        this.f201936f = (ImageView) this.f201939g.f201857V.findViewById(C0966R.C0970id.f5277ap);
        this.f201939g.f201857V.setOnClickListener(new C69974a());
    }

    /* renamed from: e */
    public View mo64133e() {
        return this.f201939g.f201857V;
    }

    public String getPath() {
        return "grouppayreddot";
    }
}
