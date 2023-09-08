package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.t */
final /* synthetic */ class C17457t implements Runnable {

    /* renamed from: a */
    private final C17455s f47360a;

    private C17457t(C17455s sVar) {
        this.f47360a = sVar;
    }

    /* renamed from: a */
    public static Runnable m17543a(C17455s sVar) {
        return new C17457t(sVar);
    }

    public final void run() {
        C17455s sVar = this.f47360a;
        if (sVar.f47354d) {
            sVar.f47354d = false;
            if (sVar.f47355e) {
                sVar.f47355e = false;
                CameraCaptureSingleton.getInstance().updateParams(sVar.f47356f);
                sVar.f47356f.f47179a = null;
                return;
            }
            CameraCaptureSingleton.getInstance().resume();
        }
    }
}
