package com.tencent.p014mm.plugin.performance.watchdogs;

import com.tencent.p014mm.sdk.platformtools.Log;
import p757xv.C91355x;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.l */
public class C85340l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f248687d;

    /* renamed from: e */
    public final /* synthetic */ MemoryWatchDog f248688e;

    public C85340l(MemoryWatchDog memoryWatchDog, int i) {
        this.f248688e = memoryWatchDog;
        this.f248687d = i;
    }

    public void run() {
        C91355x h = this.f248688e.mo118582h(false, this.f248687d);
        Log.m105925i("MicroMsg.MemoryWatchDog", "[dumpMemoryAsync] %s", h);
        if (this.f248688e.mo118577c()) {
            this.f248688e.mo118597p(h, this.f248687d);
        }
    }
}
