package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

/* renamed from: com.tencent.liteav.videoproducer.producer.at */
final /* synthetic */ class C17592at implements Runnable {

    /* renamed from: a */
    private final C17604f f47847a;

    /* renamed from: b */
    private final CaptureSourceInterface.SourceType f47848b;

    /* renamed from: c */
    private final VideoProducerDef.ProducerMode f47849c;

    /* renamed from: d */
    private final CaptureSourceInterface.CaptureParams f47850d;

    private C17592at(C17604f fVar, CaptureSourceInterface.SourceType sourceType, VideoProducerDef.ProducerMode producerMode, CaptureSourceInterface.CaptureParams captureParams) {
        this.f47847a = fVar;
        this.f47848b = sourceType;
        this.f47849c = producerMode;
        this.f47850d = captureParams;
    }

    /* renamed from: a */
    public static Runnable m17790a(C17604f fVar, CaptureSourceInterface.SourceType sourceType, VideoProducerDef.ProducerMode producerMode, CaptureSourceInterface.CaptureParams captureParams) {
        return new C17592at(fVar, sourceType, producerMode, captureParams);
    }

    public final void run() {
        C17604f.m17847a(this.f47847a, this.f47848b, this.f47849c, this.f47850d);
    }
}
