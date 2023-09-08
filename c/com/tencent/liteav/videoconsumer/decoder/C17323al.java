package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.al */
final /* synthetic */ class C17323al implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f46946a;

    private C17323al(VideoDecodeController videoDecodeController) {
        this.f46946a = videoDecodeController;
    }

    /* renamed from: a */
    public static Runnable m17249a(VideoDecodeController videoDecodeController) {
        return new C17323al(videoDecodeController);
    }

    public final void run() {
        VideoDecodeController.C17311a aVar = this.f46946a.f46900h;
        if (aVar != null) {
            aVar.mo20339e();
        }
    }
}
