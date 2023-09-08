package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.r */
final /* synthetic */ class C17361r implements Runnable {

    /* renamed from: a */
    private final C17359q f47078a;

    /* renamed from: b */
    private final VideoDecoderDef.ConsumerScene f47079b;

    private C17361r(C17359q qVar, VideoDecoderDef.ConsumerScene consumerScene) {
        this.f47078a = qVar;
        this.f47079b = consumerScene;
    }

    /* renamed from: a */
    public static Runnable m17327a(C17359q qVar, VideoDecoderDef.ConsumerScene consumerScene) {
        return new C17361r(qVar, consumerScene);
    }

    public final void run() {
        this.f47078a.f47067q = this.f47079b;
    }
}
