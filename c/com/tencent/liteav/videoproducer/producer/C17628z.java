package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.utils.Rotation;

/* renamed from: com.tencent.liteav.videoproducer.producer.z */
final /* synthetic */ class C17628z implements Runnable {

    /* renamed from: a */
    private final C17604f f47980a;

    /* renamed from: b */
    private final Rotation f47981b;

    private C17628z(C17604f fVar, Rotation rotation) {
        this.f47980a = fVar;
        this.f47981b = rotation;
    }

    /* renamed from: a */
    public static Runnable m17915a(C17604f fVar, Rotation rotation) {
        return new C17628z(fVar, rotation);
    }

    public final void run() {
        C17604f.m17844a(this.f47980a, this.f47981b);
    }
}
