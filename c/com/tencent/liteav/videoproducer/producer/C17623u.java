package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

/* renamed from: com.tencent.liteav.videoproducer.producer.u */
final /* synthetic */ class C17623u implements Runnable {

    /* renamed from: a */
    private final C17604f f47967a;

    /* renamed from: b */
    private final int f47968b;

    /* renamed from: c */
    private final VideoProducerDef.StreamType f47969c;

    private C17623u(C17604f fVar, int i, VideoProducerDef.StreamType streamType) {
        this.f47967a = fVar;
        this.f47968b = i;
        this.f47969c = streamType;
    }

    /* renamed from: a */
    public static Runnable m17910a(C17604f fVar, int i, VideoProducerDef.StreamType streamType) {
        return new C17623u(fVar, i, streamType);
    }

    public final void run() {
        C17604f.m17832a(this.f47967a, this.f47968b, this.f47969c);
    }
}
