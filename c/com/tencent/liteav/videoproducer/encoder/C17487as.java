package com.tencent.liteav.videoproducer.encoder;

/* renamed from: com.tencent.liteav.videoproducer.encoder.as */
final /* synthetic */ class C17487as implements Runnable {

    /* renamed from: a */
    private final C17474ah f47467a;

    /* renamed from: b */
    private final String f47468b;

    private C17487as(C17474ah ahVar, String str) {
        this.f47467a = ahVar;
        this.f47468b = str;
    }

    /* renamed from: a */
    public static Runnable m17629a(C17474ah ahVar, String str) {
        return new C17487as(ahVar, str);
    }

    public final void run() {
        C17474ah.m17578a(this.f47467a, this.f47468b);
    }
}
