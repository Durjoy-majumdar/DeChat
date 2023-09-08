package com.tencent.liteav.videoconsumer.decoder;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.am */
final /* synthetic */ class C17324am implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f46947a;

    /* renamed from: b */
    private final Object f46948b;

    private C17324am(VideoDecodeController videoDecodeController, Object obj) {
        this.f46947a = videoDecodeController;
        this.f46948b = obj;
    }

    /* renamed from: a */
    public static Runnable m17250a(VideoDecodeController videoDecodeController, Object obj) {
        return new C17324am(videoDecodeController, obj);
    }

    public final void run() {
        VideoDecodeController videoDecodeController = this.f46947a;
        videoDecodeController.f46901i = this.f46948b;
        if (videoDecodeController.f46902j != null) {
            videoDecodeController.mo20378g();
            videoDecodeController.mo20377f();
            videoDecodeController.f46895c.f47009u = true;
        }
    }
}
