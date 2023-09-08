package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.bd */
final /* synthetic */ class C17433bd implements Runnable {

    /* renamed from: a */
    private final C17428bc f47308a;

    private C17433bd(C17428bc bcVar) {
        this.f47308a = bcVar;
    }

    /* renamed from: a */
    public static Runnable m17512a(C17428bc bcVar) {
        return new C17433bd(bcVar);
    }

    public final void run() {
        this.f47308a.m17498a(false);
    }
}
