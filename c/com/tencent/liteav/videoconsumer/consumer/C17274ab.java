package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.ab */
final /* synthetic */ class C17274ab implements Runnable {

    /* renamed from: a */
    private final C17286j f46803a;

    /* renamed from: b */
    private final VideoDecoderDef.ConsumerScene f46804b;

    private C17274ab(C17286j jVar, VideoDecoderDef.ConsumerScene consumerScene) {
        this.f46803a = jVar;
        this.f46804b = consumerScene;
    }

    /* renamed from: a */
    public static Runnable m17179a(C17286j jVar, VideoDecoderDef.ConsumerScene consumerScene) {
        return new C17274ab(jVar, consumerScene);
    }

    public final void run() {
        C17286j jVar = this.f46803a;
        VideoDecoderDef.ConsumerScene consumerScene = this.f46804b;
        jVar.f46847t = consumerScene;
        VideoDecodeController videoDecodeController = jVar.f46833f;
        if (videoDecodeController != null) {
            videoDecodeController.f46906n = consumerScene;
        }
    }
}
