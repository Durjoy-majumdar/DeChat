package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

/* renamed from: com.tencent.liteav.videoproducer.producer.an */
final /* synthetic */ class C17586an implements Runnable {

    /* renamed from: a */
    private final C17604f f47828a;

    /* renamed from: b */
    private final CaptureSourceInterface.SourceType f47829b;

    /* renamed from: c */
    private final VideoProducerDef.ProducerMode f47830c;

    /* renamed from: d */
    private final CaptureSourceInterface.CaptureParams f47831d;

    private C17586an(C17604f fVar, CaptureSourceInterface.SourceType sourceType, VideoProducerDef.ProducerMode producerMode, CaptureSourceInterface.CaptureParams captureParams) {
        this.f47828a = fVar;
        this.f47829b = sourceType;
        this.f47830c = producerMode;
        this.f47831d = captureParams;
    }

    /* renamed from: a */
    public static Runnable m17784a(C17604f fVar, CaptureSourceInterface.SourceType sourceType, VideoProducerDef.ProducerMode producerMode, CaptureSourceInterface.CaptureParams captureParams) {
        return new C17586an(fVar, sourceType, producerMode, captureParams);
    }

    public final void run() {
        C17604f.m17865b(this.f47828a, this.f47829b, this.f47830c, this.f47831d);
    }
}
