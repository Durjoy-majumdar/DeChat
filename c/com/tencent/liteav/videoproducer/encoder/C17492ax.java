package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;

/* renamed from: com.tencent.liteav.videoproducer.encoder.ax */
final /* synthetic */ class C17492ax implements Runnable {

    /* renamed from: a */
    private final C17474ah f47479a;

    /* renamed from: b */
    private final ServerVideoProducerConfig f47480b;

    private C17492ax(C17474ah ahVar, ServerVideoProducerConfig serverVideoProducerConfig) {
        this.f47479a = ahVar;
        this.f47480b = serverVideoProducerConfig;
    }

    /* renamed from: a */
    public static Runnable m17634a(C17474ah ahVar, ServerVideoProducerConfig serverVideoProducerConfig) {
        return new C17492ax(ahVar, serverVideoProducerConfig);
    }

    public final void run() {
        this.f47479a.f47435n = this.f47480b;
    }
}
