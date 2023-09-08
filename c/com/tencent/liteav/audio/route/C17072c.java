package com.tencent.liteav.audio.route;

/* renamed from: com.tencent.liteav.audio.route.c */
final /* synthetic */ class C17072c implements Runnable {

    /* renamed from: a */
    private final AudioRouteManager f46045a;

    private C17072c(AudioRouteManager audioRouteManager) {
        this.f46045a = audioRouteManager;
    }

    /* renamed from: a */
    public static Runnable m16849a(AudioRouteManager audioRouteManager) {
        return new C17072c(audioRouteManager);
    }

    public final void run() {
        this.f46045a.autoCheckRouteUpdate(true);
    }
}
