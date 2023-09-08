package com.tencent.liteav.videoproducer.producer;

/* renamed from: com.tencent.liteav.videoproducer.producer.aj */
final /* synthetic */ class C17582aj implements Runnable {

    /* renamed from: a */
    private final C17604f f47819a;

    /* renamed from: b */
    private final boolean f47820b;

    private C17582aj(C17604f fVar, boolean z) {
        this.f47819a = fVar;
        this.f47820b = z;
    }

    /* renamed from: a */
    public static Runnable m17780a(C17604f fVar, boolean z) {
        return new C17582aj(fVar, z);
    }

    public final void run() {
        C17604f.m17870c(this.f47819a, this.f47820b);
    }
}
