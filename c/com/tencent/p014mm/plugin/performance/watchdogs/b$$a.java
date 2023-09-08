package com.tencent.p014mm.plugin.performance.watchdogs;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.b$$a */
public final /* synthetic */ class b$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C85325b f248617d;

    public /* synthetic */ b$$a(C85325b bVar) {
        this.f248617d = bVar;
    }

    public final void run() {
        C85325b bVar = this.f248617d;
        bVar.getClass();
        try {
            Log.m105921e("MicroMsg.FDWatchDog", ">>>>>>>>>>>> FD DUMP: total count = %d", Integer.valueOf(bVar.mo118615a()));
            bVar.mo118617c();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.FDWatchDog", th, "dump fd err", new Object[0]);
        }
    }
}
