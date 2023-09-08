package com.tencent.liteav.videoconsumer.decoder;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videoconsumer.decoder.C17340d;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.m */
final /* synthetic */ class C17355m implements C17340d.C17342a {

    /* renamed from: a */
    private final C17340d f47041a;

    public C17355m(C17340d dVar) {
        this.f47041a = dVar;
    }

    /* renamed from: a */
    public final C17340d.C17343b mo20419a(EncodedVideoFrame encodedVideoFrame) {
        C17340d dVar = this.f47041a;
        if (dVar.f47014z <= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION || dVar.f46987A <= 50) {
            dVar.f46988B = false;
        } else {
            dVar.f46988B = true;
            String str = dVar.f46989a;
            LiteavLog.m16901i(str, "pending send to decoder frame too long, duration:" + dVar.f47014z + ",count:" + dVar.f46987A);
        }
        return new C17340d.C17343b(C17340d.C17344c.CONTINUE_DECODE, C17340d.C17346e.NONE);
    }
}
