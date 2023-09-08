package com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ps2.C100880k;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.e */
public class C57334e implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ String f164239a;

    public C57334e(AdLandingPageEggCardHelper adLandingPageEggCardHelper, String str) {
        this.f164239a = str;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$1");
        Log.m105920e("AdLandingPageEggCardHelper", "doDownloadSpriteImg img err, url=" + this.f164239a);
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$1");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$1");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$1");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$1");
        Log.m105918d("AdLandingPageEggCardHelper", "doDownloadSpriteImg img succ");
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$1");
    }
}
