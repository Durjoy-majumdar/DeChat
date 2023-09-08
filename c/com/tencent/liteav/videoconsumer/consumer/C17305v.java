package com.tencent.liteav.videoconsumer.consumer;

import android.os.HandlerThread;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.decoder.C17318ag;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import com.tencent.liteav.videoconsumer.renderer.C17383i;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.v */
final /* synthetic */ class C17305v implements Runnable {

    /* renamed from: a */
    private final C17286j f46886a;

    private C17305v(C17286j jVar) {
        this.f46886a = jVar;
    }

    /* renamed from: a */
    public static Runnable m17215a(C17286j jVar) {
        return new C17305v(jVar);
    }

    public final void run() {
        C17286j jVar = this.f46886a;
        VideoDecodeController videoDecodeController = new VideoDecodeController(jVar.f46830c);
        jVar.f46833f = videoDecodeController;
        videoDecodeController.f46906n = jVar.f46847t;
        videoDecodeController.mo20375a(jVar.f46848u);
        VideoDecodeController videoDecodeController2 = jVar.f46833f;
        LiteavLog.m16901i(videoDecodeController2.f46893a, "initialize");
        synchronized (videoDecodeController2) {
            if (videoDecodeController2.f46898f != null) {
                LiteavLog.m16905w(videoDecodeController2.f46893a, "video decode controller is initialized");
            } else {
                HandlerThread handlerThread = new HandlerThread("video-decoder-controller");
                handlerThread.start();
                videoDecodeController2.f46898f = new C17111b(handlerThread.getLooper());
                videoDecodeController2.mo20376a((Runnable) new C17318ag(videoDecodeController2));
            }
        }
        if (jVar.f46831d == null) {
            jVar.f46831d = new C17383i(jVar.f46829b.getLooper(), jVar.f46830c);
        }
    }
}
