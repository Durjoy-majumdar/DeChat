package up0;

import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hr0.C87583a;
import lu3.C88654b;
import p224ra.C89909e;
import sp0.C90302k;

/* renamed from: up0.a */
public class C90718a extends C88654b {

    /* renamed from: e */
    public final /* synthetic */ C90721c f260552e;

    public C90718a(C90721c cVar) {
        this.f260552e = cVar;
    }

    public String getKey() {
        return "AppBrandNetworkUploadWorker#TimerTask";
    }

    public void run() {
        C90721c cVar = this.f260552e;
        Log.m105921e("MicroMsg.AppBrandNetworkUploadWorker", "call cronet time out taskid:%s,timeout:%d,url:%s", cVar.f260581w, Integer.valueOf(cVar.f260577s), this.f260552e.f260571j);
        if (!this.f260552e.f260569h) {
            this.f260552e.f260569h = true;
            C90721c cVar2 = this.f260552e;
            ((C90302k.C90303a) cVar2.f260567f).mo124537a(cVar2.f260573o, cVar2.f260571j, "fail:time out", 5);
        } else {
            Log.m105920e("MicroMsg.AppBrandNetworkUploadWorker", "call cronet time out already callback");
        }
        ((C87583a) C89909e.m112439d(C87583a.class, true)).idkeyStat(1791, 6, 1, false);
        if (!Util.isNullOrNil(this.f260552e.f260583y)) {
            CronetLogic.cancelCronetTask(this.f260552e.f260583y);
        }
    }
}
