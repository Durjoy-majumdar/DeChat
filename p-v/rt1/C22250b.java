package rt1;

import com.tencent.p014mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog;

/* renamed from: rt1.b */
public class C22250b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletFaceIdDialog f63052d;

    public C22250b(WalletFaceIdDialog walletFaceIdDialog) {
        this.f63052d = walletFaceIdDialog;
    }

    public void run() {
        this.f63052d.f52618e.sendAccessibilityEvent(128);
    }
}
