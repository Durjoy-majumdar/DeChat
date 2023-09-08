package f73;

import android.content.DialogInterface;
import b73.C28273c;
import com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;

/* renamed from: f73.f */
public class C75729f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FingerprintWalletLockUI f222327d;

    public C75729f(FingerprintWalletLockUI fingerprintWalletLockUI) {
        this.f222327d = fingerprintWalletLockUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.FingerprintWalletLockUI", "alvinluo user click set gesture");
        ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91348b(this.f222327d, 1, 4);
    }
}
