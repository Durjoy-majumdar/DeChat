package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

/* renamed from: com.tencent.liteav.videoproducer.producer.k */
final /* synthetic */ class C17613k implements Runnable {

    /* renamed from: a */
    private final C17604f f47943a;

    /* renamed from: b */
    private final VideoProducerDef.StreamType f47944b;

    /* renamed from: c */
    private final VideoEncoderDef.EncodeStrategy f47945c;

    private C17613k(C17604f fVar, VideoProducerDef.StreamType streamType, VideoEncoderDef.EncodeStrategy encodeStrategy) {
        this.f47943a = fVar;
        this.f47944b = streamType;
        this.f47945c = encodeStrategy;
    }

    /* renamed from: a */
    public static Runnable m17900a(C17604f fVar, VideoProducerDef.StreamType streamType, VideoEncoderDef.EncodeStrategy encodeStrategy) {
        return new C17613k(fVar, streamType, encodeStrategy);
    }

    public final void run() {
        C17604f.m17855a(this.f47943a, this.f47944b, this.f47945c);
    }
}
