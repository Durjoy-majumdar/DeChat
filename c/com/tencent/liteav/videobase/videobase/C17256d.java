package com.tencent.liteav.videobase.videobase;

/* renamed from: com.tencent.liteav.videobase.videobase.d */
final /* synthetic */ class C17256d implements Runnable {

    /* renamed from: a */
    private final DisplayTarget f46650a;

    private C17256d(DisplayTarget displayTarget) {
        this.f46650a = displayTarget;
    }

    /* renamed from: a */
    public static Runnable m17148a(DisplayTarget displayTarget) {
        return new C17256d(displayTarget);
    }

    public final void run() {
        DisplayTarget.lambda$removeVideoView$2(this.f46650a);
    }
}
