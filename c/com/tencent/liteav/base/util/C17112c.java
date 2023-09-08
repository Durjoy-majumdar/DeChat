package com.tencent.liteav.base.util;

/* renamed from: com.tencent.liteav.base.util.c */
final /* synthetic */ class C17112c implements Runnable {

    /* renamed from: a */
    private final C17111b f46156a;

    private C17112c(C17111b bVar) {
        this.f46156a = bVar;
    }

    /* renamed from: a */
    public static Runnable m16921a(C17111b bVar) {
        return new C17112c(bVar);
    }

    public final void run() {
        LiteavLog.m16898e("TXCHandler", "quit looper failed. " + this.f46156a.getLooper());
    }
}
