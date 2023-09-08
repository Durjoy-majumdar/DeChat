package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.frame.PixelFrame;

/* renamed from: com.tencent.liteav.videoproducer.producer.ad */
final /* synthetic */ class C17576ad implements Runnable {

    /* renamed from: a */
    private final C17604f f47800a;

    /* renamed from: b */
    private final PixelFrame f47801b;

    /* renamed from: c */
    private final int f47802c;

    /* renamed from: d */
    private final int f47803d;

    private C17576ad(C17604f fVar, PixelFrame pixelFrame, int i, int i2) {
        this.f47800a = fVar;
        this.f47801b = pixelFrame;
        this.f47802c = i;
        this.f47803d = i2;
    }

    /* renamed from: a */
    public static Runnable m17774a(C17604f fVar, PixelFrame pixelFrame, int i, int i2) {
        return new C17576ad(fVar, pixelFrame, i, i2);
    }

    public final void run() {
        C17604f.m17842a(this.f47800a, this.f47801b, this.f47802c, this.f47803d);
    }
}
