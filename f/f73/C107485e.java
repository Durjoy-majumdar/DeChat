package f73;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: f73.e */
public class C107485e implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ FingerprintWalletLockUI f321595d;

    public C107485e(FingerprintWalletLockUI fingerprintWalletLockUI) {
        this.f321595d = fingerprintWalletLockUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.FingerprintWalletLockUI", "alvinluo cancel not support fingerprint dialog");
        FingerprintWalletLockUI fingerprintWalletLockUI = this.f321595d;
        int i = FingerprintWalletLockUI.f318266C;
        fingerprintWalletLockUI.mo153187L7();
        this.f321595d.mo153188M7(0, 4, "user cancel reset wallet lock");
    }
}
