package p439ao;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import com.tencent.p014mm.storage.C19633v0;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C30798z;
import dx0.C31332a;
import ex0.C45696d;
import f40.C86709a0;
import f62.C31924c1;
import java.util.Map;
import kj2.C117407d;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C77949j3;
import zt3.C119157j;

/* renamed from: ao.k */
public class C27960k implements C31924c1 {

    /* renamed from: ao.k$a */
    public class C27961a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map f77192d;

        /* renamed from: e */
        public final /* synthetic */ C35136m.C35137a f77193e;

        public C27961a(C27960k kVar, Map map, C35136m.C35137a aVar) {
            this.f77192d = map;
            this.f77193e = aVar;
        }

        public void run() {
            C77949j3 j3Var;
            Map map = this.f77192d;
            C35136m.C35137a aVar = this.f77193e;
            if (aVar == null || (j3Var = aVar.f94242a) == null || j3Var.f227631h == null) {
                Log.m105928w("MicroMsg.BizTimeLineInfoStorageLogic", "onBizRecommendNotify data invalid");
            } else if (!C86709a0.m107522a()) {
                Log.m105924i("MicroMsg.BizTimeLineInfoStorageLogic", "onBizRecommendNotify acc not ready");
            } else {
                int i = Util.getInt((String) map.get(".sysmsg.BizAccountRecommend.Style"), -1);
                C45696d dVar = (C45696d) C86709a0.m107533q(C45696d.class);
                if (dVar == null) {
                    Log.m105924i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] onBizRecommendNotify IBrandService null");
                } else if (!dVar.mo71012rU(i)) {
                    Log.m105925i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] onBizRecommendNotify style = %s not support", Integer.valueOf(i));
                } else {
                    int i2 = Util.getInt((String) map.get(".sysmsg.BizAccountRecommend.RedDotFlag"), -1);
                    Log.m105925i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] onBizRecommendNotify redDot = %s", Integer.valueOf(i2));
                    String g = C48374j0.m53718g(aVar.f94242a.f227631h);
                    MultiProcessMMKV.getSingleMMKV("brandService");
                    if (i2 == 0) {
                        C19636w0.m21175q(g);
                    } else if (i2 == 1) {
                        ((C119157j) C119157j.f356862d).mo183876g(new C19633v0(g, map), "BizInsertTlRecCardThreadImmediately");
                    }
                    C115669n.INSTANCE.idkeyStat(1149, 0, 1, false);
                    long j = Util.getLong((String) map.get(".sysmsg.BizAccountRecommend.RecID"), 0);
                    String str = (String) map.get(".sysmsg.BizAccountRecommend.BizAccount.UserName");
                    int i3 = Util.getInt((String) map.get(".sysmsg.BizAccountRecommend.Pos"), -1);
                    int i4 = Util.getInt((String) map.get(".sysmsg.BizAccountRecommend.Weight"), -1);
                    int i5 = Util.getInt((String) map.get(".sysmsg.BizAccountRecommend.UseServerTime"), 0);
                    String str2 = (String) map.get(".sysmsg.BizAccountRecommend.CardId");
                    String str3 = (String) map.get(".sysmsg.BizAccountRecommend.ExpType");
                    int i6 = 0;
                    while (i6 < 2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(".sysmsg.BizAccountRecommend.BizAccount");
                        sb.append(i6 == 0 ? "" : Integer.valueOf(i6));
                        String sb4 = sb.toString();
                        String str4 = (String) map.get(sb4 + ".AppMsg.Title");
                        if (Util.isNullOrNil(str4)) {
                            break;
                        }
                        String str5 = (String) map.get(sb4 + ".UserName");
                        String doUrlEncode = WebViewUtilities.doUrlEncode(str4);
                        String doUrlEncode2 = WebViewUtilities.doUrlEncode((String) map.get(sb4 + ".AppMsg.ContentUrl"));
                        Log.m105925i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] onBizRecommendNotify bizUserName %s", str5);
                        C115669n.INSTANCE.mo160131h(18106, str5, Long.valueOf(j), Integer.valueOf(i3), Integer.valueOf(i4), doUrlEncode, doUrlEncode2);
                        i6++;
                        map = map;
                    }
                    Log.m105925i("MicroMsg.BizTimeLineInfoStorageLogic", "[TRACE_BIZRECCARD] onBizRecommendNotify userName %s, recId %d", str, Long.valueOf(j));
                    if (i == 101) {
                        C117407d.INSTANCE.mo182089r(1454, 83, 1);
                        C30798z.f82801a.mo57723b(i3, i4, i5, 3, i, j, str2, str3, "");
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C31332a.m39373a("BrandServiceWorkerThread", new C27961a(this, map, aVar), 0);
    }
}
