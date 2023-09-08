package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.decoder.C17325an;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.u */
final /* synthetic */ class C17304u implements Runnable {

    /* renamed from: a */
    private final C17286j f46884a;

    /* renamed from: b */
    private final ServerVideoConsumerConfig f46885b;

    private C17304u(C17286j jVar, ServerVideoConsumerConfig serverVideoConsumerConfig) {
        this.f46884a = jVar;
        this.f46885b = serverVideoConsumerConfig;
    }

    /* renamed from: a */
    public static Runnable m17214a(C17286j jVar, ServerVideoConsumerConfig serverVideoConsumerConfig) {
        return new C17304u(jVar, serverVideoConsumerConfig);
    }

    public final void run() {
        C17286j jVar = this.f46884a;
        ServerVideoConsumerConfig serverVideoConsumerConfig = this.f46885b;
        LiteavLog.m16901i(jVar.f46828a, "setServerConfig=".concat(String.valueOf(serverVideoConsumerConfig)));
        VideoDecodeController videoDecodeController = jVar.f46833f;
        if (videoDecodeController != null) {
            videoDecodeController.mo20376a((Runnable) new C17325an(videoDecodeController, serverVideoConsumerConfig));
        }
    }
}
