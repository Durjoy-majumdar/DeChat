package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videoconsumer.decoder.C17334au;
import com.tencent.liteav.videoconsumer.decoder.C17340d;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.e */
final /* synthetic */ class C17347e implements C17340d.C17342a {

    /* renamed from: a */
    private final C17340d f47033a;

    public C17347e(C17340d dVar) {
        this.f47033a = dVar;
    }

    /* renamed from: a */
    public final C17340d.C17343b mo20419a(EncodedVideoFrame encodedVideoFrame) {
        C17340d dVar = this.f47033a;
        VideoDecodeController.DecodeStrategy decodeStrategy = dVar.f46995g;
        if (decodeStrategy == VideoDecodeController.DecodeStrategy.USE_HARDWARE_ONLY && dVar.f46996h != C17334au.C17335a.HARDWARE) {
            return new C17340d.C17343b(C17340d.C17344c.SWITCH_TO_HARDWARE, C17340d.C17346e.NONE);
        }
        if (decodeStrategy == VideoDecodeController.DecodeStrategy.USE_SOFTWARE_ONLY && dVar.f46996h != C17334au.C17335a.SOFTWARE) {
            return new C17340d.C17343b(C17340d.C17344c.SWITCH_TO_SOFTWARE, C17340d.C17346e.NONE);
        }
        if (decodeStrategy == VideoDecodeController.DecodeStrategy.PREFER_HARDWARE && dVar.f46996h == null) {
            return new C17340d.C17343b(C17340d.C17344c.SWITCH_TO_HARDWARE, C17340d.C17346e.NONE);
        }
        if (decodeStrategy == VideoDecodeController.DecodeStrategy.PREFER_SOFTWARE && dVar.f46996h == null) {
            return new C17340d.C17343b(C17340d.C17344c.SWITCH_TO_SOFTWARE, C17340d.C17346e.NONE);
        }
        if (dVar.f46996h == null) {
            return new C17340d.C17343b(C17340d.C17344c.SWITCH_TO_HARDWARE, C17340d.C17346e.NONE);
        }
        return null;
    }
}
