package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.ay */
final /* synthetic */ class C17423ay implements Runnable {

    /* renamed from: a */
    private final ScreenCapturer f47280a;

    private C17423ay(ScreenCapturer screenCapturer) {
        this.f47280a = screenCapturer;
    }

    /* renamed from: a */
    public static Runnable m17487a(ScreenCapturer screenCapturer) {
        return new C17423ay(screenCapturer);
    }

    public final void run() {
        ScreenCapturer.m17414b(this.f47280a);
    }
}
