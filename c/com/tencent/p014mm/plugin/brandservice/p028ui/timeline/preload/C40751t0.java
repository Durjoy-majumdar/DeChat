package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import java.util.HashMap;
import java.util.List;
import ny0.C47307b;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.t0 */
public final class C40751t0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f109503d;

    /* renamed from: e */
    public final /* synthetic */ List<C47307b.C47308a> f109504e;

    public C40751t0(long j, List<C47307b.C47308a> list) {
        this.f109503d = j;
        this.f109504e = list;
    }

    public final void run() {
        HashMap<Long, HashMap<String, C47307b.C47308a>> hashMap = C40746q0.f109489c;
        if (!hashMap.containsKey(Long.valueOf(this.f109503d))) {
            hashMap.put(Long.valueOf(this.f109503d), new HashMap());
        }
        List<C47307b.C47308a> list = this.f109504e;
        long j = this.f109503d;
        for (C47307b.C47308a aVar : list) {
            HashMap hashMap2 = C40746q0.f109489c.get(Long.valueOf(j));
            if (hashMap2 != null) {
                C47307b.C47308a aVar2 = (C47307b.C47308a) hashMap2.put(aVar.f126969a, aVar);
            }
        }
    }
}
