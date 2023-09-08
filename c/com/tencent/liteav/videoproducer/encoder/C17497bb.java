package com.tencent.liteav.videoproducer.encoder;

/* renamed from: com.tencent.liteav.videoproducer.encoder.bb */
final /* synthetic */ class C17497bb implements Runnable {

    /* renamed from: a */
    private final C17474ah f47487a;

    private C17497bb(C17474ah ahVar) {
        this.f47487a = ahVar;
    }

    /* renamed from: a */
    public static Runnable m17639a(C17474ah ahVar) {
        return new C17497bb(ahVar);
    }

    public final void run() {
        C17474ah.m17587d(this.f47487a);
    }
}
