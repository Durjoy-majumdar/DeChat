package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.ba */
final /* synthetic */ class C17426ba implements Runnable {

    /* renamed from: a */
    private final ScreenCapturer f47286a;

    private C17426ba(ScreenCapturer screenCapturer) {
        this.f47286a = screenCapturer;
    }

    /* renamed from: a */
    public static Runnable m17490a(ScreenCapturer screenCapturer) {
        return new C17426ba(screenCapturer);
    }

    public final void run() {
        ScreenCapturer.m17410a(this.f47286a);
    }
}
