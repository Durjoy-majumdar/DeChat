package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.r */
final /* synthetic */ class C17454r implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47349a;

    /* renamed from: b */
    private final float f47350b;

    private C17454r(CameraCaptureSingleton cameraCaptureSingleton, float f) {
        this.f47349a = cameraCaptureSingleton;
        this.f47350b = f;
    }

    /* renamed from: a */
    public static Runnable m17533a(CameraCaptureSingleton cameraCaptureSingleton, float f) {
        return new C17454r(cameraCaptureSingleton, f);
    }

    public final void run() {
        this.f47349a.setZoomInternal(this.f47350b);
    }
}
