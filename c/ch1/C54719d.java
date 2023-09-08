package ch1;

import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fj1.C45795b;
import gy3.C87412m;
import j50.C60735a;
import k50.C60971a;
import te3.C49936j31;
import yg1.C39014a;
import yg1.C66639f;

/* renamed from: ch1.d */
public final class C54719d extends C66639f {

    /* renamed from: a */
    public final C45795b f153359a;

    /* renamed from: b */
    public final String f153360b = "LiveMsgQosReportIntercetor";

    public C54719d(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f153359a = bVar;
    }

    /* renamed from: b */
    public boolean mo49b(C39014a.C39015a aVar) {
        C60735a aVar2;
        C87412m.m108594g(aVar, "resp");
        C45795b bVar = this.f153359a;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        if (!FinderLiveService.f159380h || bVar == null || !((C54991o) bVar.mo71262a(C54991o.class)).f154300c2) {
            return true;
        }
        C60971a aVar3 = C60971a.C60973b.f173670a;
        String a = aVar3.mo85947d().mo86405a();
        C49936j31 j312 = ((C55001u) bVar.mo71262a(C55001u.class)).f154420q.f182400o;
        finderLiveService.mo77604E(j312 != null ? j312.f135841e : null);
        String a2 = aVar3.mo85947d().mo86405a();
        if (!Util.isEqual(a, a2) && (aVar2 = FinderLiveService.f159378f) != null) {
            aVar2.mo85673A0();
        }
        String str = this.f153360b;
        Log.m105924i(str, "check update sdk param while heartbeating, beforeKey:" + a + " afterKey:" + a2);
        return true;
    }
}
