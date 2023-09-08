package com.tencent.liteav.videoproducer.producer;

/* renamed from: com.tencent.liteav.videoproducer.producer.ak */
final /* synthetic */ class C17583ak implements Runnable {

    /* renamed from: a */
    private final C17604f f47821a;

    /* renamed from: b */
    private final boolean f47822b;

    private C17583ak(C17604f fVar, boolean z) {
        this.f47821a = fVar;
        this.f47822b = z;
    }

    /* renamed from: a */
    public static Runnable m17781a(C17604f fVar, boolean z) {
        return new C17583ak(fVar, z);
    }

    public final void run() {
        C17604f.m17867b(this.f47821a, this.f47822b);
    }
}
