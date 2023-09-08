package com.tencent.liteav.trtc;

/* renamed from: com.tencent.liteav.trtc.a */
final /* synthetic */ class C17186a implements Runnable {

    /* renamed from: a */
    private final TrtcCloudJni f46447a;

    private C17186a(TrtcCloudJni trtcCloudJni) {
        this.f46447a = trtcCloudJni;
    }

    /* renamed from: a */
    public static Runnable m17023a(TrtcCloudJni trtcCloudJni) {
        return new C17186a(trtcCloudJni);
    }

    public final void run() {
        TrtcCloudJni.lambda$enterRoom$0(this.f46447a);
    }
}
