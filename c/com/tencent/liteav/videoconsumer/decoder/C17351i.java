package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videoconsumer.decoder.C17334au;
import com.tencent.liteav.videoconsumer.decoder.C17340d;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.i */
final /* synthetic */ class C17351i implements C17340d.C17342a {

    /* renamed from: a */
    private final C17340d f47037a;

    public C17351i(C17340d dVar) {
        this.f47037a = dVar;
    }

    /* renamed from: a */
    public final C17340d.C17343b mo20419a(EncodedVideoFrame encodedVideoFrame) {
        C17340d dVar = this.f47037a;
        boolean isRPSEnable = encodedVideoFrame.isRPSEnable();
        if (!isRPSEnable && dVar.f46996h == C17334au.C17335a.SOFTWARE && dVar.mo20416a(encodedVideoFrame)) {
            C17340d.C17346e eVar = dVar.f46998j;
            if (eVar != null && eVar.mPriority > C17340d.C17346e.RPS_MODE_UPDATED.mPriority) {
                return new C17340d.C17343b(C17340d.C17344c.CONTINUE_DECODE, C17340d.C17346e.NONE);
            }
            dVar.f46991c.notifyEvent(C17263h.C17269b.EVT_VIDEO_DECODE_SW_TO_HW_REMOTE_VIDEO_DISABLE_RPS, "remote video disable RPS, switch SW to HW decode", new Object[0]);
            return VideoDecodeController.DecodeStrategy.PREFER_SOFTWARE == dVar.f46995g ? new C17340d.C17343b(C17340d.C17344c.CONTINUE_DECODE, C17340d.C17346e.NONE) : new C17340d.C17343b(C17340d.C17344c.SWITCH_TO_HARDWARE, C17340d.C17346e.RPS_MODE_UPDATED);
        } else if (!isRPSEnable || dVar.f46996h == C17334au.C17335a.SOFTWARE) {
            return null;
        } else {
            if (!dVar.mo20418b(encodedVideoFrame)) {
                return new C17340d.C17343b(C17340d.C17344c.REPORT_DECODE_ERROR, C17340d.C17346e.NONE);
            }
            dVar.f46991c.notifyEvent(C17263h.C17269b.EVT_VIDEO_DECODE_HW_TO_SW_REMOTE_VIDEO_ENABLE_RPS, "remote video enable RPS, switch HW to SW decode", new Object[0]);
            return new C17340d.C17343b(C17340d.C17344c.SWITCH_TO_SOFTWARE, C17340d.C17346e.RPS_MODE_UPDATED);
        }
    }
}
