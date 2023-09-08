package com.tencent.liteav.videoproducer.producer;

/* renamed from: com.tencent.liteav.videoproducer.producer.al */
final /* synthetic */ class C17584al implements Runnable {

    /* renamed from: a */
    private final C17604f f47823a;

    /* renamed from: b */
    private final boolean f47824b;

    private C17584al(C17604f fVar, boolean z) {
        this.f47823a = fVar;
        this.f47824b = z;
    }

    /* renamed from: a */
    public static Runnable m17782a(C17604f fVar, boolean z) {
        return new C17584al(fVar, z);
    }

    public final void run() {
        C17604f.m17857a(this.f47823a, this.f47824b);
    }
}
