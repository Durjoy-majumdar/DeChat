package iy0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import ex0.C45700h;
import gy3.C87412m;
import java.util.List;
import z04.C112551y;

/* renamed from: iy0.q */
public final class C9266q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List<C45700h.C45702b> f29017d;

    public C9266q(List<? extends C45700h.C45702b> list) {
        this.f29017d = list;
    }

    public final void run() {
        for (C45700h.C45702b bVar : this.f29017d) {
            String str = bVar.f123504a;
            C87412m.m108593f(str, "info.url");
            boolean z = false;
            if (C112551y.m153819s(str, "http", false) && bVar.f123514k != null) {
                String a = C9263p.m8906a(bVar.f123504a);
                String b = C9263p.m8907b(a, bVar);
                if (a.length() > 0) {
                    if (b.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        Log.m105924i("MicroMsg.WebPrefetcherUrlQueryManager", "saveUrlQueryList key: " + a + ", encodeQueryList " + b);
                        ((MultiProcessMMKV) C9263p.f29013a.getSlotForWrite()).encode(a, b);
                    } else {
                        MMKVSlotManager mMKVSlotManager = C9263p.f29013a;
                        if (mMKVSlotManager.containsKey(a)) {
                            Log.m105924i("MicroMsg.WebPrefetcherUrlQueryManager", "saveUrlQueryList remove key: " + a);
                            mMKVSlotManager.removeKey(a);
                        }
                    }
                }
            }
        }
    }
}
