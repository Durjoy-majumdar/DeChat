package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.videoconsumer.consumer.ServerVideoConsumerConfig;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.w */
final /* synthetic */ class C17366w implements Runnable {

    /* renamed from: a */
    private final C17359q f47086a;

    /* renamed from: b */
    private final ServerVideoConsumerConfig f47087b;

    private C17366w(C17359q qVar, ServerVideoConsumerConfig serverVideoConsumerConfig) {
        this.f47086a = qVar;
        this.f47087b = serverVideoConsumerConfig;
    }

    /* renamed from: a */
    public static Runnable m17332a(C17359q qVar, ServerVideoConsumerConfig serverVideoConsumerConfig) {
        return new C17366w(qVar, serverVideoConsumerConfig);
    }

    public final void run() {
        C17359q.m17318a(this.f47086a, this.f47087b);
    }
}
