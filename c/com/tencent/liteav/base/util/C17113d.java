package com.tencent.liteav.base.util;

/* renamed from: com.tencent.liteav.base.util.d */
final /* synthetic */ class C17113d implements Runnable {

    /* renamed from: a */
    private final C17111b f46157a;

    private C17113d(C17111b bVar) {
        this.f46157a = bVar;
    }

    /* renamed from: a */
    public static Runnable m16922a(C17111b bVar) {
        return new C17113d(bVar);
    }

    public final void run() {
        LiteavLog.m16898e("TXCHandler", "quit looper failed. " + this.f46157a.getLooper());
    }
}
