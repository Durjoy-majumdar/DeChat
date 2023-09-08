package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;

/* renamed from: com.tencent.liteav.videoproducer.capture.b */
final /* synthetic */ class C17425b implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47284a;

    /* renamed from: b */
    private final CaptureSourceInterface.C17399a f47285b;

    private C17425b(CameraCaptureSingleton cameraCaptureSingleton, CaptureSourceInterface.C17399a aVar) {
        this.f47284a = cameraCaptureSingleton;
        this.f47285b = aVar;
    }

    /* renamed from: a */
    public static Runnable m17489a(CameraCaptureSingleton cameraCaptureSingleton, CaptureSourceInterface.C17399a aVar) {
        return new C17425b(cameraCaptureSingleton, aVar);
    }

    public final void run() {
        this.f47284a.mListenerManager.mo20573b(this.f47285b);
    }
}
