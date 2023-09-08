package com.tencent.liteav.videoproducer.encoder;

/* renamed from: com.tencent.liteav.videoproducer.encoder.ac */
final /* synthetic */ class C17469ac implements Runnable {

    /* renamed from: a */
    private final C17529w f47415a;

    private C17469ac(C17529w wVar) {
        this.f47415a = wVar;
    }

    /* renamed from: a */
    public static Runnable m17559a(C17529w wVar) {
        return new C17469ac(wVar);
    }

    public final void run() {
        C17529w wVar = this.f47415a;
        if (wVar.f47608f.fullIFrame) {
            wVar.mo20746b();
        }
    }
}
