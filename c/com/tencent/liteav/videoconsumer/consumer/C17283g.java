package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.g */
final /* synthetic */ class C17283g implements Runnable {

    /* renamed from: a */
    private final C17272a f46819a;

    /* renamed from: b */
    private final boolean f46820b;

    private C17283g(C17272a aVar, boolean z) {
        this.f46819a = aVar;
        this.f46820b = z;
    }

    /* renamed from: a */
    public static Runnable m17188a(C17272a aVar, boolean z) {
        return new C17283g(aVar, z);
    }

    public final void run() {
        C17272a aVar = this.f46819a;
        boolean z = this.f46820b;
        if (aVar.f46799o != z) {
            LiteavLog.m16901i("CustomRenderProcess", "setVerticalMirror ".concat(String.valueOf(z)));
        }
        aVar.f46799o = z;
    }
}
