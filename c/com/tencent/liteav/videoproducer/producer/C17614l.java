package com.tencent.liteav.videoproducer.producer;

/* renamed from: com.tencent.liteav.videoproducer.producer.l */
final /* synthetic */ class C17614l implements Runnable {

    /* renamed from: a */
    private final C17604f f47946a;

    /* renamed from: b */
    private final boolean f47947b;

    private C17614l(C17604f fVar, boolean z) {
        this.f47946a = fVar;
        this.f47947b = z;
    }

    /* renamed from: a */
    public static Runnable m17901a(C17604f fVar, boolean z) {
        return new C17614l(fVar, z);
    }

    public final void run() {
        C17604f.m17873d(this.f47946a, this.f47947b);
    }
}
