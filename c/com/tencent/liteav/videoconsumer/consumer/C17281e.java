package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.videobase.utils.Rotation;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.e */
final /* synthetic */ class C17281e implements Runnable {

    /* renamed from: a */
    private final C17272a f46815a;

    /* renamed from: b */
    private final Rotation f46816b;

    private C17281e(C17272a aVar, Rotation rotation) {
        this.f46815a = aVar;
        this.f46816b = rotation;
    }

    /* renamed from: a */
    public static Runnable m17186a(C17272a aVar, Rotation rotation) {
        return new C17281e(aVar, rotation);
    }

    public final void run() {
        this.f46815a.f46797m = this.f46816b;
    }
}
