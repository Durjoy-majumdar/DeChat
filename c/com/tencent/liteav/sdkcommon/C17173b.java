package com.tencent.liteav.sdkcommon;

/* renamed from: com.tencent.liteav.sdkcommon.b */
final /* synthetic */ class C17173b implements Runnable {

    /* renamed from: a */
    private final DashboardManager f46378a;

    /* renamed from: b */
    private final String f46379b;

    private C17173b(DashboardManager dashboardManager, String str) {
        this.f46378a = dashboardManager;
        this.f46379b = str;
    }

    /* renamed from: a */
    public static Runnable m16998a(DashboardManager dashboardManager, String str) {
        return new C17173b(dashboardManager, str);
    }

    public final void run() {
        this.f46378a.addDashboardInternal(this.f46379b);
    }
}
