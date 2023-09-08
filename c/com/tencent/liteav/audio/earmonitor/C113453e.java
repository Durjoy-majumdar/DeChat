package com.tencent.liteav.audio.earmonitor;

/* renamed from: com.tencent.liteav.audio.earmonitor.e */
final /* synthetic */ class C113453e implements Runnable {

    /* renamed from: a */
    private final C113435a f339514a;

    private C113453e(C113435a aVar) {
        this.f339514a = aVar;
    }

    /* renamed from: a */
    public static Runnable m155336a(C113435a aVar) {
        return new C113453e(aVar);
    }

    public final void run() {
        C113435a.m155284a(this.f339514a);
    }
}
