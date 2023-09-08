package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.ax */
final /* synthetic */ class C17422ax implements Runnable {

    /* renamed from: a */
    private final ScreenCapturer f47279a;

    private C17422ax(ScreenCapturer screenCapturer) {
        this.f47279a = screenCapturer;
    }

    /* renamed from: a */
    public static Runnable m17486a(ScreenCapturer screenCapturer) {
        return new C17422ax(screenCapturer);
    }

    public final void run() {
        ScreenCapturer.m17415c(this.f47279a);
    }
}
