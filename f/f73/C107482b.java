package f73;

import android.content.Context;
import b73.C28273c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI;
import com.tencent.p014mm.plugin.walletlock.model.C106561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import e73.C107248e;
import p910lj.C76701a;

/* renamed from: f73.b */
public class C107482b implements C107248e.C107249a {

    /* renamed from: a */
    public final /* synthetic */ FingerprintWalletLockUI f321592a;

    public C107482b(FingerprintWalletLockUI fingerprintWalletLockUI) {
        this.f321592a = fingerprintWalletLockUI;
    }

    /* renamed from: n */
    public void mo157720n(int i, String str) {
        Log.m105925i("MicroMsg.FingerprintWalletLockUI", "alvinluo open fingerprint lock onFinish errCode: %d, errMsg: %s", Integer.valueOf(i), str);
        if (i == 0) {
            FingerprintWalletLockUI fingerprintWalletLockUI = this.f321592a;
            int i2 = FingerprintWalletLockUI.f318266C;
            fingerprintWalletLockUI.mo153185J7();
            MMHandlerThread.postToMainThread(new C107483c(fingerprintWalletLockUI));
            C76701a.makeText((Context) fingerprintWalletLockUI, (int) C0966R.string.kva, 0).show();
            ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91359l(2);
            C106561j.INSTANCE.mo153262e();
            fingerprintWalletLockUI.mo153188M7(-1, 0, "open fingerprint lock ok");
            return;
        }
        FingerprintWalletLockUI fingerprintWalletLockUI2 = this.f321592a;
        String string = fingerprintWalletLockUI2.getString(C0966R.string.kv_);
        int i3 = FingerprintWalletLockUI.f318266C;
        fingerprintWalletLockUI2.mo153192Q7(string);
    }
}
