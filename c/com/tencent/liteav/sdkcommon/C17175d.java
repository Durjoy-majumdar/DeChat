package com.tencent.liteav.sdkcommon;

/* renamed from: com.tencent.liteav.sdkcommon.d */
final /* synthetic */ class C17175d implements Runnable {

    /* renamed from: a */
    private final DashboardManager f46382a;

    private C17175d(DashboardManager dashboardManager) {
        this.f46382a = dashboardManager;
    }

    /* renamed from: a */
    public static Runnable m17000a(DashboardManager dashboardManager) {
        return new C17175d(dashboardManager);
    }

    public final void run() {
        this.f46382a.removeAllDashboardInternal();
    }
}
