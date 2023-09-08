package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.d */
final /* synthetic */ class C17280d implements Runnable {

    /* renamed from: a */
    private final C17272a f46814a;

    private C17280d(C17272a aVar) {
        this.f46814a = aVar;
    }

    /* renamed from: a */
    public static Runnable m17185a(C17272a aVar) {
        return new C17280d(aVar);
    }

    public final void run() {
        C17272a aVar = this.f46814a;
        if (!aVar.f46786b) {
            LiteavLog.m16905w("CustomRenderProcess", "renderer is not started!");
            return;
        }
        aVar.f46786b = false;
        aVar.mo20302a();
    }
}
