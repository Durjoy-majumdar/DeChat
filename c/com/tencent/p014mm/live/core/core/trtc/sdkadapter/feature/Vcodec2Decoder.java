package com.tencent.p014mm.live.core.core.trtc.sdkadapter.feature;

import com.tencent.liteav.TXLiteAVExternalDecoderFactoryInterface;
import j20.C117292a;
import k20.C9556a;
import p206nj.C88957l;
import p734vz.C102301h;

/* renamed from: com.tencent.mm.live.core.core.trtc.sdkadapter.feature.Vcodec2Decoder */
public class Vcodec2Decoder implements TXLiteAVExternalDecoderFactoryInterface {

    /* renamed from: a */
    public static final Vcodec2Decoder f266769a = new Vcodec2Decoder();

    static {
        if (!C102301h.f301316a) {
            C88957l.m111079o("voipVideoCodec", C102301h.class.getClassLoader());
            C102301h.f301316a = true;
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c("voipCodec");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/live/core/core/trtc/sdkadapter/feature/Vcodec2Decoder", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/live/core/core/trtc/sdkadapter/feature/Vcodec2Decoder", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private native long createDecoder();

    private native void destroyDecoder(long j);

    public long CreateHevcDecoder() {
        return createDecoder();
    }

    public void DestroyHevcDecoder(long j) {
        destroyDecoder(j);
    }
}
