package sc2;

import com.tencent.p014mm.plugin.nfc_open.p802ui.NfcWebViewUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: sc2.a */
public class C13651a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f38672d;

    public C13651a(NfcWebViewUI nfcWebViewUI, String str) {
        this.f38672d = str;
    }

    public void run() {
        C115669n.INSTANCE.mo160131h(12794, this.f38672d, 0);
        Log.m105918d("MicroMsg.NfcWebViewUI", "doCardTypeReport url = " + this.f38672d);
    }
}
