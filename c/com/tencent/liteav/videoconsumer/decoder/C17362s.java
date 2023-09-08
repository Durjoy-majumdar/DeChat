package com.tencent.liteav.videoconsumer.decoder;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.s */
final /* synthetic */ class C17362s implements Runnable {

    /* renamed from: a */
    private final C17359q f47080a;

    /* renamed from: b */
    private final Object f47081b;

    /* renamed from: c */
    private final C17336av f47082c;

    private C17362s(C17359q qVar, Object obj, C17336av avVar) {
        this.f47080a = qVar;
        this.f47081b = obj;
        this.f47082c = avVar;
    }

    /* renamed from: a */
    public static Runnable m17328a(C17359q qVar, Object obj, C17336av avVar) {
        return new C17362s(qVar, obj, avVar);
    }

    public final void run() {
        C17359q.m17320a(this.f47080a, this.f47081b, this.f47082c);
    }
}
