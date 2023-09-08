package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.c */
final /* synthetic */ class C17439c implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47321a;

    /* renamed from: b */
    private final float f47322b;

    private C17439c(CameraCaptureSingleton cameraCaptureSingleton, float f) {
        this.f47321a = cameraCaptureSingleton;
        this.f47322b = f;
    }

    /* renamed from: a */
    public static Runnable m17518a(CameraCaptureSingleton cameraCaptureSingleton, float f) {
        return new C17439c(cameraCaptureSingleton, f);
    }

    public final void run() {
        CameraCaptureSingleton.lambda$setExposureCompensation$9(this.f47321a, this.f47322b);
    }
}
