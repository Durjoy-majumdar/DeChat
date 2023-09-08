package com.tencent.liteav.sdkcommon;

/* renamed from: com.tencent.liteav.sdkcommon.f */
final /* synthetic */ class C17177f implements Runnable {

    /* renamed from: a */
    private final DashboardManager f46386a;

    /* renamed from: b */
    private final String f46387b;

    /* renamed from: c */
    private final String f46388c;

    private C17177f(DashboardManager dashboardManager, String str, String str2) {
        this.f46386a = dashboardManager;
        this.f46387b = str;
        this.f46388c = str2;
    }

    /* renamed from: a */
    public static Runnable m17002a(DashboardManager dashboardManager, String str, String str2) {
        return new C17177f(dashboardManager, str, str2);
    }

    public final void run() {
        this.f46386a.appendLogInternal(this.f46387b, this.f46388c);
    }
}
