package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.aw */
final /* synthetic */ class C17421aw implements Runnable {

    /* renamed from: a */
    private final ScreenCapturer f47278a;

    private C17421aw(ScreenCapturer screenCapturer) {
        this.f47278a = screenCapturer;
    }

    /* renamed from: a */
    public static Runnable m17485a(ScreenCapturer screenCapturer) {
        return new C17421aw(screenCapturer);
    }

    public final void run() {
        ScreenCapturer.m17416d(this.f47278a);
    }
}
