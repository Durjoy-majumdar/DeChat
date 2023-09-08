package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.consumer.C17286j;
import com.tencent.liteav.videoconsumer.decoder.C17327ap;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import com.tencent.liteav.videoconsumer.renderer.C17381h;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.w */
final /* synthetic */ class C17306w implements Runnable {

    /* renamed from: a */
    private final C17286j f46887a;

    private C17306w(C17286j jVar) {
        this.f46887a = jVar;
    }

    /* renamed from: a */
    public static Runnable m17216a(C17286j jVar) {
        return new C17306w(jVar);
    }

    public final void run() {
        C17286j jVar = this.f46887a;
        LiteavLog.m16901i(jVar.f46828a, "Start");
        if (jVar.f46843p != C17286j.C17292a.STOPPED) {
            LiteavLog.m16905w(jVar.f46828a, "video consumer is started.");
            return;
        }
        jVar.mo20328a(jVar.f46831d);
        C17381h hVar = jVar.f46851x;
        hVar.f47125f = false;
        hVar.mo20474a();
        VideoDecodeController videoDecodeController = jVar.f46833f;
        if (videoDecodeController != null) {
            videoDecodeController.mo20376a((Runnable) new C17327ap(videoDecodeController, jVar.f46825A));
        }
        jVar.f46840m.mo20220a();
        jVar.f46843p = jVar.f46844q ? C17286j.C17292a.PAUSED : C17286j.C17292a.STARTED;
    }
}
