package com.tencent.liteav.videoproducer.encoder;

/* renamed from: com.tencent.liteav.videoproducer.encoder.ag */
final /* synthetic */ class C17473ag implements Runnable {

    /* renamed from: a */
    private final C17529w f47421a;

    private C17473ag(C17529w wVar) {
        this.f47421a = wVar;
    }

    /* renamed from: a */
    public static Runnable m17563a(C17529w wVar) {
        return new C17473ag(wVar);
    }

    public final void run() {
        C17529w wVar = this.f47421a;
        wVar.mo20742a();
        wVar.f47605c.removeCallbacks(wVar.f47616n);
        wVar.mo20744a(wVar.f47606d);
        wVar.f47606d = null;
    }
}
