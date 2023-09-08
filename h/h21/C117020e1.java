package h21;

import android.os.Handler;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import qo3.C101218e0;
import te3.C48745ap;

/* renamed from: h21.e1 */
public class C117020e1 implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C48745ap f350672a;

    /* renamed from: b */
    public final /* synthetic */ WalletCollectQrCodeUI f350673b;

    /* renamed from: h21.e1$a */
    public class C117021a implements Runnable {
        public C117021a() {
        }

        public void run() {
            C117020e1.this.f350673b.hideVKB();
        }
    }

    public C117020e1(WalletCollectQrCodeUI walletCollectQrCodeUI, C48745ap apVar) {
        this.f350673b = walletCollectQrCodeUI;
        this.f350672a = apVar;
    }

    /* renamed from: a */
    public void mo2001a() {
        WalletCollectQrCodeUI.m162109N7(this.f350673b, this.f350672a.f130704g);
        WalletCollectQrCodeUI walletCollectQrCodeUI = this.f350673b;
        C101218e0 e0Var = walletCollectQrCodeUI.f345677H;
        if (e0Var != null && e0Var.mo140661h()) {
            walletCollectQrCodeUI.f345677H.mo140680z();
            walletCollectQrCodeUI.f345677H = null;
        }
        new Handler().postDelayed(new C117021a(), 200);
    }
}
