package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videoproducer.encoder.VideoEncodeParams;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

/* renamed from: com.tencent.liteav.videoproducer.producer.i */
final /* synthetic */ class C17611i implements Runnable {

    /* renamed from: a */
    private final C17604f f47937a;

    /* renamed from: b */
    private final VideoProducerDef.StreamType f47938b;

    /* renamed from: c */
    private final VideoEncodeParams f47939c;

    /* renamed from: d */
    private final VideoEncoderDef.VideoEncoderDataListener f47940d;

    private C17611i(C17604f fVar, VideoProducerDef.StreamType streamType, VideoEncodeParams videoEncodeParams, VideoEncoderDef.VideoEncoderDataListener videoEncoderDataListener) {
        this.f47937a = fVar;
        this.f47938b = streamType;
        this.f47939c = videoEncodeParams;
        this.f47940d = videoEncoderDataListener;
    }

    /* renamed from: a */
    public static Runnable m17898a(C17604f fVar, VideoProducerDef.StreamType streamType, VideoEncodeParams videoEncodeParams, VideoEncoderDef.VideoEncoderDataListener videoEncoderDataListener) {
        return new C17611i(fVar, streamType, videoEncodeParams, videoEncoderDataListener);
    }

    public final void run() {
        C17604f.m17854a(this.f47937a, this.f47938b, this.f47939c, this.f47940d);
    }
}
