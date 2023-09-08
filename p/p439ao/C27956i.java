package p439ao;

import com.tencent.p014mm.pluginsdk.model.C19467w0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C30798z;
import dx0.C31332a;
import f62.C31924c1;
import gy3.C87412m;
import java.util.Map;
import kj2.C117407d;
import ky3.C88334c;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C51163rv3;
import te3.C77949j3;
import te3.re4;

/* renamed from: ao.i */
public class C27956i implements C31924c1 {

    /* renamed from: ao.i$a */
    public class C27957a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C35136m.C35137a f77186d;

        /* renamed from: e */
        public final /* synthetic */ Map f77187e;

        public C27957a(C27956i iVar, C35136m.C35137a aVar, Map map) {
            this.f77186d = aVar;
            this.f77187e = map;
        }

        public void run() {
            C77949j3 j3Var;
            C51163rv3 rv32;
            re4 d;
            C35136m.C35137a aVar = this.f77186d;
            if (aVar != null && (j3Var = aVar.f94242a) != null && (rv32 = j3Var.f227631h) != null) {
                Map map = this.f77187e;
                String g = C48374j0.m53718g(rv32);
                C88334c cVar = C19613h1.f55490a;
                C87412m.m108594g(map, "values");
                C87412m.m108594g(g, "content");
                if (!C19613h1.m21047t() || (d = C19613h1.m21031d(map)) == null) {
                    return;
                }
                if (!C19613h1.m21043p(d, (C19623o0) null)) {
                    Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] onBizRecommendExpt illegal");
                    return;
                }
                int i = d.f64528t;
                if (i == 0) {
                    C19636w0.m21175q(g);
                    C19627t.f55586a.mo25851y(d, (C19623o0) null);
                } else if (i == 1) {
                    C19613h1.m21035h(map, d, (C19467w0) null, 4, (Object) null);
                }
                C117407d.INSTANCE.mo182089r(1454, 81, 1);
                long j = Util.getLong((String) map.get(".sysmsg.BizRecommendExpt.RecID"), 0);
                C30798z.f82801a.mo57723b(Util.getInt((String) map.get(".sysmsg.BizRecommendExpt.Pos"), -1), Util.getInt((String) map.get(".sysmsg.BizRecommendExpt.Weight"), -1), Util.getInt((String) map.get(".sysmsg.BizRecommendExpt.UseServerTime"), 0), 5, 1001, j, (String) map.get(".sysmsg.BizRecommendExpt.CardID"), (String) map.get(".sysmsg.BizRecommendExpt.ExpType"), (String) map.get(".sysmsg.BizRecommendExpt.ExtraData"));
            }
        }
    }

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C31332a.m39373a("BrandServiceWorkerThread", new C27957a(this, aVar, map), 0);
    }
}
