package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videoconsumer.decoder.C17334au;
import com.tencent.liteav.videoconsumer.decoder.C17340d;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.l */
final /* synthetic */ class C17354l implements C17340d.C17342a {

    /* renamed from: a */
    private final C17340d f47040a;

    public C17354l(C17340d dVar) {
        this.f47040a = dVar;
    }

    /* renamed from: a */
    public final C17340d.C17343b mo20419a(EncodedVideoFrame encodedVideoFrame) {
        C17340d dVar = this.f47040a;
        if (dVar.f46996h == C17334au.C17335a.SOFTWARE || encodedVideoFrame == null) {
            return null;
        }
        SpsInfo spsInfo = dVar.f46992d;
        if (spsInfo.width * spsInfo.height > 40000 || !dVar.mo20418b(encodedVideoFrame)) {
            return null;
        }
        return new C17340d.C17343b(C17340d.C17344c.SWITCH_TO_SOFTWARE, C17340d.C17346e.LOW_RESOLUTION);
    }
}
