package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.n */
final /* synthetic */ class C17450n implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47340a;

    /* renamed from: b */
    private final boolean f47341b;

    private C17450n(CameraCaptureSingleton cameraCaptureSingleton, boolean z) {
        this.f47340a = cameraCaptureSingleton;
        this.f47341b = z;
    }

    /* renamed from: a */
    public static Runnable m17529a(CameraCaptureSingleton cameraCaptureSingleton, boolean z) {
        return new C17450n(cameraCaptureSingleton, z);
    }

    public final void run() {
        CameraCaptureSingleton.lambda$enableTapToFocus$4(this.f47340a, this.f47341b);
    }
}
