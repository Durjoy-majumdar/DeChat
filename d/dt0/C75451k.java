package dt0;

import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.plugin.appbrand.appusage.C68587i1;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p235sm.C77729f;
import rx3.C13598b0;
import sx3.C110818d0;
import xt0.C78980e;
import xt0.C78983j;
import xt0.C78984k;

/* renamed from: dt0.k */
public final class C75451k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C75452l f221767d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<List<? extends C68691e.C68692a>, C13598b0> f221768e;

    public C75451k(C75452l lVar, C32226l<? super List<? extends C68691e.C68692a>, C13598b0> lVar2) {
        this.f221767d = lVar;
        this.f221768e = lVar2;
    }

    public final void run() {
        C77729f fVar = (C77729f) C86312j.m106911c(C77729f.class);
        C75452l lVar = this.f221767d;
        C32226l<List<? extends C68691e.C68692a>, C13598b0> lVar2 = this.f221768e;
        synchronized (lVar) {
            ArrayList arrayList = new ArrayList();
            int i = C78983j.f231934b.f231940b;
            int i2 = 0;
            lVar.f221770b = fVar.mo107871vF();
            if (lVar.f221771c == null) {
                lVar.f221771c = C78980e.f231921a.mo108958b();
            }
            C68587i1 i1Var = lVar.f221771c;
            List<LocalUsageInfo> gC = i1Var != null ? ((C78984k) i1Var).mo94250gC(lVar.f221769a, i + 1) : null;
            if (gC != null) {
                Iterator it = ((ArrayList) C110818d0.m150912J(gC)).iterator();
                while (it.hasNext()) {
                    LocalUsageInfo localUsageInfo = (LocalUsageInfo) it.next();
                    i2++;
                    if (i2 > i) {
                        lVar.f221770b = true;
                    } else {
                        C68691e.C68692a aVar = new C68691e.C68692a(1);
                        aVar.f197340a = localUsageInfo;
                        arrayList.add(aVar);
                        C87412m.m108592e(localUsageInfo, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo");
                        lVar.f221769a = ((AppBrandRecentTaskInfo) localUsageInfo).f239037z;
                    }
                }
            }
            lVar2.invoke(arrayList);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
