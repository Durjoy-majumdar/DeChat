package p439ao;

import com.tencent.p014mm.storage.C19627t;
import dx0.C31332a;
import f62.C31924c1;
import java.util.Map;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C51163rv3;
import te3.C77949j3;

/* renamed from: ao.a */
public class C27939a implements C31924c1 {

    /* renamed from: ao.a$a */
    public class C27940a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C35136m.C35137a f77160d;

        /* renamed from: e */
        public final /* synthetic */ Map f77161e;

        public C27940a(C27939a aVar, C35136m.C35137a aVar2, Map map) {
            this.f77160d = aVar2;
            this.f77161e = map;
        }

        public void run() {
            C77949j3 j3Var;
            C51163rv3 rv32;
            C35136m.C35137a aVar = this.f77160d;
            if (aVar != null && (j3Var = aVar.f94242a) != null && (rv32 = j3Var.f227631h) != null) {
                C19627t.f55586a.mo25847u(this.f77161e, C48374j0.m53718g(rv32));
            }
        }
    }

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C31332a.m39373a("BrandServiceWorkerThread", new C27940a(this, aVar, map), 0);
    }
}
