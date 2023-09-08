package e73;

import com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI;
import com.tencent.p014mm.plugin.walletlock.model.C106556c;
import com.tencent.p014mm.plugin.walletlock.model.C106559h;
import com.tencent.p014mm.plugin.walletlock.model.C106560i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WCWebUpdater;
import ot3.C21889m;
import p623nr.C76956i;
import tt3.C22550a;
import xb3.C15635h;

/* renamed from: e73.i */
public class C107250i implements C76956i.C76958b {

    /* renamed from: a */
    public final /* synthetic */ C106556c f320894a;

    public C107250i(C107252k kVar, C106556c cVar) {
        this.f320894a = cVar;
    }

    /* renamed from: a */
    public void mo107280a(C22550a aVar) {
        C106559h.instance.f318382e = (C21889m) aVar.f64864c;
        ((FingerprintWalletLockUI.C106535j) this.f320894a).mo153205b(aVar.f61886a, aVar.f61887b);
    }

    /* renamed from: b */
    public void mo107281b() {
        FingerprintWalletLockUI.C106535j jVar = (FingerprintWalletLockUI.C106535j) this.f320894a;
        FingerprintWalletLockUI fingerprintWalletLockUI = FingerprintWalletLockUI.this;
        int i = FingerprintWalletLockUI.f318266C;
        fingerprintWalletLockUI.mo153186K7();
        FingerprintWalletLockUI.this.mo153193R7();
    }

    /* renamed from: c */
    public void mo107282c(int i, C22550a aVar) {
        C15635h.f42265a.mo14380a(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, "3", String.valueOf(aVar.f61886a), aVar.f61887b);
        C106560i.m143896b(3, aVar.f61886a, 1);
        if (i == 1) {
            C106556c cVar = this.f320894a;
            if (cVar != null) {
                ((FingerprintWalletLockUI.C106535j) cVar).mo153205b(1, "not match");
                return;
            }
            return;
        }
        int i2 = aVar.f61886a;
        if (i2 == 1021 || i2 == 1022) {
            Log.m105924i("MicroMsg.SoterFingerprintAuthManager", "alvinluo too many trial");
            C106556c cVar2 = this.f320894a;
            if (cVar2 != null) {
                ((FingerprintWalletLockUI.C106535j) cVar2).mo153205b(3, "too many trial");
            }
        } else if (i2 == 1020 || i2 == 1029) {
            Log.m105924i("MicroMsg.SoterFingerprintAuthManager", "alvinluo user cancelled");
            C106556c cVar3 = this.f320894a;
            if (cVar3 != null) {
                ((FingerprintWalletLockUI.C106535j) cVar3).mo153205b(4, "user cancelled");
            }
        } else if (i2 == 1012) {
            C106556c cVar4 = this.f320894a;
            if (cVar4 != null) {
                ((FingerprintWalletLockUI.C106535j) cVar4).mo153205b(8, "no fingerprint enrolled in system");
            }
        } else {
            C106556c cVar5 = this.f320894a;
            if (cVar5 != null) {
                ((FingerprintWalletLockUI.C106535j) cVar5).mo153205b(2, aVar.f61887b);
            }
        }
    }
}
