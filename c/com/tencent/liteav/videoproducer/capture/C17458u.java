package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.u */
final /* synthetic */ class C17458u implements Runnable {

    /* renamed from: a */
    private final int f47361a;

    /* renamed from: b */
    private final int f47362b;

    private C17458u(int i, int i2) {
        this.f47361a = i;
        this.f47362b = i2;
    }

    /* renamed from: a */
    public static Runnable m17544a(int i, int i2) {
        return new C17458u(i, i2);
    }

    public final void run() {
        CameraCaptureSingleton.getInstance().startAutoFocusAtPosition(this.f47361a, this.f47362b);
    }
}
