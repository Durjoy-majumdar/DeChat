package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videobase.utils.Rotation;

/* renamed from: com.tencent.liteav.videoproducer.encoder.bd */
final /* synthetic */ class C17499bd implements Runnable {

    /* renamed from: a */
    private final C17474ah f47490a;

    /* renamed from: b */
    private final Rotation f47491b;

    private C17499bd(C17474ah ahVar, Rotation rotation) {
        this.f47490a = ahVar;
        this.f47491b = rotation;
    }

    /* renamed from: a */
    public static Runnable m17641a(C17474ah ahVar, Rotation rotation) {
        return new C17499bd(ahVar, rotation);
    }

    public final void run() {
        C17474ah.m17585b(this.f47490a, this.f47491b);
    }
}
