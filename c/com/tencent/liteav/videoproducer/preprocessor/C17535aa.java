package com.tencent.liteav.videoproducer.preprocessor;

import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.C17253a;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.aa */
final /* synthetic */ class C17535aa implements Runnable {

    /* renamed from: a */
    private final VideoPreprocessor f47634a;

    /* renamed from: b */
    private final int f47635b;

    /* renamed from: c */
    private final C17253a f47636c;

    /* renamed from: d */
    private final GLConstants.PixelBufferType f47637d;

    /* renamed from: e */
    private final GLConstants.PixelFormatType f47638e;

    /* renamed from: f */
    private final boolean f47639f;

    /* renamed from: g */
    private final C17541ag f47640g;

    private C17535aa(VideoPreprocessor videoPreprocessor, int i, C17253a aVar, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType, boolean z, C17541ag agVar) {
        this.f47634a = videoPreprocessor;
        this.f47635b = i;
        this.f47636c = aVar;
        this.f47637d = pixelBufferType;
        this.f47638e = pixelFormatType;
        this.f47639f = z;
        this.f47640g = agVar;
    }

    /* renamed from: a */
    public static Runnable m17721a(VideoPreprocessor videoPreprocessor, int i, C17253a aVar, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType, boolean z, C17541ag agVar) {
        return new C17535aa(videoPreprocessor, i, aVar, pixelBufferType, pixelFormatType, z, agVar);
    }

    public final void run() {
        VideoPreprocessor.lambda$registerVideoProcessedListener$3(this.f47634a, this.f47635b, this.f47636c, this.f47637d, this.f47638e, this.f47639f, this.f47640g);
    }
}
