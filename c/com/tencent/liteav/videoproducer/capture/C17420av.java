package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.capture.av */
final /* synthetic */ class C17420av implements Runnable {

    /* renamed from: a */
    private final ScreenCapturer f47276a;

    /* renamed from: b */
    private final CaptureSourceInterface.CaptureParams f47277b;

    private C17420av(ScreenCapturer screenCapturer, CaptureSourceInterface.CaptureParams captureParams) {
        this.f47276a = screenCapturer;
        this.f47277b = captureParams;
    }

    /* renamed from: a */
    public static Runnable m17484a(ScreenCapturer screenCapturer, CaptureSourceInterface.CaptureParams captureParams) {
        return new C17420av(screenCapturer, captureParams);
    }

    public final void run() {
        ScreenCapturer.m17411a(this.f47276a, this.f47277b);
    }
}
