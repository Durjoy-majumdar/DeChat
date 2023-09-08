package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.util.LiteavLog;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.ad */
public final /* synthetic */ class C17315ad implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f46936a;

    public C17315ad(VideoDecodeController videoDecodeController) {
        this.f46936a = videoDecodeController;
    }

    public final void run() {
        VideoDecodeController videoDecodeController = this.f46936a;
        String str = videoDecodeController.f46893a;
        LiteavLog.m16901i(str, "pixelFrameQueue:" + videoDecodeController.f46909q.mo20227c());
    }
}
