package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.f */
final /* synthetic */ class C17282f implements Runnable {

    /* renamed from: a */
    private final C17272a f46817a;

    /* renamed from: b */
    private final boolean f46818b;

    private C17282f(C17272a aVar, boolean z) {
        this.f46817a = aVar;
        this.f46818b = z;
    }

    /* renamed from: a */
    public static Runnable m17187a(C17272a aVar, boolean z) {
        return new C17282f(aVar, z);
    }

    public final void run() {
        C17272a aVar = this.f46817a;
        boolean z = this.f46818b;
        if (aVar.f46798n != z) {
            LiteavLog.m16901i("CustomRenderProcess", "setHorizontalMirror ".concat(String.valueOf(z)));
        }
        aVar.f46798n = z;
    }
}
