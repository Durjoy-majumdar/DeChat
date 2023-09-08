package p439ao;

import com.tencent.p014mm.sdk.platformtools.Log;
import dx0.C31332a;
import f62.C31924c1;
import java.util.Map;
import jw0.C21290c;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C51163rv3;

/* renamed from: ao.e */
public class C27948e implements C31924c1 {

    /* renamed from: ao.e$a */
    public class C27949a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map f77175d;

        /* renamed from: e */
        public final /* synthetic */ C35136m.C35137a f77176e;

        public C27949a(C27948e eVar, Map map, C35136m.C35137a aVar) {
            this.f77175d = map;
            this.f77176e = aVar;
        }

        public void run() {
            C51163rv3 rv32;
            C21290c cVar = C21290c.f60147a;
            Map map = this.f77175d;
            C35136m.C35137a aVar = this.f77176e;
            if ((aVar != null ? aVar.f94242a : null) == null || (rv32 = aVar.f94242a.f227631h) == null || map == null) {
                Log.m105928w("MicroMsg.BizPayAlbumLogic", "onBizPayAlbumNotify data invalid");
            } else {
                cVar.mo33269b(map, C48374j0.m53718g(rv32));
            }
        }
    }

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C31332a.m39373a("BrandServiceWorkerThread", new C27949a(this, map, aVar), 0);
    }
}
