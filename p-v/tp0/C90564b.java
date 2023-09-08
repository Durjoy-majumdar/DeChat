package tp0;

import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hr0.C87583a;
import lu3.C88654b;
import p224ra.C89909e;

/* renamed from: tp0.b */
public class C90564b extends C88654b {

    /* renamed from: e */
    public final /* synthetic */ C90567d f260192e;

    public C90564b(C90567d dVar) {
        this.f260192e = dVar;
    }

    public String getKey() {
        return "AppBrandDownloadWorker#TimerTask";
    }

    public void run() {
        C90567d dVar = this.f260192e;
        Log.m105921e("MicroMsg.AppBrandDownloadWorker", "call cronet time out taskid:%s,timeout:%d,url:%s", dVar.f260220v, Integer.valueOf(dVar.f260215q), this.f260192e.f260210i);
        if (!this.f260192e.f260209h) {
            this.f260192e.f260209h = true;
            C90567d dVar2 = this.f260192e;
            dVar2.f260207f.mo124494d(dVar2.f260211j, dVar2.f260210i, "fail:time out", 5);
        } else {
            Log.m105920e("MicroMsg.AppBrandDownloadWorker", "call cronet time out already callback");
        }
        ((C87583a) C89909e.m112439d(C87583a.class, true)).idkeyStat(1197, 6, 1, false);
        if (!Util.isNullOrNil(this.f260192e.f260222x)) {
            CronetLogic.cancelCronetTask(this.f260192e.f260222x);
        }
    }
}
