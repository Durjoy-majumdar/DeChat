package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.z */
final /* synthetic */ class C17463z implements Runnable {

    /* renamed from: a */
    private final C17455s f47371a;

    private C17463z(C17455s sVar) {
        this.f47371a = sVar;
    }

    /* renamed from: a */
    public static Runnable m17549a(C17455s sVar) {
        return new C17463z(sVar);
    }

    public final void run() {
        C17455s sVar = this.f47371a;
        if (!sVar.f47354d) {
            sVar.f47354d = true;
            CameraCaptureSingleton.getInstance().pause();
        }
    }
}
