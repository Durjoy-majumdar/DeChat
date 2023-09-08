package f73;

import android.content.DialogInterface;
import b73.C28273c;
import com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;

/* renamed from: f73.a */
public class C75728a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FingerprintWalletLockUI f222326d;

    public C75728a(FingerprintWalletLockUI fingerprintWalletLockUI) {
        this.f222326d = fingerprintWalletLockUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.FingerprintWalletLockUI", "alvinluo user click close wallet lock");
        ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91353g(this.f222326d, 5);
    }
}
