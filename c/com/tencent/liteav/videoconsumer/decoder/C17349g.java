package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videoconsumer.decoder.C17334au;
import com.tencent.liteav.videoconsumer.decoder.C17340d;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.g */
final /* synthetic */ class C17349g implements C17340d.C17342a {

    /* renamed from: a */
    private final C17340d f47035a;

    public C17349g(C17340d dVar) {
        this.f47035a = dVar;
    }

    /* renamed from: a */
    public final C17340d.C17343b mo20419a(EncodedVideoFrame encodedVideoFrame) {
        C17340d.C17343b bVar;
        C17340d dVar = this.f47035a;
        boolean isH265 = encodedVideoFrame.isH265();
        if (isH265 != dVar.f46997i) {
            C17340d.C17346e eVar = C17340d.C17346e.NONE;
            dVar.f46998j = eVar;
            dVar.f47007s = 0;
            dVar.f47008t = 0;
            LiteavLog.m16901i(dVar.f46989a, "checkH265Frame find h265 frame.");
            bVar = new C17340d.C17343b(C17340d.C17344c.RESTART_DECODER, eVar);
        } else {
            bVar = null;
        }
        if (isH265 && !dVar.f46994f && !dVar.f46993e) {
            dVar.mo20415a();
            return new C17340d.C17343b(C17340d.C17344c.REPORT_DECODE_ERROR, C17340d.C17346e.NONE);
        } else if (!isH265 || dVar.f46993e || dVar.f46996h == C17334au.C17335a.HARDWARE) {
            if (!isH265 || dVar.f46994f || dVar.f46996h == C17334au.C17335a.SOFTWARE) {
                return bVar;
            }
            if (dVar.mo20418b(encodedVideoFrame)) {
                return new C17340d.C17343b(C17340d.C17344c.SWITCH_TO_SOFTWARE, C17340d.C17346e.OTHERS_DO_NOT_SUPPORT_H265);
            }
            dVar.mo20415a();
            return new C17340d.C17343b(C17340d.C17344c.REPORT_DECODE_ERROR, C17340d.C17346e.NONE);
        } else if (dVar.mo20416a(encodedVideoFrame)) {
            return new C17340d.C17343b(C17340d.C17344c.SWITCH_TO_HARDWARE, C17340d.C17346e.OTHERS_DO_NOT_SUPPORT_H265);
        } else {
            dVar.mo20415a();
            return new C17340d.C17343b(C17340d.C17344c.REPORT_DECODE_ERROR, C17340d.C17346e.NONE);
        }
    }
}
