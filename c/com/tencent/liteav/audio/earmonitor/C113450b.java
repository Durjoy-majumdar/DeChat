package com.tencent.liteav.audio.earmonitor;

/* renamed from: com.tencent.liteav.audio.earmonitor.b */
final /* synthetic */ class C113450b implements Runnable {

    /* renamed from: a */
    private final C113435a f339511a;

    private C113450b(C113435a aVar) {
        this.f339511a = aVar;
    }

    /* renamed from: a */
    public static Runnable m155333a(C113435a aVar) {
        return new C113450b(aVar);
    }

    public final void run() {
        C113435a.m155293d(this.f339511a);
    }
}
