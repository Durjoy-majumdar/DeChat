package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.videobase.C17263h;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.ah */
final /* synthetic */ class C17319ah implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f46942a;

    private C17319ah(VideoDecodeController videoDecodeController) {
        this.f46942a = videoDecodeController;
    }

    /* renamed from: a */
    public static Runnable m17245a(VideoDecodeController videoDecodeController) {
        return new C17319ah(videoDecodeController);
    }

    public final void run() {
        VideoDecodeController videoDecodeController = this.f46942a;
        LiteavLog.m16902i(videoDecodeController.f46893a, "on decode failed, type: %s", videoDecodeController.mo20381j());
        videoDecodeController.f46895c.f47006r = true;
        C17330as asVar = videoDecodeController.f46896d;
        asVar.f46966j++;
        asVar.mo20410b();
        videoDecodeController.f46894b.notifyWarning(C17263h.C17270c.WARNING_VIDEO_DECODE_ABNORMAL, "decode error try restart", new Object[0]);
    }
}
