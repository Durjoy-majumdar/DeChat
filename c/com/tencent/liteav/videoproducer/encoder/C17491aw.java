package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videobase.videobase.C17263h;

/* renamed from: com.tencent.liteav.videoproducer.encoder.aw */
final /* synthetic */ class C17491aw implements Runnable {

    /* renamed from: a */
    private final C17474ah f47477a;

    /* renamed from: b */
    private final C17263h.C17268a f47478b;

    private C17491aw(C17474ah ahVar, C17263h.C17268a aVar) {
        this.f47477a = ahVar;
        this.f47478b = aVar;
    }

    /* renamed from: a */
    public static Runnable m17633a(C17474ah ahVar, C17263h.C17268a aVar) {
        return new C17491aw(ahVar, aVar);
    }

    public final void run() {
        C17474ah.m17573a(this.f47477a, this.f47478b);
    }
}
