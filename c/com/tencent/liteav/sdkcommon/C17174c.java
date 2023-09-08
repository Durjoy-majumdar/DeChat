package com.tencent.liteav.sdkcommon;

/* renamed from: com.tencent.liteav.sdkcommon.c */
final /* synthetic */ class C17174c implements Runnable {

    /* renamed from: a */
    private final DashboardManager f46380a;

    /* renamed from: b */
    private final String f46381b;

    private C17174c(DashboardManager dashboardManager, String str) {
        this.f46380a = dashboardManager;
        this.f46381b = str;
    }

    /* renamed from: a */
    public static Runnable m16999a(DashboardManager dashboardManager, String str) {
        return new C17174c(dashboardManager, str);
    }

    public final void run() {
        this.f46380a.removeDashboardInternal(this.f46381b);
    }
}
