package com.tencent.liteav.videoproducer.encoder;

/* renamed from: com.tencent.liteav.videoproducer.encoder.an */
public final /* synthetic */ class C17482an implements Runnable {

    /* renamed from: a */
    private final C17474ah f47458a;

    /* renamed from: b */
    private final int f47459b;

    private C17482an(C17474ah ahVar, int i) {
        this.f47458a = ahVar;
        this.f47459b = i;
    }

    /* renamed from: a */
    public static Runnable m17624a(C17474ah ahVar, int i) {
        return new C17482an(ahVar, i);
    }

    public final void run() {
        C17474ah.m17569a(this.f47458a, this.f47459b);
    }
}
