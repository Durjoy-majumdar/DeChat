package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.j */
final /* synthetic */ class C17446j implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47333a;

    /* renamed from: b */
    private final CameraCaptureParams f47334b;

    private C17446j(CameraCaptureSingleton cameraCaptureSingleton, CameraCaptureParams cameraCaptureParams) {
        this.f47333a = cameraCaptureSingleton;
        this.f47334b = cameraCaptureParams;
    }

    /* renamed from: a */
    public static Runnable m17525a(CameraCaptureSingleton cameraCaptureSingleton, CameraCaptureParams cameraCaptureParams) {
        return new C17446j(cameraCaptureSingleton, cameraCaptureParams);
    }

    public final void run() {
        CameraCaptureSingleton.lambda$updateParams$15(this.f47333a, this.f47334b);
    }
}
