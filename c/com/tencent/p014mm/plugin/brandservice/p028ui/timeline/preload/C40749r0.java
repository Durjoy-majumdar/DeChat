package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45700h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.r0 */
public final class C40749r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f109499d;

    /* renamed from: e */
    public final /* synthetic */ boolean f109500e;

    public C40749r0(long j, boolean z) {
        this.f109499d = j;
        this.f109500e = z;
    }

    public final void run() {
        C45700h.C45701a aVar;
        WeakReference remove = C40746q0.f109488b.remove(Long.valueOf(this.f109499d));
        if (!(remove == null || (aVar = (C45700h.C45701a) remove.get()) == null)) {
            long j = this.f109499d;
            boolean z = this.f109500e;
            HashMap remove2 = C40746q0.f109490d.remove(Long.valueOf(j));
            ArrayList arrayList = new ArrayList();
            if (remove2 != null) {
                for (Map.Entry value : remove2.entrySet()) {
                    C45700h.C45704d dVar = (C45700h.C45704d) value.getValue();
                    Log.m105925i("MicroMsg.WebPrefetcherCallbackManager", "notifyCallback session: %d, timeout: %s, url: %s, result: %d", Long.valueOf(j), Boolean.valueOf(z), dVar.f123529a.f123504a, Integer.valueOf(dVar.f123530b));
                    if (z || dVar.f123530b == 1) {
                        dVar.f123530b = 8;
                        arrayList.add(dVar);
                    } else {
                        arrayList.add(dVar);
                    }
                }
            }
            aVar.mo68728a(arrayList);
        }
        C40746q0 q0Var = C40746q0.f109487a;
        long j2 = this.f109499d;
        C40746q0.f109489c.remove(Long.valueOf(j2));
        C40746q0.f109490d.remove(Long.valueOf(j2));
    }
}
