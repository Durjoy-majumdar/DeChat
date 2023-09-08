package bp1;

import bl3.C0325u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import ht1.C60200t1;
import rx3.C13598b0;
import yo1.C66690g;

/* renamed from: bp1.c */
public final class C54518c extends C0325u<C60200t1> {

    /* renamed from: d */
    public final String f152837d = "LiveReplayCacheSlice";

    /* renamed from: e */
    public final LruCache<Long, C66690g> f152838e = new LruCache<>(50);

    /* renamed from: c3 */
    public final void mo75360c3(long j, int i) {
        if (j != 0) {
            String str = this.f152837d;
            Log.m105924i(str, "cache offset:" + i + " for liveId:" + j);
            C66690g gVar = this.f152838e.get(Long.valueOf(j));
            if (gVar != null) {
                gVar.f191730a = i;
                return;
            }
            LruCache<Long, C66690g> lruCache = this.f152838e;
            Long valueOf = Long.valueOf(j);
            C66690g gVar2 = new C66690g();
            gVar2.f191730a = i;
            C13598b0 b0Var = C13598b0.f38549a;
            C66690g put = lruCache.put(valueOf, gVar2);
        }
    }

    public void onCleared() {
        super.onCleared();
    }
}
