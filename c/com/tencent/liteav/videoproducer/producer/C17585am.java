package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.producer.am */
final /* synthetic */ class C17585am implements Runnable {

    /* renamed from: a */
    private final C17604f f47825a;

    /* renamed from: b */
    private final PixelFrame f47826b;

    /* renamed from: c */
    private final CaptureSourceInterface f47827c;

    private C17585am(C17604f fVar, PixelFrame pixelFrame, CaptureSourceInterface captureSourceInterface) {
        this.f47825a = fVar;
        this.f47826b = pixelFrame;
        this.f47827c = captureSourceInterface;
    }

    /* renamed from: a */
    public static Runnable m17783a(C17604f fVar, PixelFrame pixelFrame, CaptureSourceInterface captureSourceInterface) {
        return new C17585am(fVar, pixelFrame, captureSourceInterface);
    }

    public final void run() {
        C17604f.m17843a(this.f47825a, this.f47826b, this.f47827c);
    }
}
