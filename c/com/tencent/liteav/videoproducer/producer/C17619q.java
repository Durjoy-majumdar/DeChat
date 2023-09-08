package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

/* renamed from: com.tencent.liteav.videoproducer.producer.q */
final /* synthetic */ class C17619q implements Runnable {

    /* renamed from: a */
    private final C17604f f47957a;

    /* renamed from: b */
    private final VideoProducerDef.HomeOrientation f47958b;

    private C17619q(C17604f fVar, VideoProducerDef.HomeOrientation homeOrientation) {
        this.f47957a = fVar;
        this.f47958b = homeOrientation;
    }

    /* renamed from: a */
    public static Runnable m17906a(C17604f fVar, VideoProducerDef.HomeOrientation homeOrientation) {
        return new C17619q(fVar, homeOrientation);
    }

    public final void run() {
        C17604f.m17850a(this.f47957a, this.f47958b);
    }
}
