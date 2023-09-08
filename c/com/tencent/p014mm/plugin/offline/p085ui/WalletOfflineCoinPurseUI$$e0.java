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
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import f40.C86709a0;
import ie3.C76331i;
import l20.C21388a;
import p281yz.C79173v;
import p327ct.C20362d;
import p327ct.C30914c;
import p626nv.C109759g;
import z53.C79311j;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$e0 */
public class WalletOfflineCoinPurseUI$$e0 extends WalletOfflineCoinPurseUI$$a0 {

    /* renamed from: g */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201946g;

    /* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$e0$a */
    public class C69978a extends C7089c0 {

        /* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$e0$a$a */
        public class C69979a implements C67008a.C67019k {
            public C69979a() {
            }

            public boolean run(int i, int i2, String str, boolean z) {
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "getDisclaimer   resultCode=" + i + ";errCode=" + i2 + ";errMsg=" + str + ";hadAgree = " + z);
                if (i == 2) {
                    WalletOfflineCoinPurseUI$$e0.this.f201946g.doSceneProgress(new C79311j(1, "collect"), false);
                } else if (i != 0 || !z) {
                    Dialog dialog = WalletOfflineCoinPurseUI$$e0.this.f201946g.f201913y0;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    WalletOfflineCoinPurseUI$$e0.this.f201946g.doSceneProgress(new C79311j(1, "collect"), false);
                }
                return true;
            }
        }

        public C69978a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Class cls = C79173v.class;
            Class cls2 = C30914c.class;
            WalletOfflineCoinPurseUI$$e0.this.f201946g.f201908w1 = false;
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(17);
            C20362d sM = ((C30914c) C86312j.m106911c(cls2)).mo17862sM();
            C72994y1.C72995a aVar = C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_F2F_COLLECT_STRING_SYNC;
            C72994y1.C72995a aVar2 = C72994y1.C72995a.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC;
            if (((C21388a) sM).mo33496d(aVar, aVar2)) {
                ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33501j(aVar, aVar2);
                WalletOfflineCoinPurseUI$$e0.this.f201934d.setVisibility(8);
                WalletOfflineCoinPurseUI$$e0.this.f201935e.setVisibility(8);
                WalletOfflineCoinPurseUI$$e0.this.f201936f.setVisibility(8);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_FACING_REDDOT_WORDING_STRING_SYNC, "");
                C115669n.INSTANCE.mo160131h(14396, 3);
            }
            if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91341w()) {
                WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = WalletOfflineCoinPurseUI$$e0.this.f201946g;
                walletOfflineCoinPurseUI.getClass();
                C75228t.m90243e0(32, 1);
                C76331i.m91765i(walletOfflineCoinPurseUI, walletOfflineCoinPurseUI.f201891o1);
                return;
            }
            WalletOfflineCoinPurseUI walletOfflineCoinPurseUI2 = WalletOfflineCoinPurseUI$$e0.this.f201946g;
            ((C79173v) C86312j.m106911c(cls)).f232485t.mo90979g(walletOfflineCoinPurseUI2, 4, walletOfflineCoinPurseUI2.mNetSceneMgr, new C69979a(), false, 1006, false);
            WalletOfflineCoinPurseUI$$e0.this.f201946g.doSceneForceProgress(new C79311j(1, "collect"));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletOfflineCoinPurseUI$$e0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        super(walletOfflineCoinPurseUI);
        this.f201946g = walletOfflineCoinPurseUI;
    }

    /* renamed from: a */
    public void mo96314a() {
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201946g;
        walletOfflineCoinPurseUI.f201854U = (LinearLayout) walletOfflineCoinPurseUI.findViewById(C0966R.C0970id.lhg);
        this.f201934d = (TextView) this.f201946g.f201854U.findViewById(C0966R.C0970id.f357955com);
        this.f201935e = (TextView) this.f201946g.f201854U.findViewById(C0966R.C0970id.cop);
        this.f201936f = (ImageView) this.f201946g.f201854U.findViewById(C0966R.C0970id.coo);
        this.f201946g.f201854U.setOnClickListener(new C69978a());
    }

    /* renamed from: e */
    public View mo64133e() {
        return this.f201946g.f201854U;
    }

    public String getPath() {
        return "facingreceivereddot";
    }
}
