package com.tencent.p014mm.plugin.recordvideo.background;

import ah2.C92000a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.recordvideo.background.a */
public final class C94400a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ VideoMixer f272889d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94400a(VideoMixer videoMixer) {
        super(0);
        this.f272889d = videoMixer;
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.Media.VideoMixer", "[start] mixThread=" + this.f272889d.f272875z);
        try {
            this.f272889d.mo129784e();
            VideoMixer.m119412c(this.f272889d);
            return C13598b0.f38549a;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Media.VideoMixer", e, "error on startVideoMixer", new Object[0]);
            VideoMixer videoMixer = this.f272889d;
            C32229r<? super String, ? super String, ? super Boolean, ? super Integer, C13598b0> rVar = videoMixer.f272851b;
            if (rVar == null) {
                return null;
            }
            C92000a aVar = videoMixer.f272850a;
            rVar.mo162I(aVar.f263374e, aVar.f263375f, Boolean.FALSE, -1);
            return C13598b0.f38549a;
        }
    }
}
