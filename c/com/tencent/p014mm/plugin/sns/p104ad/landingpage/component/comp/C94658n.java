package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import ps2.C100880k;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.n */
public class C94658n implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ long f273921a;

    /* renamed from: b */
    public final /* synthetic */ C94651l f273922b;

    public C94658n(C94651l lVar, long j) {
        this.f273922b = lVar;
        this.f273921a = j;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$5");
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$5");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$5");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$5");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$5");
        long currentTimeMillis = System.currentTimeMillis();
        this.f273922b.f273883A.setCover(BitmapUtil.decodeFile(str));
        C94651l lVar = this.f273922b;
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long j = this.f273921a;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        lVar.mo130242Y(currentTimeMillis2, j);
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$5");
    }
}
