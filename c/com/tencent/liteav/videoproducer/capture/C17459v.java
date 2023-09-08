package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.v */
final /* synthetic */ class C17459v implements Runnable {

    /* renamed from: a */
    private final float f47363a;

    private C17459v(float f) {
        this.f47363a = f;
    }

    /* renamed from: a */
    public static Runnable m17545a(float f) {
        return new C17459v(f);
    }

    public final void run() {
        CameraCaptureSingleton.getInstance().setPercentOfMaxZoomLevel(this.f47363a);
    }
}
