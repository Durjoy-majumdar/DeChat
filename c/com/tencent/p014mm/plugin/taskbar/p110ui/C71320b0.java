package com.tencent.p014mm.plugin.taskbar.p110ui;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import di3.C86312j;
import kr0.C76630x0;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.b0 */
public class C71320b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LocalUsageInfo f206554d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandStatObject f206555e;

    /* renamed from: f */
    public final /* synthetic */ TaskBarView f206556f;

    public C71320b0(TaskBarView taskBarView, LocalUsageInfo localUsageInfo, AppBrandStatObject appBrandStatObject) {
        this.f206556f = taskBarView;
        this.f206554d = localUsageInfo;
        this.f206555e = appBrandStatObject;
    }

    public void run() {
        this.f206556f.f206494b2 = 13;
        Context context = this.f206556f.getContext();
        LocalUsageInfo localUsageInfo = this.f206554d;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(context, localUsageInfo.f239040d, localUsageInfo.f239041e, localUsageInfo.f239042f, -1, (String) null, this.f206555e);
    }
}
