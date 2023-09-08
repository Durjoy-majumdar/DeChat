package h21;

import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeSettingUI;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76879j;

/* renamed from: h21.i0 */
public class C76111i0 implements C76879j.C47267l {

    /* renamed from: a */
    public final /* synthetic */ WalletCollectQrCodeSettingUI f223025a;

    /* renamed from: h21.i0$a */
    public class C76112a implements Runnable {
        public C76112a() {
        }

        public void run() {
            C76111i0.this.f223025a.hideVKB();
            C76111i0.this.f223025a.showNormalStWcKb();
        }
    }

    public C76111i0(WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI) {
        this.f223025a = walletCollectQrCodeSettingUI;
    }

    public boolean onFinish(CharSequence charSequence) {
        if (!Util.isNullOrNil(charSequence.toString())) {
            this.f223025a.f197822g = charSequence.toString();
            this.f223025a.mo94706K7();
        } else {
            WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI = this.f223025a;
            walletCollectQrCodeSettingUI.f197822g = "";
            walletCollectQrCodeSettingUI.mo94706K7();
        }
        MMHandlerThread.postToMainThreadDelayed(new C76112a(), 200);
        return true;
    }
}
