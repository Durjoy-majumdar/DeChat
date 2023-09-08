package com.tencent.liteav.videoproducer.producer;

/* renamed from: com.tencent.liteav.videoproducer.producer.ac */
final /* synthetic */ class C17575ac implements Runnable {

    /* renamed from: a */
    private final C17604f f47798a;

    /* renamed from: b */
    private final ServerVideoProducerConfig f47799b;

    private C17575ac(C17604f fVar, ServerVideoProducerConfig serverVideoProducerConfig) {
        this.f47798a = fVar;
        this.f47799b = serverVideoProducerConfig;
    }

    /* renamed from: a */
    public static Runnable m17773a(C17604f fVar, ServerVideoProducerConfig serverVideoProducerConfig) {
        return new C17575ac(fVar, serverVideoProducerConfig);
    }

    public final void run() {
        C17604f.m17848a(this.f47798a, this.f47799b);
    }
}
