package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videoconsumer.decoder.C17334au;
import com.tencent.liteav.videoconsumer.decoder.C17340d;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.j */
final /* synthetic */ class C17352j implements C17340d.C17342a {

    /* renamed from: a */
    private final C17340d f47038a;

    public C17352j(C17340d dVar) {
        this.f47038a = dVar;
    }

    /* renamed from: a */
    public final C17340d.C17343b mo20419a(EncodedVideoFrame encodedVideoFrame) {
        C17340d dVar = this.f47038a;
        SpsInfo spsInfo = dVar.f46992d;
        C104507p pVar = new C104507p(spsInfo.width, spsInfo.height);
        if (dVar.f46996h == C17334au.C17335a.HARDWARE && pVar.mo147178b() > 0) {
            if (dVar.f47012x > 1.2f) {
                LiteavLog.m16901i(dVar.f46989a, "Received frame too fast, skip check hardware decoder");
            } else {
                boolean z = true;
                int i = pVar.mo147178b() >= 480000 ? dVar.f47001m : dVar.f47002n;
                int i2 = dVar.f47005q;
                boolean z2 = i2 >= i;
                long j = dVar.f47000l;
                boolean z3 = j != 0 && encodedVideoFrame.pts - j >= ((long) (i * 66)) && i2 >= i + -2;
                if (!z2 && !z3) {
                    z = false;
                }
                if (z && dVar.mo20418b(encodedVideoFrame)) {
                    String str = "Remote-VideoDecoder[" + dVar + "]: " + (z2 ? "Too many hard decoder buffers, switch to soft decoder" : "Hard decoding takes too long, switch to soft decoder") + "[videoSize: " + pVar + "][decCacheNum:" + dVar.f47005q + "][decPts:" + encodedVideoFrame.pts + "][renderPts:" + dVar.f47000l + "][cacheHigh:" + dVar.f47001m + "][cacheLow:" + dVar.f47002n + "]";
                    if (z2) {
                        dVar.f46991c.notifyWarning(C17263h.C17270c.WARNING_VIDEO_DECODE_CACHE_EXCEEDED, "cache to much deviceName:" + LiteavSystemInfo.getModel(), new Object[0]);
                    }
                    if (z3) {
                        dVar.f46991c.notifyEvent(C17263h.C17269b.EVT_VIDEO_DECODE_HW_TO_SW_DECODE_COST_TOO_HIGH, "decode cost too high, switch HW to SW, deviceName:" + LiteavSystemInfo.getModel(), new Object[0]);
                    }
                    LiteavLog.m16901i(dVar.f46989a, str);
                    return new C17340d.C17343b(C17340d.C17344c.SWITCH_TO_SOFTWARE, C17340d.C17346e.HARDWARE_DECODER_ABNORMAL);
                }
            }
        }
        return null;
    }
}
