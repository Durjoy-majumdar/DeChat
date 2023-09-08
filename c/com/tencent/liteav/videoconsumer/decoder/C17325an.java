package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.consumer.ServerVideoConsumerConfig;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.an */
public final /* synthetic */ class C17325an implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f46949a;

    /* renamed from: b */
    private final ServerVideoConsumerConfig f46950b;

    public C17325an(VideoDecodeController videoDecodeController, ServerVideoConsumerConfig serverVideoConsumerConfig) {
        this.f46949a = videoDecodeController;
        this.f46950b = serverVideoConsumerConfig;
    }

    public final void run() {
        VideoDecodeController videoDecodeController = this.f46949a;
        ServerVideoConsumerConfig serverVideoConsumerConfig = this.f46950b;
        videoDecodeController.f46910r = serverVideoConsumerConfig;
        C17340d dVar = videoDecodeController.f46895c;
        if (serverVideoConsumerConfig != null) {
            int i = serverVideoConsumerConfig.hwDecoderMaxCacheForHighRes;
            dVar.f47001m = i;
            dVar.f47002n = serverVideoConsumerConfig.hwDecoderMaxCacheForLowRes;
            LiteavLog.m16902i(dVar.f46989a, "set hardware decoder max cache to highResolution: %d, lowResolution: %d", Integer.valueOf(i), Integer.valueOf(dVar.f47002n));
        }
    }
}
