package com.tencent.p014mm.plugin.offline.p085ui;

import a63.C67008a;
import android.app.Dialog;
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
import p281yz.C79173v;
import p327ct.C20362d;
import p327ct.C30914c;
import p626nv.C109759g;
import z53.C79311j;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$h0 */
public class WalletOfflineCoinPurseUI$$h0 extends WalletOfflineCoinPurseUI$$a0 {

    /* renamed from: g */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201960g;

    /* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$h0$a */
    public class C69981a extends C7089c0 {

        /* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$h0$a$a */
        public class C69982a implements C67008a.C67019k {
            public C69982a() {
            }

            public boolean run(int i, int i2, String str, boolean z) {
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "getDisclaimer   resultCode=" + i + ";errCode=" + i2 + ";errMsg=" + str + ";hadAgree = " + z);
                if (i == 2) {
                    WalletOfflineCoinPurseUI$$h0.this.f201960g.doSceneProgress(new C79311j(1, "reward"), false);
                } else if (i != 0 || !z) {
                    Dialog dialog = WalletOfflineCoinPurseUI$$h0.this.f201960g.f201913y0;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    WalletOfflineCoinPurseUI$$h0.this.f201960g.doSceneProgress(new C79311j(1, "reward"), false);
                }
                return true;
            }
        }

        public C69981a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Class cls = C79173v.class;
            Class cls2 = C30914c.class;
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "click qr reward");
            WalletOfflineCoinPurseUI$$h0.this.f201960g.f201908w1 = false;
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(19);
            C115669n.INSTANCE.mo160131h(14021, 5, Integer.valueOf(WalletOfflineCoinPurseUI$$h0.this.f201960g.f201891o1));
            C20362d sM = ((C30914c) C86312j.m106911c(cls2)).mo17862sM();
            C72994y1.C72995a aVar = C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_QR_REWARD_STRING_SYNC;
            C72994y1.C72995a aVar2 = C72994y1.C72995a.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC;
            if (((C21388a) sM).mo33496d(aVar, aVar2)) {
                ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33501j(aVar, aVar2);
                WalletOfflineCoinPurseUI$$h0.this.f201934d.setVisibility(8);
            }
            if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91341w()) {
                C88144b.m109789g(WalletOfflineCoinPurseUI$$h0.this.f201960g.getContext(), "collect", ".reward.ui.QrRewardMainUI");
                return;
            }
            WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = WalletOfflineCoinPurseUI$$h0.this.f201960g;
            ((C79173v) C86312j.m106911c(cls)).f232485t.mo90979g(walletOfflineCoinPurseUI, 4, walletOfflineCoinPurseUI.mNetSceneMgr, new C69982a(), false, 1006, false);
            WalletOfflineCoinPurseUI$$h0.this.f201960g.doSceneForceProgress(new C79311j(1, "reward"));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletOfflineCoinPurseUI$$h0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(walletOfflineCoinPurseUI);
        this.f201960g = walletOfflineCoinPurseUI;
    }

    /* renamed from: a */
    public void mo96314a() {
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201960g;
        walletOfflineCoinPurseUI.f201862X = (LinearLayout) walletOfflineCoinPurseUI.findViewById(C0966R.C0970id.lhm);
        this.f201934d = (TextView) this.f201960g.f201862X.findViewById(C0966R.C0970id.i_h);
        this.f201935e = (TextView) this.f201960g.f201862X.findViewById(C0966R.C0970id.i_j);
        this.f201936f = (ImageView) this.f201960g.f201862X.findViewById(C0966R.C0970id.i_i);
        this.f201960g.f201862X.setOnClickListener(new C69981a());
    }

    /* renamed from: e */
    public View mo64133e() {
        return this.f201960g.f201862X;
    }

    public String getPath() {
        return "rewardcodereddot";
    }
}
