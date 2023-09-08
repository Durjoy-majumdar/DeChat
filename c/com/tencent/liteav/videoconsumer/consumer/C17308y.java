package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.consumer.C17286j;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.y */
final /* synthetic */ class C17308y implements Runnable {

    /* renamed from: a */
    private final C17286j f46890a;

    private C17308y(C17286j jVar) {
        this.f46890a = jVar;
    }

    /* renamed from: a */
    public static Runnable m17218a(C17286j jVar) {
        return new C17308y(jVar);
    }

    public final void run() {
        C17286j jVar = this.f46890a;
        String str = jVar.f46828a;
        LiteavLog.m16901i(str, "pause , current status is " + jVar.f46843p);
        if (jVar.f46843p == C17286j.C17292a.STARTED) {
            jVar.f46851x.mo20474a();
            jVar.f46843p = C17286j.C17292a.PAUSED;
        }
        jVar.f46844q = true;
    }
}
