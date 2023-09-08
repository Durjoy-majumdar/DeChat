package f73;

import com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI;
import com.tencent.p014mm.plugin.walletlock.model.C106559h;
import e73.C107243a;

/* renamed from: f73.c */
public class C107483c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FingerprintWalletLockUI f321593d;

    public C107483c(FingerprintWalletLockUI fingerprintWalletLockUI) {
        this.f321593d = fingerprintWalletLockUI;
    }

    public void run() {
        C107243a.m145333b();
        C107243a.m145332a(this.f321593d.f318281s);
        C107243a.f320886a = -1;
        C106559h.instance.mo153257f(true);
    }
}
