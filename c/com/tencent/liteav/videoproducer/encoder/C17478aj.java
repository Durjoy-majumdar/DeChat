package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videobase.utils.Rotation;

/* renamed from: com.tencent.liteav.videoproducer.encoder.aj */
final /* synthetic */ class C17478aj implements Runnable {

    /* renamed from: a */
    private final C17474ah f47451a;

    /* renamed from: b */
    private final Rotation f47452b;

    private C17478aj(C17474ah ahVar, Rotation rotation) {
        this.f47451a = ahVar;
        this.f47452b = rotation;
    }

    /* renamed from: a */
    public static Runnable m17620a(C17474ah ahVar, Rotation rotation) {
        return new C17478aj(ahVar, rotation);
    }

    public final void run() {
        C17474ah.m17572a(this.f47451a, this.f47452b);
    }
}
