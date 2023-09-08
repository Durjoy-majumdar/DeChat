package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.i */
final /* synthetic */ class C17445i implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47332a;

    private C17445i(CameraCaptureSingleton cameraCaptureSingleton) {
        this.f47332a = cameraCaptureSingleton;
    }

    /* renamed from: a */
    public static Runnable m17524a(CameraCaptureSingleton cameraCaptureSingleton) {
        return new C17445i(cameraCaptureSingleton);
    }

    public final void run() {
        this.f47332a.resumeInternal(this.f47332a.mCurrentCaptureParams);
    }
}
