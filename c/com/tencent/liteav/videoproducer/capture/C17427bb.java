package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.bb */
final /* synthetic */ class C17427bb implements Runnable {

    /* renamed from: a */
    private final ScreenCapturer f47287a;

    /* renamed from: b */
    private final boolean f47288b;

    private C17427bb(ScreenCapturer screenCapturer, boolean z) {
        this.f47287a = screenCapturer;
        this.f47288b = z;
    }

    /* renamed from: a */
    public static Runnable m17491a(ScreenCapturer screenCapturer, boolean z) {
        return new C17427bb(screenCapturer, z);
    }

    public final void run() {
        ScreenCapturer.m17412a(this.f47287a, this.f47288b);
    }
}
