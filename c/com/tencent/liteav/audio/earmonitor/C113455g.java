package com.tencent.liteav.audio.earmonitor;

/* renamed from: com.tencent.liteav.audio.earmonitor.g */
final /* synthetic */ class C113455g implements Runnable {

    /* renamed from: a */
    private final C113435a f339517a;

    /* renamed from: b */
    private final int f339518b;

    private C113455g(C113435a aVar, int i) {
        this.f339517a = aVar;
        this.f339518b = i;
    }

    /* renamed from: a */
    public static Runnable m155338a(C113435a aVar, int i) {
        return new C113455g(aVar, i);
    }

    public final void run() {
        this.f339517a.m155288b(this.f339518b);
    }
}
