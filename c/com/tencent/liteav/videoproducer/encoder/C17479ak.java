package com.tencent.liteav.videoproducer.encoder;

/* renamed from: com.tencent.liteav.videoproducer.encoder.ak */
final /* synthetic */ class C17479ak implements Runnable {

    /* renamed from: a */
    private final C17474ah f47453a;

    /* renamed from: b */
    private final boolean f47454b;

    private C17479ak(C17474ah ahVar, boolean z) {
        this.f47453a = ahVar;
        this.f47454b = z;
    }

    /* renamed from: a */
    public static Runnable m17621a(C17474ah ahVar, boolean z) {
        return new C17479ak(ahVar, z);
    }

    public final void run() {
        this.f47453a.f47434m = this.f47454b;
    }
}
