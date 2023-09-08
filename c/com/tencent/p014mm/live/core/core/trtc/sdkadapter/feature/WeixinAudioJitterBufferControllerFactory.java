package com.tencent.p014mm.live.core.core.trtc.sdkadapter.feature;

import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory */
public class WeixinAudioJitterBufferControllerFactory {

    /* renamed from: b */
    public static WeixinAudioJitterBufferControllerFactory f157119b = null;

    /* renamed from: a */
    public long f157120a = 0;

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("voipCodec");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/live/core/core/trtc/sdkadapter/feature/WeixinAudioJitterBufferControllerFactory", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/live/core/core/trtc/sdkadapter/feature/WeixinAudioJitterBufferControllerFactory", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private native long nativeCreateFactory();

    private native void nativeDestroyFactory(long j);

    private native void nativeSetJitterBufferConfig(long j, int i, float f, float f2);

    private native void nativeSetJitterBufferParams(long j, int i, int i2);

    private native void nativeSetJoinLiveRoom(long j, int i);

    /* renamed from: a */
    public long mo76386a() {
        if (this.f157120a == 0) {
            this.f157120a = nativeCreateFactory();
        }
        return this.f157120a;
    }

    /* renamed from: b */
    public void mo76387b(int i, float f, float f2) {
        long j = this.f157120a;
        if (j != 0) {
            nativeSetJitterBufferConfig(j, i, f, f2);
        }
    }

    /* renamed from: c */
    public void mo76388c(int i, int i2) {
        long j = this.f157120a;
        if (j != 0) {
            nativeSetJitterBufferParams(j, i, i2);
        }
    }

    /* renamed from: d */
    public void mo76389d(int i) {
        long j = this.f157120a;
        if (j != 0) {
            nativeSetJoinLiveRoom(j, i);
        }
    }

    public void finalize() {
        long j = this.f157120a;
        if (j != 0) {
            nativeDestroyFactory(j);
        }
    }
}
