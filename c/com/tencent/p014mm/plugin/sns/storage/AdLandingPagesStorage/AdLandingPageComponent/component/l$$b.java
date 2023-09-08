package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ps2.C100880k;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l$$b */
public class l$$b implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ String f276116a;

    public l$$b(C95136l lVar, String str) {
        this.f276116a = str;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$10");
        Log.m105920e("AdLandingNewH5Comp", "onDownloadError, imageUrl=" + this.f276116a);
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$10");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$10");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$10");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$10");
        Log.m105924i("AdLandingNewH5Comp", "onDownloaded, imageUrl=" + this.f276116a);
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$10");
    }
}
