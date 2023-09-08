package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.l */
final /* synthetic */ class C17448l implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47337a;

    private C17448l(CameraCaptureSingleton cameraCaptureSingleton) {
        this.f47337a = cameraCaptureSingleton;
    }

    /* renamed from: a */
    public static Runnable m17527a(CameraCaptureSingleton cameraCaptureSingleton) {
        return new C17448l(cameraCaptureSingleton);
    }

    public final void run() {
        CameraCaptureSingleton.lambda$switchCamera$2(this.f47337a);
    }
}
