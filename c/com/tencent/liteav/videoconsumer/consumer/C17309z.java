package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.consumer.C17286j;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.z */
final /* synthetic */ class C17309z implements Runnable {

    /* renamed from: a */
    private final C17286j f46891a;

    private C17309z(C17286j jVar) {
        this.f46891a = jVar;
    }

    /* renamed from: a */
    public static Runnable m17219a(C17286j jVar) {
        return new C17309z(jVar);
    }

    public final void run() {
        C17286j jVar = this.f46891a;
        String str = jVar.f46828a;
        LiteavLog.m16901i(str, "resume , current status is " + jVar.f46843p);
        if (jVar.f46843p == C17286j.C17292a.PAUSED) {
            jVar.f46843p = C17286j.C17292a.STARTED;
        }
        jVar.f46844q = false;
    }
}
