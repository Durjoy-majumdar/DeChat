package com.tencent.liteav.audio.route;

/* renamed from: com.tencent.liteav.audio.route.d */
final /* synthetic */ class C17073d implements Runnable {

    /* renamed from: a */
    private final AudioRouteManager f46046a;

    /* renamed from: b */
    private final boolean f46047b;

    private C17073d(AudioRouteManager audioRouteManager, boolean z) {
        this.f46046a = audioRouteManager;
        this.f46047b = z;
    }

    /* renamed from: a */
    public static Runnable m16850a(AudioRouteManager audioRouteManager, boolean z) {
        return new C17073d(audioRouteManager, z);
    }

    public final void run() {
        this.f46046a.handleBluetoothSCOChangedInternal(this.f46047b);
    }
}
