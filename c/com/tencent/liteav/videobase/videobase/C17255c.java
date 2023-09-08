package com.tencent.liteav.videobase.videobase;

/* renamed from: com.tencent.liteav.videobase.videobase.c */
final /* synthetic */ class C17255c implements Runnable {

    /* renamed from: a */
    private final DisplayTarget f46649a;

    private C17255c(DisplayTarget displayTarget) {
        this.f46649a = displayTarget;
    }

    /* renamed from: a */
    public static Runnable m17147a(DisplayTarget displayTarget) {
        return new C17255c(displayTarget);
    }

    public final void run() {
        DisplayTarget.lambda$addVideoView$1(this.f46649a);
    }
}
