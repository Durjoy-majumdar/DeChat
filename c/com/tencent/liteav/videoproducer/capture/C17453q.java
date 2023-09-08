package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.q */
final /* synthetic */ class C17453q implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47347a;

    /* renamed from: b */
    private final float f47348b;

    private C17453q(CameraCaptureSingleton cameraCaptureSingleton, float f) {
        this.f47347a = cameraCaptureSingleton;
        this.f47348b = f;
    }

    /* renamed from: a */
    public static Runnable m17532a(CameraCaptureSingleton cameraCaptureSingleton, float f) {
        return new C17453q(cameraCaptureSingleton, f);
    }

    public final void run() {
        CameraCaptureSingleton.lambda$setZoomLevel$7(this.f47347a, this.f47348b);
    }
}
