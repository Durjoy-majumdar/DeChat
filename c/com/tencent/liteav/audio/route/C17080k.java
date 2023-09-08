package com.tencent.liteav.audio.route;

/* renamed from: com.tencent.liteav.audio.route.k */
final /* synthetic */ class C17080k implements Runnable {

    /* renamed from: a */
    private final AudioRouteManager f46058a;

    /* renamed from: b */
    private final boolean f46059b;

    private C17080k(AudioRouteManager audioRouteManager, boolean z) {
        this.f46058a = audioRouteManager;
        this.f46059b = z;
    }

    /* renamed from: a */
    public static Runnable m16857a(AudioRouteManager audioRouteManager, boolean z) {
        return new C17080k(audioRouteManager, z);
    }

    public final void run() {
        this.f46058a.handleBluetoothHeadsetChangedInternal(this.f46059b);
    }
}
