package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;

/* renamed from: com.tencent.liteav.videoproducer.producer.af */
final /* synthetic */ class C17578af implements Runnable {

    /* renamed from: a */
    private final C17604f f47805a;

    /* renamed from: b */
    private final GLConstants.PixelFormatType f47806b;

    /* renamed from: c */
    private final GLConstants.PixelBufferType f47807c;

    /* renamed from: d */
    private final VideoRenderListener f47808d;

    private C17578af(C17604f fVar, GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, VideoRenderListener videoRenderListener) {
        this.f47805a = fVar;
        this.f47806b = pixelFormatType;
        this.f47807c = pixelBufferType;
        this.f47808d = videoRenderListener;
    }

    /* renamed from: a */
    public static Runnable m17776a(C17604f fVar, GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, VideoRenderListener videoRenderListener) {
        return new C17578af(fVar, pixelFormatType, pixelBufferType, videoRenderListener);
    }

    public final void run() {
        C17604f.m17838a(this.f47805a, this.f47806b, this.f47807c, this.f47808d);
    }
}
