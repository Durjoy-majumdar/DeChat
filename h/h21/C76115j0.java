package h21;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeSettingUI;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: h21.j0 */
public class C76115j0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletCollectQrCodeSettingUI f223029d;

    /* renamed from: h21.j0$a */
    public class C76116a implements Runnable {
        public C76116a() {
        }

        public void run() {
            C76115j0.this.f223029d.hideVKB();
            C76115j0.this.f223029d.showNormalStWcKb();
        }
    }

    public C76115j0(WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI) {
        this.f223029d = walletCollectQrCodeSettingUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        MMHandlerThread.postToMainThreadDelayed(new C76116a(), 200);
    }
}
