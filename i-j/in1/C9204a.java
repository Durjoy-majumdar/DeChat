package in1;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import os1.C11759w;

/* renamed from: in1.a */
public final class C9204a {

    /* renamed from: a */
    public final C11759w f28946a;

    public C9204a() {
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11759w.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…eloadCacheVM::class.java)");
        this.f28946a = (C11759w) a;
    }

    /* renamed from: a */
    public final void mo10009a(int i, long j, long j2, long j3) {
        Log.m105924i("PreloadCacheManager", "storePreloadTimeStampCache lastFindPrefetchTimeStampMs:" + j + " lastRedDotPrefetchTimeStampMs:" + j2 + " lastTabPagesPrefetchTimeStampMs:" + j3);
        C11759w.C11761b e3 = this.f28946a.mo11636e3(i);
        if (j != 0) {
            e3.f34439b = j;
        }
        if (j2 != 0) {
            e3.f34440c = j2;
        }
        if (j3 != 0) {
            e3.f34441d = j3;
        }
    }
}
