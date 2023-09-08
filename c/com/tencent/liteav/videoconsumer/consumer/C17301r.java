package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videoconsumer.renderer.C17380g;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.r */
final /* synthetic */ class C17301r implements Runnable {

    /* renamed from: a */
    private final C17286j f46877a;

    /* renamed from: b */
    private final GLConstants.PixelFormatType f46878b;

    /* renamed from: c */
    private final GLConstants.PixelBufferType f46879c;

    /* renamed from: d */
    private final VideoRenderListener f46880d;

    private C17301r(C17286j jVar, GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, VideoRenderListener videoRenderListener) {
        this.f46877a = jVar;
        this.f46878b = pixelFormatType;
        this.f46879c = pixelBufferType;
        this.f46880d = videoRenderListener;
    }

    /* renamed from: a */
    public static Runnable m17211a(C17286j jVar, GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, VideoRenderListener videoRenderListener) {
        return new C17301r(jVar, pixelFormatType, pixelBufferType, videoRenderListener);
    }

    public final void run() {
        C17286j jVar = this.f46877a;
        GLConstants.PixelFormatType pixelFormatType = this.f46878b;
        GLConstants.PixelBufferType pixelBufferType = this.f46879c;
        VideoRenderListener videoRenderListener = this.f46880d;
        String str = jVar.f46828a;
        LiteavLog.m16901i(str, "setCustomRenderListener: formatType = " + pixelFormatType + " bufferType = " + pixelBufferType + " ," + videoRenderListener);
        jVar.f46835h = videoRenderListener;
        if (videoRenderListener != null) {
            if (jVar.f46832e == null) {
                C17272a aVar = new C17272a(jVar.f46829b.getLooper());
                jVar.f46832e = aVar;
                jVar.mo20328a((C17380g) aVar);
            }
            ((C17272a) jVar.f46832e).mo20304a(pixelFormatType, pixelBufferType);
            return;
        }
        C17380g gVar = jVar.f46832e;
        if (gVar != null) {
            gVar.mo20310a(true);
            jVar.f46832e = null;
        }
    }
}
