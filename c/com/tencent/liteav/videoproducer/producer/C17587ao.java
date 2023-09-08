package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.frame.PixelFrame;

/* renamed from: com.tencent.liteav.videoproducer.producer.ao */
final /* synthetic */ class C17587ao implements Runnable {

    /* renamed from: a */
    private final C17604f f47832a;

    /* renamed from: b */
    private final int f47833b;

    /* renamed from: c */
    private final PixelFrame f47834c;

    private C17587ao(C17604f fVar, int i, PixelFrame pixelFrame) {
        this.f47832a = fVar;
        this.f47833b = i;
        this.f47834c = pixelFrame;
    }

    /* renamed from: a */
    public static Runnable m17785a(C17604f fVar, int i, PixelFrame pixelFrame) {
        return new C17587ao(fVar, i, pixelFrame);
    }

    public final void run() {
        C17604f.m17831a(this.f47832a, this.f47833b, this.f47834c);
    }
}
