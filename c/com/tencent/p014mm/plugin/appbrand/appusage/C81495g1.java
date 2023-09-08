package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.TimeUnit;
import ob0.C89132b;
import te3.C50385md2;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.g1 */
public final class C81495g1 {

    /* renamed from: a */
    public static final C81496a f239096a = new C81496a((C8480h) null);

    /* renamed from: b */
    public static final long f239097b = TimeUnit.DAYS.toSeconds(1);

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.g1$a */
    public static final class C81496a {
        public C81496a(C8480h hVar) {
        }

        /* renamed from: a */
        public static void m99972a(C81496a aVar, int i, int i2, C81497b bVar, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 5;
            }
            boolean z = false;
            int i4 = (i3 & 2) != 0 ? 0 : i2;
            if ((i3 & 4) != 0) {
                bVar = null;
            }
            aVar.getClass();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_APP_BRAND_COLLECTION_LIST_FETCH_NEXT_TIME_SEC_LONG;
            if (i == 2 || i == 7 || i == 8) {
                z = true;
            }
            if (z) {
                long j = 0;
                try {
                    Object f = C86709a0.m107535s().mo121142i().mo119685f(aVar2, 0L);
                    C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Long");
                    j = ((Long) f).longValue();
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.AppBrandCollectionModifyQueue[collection].FetchStarListLogic", "fetchListFromServer checkFrequency by configStg fail, e=" + e);
                }
                if (j > Util.nowSecond()) {
                    Log.m105918d("MicroMsg.AppBrandCollectionModifyQueue[collection].FetchStarListLogic", "daily fetch blocked by frequency");
                    if (bVar != null) {
                        bVar.mo113781b();
                        return;
                    }
                    return;
                }
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(Util.nowSecond() + C81495g1.f239097b));
            }
            Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection].FetchStarListLogic", "fetchList reason=" + i + ", prescene=" + i4);
            new C55445n0(i, i4, 2, Integer.MAX_VALUE, 0).mo9225i().mo123419C(new C81487f1(bVar, i, Util.nowMilliSecond()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.g1$b */
    public interface C81497b {
        /* renamed from: a */
        void mo113780a(C89132b.C89134c<C50385md2> cVar);

        /* renamed from: b */
        void mo113781b();
    }
}
