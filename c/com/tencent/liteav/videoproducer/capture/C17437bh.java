package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.bh */
final /* synthetic */ class C17437bh implements Runnable {

    /* renamed from: a */
    private final C17428bc f47319a;

    private C17437bh(C17428bc bcVar) {
        this.f47319a = bcVar;
    }

    /* renamed from: a */
    public static Runnable m17516a(C17428bc bcVar) {
        return new C17437bh(bcVar);
    }

    public final void run() {
        C17428bc.m17502c(this.f47319a);
    }
}
