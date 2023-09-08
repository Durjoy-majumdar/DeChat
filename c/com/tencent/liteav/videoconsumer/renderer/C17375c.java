package com.tencent.liteav.videoconsumer.renderer;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.c */
final /* synthetic */ class C17375c implements Runnable {

    /* renamed from: a */
    private final C17370a f47107a;

    private C17375c(C17370a aVar) {
        this.f47107a = aVar;
    }

    /* renamed from: a */
    public static Runnable m17354a(C17370a aVar) {
        return new C17375c(aVar);
    }

    public final void run() {
        C17370a aVar = this.f47107a;
        aVar.mo20449a(aVar.mo20456d());
    }
}
