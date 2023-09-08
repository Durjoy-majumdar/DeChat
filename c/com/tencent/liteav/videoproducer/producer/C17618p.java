package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

/* renamed from: com.tencent.liteav.videoproducer.producer.p */
final /* synthetic */ class C17618p implements Runnable {

    /* renamed from: a */
    private final C17604f f47955a;

    /* renamed from: b */
    private final VideoProducerDef.GSensorMode f47956b;

    private C17618p(C17604f fVar, VideoProducerDef.GSensorMode gSensorMode) {
        this.f47955a = fVar;
        this.f47956b = gSensorMode;
    }

    /* renamed from: a */
    public static Runnable m17905a(C17604f fVar, VideoProducerDef.GSensorMode gSensorMode) {
        return new C17618p(fVar, gSensorMode);
    }

    public final void run() {
        C17604f.m17849a(this.f47955a, this.f47956b);
    }
}
