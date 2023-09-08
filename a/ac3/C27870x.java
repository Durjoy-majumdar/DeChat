package ac3;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedHashSet;
import rx3.C13598b0;

/* renamed from: ac3.x */
public final class C27870x extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        C87412m.m108594g(checkResUpdateCacheFileEvent, "event");
        CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
        int i = aVar.f78744a;
        boolean z = aVar.f78748e;
        C27862u0 u0Var = C27862u0.f77002a;
        if (!C27862u0.f77007f.contains(Integer.valueOf(i))) {
            return false;
        }
        CheckResUpdateCacheFileEvent.C28720a aVar2 = checkResUpdateCacheFileEvent.f78743d;
        int i2 = aVar2.f78745b;
        String str = aVar2.f78746c;
        Log.m105924i("MicroMsg.WeVisModelMgr", "getRes: " + i + ", " + i2 + ", " + str + ", " + z);
        if (!z || str == null) {
            return false;
        }
        u0Var.mo55646a(i, i2, str);
        u0Var.mo55652g();
        LinkedHashSet<String> linkedHashSet = C27862u0.f77008g;
        synchronized (linkedHashSet) {
            if (!linkedHashSet.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append('.');
                sb.append(i2);
                linkedHashSet.remove(sb.toString());
                if (linkedHashSet.isEmpty()) {
                    C27855h1.f76992a.mo55644c();
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return false;
    }
}
