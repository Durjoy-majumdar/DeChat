package com.tencent.liteav.audio.earmonitor;

/* renamed from: com.tencent.liteav.audio.earmonitor.f */
final /* synthetic */ class C113454f implements Runnable {

    /* renamed from: a */
    private final C113435a f339515a;

    /* renamed from: b */
    private final int f339516b;

    private C113454f(C113435a aVar, int i) {
        this.f339515a = aVar;
        this.f339516b = i;
    }

    /* renamed from: a */
    public static Runnable m155337a(C113435a aVar, int i) {
        return new C113454f(aVar, i);
    }

    public final void run() {
        C113435a.m155290b(this.f339515a, this.f339516b);
    }
}
