package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.az */
final /* synthetic */ class C17424az implements Runnable {

    /* renamed from: a */
    private final ScreenCapturer f47281a;

    /* renamed from: b */
    private final boolean f47282b;

    /* renamed from: c */
    private final boolean f47283c;

    private C17424az(ScreenCapturer screenCapturer, boolean z, boolean z2) {
        this.f47281a = screenCapturer;
        this.f47282b = z;
        this.f47283c = z2;
    }

    /* renamed from: a */
    public static Runnable m17488a(ScreenCapturer screenCapturer, boolean z, boolean z2) {
        return new C17424az(screenCapturer, z, z2);
    }

    public final void run() {
        ScreenCapturer.m17413a(this.f47281a, this.f47282b, this.f47283c);
    }
}
