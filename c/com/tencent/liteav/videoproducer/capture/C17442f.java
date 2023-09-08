package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.capture.f */
final /* synthetic */ class C17442f implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47327a;

    /* renamed from: b */
    private final CaptureSourceInterface.C17399a f47328b;

    /* renamed from: c */
    private final CameraCaptureParams f47329c;

    private C17442f(CameraCaptureSingleton cameraCaptureSingleton, CaptureSourceInterface.C17399a aVar, CameraCaptureParams cameraCaptureParams) {
        this.f47327a = cameraCaptureSingleton;
        this.f47328b = aVar;
        this.f47329c = cameraCaptureParams;
    }

    /* renamed from: a */
    public static Runnable m17521a(CameraCaptureSingleton cameraCaptureSingleton, CaptureSourceInterface.C17399a aVar, CameraCaptureParams cameraCaptureParams) {
        return new C17442f(cameraCaptureSingleton, aVar, cameraCaptureParams);
    }

    public final void run() {
        CameraCaptureSingleton.lambda$start$12(this.f47327a, this.f47328b, this.f47329c);
    }
}
