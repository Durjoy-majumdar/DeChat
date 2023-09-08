package h21;

import android.os.Handler;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import qo3.C101218e0;
import te3.C48745ap;

/* renamed from: h21.f1 */
public class C117023f1 implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C48745ap f350679a;

    /* renamed from: b */
    public final /* synthetic */ WalletCollectQrCodeUI f350680b;

    /* renamed from: h21.f1$a */
    public class C117024a implements Runnable {
        public C117024a() {
        }

        public void run() {
            C117023f1.this.f350680b.hideVKB();
        }
    }

    public C117023f1(WalletCollectQrCodeUI walletCollectQrCodeUI, C48745ap apVar) {
        this.f350680b = walletCollectQrCodeUI;
        this.f350679a = apVar;
    }

    /* renamed from: a */
    public void mo2001a() {
        new Handler().postDelayed(new C117024a(), 200);
        WalletCollectQrCodeUI.m162109N7(this.f350680b, this.f350679a.f130705h);
        WalletCollectQrCodeUI walletCollectQrCodeUI = this.f350680b;
        C101218e0 e0Var = walletCollectQrCodeUI.f345677H;
        if (e0Var != null && e0Var.mo140661h()) {
            walletCollectQrCodeUI.f345677H.mo140680z();
            walletCollectQrCodeUI.f345677H = null;
        }
    }
}
