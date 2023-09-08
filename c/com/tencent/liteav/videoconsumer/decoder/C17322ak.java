package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.ak */
final /* synthetic */ class C17322ak implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f46945a;

    private C17322ak(VideoDecodeController videoDecodeController) {
        this.f46945a = videoDecodeController;
    }

    /* renamed from: a */
    public static Runnable m17248a(VideoDecodeController videoDecodeController) {
        return new C17322ak(videoDecodeController);
    }

    public final void run() {
        VideoDecodeController.C17311a aVar = this.f46945a.f46900h;
        if (aVar != null) {
            aVar.mo20338d();
        }
    }
}
