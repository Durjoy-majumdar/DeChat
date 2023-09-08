package com.tencent.liteav.audio.earmonitor;

/* renamed from: com.tencent.liteav.audio.earmonitor.c */
final /* synthetic */ class C113451c implements Runnable {

    /* renamed from: a */
    private final C113435a f339512a;

    private C113451c(C113435a aVar) {
        this.f339512a = aVar;
    }

    /* renamed from: a */
    public static Runnable m155334a(C113435a aVar) {
        return new C113451c(aVar);
    }

    public final void run() {
        C113435a.m155292c(this.f339512a);
    }
}
