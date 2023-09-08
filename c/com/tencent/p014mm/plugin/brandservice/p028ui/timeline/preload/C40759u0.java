package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.u0 */
public final class C40759u0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f109579d;

    public C40759u0(long j) {
        this.f109579d = j;
    }

    public final void run() {
        if (C40746q0.f109488b.containsKey(Long.valueOf(this.f109579d))) {
            Log.m105925i("MicroMsg.WebPrefetcherCallbackManager", "clearData session: %d", Long.valueOf(this.f109579d));
            C40746q0.m44019b(C40746q0.f109487a, this.f109579d, true, 0, 4, (Object) null);
        }
    }
}
