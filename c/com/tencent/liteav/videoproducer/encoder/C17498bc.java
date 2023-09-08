package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;

/* renamed from: com.tencent.liteav.videoproducer.encoder.bc */
final /* synthetic */ class C17498bc implements Runnable {

    /* renamed from: a */
    private final C17474ah f47488a;

    /* renamed from: b */
    private final VideoEncoderDef.EncodeStrategy f47489b;

    private C17498bc(C17474ah ahVar, VideoEncoderDef.EncodeStrategy encodeStrategy) {
        this.f47488a = ahVar;
        this.f47489b = encodeStrategy;
    }

    /* renamed from: a */
    public static Runnable m17640a(C17474ah ahVar, VideoEncoderDef.EncodeStrategy encodeStrategy) {
        return new C17498bc(ahVar, encodeStrategy);
    }

    public final void run() {
        C17474ah.m17576a(this.f47488a, this.f47489b);
    }
}
