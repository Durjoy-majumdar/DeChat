package com.tencent.liteav.videoproducer.capture;

import android.graphics.SurfaceTexture;

/* renamed from: com.tencent.liteav.videoproducer.capture.e */
final /* synthetic */ class C17441e implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47325a;

    /* renamed from: b */
    private final SurfaceTexture f47326b;

    private C17441e(CameraCaptureSingleton cameraCaptureSingleton, SurfaceTexture surfaceTexture) {
        this.f47325a = cameraCaptureSingleton;
        this.f47326b = surfaceTexture;
    }

    /* renamed from: a */
    public static Runnable m17520a(CameraCaptureSingleton cameraCaptureSingleton, SurfaceTexture surfaceTexture) {
        return new C17441e(cameraCaptureSingleton, surfaceTexture);
    }

    public final void run() {
        CameraCaptureSingleton.lambda$onFrameAvailable$11(this.f47325a, this.f47326b);
    }
}
