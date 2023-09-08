package h21;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p910lj.C76701a;

/* renamed from: h21.y0 */
public class C8484y0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f27494d;

    /* renamed from: e */
    public final /* synthetic */ WalletCollectQrCodeUI f27495e;

    public C8484y0(WalletCollectQrCodeUI walletCollectQrCodeUI, int i) {
        this.f27495e = walletCollectQrCodeUI;
        this.f27494d = i;
    }

    public void run() {
        C76701a.makeText((Context) this.f27495e.getContext(), (CharSequence) this.f27495e.getString(C0966R.string.bhb), 1).show();
        C115669n.INSTANCE.mo160131h(25983, 17, Integer.valueOf(this.f27494d));
    }
}
