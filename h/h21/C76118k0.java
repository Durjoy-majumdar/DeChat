package h21;

import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeSettingUI;
import qo3.C47883u;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: h21.k0 */
public class C76118k0 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ WalletCollectQrCodeSettingUI f223032a;

    /* renamed from: h21.k0$a */
    public class C76119a implements Runnable {
        public C76119a() {
        }

        public void run() {
            C76118k0.this.f223032a.showNormalStWcKb();
        }
    }

    public C76118k0(WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI) {
        this.f223032a = walletCollectQrCodeSettingUI;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        C119179t tVar = C119157j.f356862d;
        C76119a aVar = new C76119a();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 300, false);
    }
}
