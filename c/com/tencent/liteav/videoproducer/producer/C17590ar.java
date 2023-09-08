package com.tencent.liteav.videoproducer.producer;

/* renamed from: com.tencent.liteav.videoproducer.producer.ar */
final /* synthetic */ class C17590ar implements Runnable {

    /* renamed from: a */
    private final C17604f f47844a;

    /* renamed from: b */
    private final float f47845b;

    private C17590ar(C17604f fVar, float f) {
        this.f47844a = fVar;
        this.f47845b = f;
    }

    /* renamed from: a */
    public static Runnable m17788a(C17604f fVar, float f) {
        return new C17590ar(fVar, f);
    }

    public final void run() {
        C17604f.m17829a(this.f47844a, this.f47845b);
    }
}
