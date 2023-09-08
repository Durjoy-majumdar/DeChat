package com.tencent.liteav.audio.route;

/* renamed from: com.tencent.liteav.audio.route.h */
final /* synthetic */ class C17077h implements Runnable {

    /* renamed from: a */
    private final AudioRouteManager f46052a;

    /* renamed from: b */
    private final int f46053b;

    private C17077h(AudioRouteManager audioRouteManager, int i) {
        this.f46052a = audioRouteManager;
        this.f46053b = i;
    }

    /* renamed from: a */
    public static Runnable m16854a(AudioRouteManager audioRouteManager, int i) {
        return new C17077h(audioRouteManager, i);
    }

    public final void run() {
        AudioRouteManager.lambda$notifyAudioIOSceneChanged$2(this.f46052a, this.f46053b);
    }
}
