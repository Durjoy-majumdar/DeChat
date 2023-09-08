package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

/* renamed from: com.tencent.liteav.videoproducer.producer.w */
final /* synthetic */ class C17625w implements Runnable {

    /* renamed from: a */
    private final C17604f f47974a;

    /* renamed from: b */
    private final VideoProducerDef.StreamType f47975b;

    private C17625w(C17604f fVar, VideoProducerDef.StreamType streamType) {
        this.f47974a = fVar;
        this.f47975b = streamType;
    }

    /* renamed from: a */
    public static Runnable m17912a(C17604f fVar, VideoProducerDef.StreamType streamType) {
        return new C17625w(fVar, streamType);
    }

    public final void run() {
        C17604f.m17851a(this.f47974a, this.f47975b);
    }
}
