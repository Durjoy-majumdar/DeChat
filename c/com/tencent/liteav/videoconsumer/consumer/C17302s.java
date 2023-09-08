package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.s */
final /* synthetic */ class C17302s implements Runnable {

    /* renamed from: a */
    private final C17286j f46881a;

    /* renamed from: b */
    private final Object f46882b;

    private C17302s(C17286j jVar, Object obj) {
        this.f46881a = jVar;
        this.f46882b = obj;
    }

    /* renamed from: a */
    public static Runnable m17212a(C17286j jVar, Object obj) {
        return new C17302s(jVar, obj);
    }

    public final void run() {
        C17286j jVar = this.f46881a;
        Object obj = this.f46882b;
        jVar.f46848u = obj;
        VideoDecodeController videoDecodeController = jVar.f46833f;
        if (videoDecodeController != null) {
            videoDecodeController.mo20375a(obj);
        }
    }
}
