package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import com.tencent.liteav.videoconsumer.renderer.C17380g;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.o */
final /* synthetic */ class C17298o implements Runnable {

    /* renamed from: a */
    private final C17286j f46870a;

    /* renamed from: b */
    private final DisplayTarget f46871b;

    private C17298o(C17286j jVar, DisplayTarget displayTarget) {
        this.f46870a = jVar;
        this.f46871b = displayTarget;
    }

    /* renamed from: a */
    public static Runnable m17208a(C17286j jVar, DisplayTarget displayTarget) {
        return new C17298o(jVar, displayTarget);
    }

    public final void run() {
        C17286j jVar = this.f46870a;
        DisplayTarget displayTarget = this.f46871b;
        LiteavLog.m16901i(jVar.f46828a, "setDisplayTarget: ".concat(String.valueOf(displayTarget)));
        jVar.f46836i = displayTarget;
        if (!(displayTarget == null || displayTarget.getTXCloudVideoView() == null || jVar.f46836i.getTXCloudVideoView().getOpenGLContext() == null)) {
            Object openGLContext = jVar.f46836i.getTXCloudVideoView().getOpenGLContext();
            jVar.f46848u = openGLContext;
            VideoDecodeController videoDecodeController = jVar.f46833f;
            if (videoDecodeController != null) {
                videoDecodeController.mo20375a(openGLContext);
            }
        }
        for (C17380g next : jVar.mo20326a()) {
            if (next != null) {
                next.mo20308a(displayTarget, true);
            }
        }
    }
}
