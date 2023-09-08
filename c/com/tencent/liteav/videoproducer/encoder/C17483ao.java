package com.tencent.liteav.videoproducer.encoder;

/* renamed from: com.tencent.liteav.videoproducer.encoder.ao */
public final /* synthetic */ class C17483ao implements Runnable {

    /* renamed from: a */
    private final C17474ah f47460a;

    /* renamed from: b */
    private final int f47461b;

    /* renamed from: c */
    private final int f47462c;

    private C17483ao(C17474ah ahVar, int i, int i2) {
        this.f47460a = ahVar;
        this.f47461b = i;
        this.f47462c = i2;
    }

    /* renamed from: a */
    public static Runnable m17625a(C17474ah ahVar, int i, int i2) {
        return new C17483ao(ahVar, i, i2);
    }

    public final void run() {
        C17474ah.m17570a(this.f47460a, this.f47461b, this.f47462c);
    }
}
