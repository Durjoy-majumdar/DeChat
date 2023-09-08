package com.tencent.liteav.videoproducer.encoder;

/* renamed from: com.tencent.liteav.videoproducer.encoder.p */
final /* synthetic */ class C17521p implements Runnable {

    /* renamed from: a */
    private final C17520o f47570a;

    private C17521p(C17520o oVar) {
        this.f47570a = oVar;
    }

    /* renamed from: a */
    public static Runnable m17695a(C17520o oVar) {
        return new C17521p(oVar);
    }

    public final void run() {
        C17520o.m17684a(this.f47570a);
    }
}
