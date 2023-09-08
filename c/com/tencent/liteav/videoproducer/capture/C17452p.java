package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.p */
final /* synthetic */ class C17452p implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47345a;

    /* renamed from: b */
    private final boolean f47346b;

    private C17452p(CameraCaptureSingleton cameraCaptureSingleton, boolean z) {
        this.f47345a = cameraCaptureSingleton;
        this.f47346b = z;
    }

    /* renamed from: a */
    public static Runnable m17531a(CameraCaptureSingleton cameraCaptureSingleton, boolean z) {
        return new C17452p(cameraCaptureSingleton, z);
    }

    public final void run() {
        CameraCaptureSingleton.lambda$enableCameraZoom$6(this.f47345a, this.f47346b);
    }
}
