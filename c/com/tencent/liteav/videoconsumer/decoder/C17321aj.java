package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.aj */
final /* synthetic */ class C17321aj implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f46944a;

    private C17321aj(VideoDecodeController videoDecodeController) {
        this.f46944a = videoDecodeController;
    }

    /* renamed from: a */
    public static Runnable m17247a(VideoDecodeController videoDecodeController) {
        return new C17321aj(videoDecodeController);
    }

    public final void run() {
        VideoDecodeController videoDecodeController = this.f46944a;
        LiteavLog.m16901i(videoDecodeController.f46893a, "decoder onAbandonDecodingFramesCompleted");
        videoDecodeController.f46909q.mo20219b();
        videoDecodeController.f46908p.set(0);
        VideoDecodeController.C17311a aVar = videoDecodeController.f46900h;
        if (aVar != null) {
            aVar.mo20337c();
        }
    }
}
