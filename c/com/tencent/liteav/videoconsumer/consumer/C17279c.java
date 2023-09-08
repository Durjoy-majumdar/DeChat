package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.c */
final /* synthetic */ class C17279c implements Runnable {

    /* renamed from: a */
    private final C17272a f46812a;

    /* renamed from: b */
    private final VideoRenderListener f46813b;

    private C17279c(C17272a aVar, VideoRenderListener videoRenderListener) {
        this.f46812a = aVar;
        this.f46813b = videoRenderListener;
    }

    /* renamed from: a */
    public static Runnable m17184a(C17272a aVar, VideoRenderListener videoRenderListener) {
        return new C17279c(aVar, videoRenderListener);
    }

    public final void run() {
        C17272a aVar = this.f46812a;
        VideoRenderListener videoRenderListener = this.f46813b;
        if (aVar.f46786b) {
            LiteavLog.m16905w("CustomRenderProcess", "renderer is started!");
            return;
        }
        aVar.f46791g = videoRenderListener;
        aVar.f46786b = true;
    }
}
