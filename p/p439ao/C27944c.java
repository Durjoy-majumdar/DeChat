package p439ao;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C29763t;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.platformtools.Util;
import dx0.C31332a;
import f62.C31924c1;
import java.util.List;
import java.util.Map;
import ob0.C35136m;
import te3.C77949j3;
import te3.mg4;

/* renamed from: ao.c */
public class C27944c implements C31924c1 {

    /* renamed from: ao.c$a */
    public class C27945a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C35136m.C35137a f77169d;

        /* renamed from: e */
        public final /* synthetic */ Map f77170e;

        public C27945a(C27944c cVar, C35136m.C35137a aVar, Map map) {
            this.f77169d = aVar;
            this.f77170e = map;
        }

        public void run() {
            C77949j3 j3Var;
            mg4 a;
            C35136m.C35137a aVar = this.f77169d;
            if (aVar != null && (j3Var = aVar.f94242a) != null && j3Var.f227631h != null && Util.getInt((String) this.f77170e.get(".sysmsg.bizlivenotify.op_flag"), 1) == 1 && (a = C29763t.m38870a()) != null && !Util.isNullOrNil((List) a.f184323d)) {
                C19428d.f54856a.mo25148A(a.f184323d);
            }
        }
    }

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C31332a.m39373a("BrandServiceWorkerThread", new C27945a(this, aVar, map), 0);
    }
}
