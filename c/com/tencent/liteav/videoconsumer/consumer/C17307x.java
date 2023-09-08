package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videoconsumer.consumer.C17286j;
import com.tencent.liteav.videoconsumer.decoder.C17369z;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import com.tencent.liteav.videoconsumer.renderer.C17380g;
import com.tencent.liteav.videoconsumer.renderer.C17381h;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.x */
final /* synthetic */ class C17307x implements Runnable {

    /* renamed from: a */
    private final C17286j f46888a;

    /* renamed from: b */
    private final boolean f46889b;

    private C17307x(C17286j jVar, boolean z) {
        this.f46888a = jVar;
        this.f46889b = z;
    }

    /* renamed from: a */
    public static Runnable m17217a(C17286j jVar, boolean z) {
        return new C17307x(jVar, z);
    }

    public final void run() {
        C17286j jVar = this.f46888a;
        boolean z = this.f46889b;
        LiteavLog.m16901i(jVar.f46828a, "Stop");
        C17286j.C17292a aVar = jVar.f46843p;
        C17286j.C17292a aVar2 = C17286j.C17292a.STOPPED;
        if (aVar != aVar2) {
            jVar.f46843p = aVar2;
            jVar.f46841n = false;
            jVar.f46842o.mo20223b();
            jVar.f46849v.getAndSet(0);
            jVar.f46850w.getAndSet(0);
            VideoDecodeController videoDecodeController = jVar.f46833f;
            if (videoDecodeController != null) {
                videoDecodeController.mo20376a((Runnable) new C17369z(videoDecodeController));
            }
            for (C17380g next : jVar.mo20326a()) {
                if (next != null) {
                    next.mo20310a(z);
                }
            }
            jVar.f46852y.mo20219b();
            C17381h hVar = jVar.f46851x;
            hVar.f47125f = false;
            hVar.f47121b.mo20223b();
            jVar.f46848u = null;
        }
    }
}
