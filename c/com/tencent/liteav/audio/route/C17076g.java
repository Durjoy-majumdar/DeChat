package com.tencent.liteav.audio.route;

/* renamed from: com.tencent.liteav.audio.route.g */
final /* synthetic */ class C17076g implements Runnable {

    /* renamed from: a */
    private final AudioRouteManager f46051a;

    private C17076g(AudioRouteManager audioRouteManager) {
        this.f46051a = audioRouteManager;
    }

    /* renamed from: a */
    public static Runnable m16853a(AudioRouteManager audioRouteManager) {
        return new C17076g(audioRouteManager);
    }

    public final void run() {
        this.f46051a.stopInternal();
    }
}
