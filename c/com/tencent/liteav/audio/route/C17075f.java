package com.tencent.liteav.audio.route;

/* renamed from: com.tencent.liteav.audio.route.f */
final /* synthetic */ class C17075f implements Runnable {

    /* renamed from: a */
    private final AudioRouteManager f46049a;

    /* renamed from: b */
    private final String f46050b;

    private C17075f(AudioRouteManager audioRouteManager, String str) {
        this.f46049a = audioRouteManager;
        this.f46050b = str;
    }

    /* renamed from: a */
    public static Runnable m16852a(AudioRouteManager audioRouteManager, String str) {
        return new C17075f(audioRouteManager, str);
    }

    public final void run() {
        this.f46049a.startInternal(this.f46050b);
    }
}
