package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.h */
final /* synthetic */ class C17444h implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47331a;

    private C17444h(CameraCaptureSingleton cameraCaptureSingleton) {
        this.f47331a = cameraCaptureSingleton;
    }

    /* renamed from: a */
    public static Runnable m17523a(CameraCaptureSingleton cameraCaptureSingleton) {
        return new C17444h(cameraCaptureSingleton);
    }

    public final void run() {
        this.f47331a.pauseInternal();
    }
}
