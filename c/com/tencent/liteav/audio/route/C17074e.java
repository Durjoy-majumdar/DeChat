package com.tencent.liteav.audio.route;

/* renamed from: com.tencent.liteav.audio.route.e */
final /* synthetic */ class C17074e implements Runnable {

    /* renamed from: a */
    private final AudioRouteManager f46048a;

    private C17074e(AudioRouteManager audioRouteManager) {
        this.f46048a = audioRouteManager;
    }

    /* renamed from: a */
    public static Runnable m16851a(AudioRouteManager audioRouteManager) {
        return new C17074e(audioRouteManager);
    }

    public final void run() {
        this.f46048a.notifyAudioIOSceneChangedInternal();
    }
}
