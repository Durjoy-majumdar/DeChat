package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.util.C113473t;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.aq */
final /* synthetic */ class C17328aq implements C113473t.C113474a {

    /* renamed from: a */
    private final VideoDecodeController f46955a;

    public C17328aq(VideoDecodeController videoDecodeController) {
        this.f46955a = videoDecodeController;
    }

    /* renamed from: a_ */
    public final void mo20405a_() {
        C17334au auVar;
        VideoDecodeController videoDecodeController = this.f46955a;
        if (videoDecodeController.mo20380i() > 0) {
            videoDecodeController.mo20379h();
        } else if (videoDecodeController.f46897e && videoDecodeController.f46908p.get() > 0 && (auVar = videoDecodeController.f46904l) != null) {
            auVar.decode((EncodedVideoFrame) null);
        }
    }
}
