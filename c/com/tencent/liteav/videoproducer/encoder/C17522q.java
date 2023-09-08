package com.tencent.liteav.videoproducer.encoder;

/* renamed from: com.tencent.liteav.videoproducer.encoder.q */
final /* synthetic */ class C17522q implements Runnable {

    /* renamed from: a */
    private final C17520o f47571a;

    /* renamed from: b */
    private final String f47572b;

    private C17522q(C17520o oVar, String str) {
        this.f47571a = oVar;
        this.f47572b = str;
    }

    /* renamed from: a */
    public static Runnable m17696a(C17520o oVar, String str) {
        return new C17522q(oVar, str);
    }

    public final void run() {
        C17520o.m17688a(this.f47571a, this.f47572b);
    }
}
