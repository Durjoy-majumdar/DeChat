package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videoconsumer.decoder.C17334au;
import com.tencent.liteav.videoconsumer.decoder.C17340d;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.k */
final /* synthetic */ class C17353k implements C17340d.C17342a {

    /* renamed from: a */
    private final C17340d f47039a;

    public C17353k(C17340d dVar) {
        this.f47039a = dVar;
    }

    /* renamed from: a */
    public final C17340d.C17343b mo20419a(EncodedVideoFrame encodedVideoFrame) {
        C17340d dVar = this.f47039a;
        if (dVar.f47009u) {
            dVar.f47009u = false;
            LiteavLog.m16901i(dVar.f46989a, "EGLContext changed.");
            if (dVar.f46996h == C17334au.C17335a.HARDWARE) {
                return new C17340d.C17343b(C17340d.C17344c.RESTART_DECODER, C17340d.C17346e.NONE);
            }
        }
        return null;
    }
}
