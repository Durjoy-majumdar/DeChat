package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.base.GLConstants;

/* renamed from: com.tencent.liteav.videoproducer.producer.ah */
final /* synthetic */ class C17580ah implements Runnable {

    /* renamed from: a */
    private final C17604f f47814a;

    /* renamed from: b */
    private final GLConstants.PixelFormatType f47815b;

    /* renamed from: c */
    private final GLConstants.PixelBufferType f47816c;

    /* renamed from: d */
    private final CustomVideoProcessListener f47817d;

    private C17580ah(C17604f fVar, GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, CustomVideoProcessListener customVideoProcessListener) {
        this.f47814a = fVar;
        this.f47815b = pixelFormatType;
        this.f47816c = pixelBufferType;
        this.f47817d = customVideoProcessListener;
    }

    /* renamed from: a */
    public static Runnable m17778a(C17604f fVar, GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, CustomVideoProcessListener customVideoProcessListener) {
        return new C17580ah(fVar, pixelFormatType, pixelBufferType, customVideoProcessListener);
    }

    public final void run() {
        C17604f.m17839a(this.f47814a, this.f47815b, this.f47816c, this.f47817d);
    }
}
