package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.af */
final /* synthetic */ class C17317af implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f46939a;

    /* renamed from: b */
    private final long f46940b;

    private C17317af(VideoDecodeController videoDecodeController, long j) {
        this.f46939a = videoDecodeController;
        this.f46940b = j;
    }

    /* renamed from: a */
    public static Runnable m17244a(VideoDecodeController videoDecodeController, long j) {
        return new C17317af(videoDecodeController, j);
    }

    public final void run() {
        PixelFrame a;
        VideoDecodeController videoDecodeController = this.f46939a;
        long j = this.f46940b;
        if (videoDecodeController.f46903k && (a = videoDecodeController.f46909q.mo20217a()) != null) {
            if (videoDecodeController.f46902j == null || !videoDecodeController.mo20383l()) {
                a.release();
                return;
            }
            videoDecodeController.f46911s.mo20229a(a.getWidth(), a.getHeight());
            videoDecodeController.f46911s.mo20230a(a);
            VideoDecodeController.C17311a aVar = videoDecodeController.f46900h;
            if (aVar != null) {
                aVar.mo20335a(a, j);
            }
            a.release();
        }
    }
}
