package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.m */
final /* synthetic */ class C17449m implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47338a;

    /* renamed from: b */
    private final boolean f47339b;

    private C17449m(CameraCaptureSingleton cameraCaptureSingleton, boolean z) {
        this.f47338a = cameraCaptureSingleton;
        this.f47339b = z;
    }

    /* renamed from: a */
    public static Runnable m17528a(CameraCaptureSingleton cameraCaptureSingleton, boolean z) {
        return new C17449m(cameraCaptureSingleton, z);
    }

    public final void run() {
        CameraCaptureSingleton.lambda$turnOnTorch$3(this.f47338a, this.f47339b);
    }
}
