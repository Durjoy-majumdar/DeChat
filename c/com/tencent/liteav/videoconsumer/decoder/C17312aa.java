package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.aa */
public final /* synthetic */ class C17312aa implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f46931a;

    /* renamed from: b */
    private final VideoDecodeController.DecodeStrategy f46932b;

    public C17312aa(VideoDecodeController videoDecodeController, VideoDecodeController.DecodeStrategy decodeStrategy) {
        this.f46931a = videoDecodeController;
        this.f46932b = decodeStrategy;
    }

    public final void run() {
        VideoDecodeController videoDecodeController = this.f46931a;
        VideoDecodeController.DecodeStrategy decodeStrategy = this.f46932b;
        C17340d dVar = videoDecodeController.f46895c;
        if (dVar.f46995g != decodeStrategy) {
            dVar.f46995g = decodeStrategy;
            dVar.f46996h = null;
            LiteavLog.m16902i(dVar.f46989a, "set decode strategy to %s", decodeStrategy);
        }
    }
}
