package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.o */
final /* synthetic */ class C17451o implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47342a;

    /* renamed from: b */
    private final int f47343b;

    /* renamed from: c */
    private final int f47344c;

    private C17451o(CameraCaptureSingleton cameraCaptureSingleton, int i, int i2) {
        this.f47342a = cameraCaptureSingleton;
        this.f47343b = i;
        this.f47344c = i2;
    }

    /* renamed from: a */
    public static Runnable m17530a(CameraCaptureSingleton cameraCaptureSingleton, int i, int i2) {
        return new C17451o(cameraCaptureSingleton, i, i2);
    }

    public final void run() {
        CameraCaptureSingleton.lambda$startAutoFocusAtPosition$5(this.f47342a, this.f47343b, this.f47344c);
    }
}
