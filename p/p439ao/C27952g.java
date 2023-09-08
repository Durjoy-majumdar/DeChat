package p439ao;

import dx0.C31332a;
import f62.C31924c1;
import fx0.C45821d;
import java.util.Map;
import ob0.C35136m;

/* renamed from: ao.g */
public class C27952g implements C31924c1 {

    /* renamed from: ao.g$a */
    public class C27953a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map f77181d;

        public C27953a(C27952g gVar, Map map) {
            this.f77181d = map;
        }

        public void run() {
            C45821d.f123719a.mo71285c(this.f77181d);
        }
    }

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C31332a.m39373a("BrandServiceWorkerThread", new C27953a(this, map), 0);
    }
}
