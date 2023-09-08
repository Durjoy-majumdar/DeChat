package com.tencent.liteav.audio.earmonitor;

/* renamed from: com.tencent.liteav.audio.earmonitor.d */
final /* synthetic */ class C113452d implements Runnable {

    /* renamed from: a */
    private final C113435a f339513a;

    private C113452d(C113435a aVar) {
        this.f339513a = aVar;
    }

    /* renamed from: a */
    public static Runnable m155335a(C113435a aVar) {
        return new C113452d(aVar);
    }

    public final void run() {
        C113435a.m155289b(this.f339513a);
    }
}
