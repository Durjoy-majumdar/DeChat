package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45700h;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.v0 */
public final class C40778v0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f109627d;

    /* renamed from: e */
    public final /* synthetic */ List<C45700h.C45704d> f109628e;

    public C40778v0(long j, List<? extends C45700h.C45704d> list) {
        this.f109627d = j;
        this.f109628e = list;
    }

    public final void run() {
        if (C40746q0.f109489c.containsKey(Long.valueOf(this.f109627d))) {
            HashMap<Long, HashMap<String, C45700h.C45704d>> hashMap = C40746q0.f109490d;
            if (!hashMap.containsKey(Long.valueOf(this.f109627d))) {
                hashMap.put(Long.valueOf(this.f109627d), new HashMap());
            }
            List<C45700h.C45704d> list = this.f109628e;
            long j = this.f109627d;
            for (C45700h.C45704d dVar : list) {
                C45700h.C45702b bVar = dVar.f123529a;
                if (bVar != null) {
                    Log.m105925i("MicroMsg.WebPrefetcherCallbackManager", "setPreAuthResult session: %d, %d, url: %s", Long.valueOf(j), Integer.valueOf(dVar.f123530b), bVar.f123504a);
                    HashMap hashMap2 = C40746q0.f109490d.get(Long.valueOf(j));
                    if (hashMap2 != null) {
                        C45700h.C45704d dVar2 = (C45700h.C45704d) hashMap2.put(bVar.f123504a, dVar);
                    }
                }
            }
        }
    }
}
