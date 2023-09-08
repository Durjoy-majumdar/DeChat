package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

/* renamed from: com.tencent.liteav.videoproducer.producer.t */
final /* synthetic */ class C17622t implements Runnable {

    /* renamed from: a */
    private final C17604f f47964a;

    /* renamed from: b */
    private final int f47965b;

    /* renamed from: c */
    private final VideoProducerDef.StreamType f47966c;

    private C17622t(C17604f fVar, int i, VideoProducerDef.StreamType streamType) {
        this.f47964a = fVar;
        this.f47965b = i;
        this.f47966c = streamType;
    }

    /* renamed from: a */
    public static Runnable m17909a(C17604f fVar, int i, VideoProducerDef.StreamType streamType) {
        return new C17622t(fVar, i, streamType);
    }

    public final void run() {
        C17604f.m17862b(this.f47964a, this.f47965b, this.f47966c);
    }
}
