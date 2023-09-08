package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videoconsumer.decoder.C17334au;
import com.tencent.liteav.videoconsumer.decoder.C17340d;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.f */
final /* synthetic */ class C17348f implements C17340d.C17342a {

    /* renamed from: a */
    private final C17340d f47034a;

    public C17348f(C17340d dVar) {
        this.f47034a = dVar;
    }

    /* renamed from: a */
    public final C17340d.C17343b mo20419a(EncodedVideoFrame encodedVideoFrame) {
        boolean z;
        C17340d dVar = this.f47034a;
        SpsInfo a = dVar.f46990b.mo20421a(encodedVideoFrame.isH265(), encodedVideoFrame.data);
        if (!dVar.f46992d.equals(a)) {
            dVar.f46992d.set(a);
            z = true;
        } else {
            z = false;
        }
        if (dVar.f46996h != C17334au.C17335a.HARDWARE || !z) {
            return null;
        }
        return new C17340d.C17343b(C17340d.C17344c.RESTART_DECODER, C17340d.C17346e.NONE);
    }
}
