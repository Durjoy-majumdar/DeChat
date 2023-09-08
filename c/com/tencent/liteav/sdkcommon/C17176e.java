package com.tencent.liteav.sdkcommon;

/* renamed from: com.tencent.liteav.sdkcommon.e */
final /* synthetic */ class C17176e implements Runnable {

    /* renamed from: a */
    private final DashboardManager f46383a;

    /* renamed from: b */
    private final String f46384b;

    /* renamed from: c */
    private final String f46385c;

    private C17176e(DashboardManager dashboardManager, String str, String str2) {
        this.f46383a = dashboardManager;
        this.f46384b = str;
        this.f46385c = str2;
    }

    /* renamed from: a */
    public static Runnable m17001a(DashboardManager dashboardManager, String str, String str2) {
        return new C17176e(dashboardManager, str, str2);
    }

    public final void run() {
        this.f46383a.setStatusInternal(this.f46384b, this.f46385c);
    }
}
