package com.tencent.liteav.videoproducer.producer;

/* renamed from: com.tencent.liteav.videoproducer.producer.n */
final /* synthetic */ class C17616n implements Runnable {

    /* renamed from: a */
    private final C17604f f47950a;

    /* renamed from: b */
    private final String f47951b;

    private C17616n(C17604f fVar, String str) {
        this.f47950a = fVar;
        this.f47951b = str;
    }

    /* renamed from: a */
    public static Runnable m17903a(C17604f fVar, String str) {
        return new C17616n(fVar, str);
    }

    public final void run() {
        C17604f.m17856a(this.f47950a, this.f47951b);
    }
}
