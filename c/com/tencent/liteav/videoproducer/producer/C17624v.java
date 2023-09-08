package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videoproducer.producer.VideoProducerDef;

/* renamed from: com.tencent.liteav.videoproducer.producer.v */
final /* synthetic */ class C17624v implements Runnable {

    /* renamed from: a */
    private final C17604f f47970a;

    /* renamed from: b */
    private final VideoProducerDef.StreamType f47971b;

    /* renamed from: c */
    private final int f47972c;

    /* renamed from: d */
    private final int f47973d;

    private C17624v(C17604f fVar, VideoProducerDef.StreamType streamType, int i, int i2) {
        this.f47970a = fVar;
        this.f47971b = streamType;
        this.f47972c = i;
        this.f47973d = i2;
    }

    /* renamed from: a */
    public static Runnable m17911a(C17604f fVar, VideoProducerDef.StreamType streamType, int i, int i2) {
        return new C17624v(fVar, streamType, i, i2);
    }

    public final void run() {
        C17604f.m17852a(this.f47970a, this.f47971b, this.f47972c, this.f47973d);
    }
}
