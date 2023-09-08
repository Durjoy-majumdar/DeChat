package h52;

import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import lu3.C88654b;

/* renamed from: h52.e */
public class C87440e extends C88654b {

    /* renamed from: e */
    public final /* synthetic */ C87443g f253360e;

    public C87440e(C87443g gVar) {
        this.f253360e = gVar;
    }

    public String getKey() {
        return "MagicBrushDownloadWorker#TimerTask";
    }

    public void run() {
        C87443g gVar = this.f253360e;
        Log.m105921e("MicroMsg.MagicBrushDownloadWorker", "call cronet time out taskid:%s,timeout:%d,url:%s", gVar.f253381t, Integer.valueOf(gVar.f253378q), this.f253360e.f253374j);
        if (!this.f253360e.f253372h) {
            this.f253360e.f253372h = true;
            C87443g gVar2 = this.f253360e;
            gVar2.f253370f.mo121898d(gVar2.f253375n, gVar2.f253374j, "fail:time out", 5);
        } else {
            Log.m105920e("MicroMsg.MagicBrushDownloadWorker", "call cronet time out already callback");
        }
        ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class)).Ov0(IMagicBrushMonitor.Key.MagicNetworkDownloadTaskTimeout.name(), 1, (String) null);
        if (!Util.isNullOrNil(this.f253360e.f253382u)) {
            CronetLogic.cancelCronetTask(this.f253360e.f253382u);
        }
    }
}
