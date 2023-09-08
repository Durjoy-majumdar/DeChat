package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.base.GLConstants;

/* renamed from: com.tencent.liteav.videoproducer.producer.b */
final /* synthetic */ class C17598b implements Runnable {

    /* renamed from: a */
    private final C17572a f47870a;

    /* renamed from: b */
    private final GLConstants.PixelFormatType f47871b;

    /* renamed from: c */
    private final GLConstants.PixelBufferType f47872c;

    /* renamed from: d */
    private final CustomVideoProcessListener f47873d;

    private C17598b(C17572a aVar, GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, CustomVideoProcessListener customVideoProcessListener) {
        this.f47870a = aVar;
        this.f47871b = pixelFormatType;
        this.f47872c = pixelBufferType;
        this.f47873d = customVideoProcessListener;
    }

    /* renamed from: a */
    public static Runnable m17808a(C17572a aVar, GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, CustomVideoProcessListener customVideoProcessListener) {
        return new C17598b(aVar, pixelFormatType, pixelBufferType, customVideoProcessListener);
    }

    public final void run() {
        C17572a aVar = this.f47870a;
        GLConstants.PixelFormatType pixelFormatType = this.f47871b;
        GLConstants.PixelBufferType pixelBufferType = this.f47872c;
        CustomVideoProcessListener customVideoProcessListener = this.f47873d;
        aVar.f47782f = (aVar.f47781e == pixelFormatType && aVar.f47780d == pixelBufferType) ? false : true;
        if (aVar.f47779c == null) {
            aVar.mo20879a(customVideoProcessListener);
        }
        CustomVideoProcessListener customVideoProcessListener2 = aVar.f47779c;
        if (customVideoProcessListener2 != null && (aVar.f47782f || customVideoProcessListener2 != customVideoProcessListener)) {
            aVar.mo20880b(customVideoProcessListener2);
            aVar.mo20879a(customVideoProcessListener);
        }
        aVar.f47781e = pixelFormatType;
        aVar.f47780d = pixelBufferType;
        aVar.f47779c = customVideoProcessListener;
    }
}
