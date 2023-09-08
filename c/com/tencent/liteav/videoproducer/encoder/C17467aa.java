package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;

/* renamed from: com.tencent.liteav.videoproducer.encoder.aa */
final /* synthetic */ class C17467aa implements Runnable {

    /* renamed from: a */
    private final C17529w f47409a;

    /* renamed from: b */
    private final ServerVideoProducerConfig f47410b;

    private C17467aa(C17529w wVar, ServerVideoProducerConfig serverVideoProducerConfig) {
        this.f47409a = wVar;
        this.f47410b = serverVideoProducerConfig;
    }

    /* renamed from: a */
    public static Runnable m17557a(C17529w wVar, ServerVideoProducerConfig serverVideoProducerConfig) {
        return new C17467aa(wVar, serverVideoProducerConfig);
    }

    public final void run() {
        this.f47409a.f47611i = this.f47410b;
    }
}
