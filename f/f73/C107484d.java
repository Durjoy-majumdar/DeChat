package f73;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import e73.C107248e;

/* renamed from: f73.d */
public class C107484d implements C107248e.C107249a {

    /* renamed from: a */
    public final /* synthetic */ FingerprintWalletLockUI f321594a;

    public C107484d(FingerprintWalletLockUI fingerprintWalletLockUI) {
        this.f321594a = fingerprintWalletLockUI;
    }

    /* renamed from: n */
    public void mo157720n(int i, String str) {
        Log.m105925i("MicroMsg.FingerprintWalletLockUI", "prepare onFinish errCode: %d, errMsg: %s, time: %d", Integer.valueOf(i), str, Long.valueOf(System.currentTimeMillis()));
        FingerprintWalletLockUI fingerprintWalletLockUI = this.f321594a;
        if (fingerprintWalletLockUI.f318287y) {
            Log.m105924i("MicroMsg.FingerprintWalletLockUI", "alvinluo has cancelled and return");
        } else if (i == 0) {
            fingerprintWalletLockUI.mo153190O7();
        } else {
            fingerprintWalletLockUI.mo153192Q7(fingerprintWalletLockUI.getString(C0966R.string.kv9));
        }
    }
}
