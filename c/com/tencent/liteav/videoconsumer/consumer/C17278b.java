package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.videobase.base.GLConstants;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.b */
final /* synthetic */ class C17278b implements Runnable {

    /* renamed from: a */
    private final C17272a f46809a;

    /* renamed from: b */
    private final GLConstants.PixelFormatType f46810b;

    /* renamed from: c */
    private final GLConstants.PixelBufferType f46811c;

    private C17278b(C17272a aVar, GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType) {
        this.f46809a = aVar;
        this.f46810b = pixelFormatType;
        this.f46811c = pixelBufferType;
    }

    /* renamed from: a */
    public static Runnable m17183a(C17272a aVar, GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType) {
        return new C17278b(aVar, pixelFormatType, pixelBufferType);
    }

    public final void run() {
        C17272a aVar = this.f46809a;
        GLConstants.PixelFormatType pixelFormatType = this.f46810b;
        GLConstants.PixelBufferType pixelBufferType = this.f46811c;
        aVar.f46787c = true;
        aVar.f46788d = pixelFormatType;
        aVar.f46789e = pixelBufferType;
    }
}
