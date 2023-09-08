package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.m0 */
public class C83367m0 extends C83524y3 {

    /* renamed from: C */
    public final /* synthetic */ AppLaunchPrepareProcess f243596C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83367m0(AppLaunchPrepareProcess appLaunchPrepareProcess, String str, int i, WxaAttributes.WxaVersionInfo wxaVersionInfo, int i2, int i3, String str2, AppBrandLaunchReferrer appBrandLaunchReferrer, String str3, ICommLibReader iCommLibReader, QualitySession qualitySession, String str4, AppBrandLaunchFromNotifyReferrer appBrandLaunchFromNotifyReferrer, String str5, C80247h hVar, int i4, int i5, AppBrandRuntimeReloadReportBundle appBrandRuntimeReloadReportBundle, boolean z) {
        super(str, i, wxaVersionInfo, i2, i3, str2, appBrandLaunchReferrer, str3, iCommLibReader, qualitySession, str4, appBrandLaunchFromNotifyReferrer, str5, hVar, i4, i5, appBrandRuntimeReloadReportBundle, z);
        String str6 = str;
        this.f243596C = appLaunchPrepareProcess;
    }
}
