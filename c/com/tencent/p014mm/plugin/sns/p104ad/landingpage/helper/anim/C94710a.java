package com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim;

import android.view.ViewTreeObserver;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.a */
public class C94710a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ AdLandingPageEggCardHelper f274129d;

    public C94710a(AdLandingPageEggCardHelper adLandingPageEggCardHelper) {
        this.f274129d = adLandingPageEggCardHelper;
    }

    public boolean onPreDraw() {
        SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$10");
        AdLandingPageEggCardHelper.m119891a(this.f274129d).mo132534f8();
        AdLandingPageEggCardHelper.m119898h(this.f274129d).getViewTreeObserver().removeOnPreDrawListener(this);
        SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$10");
        return false;
    }
}
