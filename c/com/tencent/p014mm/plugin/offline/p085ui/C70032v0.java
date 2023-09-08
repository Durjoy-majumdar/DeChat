package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di0.C86300q;
import di3.C86312j;
import kr0.C76630x0;
import te3.C77951j53;

/* renamed from: com.tencent.mm.plugin.offline.ui.v0 */
public class C70032v0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C77951j53 f202057g;

    /* renamed from: h */
    public final /* synthetic */ WalletOfflineCoinPurseUI f202058h;

    /* renamed from: com.tencent.mm.plugin.offline.ui.v0$a */
    public class C70033a implements C86300q {
        public C70033a() {
        }

        /* renamed from: a */
        public void mo63853a() {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "onAppBrandProcessDied");
            C70032v0.this.f202058h.f201874e1 = true;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
        }

        /* renamed from: b */
        public void mo63854b(String str) {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "onTriggerHalfScreenShare");
        }

        /* renamed from: c */
        public void mo63855c() {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "onAppBrandUIEnter");
        }

        /* renamed from: d */
        public /* synthetic */ void mo63856d() {
        }

        /* renamed from: e */
        public void mo63857e() {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "onAppBrandPreconditionError");
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
        }

        /* renamed from: f */
        public void mo63858f(boolean z) {
            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "onAppBrandUIExit：%s", Boolean.valueOf(z));
            C70032v0.this.f202058h.f201874e1 = true;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
        }
    }

    public C70032v0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, C77951j53 j532) {
        this.f202058h = walletOfflineCoinPurseUI;
        this.f202057g = j532;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        this.f202058h.f201874e1 = true;
        WalletOfflineCoinPurseUI.m82435R7(5);
        C77951j53 j532 = this.f202057g;
        int i = j532.f227657s;
        if (i == 1) {
            return;
        }
        if (i == 2) {
            C75228t.m90219L(this.f202058h.getContext(), this.f202057g.f227658t, false);
        } else if (i != 3) {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "unknown entrance type");
        } else {
            C75228t.m90225R(j532.f227659u, j532.f227660v, 0, 1137, new C70033a());
        }
    }
}
