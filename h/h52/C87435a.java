package h52;

import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import lu3.C88654b;

/* renamed from: h52.a */
public class C87435a extends C88654b {

    /* renamed from: e */
    public final /* synthetic */ C87438c f253341e;

    public C87435a(C87438c cVar) {
        this.f253341e = cVar;
    }

    public String getKey() {
        return "MagicBrushDownloadWorker#TimerTask";
    }

    public void run() {
        C87438c cVar = this.f253341e;
        Log.m105925i("MicroMsg.MagicBrushCDNDownloadWorker", "call cdndownload time out taskid:%s,timeout:%d,uri:%s", cVar.f253357s, Integer.valueOf(cVar.f253355q), this.f253341e.f253349h);
        if (!this.f253341e.f253347f) {
            this.f253341e.f253347f = true;
            C87438c cVar2 = this.f253341e;
            cVar2.f253345d.mo121898d(cVar2.f253352n, cVar2.f253349h, "fail:time out", 5);
        } else {
            Log.m105920e("MicroMsg.MagicBrushCDNDownloadWorker", "call cdndownload time out already callback");
        }
        ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class)).Ov0(IMagicBrushMonitor.Key.MagicNetworkCDNDownloadTaskTimeout.name(), 1, (String) null);
        mo123097b(true);
    }
}
