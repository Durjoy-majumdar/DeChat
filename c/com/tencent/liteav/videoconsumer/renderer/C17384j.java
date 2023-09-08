package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.j */
final /* synthetic */ class C17384j implements Runnable {

    /* renamed from: a */
    private final C17383i f47153a;

    /* renamed from: b */
    private final VideoRenderListener f47154b;

    private C17384j(C17383i iVar, VideoRenderListener videoRenderListener) {
        this.f47153a = iVar;
        this.f47154b = videoRenderListener;
    }

    /* renamed from: a */
    public static Runnable m17391a(C17383i iVar, VideoRenderListener videoRenderListener) {
        return new C17384j(iVar, videoRenderListener);
    }

    public final void run() {
        C17383i iVar = this.f47153a;
        VideoRenderListener videoRenderListener = this.f47154b;
        LiteavLog.m16901i("VideoRenderer", "Start");
        if (iVar.f47143q) {
            LiteavLog.m16905w("VideoRenderer", "renderer is started!");
            return;
        }
        iVar.f47143q = true;
        iVar.f47146t = videoRenderListener;
        DisplayTarget displayTarget = iVar.f47131e;
        if (displayTarget != null) {
            iVar.mo20308a(displayTarget, true);
        }
    }
}
