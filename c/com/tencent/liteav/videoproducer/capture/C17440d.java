package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.d */
final /* synthetic */ class C17440d implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47323a;

    /* renamed from: b */
    private final C17404ad f47324b;

    private C17440d(CameraCaptureSingleton cameraCaptureSingleton, C17404ad adVar) {
        this.f47323a = cameraCaptureSingleton;
        this.f47324b = adVar;
    }

    /* renamed from: a */
    public static Runnable m17519a(CameraCaptureSingleton cameraCaptureSingleton, C17404ad adVar) {
        return new C17440d(cameraCaptureSingleton, adVar);
    }

    public final void run() {
        CameraCaptureSingleton.lambda$onCameraError$10(this.f47323a, this.f47324b);
    }
}
