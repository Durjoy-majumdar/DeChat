package com.tencent.liteav.videoproducer.capture;

import android.view.Surface;

/* renamed from: com.tencent.liteav.videoproducer.capture.bf */
final /* synthetic */ class C17435bf implements Runnable {

    /* renamed from: a */
    private final C17428bc f47315a;

    /* renamed from: b */
    private final Surface f47316b;

    private C17435bf(C17428bc bcVar, Surface surface) {
        this.f47315a = bcVar;
        this.f47316b = surface;
    }

    /* renamed from: a */
    public static Runnable m17514a(C17428bc bcVar, Surface surface) {
        return new C17435bf(bcVar, surface);
    }

    public final void run() {
        C17428bc.m17496a(this.f47315a, this.f47316b);
    }
}
