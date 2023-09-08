package com.tencent.liteav.videoconsumer.decoder;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.v */
final /* synthetic */ class C17365v implements Runnable {

    /* renamed from: a */
    private final C17359q f47085a;

    private C17365v(C17359q qVar) {
        this.f47085a = qVar;
    }

    /* renamed from: a */
    public static Runnable m17331a(C17359q qVar) {
        return new C17365v(qVar);
    }

    public final void run() {
        C17359q.m17326c(this.f47085a);
    }
}
