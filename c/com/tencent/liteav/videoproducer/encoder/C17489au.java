package com.tencent.liteav.videoproducer.encoder;

/* renamed from: com.tencent.liteav.videoproducer.encoder.au */
final /* synthetic */ class C17489au implements Runnable {

    /* renamed from: a */
    private final C17474ah f47471a;

    /* renamed from: b */
    private final boolean f47472b;

    /* renamed from: c */
    private final int f47473c;

    private C17489au(C17474ah ahVar, boolean z, int i) {
        this.f47471a = ahVar;
        this.f47472b = z;
        this.f47473c = i;
    }

    /* renamed from: a */
    public static Runnable m17631a(C17474ah ahVar, boolean z, int i) {
        return new C17489au(ahVar, z, i);
    }

    public final void run() {
        C17474ah.m17580a(this.f47471a, this.f47472b, this.f47473c);
    }
}
