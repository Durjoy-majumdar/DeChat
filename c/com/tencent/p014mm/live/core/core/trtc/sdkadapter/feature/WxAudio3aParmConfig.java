package com.tencent.p014mm.live.core.core.trtc.sdkadapter.feature;

import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.live.core.core.trtc.sdkadapter.feature.WxAudio3aParmConfig */
public class WxAudio3aParmConfig {
    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("voipCodec");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/live/core/core/trtc/sdkadapter/feature/WxAudio3aParmConfig", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/live/core/core/trtc/sdkadapter/feature/WxAudio3aParmConfig", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native long GetTxliteLive3AStrategyCreateAddr();

    public static native long GetTxliteLive3AStrategyDestroyAddr();

    public static native long GetWaveLive3AStrategyCreateAddr();

    public static native long GetWaveLive3AStrategyDestroyAddr();

    public static native long GetWaveLive3aProcessorCreateAddr();

    public static native long GetWaveLive3aProcessorDestoryAddr();

    public static native int SetTxlite3ALiveXSysParm(int i, long j, long j2, long j3, long j4);

    public static native int SetWave3ALiveXSysParm(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28, int i29, int i35, int i36);
}
