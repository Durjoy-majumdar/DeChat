package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.utils.Rotation;

/* renamed from: com.tencent.liteav.videoproducer.producer.m */
final /* synthetic */ class C17615m implements Runnable {

    /* renamed from: a */
    private final C17604f f47948a;

    /* renamed from: b */
    private final Rotation f47949b;

    private C17615m(C17604f fVar, Rotation rotation) {
        this.f47948a = fVar;
        this.f47949b = rotation;
    }

    /* renamed from: a */
    public static Runnable m17902a(C17604f fVar, Rotation rotation) {
        return new C17615m(fVar, rotation);
    }

    public final void run() {
        C17604f.m17864b(this.f47948a, this.f47949b);
    }
}
