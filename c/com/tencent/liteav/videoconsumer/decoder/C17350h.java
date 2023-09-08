package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videoconsumer.decoder.C17334au;
import com.tencent.liteav.videoconsumer.decoder.C17340d;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.h */
final /* synthetic */ class C17350h implements C17340d.C17342a {

    /* renamed from: a */
    private final C17340d f47036a;

    public C17350h(C17340d dVar) {
        this.f47036a = dVar;
    }

    /* renamed from: a */
    public final C17340d.C17343b mo20419a(EncodedVideoFrame encodedVideoFrame) {
        C17340d dVar = this.f47036a;
        if (!dVar.f47006r) {
            return null;
        }
        dVar.f47006r = false;
        C17334au.C17335a aVar = dVar.f46996h;
        if (aVar == C17334au.C17335a.HARDWARE) {
            dVar.f47007s++;
            if (encodedVideoFrame.isH265()) {
                dVar.f46994f = false;
            }
            if (!dVar.mo20418b(encodedVideoFrame) || dVar.f47008t >= 3) {
                if (encodedVideoFrame.isH265()) {
                    dVar.mo20415a();
                }
                return new C17340d.C17343b(C17340d.C17344c.REPORT_DECODE_ERROR, C17340d.C17346e.NONE);
            }
            dVar.f46991c.notifyEvent(C17263h.C17269b.EVT_VIDEO_DECODE_HW_TO_SW_MEDIACODEC_NOT_WORK, "MediaCodec doesn't work, switch HW to SW decode", new Object[0]);
            LiteavLog.m16901i(dVar.f46989a, "checkPendingDecodeError switch HW to SW decode");
            return new C17340d.C17343b(C17340d.C17344c.SWITCH_TO_SOFTWARE, C17340d.C17346e.DECODE_ERROR);
        } else if (aVar != C17334au.C17335a.SOFTWARE) {
            return null;
        } else {
            int i = dVar.f47008t + 1;
            dVar.f47008t = i;
            if (i < 3) {
                LiteavLog.m16901i(dVar.f46989a, "checkPendingDecodeError failed decoder count is less max count.");
                return new C17340d.C17343b(C17340d.C17344c.RESTART_DECODER, C17340d.C17346e.NONE);
            }
            if (encodedVideoFrame.isH265()) {
                dVar.f46993e = false;
            }
            if (!dVar.mo20416a(encodedVideoFrame) || dVar.f47007s > 0 || encodedVideoFrame.isRPSEnable()) {
                if (encodedVideoFrame.isH265()) {
                    dVar.mo20415a();
                }
                return new C17340d.C17343b(C17340d.C17344c.REPORT_DECODE_ERROR, C17340d.C17346e.NONE);
            }
            LiteavLog.m16901i(dVar.f46989a, "checkPendingDecodeError switch SW to HW decode");
            return new C17340d.C17343b(C17340d.C17344c.SWITCH_TO_HARDWARE, C17340d.C17346e.DECODE_ERROR);
        }
    }
}
