package rt1;

import com.tencent.p014mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog;

/* renamed from: rt1.c */
public class C22251c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletFaceIdDialog f63053d;

    public C22251c(WalletFaceIdDialog walletFaceIdDialog) {
        this.f63053d = walletFaceIdDialog;
    }

    public void run() {
        this.f63053d.f52618e.sendAccessibilityEvent(128);
    }
}
