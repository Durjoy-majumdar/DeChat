package com.tencent.liteav.videoproducer.encoder;

/* renamed from: com.tencent.liteav.videoproducer.encoder.am */
public final /* synthetic */ class C17481am implements Runnable {

    /* renamed from: a */
    private final C17474ah f47456a;

    /* renamed from: b */
    private final int f47457b;

    private C17481am(C17474ah ahVar, int i) {
        this.f47456a = ahVar;
        this.f47457b = i;
    }

    /* renamed from: a */
    public static Runnable m17623a(C17474ah ahVar, int i) {
        return new C17481am(ahVar, i);
    }

    public final void run() {
        C17474ah.m17584b(this.f47456a, this.f47457b);
    }
}
