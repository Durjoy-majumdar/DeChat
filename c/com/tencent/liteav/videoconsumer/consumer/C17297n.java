package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.decoder.C17312aa;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.n */
final /* synthetic */ class C17297n implements Runnable {

    /* renamed from: a */
    private final C17286j f46868a;

    /* renamed from: b */
    private final VideoDecodeController.DecodeStrategy f46869b;

    private C17297n(C17286j jVar, VideoDecodeController.DecodeStrategy decodeStrategy) {
        this.f46868a = jVar;
        this.f46869b = decodeStrategy;
    }

    /* renamed from: a */
    public static Runnable m17207a(C17286j jVar, VideoDecodeController.DecodeStrategy decodeStrategy) {
        return new C17297n(jVar, decodeStrategy);
    }

    public final void run() {
        C17286j jVar = this.f46868a;
        VideoDecodeController.DecodeStrategy decodeStrategy = this.f46869b;
        LiteavLog.m16901i(jVar.f46828a, "setDecoderType: ".concat(String.valueOf(decodeStrategy)));
        VideoDecodeController videoDecodeController = jVar.f46833f;
        if (videoDecodeController != null) {
            videoDecodeController.mo20376a((Runnable) new C17312aa(videoDecodeController, decodeStrategy));
        }
    }
}
