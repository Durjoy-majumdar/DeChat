package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;

/* renamed from: com.tencent.liteav.videoproducer.capture.k */
final /* synthetic */ class C17447k implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSingleton f47335a;

    /* renamed from: b */
    private final ServerVideoProducerConfig f47336b;

    private C17447k(CameraCaptureSingleton cameraCaptureSingleton, ServerVideoProducerConfig serverVideoProducerConfig) {
        this.f47335a = cameraCaptureSingleton;
        this.f47336b = serverVideoProducerConfig;
    }

    /* renamed from: a */
    public static Runnable m17526a(CameraCaptureSingleton cameraCaptureSingleton, ServerVideoProducerConfig serverVideoProducerConfig) {
        return new C17447k(cameraCaptureSingleton, serverVideoProducerConfig);
    }

    public final void run() {
        CameraCaptureSingleton.lambda$setServerConfig$1(this.f47335a, this.f47336b);
    }
}
