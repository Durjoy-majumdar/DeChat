package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

/* renamed from: com.tencent.liteav.videoproducer.producer.j */
final /* synthetic */ class C17612j implements Runnable {

    /* renamed from: a */
    private final C17604f f47941a;

    /* renamed from: b */
    private final VideoProducerDef.StreamType f47942b;

    private C17612j(C17604f fVar, VideoProducerDef.StreamType streamType) {
        this.f47941a = fVar;
        this.f47942b = streamType;
    }

    /* renamed from: a */
    public static Runnable m17899a(C17604f fVar, VideoProducerDef.StreamType streamType) {
        return new C17612j(fVar, streamType);
    }

    public final void run() {
        C17604f.m17866b(this.f47941a, this.f47942b);
    }
}
