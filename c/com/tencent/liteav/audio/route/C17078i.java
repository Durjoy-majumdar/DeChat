package com.tencent.liteav.audio.route;

/* renamed from: com.tencent.liteav.audio.route.i */
final /* synthetic */ class C17078i implements Runnable {

    /* renamed from: a */
    private final AudioRouteManager f46054a;

    /* renamed from: b */
    private final boolean f46055b;

    private C17078i(AudioRouteManager audioRouteManager, boolean z) {
        this.f46054a = audioRouteManager;
        this.f46055b = z;
    }

    /* renamed from: a */
    public static Runnable m16855a(AudioRouteManager audioRouteManager, boolean z) {
        return new C17078i(audioRouteManager, z);
    }

    public final void run() {
        this.f46054a.setHandFreeModeEnabledInternal(this.f46055b);
    }
}
