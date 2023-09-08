package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.i */
final /* synthetic */ class C17285i implements Runnable {

    /* renamed from: a */
    private final C17272a f46823a;

    /* renamed from: b */
    private final PixelFrame f46824b;

    private C17285i(C17272a aVar, PixelFrame pixelFrame) {
        this.f46823a = aVar;
        this.f46824b = pixelFrame;
    }

    /* renamed from: a */
    public static Runnable m17190a(C17272a aVar, PixelFrame pixelFrame) {
        return new C17285i(aVar, pixelFrame);
    }

    public final void run() {
        C17272a aVar = this.f46823a;
        PixelFrame pixelFrame = this.f46824b;
        VideoRenderListener videoRenderListener = aVar.f46791g;
        if (videoRenderListener != null) {
            videoRenderListener.onRenderFrame(pixelFrame);
        }
    }
}
