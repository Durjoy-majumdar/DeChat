package com.tencent.liteav.videoconsumer.decoder;

import android.os.Looper;
import com.tencent.liteav.base.util.C113473t;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.ap */
public final /* synthetic */ class C17327ap implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f46953a;

    /* renamed from: b */
    private final VideoDecodeController.C17311a f46954b;

    public C17327ap(VideoDecodeController videoDecodeController, VideoDecodeController.C17311a aVar) {
        this.f46953a = videoDecodeController;
        this.f46954b = aVar;
    }

    public final void run() {
        VideoDecodeController videoDecodeController = this.f46953a;
        VideoDecodeController.C17311a aVar = this.f46954b;
        if (!videoDecodeController.f46903k) {
            videoDecodeController.f46903k = true;
            videoDecodeController.f46900h = aVar;
            videoDecodeController.f46908p.set(0);
            videoDecodeController.f46895c.mo20417b();
            videoDecodeController.f46896d.mo20407a();
            if (videoDecodeController.f46899g == null) {
                videoDecodeController.f46899g = new C113473t(Looper.myLooper(), new C17328aq(videoDecodeController));
            }
            videoDecodeController.f46899g.mo169974a(0, 15);
        }
    }
}
