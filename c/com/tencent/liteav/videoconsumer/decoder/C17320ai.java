package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.ai */
final /* synthetic */ class C17320ai implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f46943a;

    private C17320ai(VideoDecodeController videoDecodeController) {
        this.f46943a = videoDecodeController;
    }

    /* renamed from: a */
    public static Runnable m17246a(VideoDecodeController videoDecodeController) {
        return new C17320ai(videoDecodeController);
    }

    public final void run() {
        VideoDecodeController.C17311a aVar = this.f46943a.f46900h;
        if (aVar != null) {
            aVar.mo20336b();
        }
    }
}
