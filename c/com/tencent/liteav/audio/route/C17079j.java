package com.tencent.liteav.audio.route;

/* renamed from: com.tencent.liteav.audio.route.j */
final /* synthetic */ class C17079j implements Runnable {

    /* renamed from: a */
    private final AudioRouteManager f46056a;

    /* renamed from: b */
    private final boolean f46057b;

    private C17079j(AudioRouteManager audioRouteManager, boolean z) {
        this.f46056a = audioRouteManager;
        this.f46057b = z;
    }

    /* renamed from: a */
    public static Runnable m16856a(AudioRouteManager audioRouteManager, boolean z) {
        return new C17079j(audioRouteManager, z);
    }

    public final void run() {
        this.f46056a.handleWiredHeadsetChangedInternal(this.f46057b);
    }
}
