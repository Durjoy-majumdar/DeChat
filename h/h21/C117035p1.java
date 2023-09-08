package h21;

import android.widget.Toast;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import te3.C118461r00;

/* renamed from: h21.p1 */
public class C117035p1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Toast f350700d;

    /* renamed from: e */
    public final /* synthetic */ C118461r00 f350701e;

    /* renamed from: f */
    public final /* synthetic */ WalletCollectQrCodeUI f350702f;

    public C117035p1(WalletCollectQrCodeUI walletCollectQrCodeUI, Toast toast, C118461r00 r002) {
        this.f350702f = walletCollectQrCodeUI;
        this.f350700d = toast;
        this.f350701e = r002;
    }

    public void run() {
        this.f350700d.cancel();
        C118461r00 r002 = this.f350701e;
        if (r002 != null) {
            WalletCollectQrCodeUI walletCollectQrCodeUI = this.f350702f;
            int i = WalletCollectQrCodeUI.f345669T;
            walletCollectQrCodeUI.mo175159w8(r002);
        }
    }
}
