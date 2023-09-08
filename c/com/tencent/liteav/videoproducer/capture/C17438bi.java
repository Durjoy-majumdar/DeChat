package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.bi */
final /* synthetic */ class C17438bi implements Runnable {

    /* renamed from: a */
    private final C17428bc f47320a;

    private C17438bi(C17428bc bcVar) {
        this.f47320a = bcVar;
    }

    /* renamed from: a */
    public static Runnable m17517a(C17428bc bcVar) {
        return new C17438bi(bcVar);
    }

    public final void run() {
        C17428bc.m17503d(this.f47320a);
    }
}
