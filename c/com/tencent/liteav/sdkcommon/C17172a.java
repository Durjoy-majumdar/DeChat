package com.tencent.liteav.sdkcommon;

/* renamed from: com.tencent.liteav.sdkcommon.a */
final /* synthetic */ class C17172a implements Runnable {

    /* renamed from: a */
    private final DashboardManager f46376a;

    /* renamed from: b */
    private final boolean f46377b;

    private C17172a(DashboardManager dashboardManager, boolean z) {
        this.f46376a = dashboardManager;
        this.f46377b = z;
    }

    /* renamed from: a */
    public static Runnable m16997a(DashboardManager dashboardManager, boolean z) {
        return new C17172a(dashboardManager, z);
    }

    public final void run() {
        this.f46376a.showDashboardInternal(this.f46377b);
    }
}
