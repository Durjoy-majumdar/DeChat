package bb1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.storage.C72959e;
import di3.C86312j;
import g62.C75875l;
import gy3.C87412m;
import p727vq.C37801b;
import up1.C78268z;

/* renamed from: bb1.g */
public final class C28283g implements C37801b {
    public C72959e j20(C75875l lVar) {
        C87412m.m108594g(lVar, "msgStg");
        FinderCommonFeatureService finderCommonFeatureService = (FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class);
        finderCommonFeatureService.getClass();
        C78268z zVar = finderCommonFeatureService.f157808t;
        if (zVar == null) {
            zVar = new C78268z(lVar);
        }
        finderCommonFeatureService.f157808t = zVar;
        return zVar;
    }
}
