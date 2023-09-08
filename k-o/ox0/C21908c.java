package ox0;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8781l2;
import o40.C61926c;
import te3.C22521pi1;

/* renamed from: ox0.c */
public final class C21908c {
    /* renamed from: a */
    public final void mo34948a(C22521pi1 pi12, int i) {
        C87412m.m108594g(pi12, "finderRecommendData");
        boolean z = true;
        if (!(pi12.f64412G == 1 && pi12.f64438u == 4 && pi12.f64443z > pi12.f64442y)) {
            z = false;
        }
        long P = C61926c.m72671P(pi12.f64435r);
        String str = pi12.f64437t;
        C87412m.m108593f(str, "finderRecommendData.finder_object_nonce_id");
        boolean xE = ((C8781l2) C86312j.m106911c(C8781l2.class)).mo377xE(P, str, i, z);
        Log.m105924i("BizTimeLineFinderPreloadMgr", "addToPreload: triggerPreload=" + xE + ", isLandscapeVideo=" + z + ", objectId=" + C61926c.m72691p(P));
    }
}
