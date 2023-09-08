package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.x */
final /* synthetic */ class C17461x implements Runnable {

    /* renamed from: a */
    private final C17455s f47368a;

    private C17461x(C17455s sVar) {
        this.f47368a = sVar;
    }

    /* renamed from: a */
    public static Runnable m17547a(C17455s sVar) {
        return new C17461x(sVar);
    }

    public final void run() {
        C17455s sVar = this.f47368a;
        sVar.f47353c = null;
        CameraCaptureSingleton.getInstance().removeListener(sVar.f47358h);
        sVar.f47354d = true;
        sVar.f47355e = false;
        CameraCaptureSingleton.getInstance().stop();
    }
}
