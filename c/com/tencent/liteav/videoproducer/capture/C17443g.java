package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.g */
final /* synthetic */ class C17443g implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47330a;

    private C17443g(CameraCaptureSingleton cameraCaptureSingleton) {
        this.f47330a = cameraCaptureSingleton;
    }

    /* renamed from: a */
    public static Runnable m17522a(CameraCaptureSingleton cameraCaptureSingleton) {
        return new C17443g(cameraCaptureSingleton);
    }

    public final void run() {
        CameraCaptureSingleton.lambda$stop$13(this.f47330a);
    }
}
