package com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim;

import android.view.ViewTreeObserver;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.f */
public class C94716f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ AdLandingPageEggCardHelper f274137d;

    public C94716f(AdLandingPageEggCardHelper adLandingPageEggCardHelper) {
        this.f274137d = adLandingPageEggCardHelper;
    }

    public boolean onPreDraw() {
        SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$2");
        if (AdLandingPageEggCardHelper.m119891a(this.f274137d).isSupportNavigationSwipeBack()) {
            AdLandingPageEggCardHelper.m119891a(this.f274137d).getSwipeBackLayout().setEnableGesture(false);
            AdLandingPageEggCardHelper.m119891a(this.f274137d).getSwipeBackLayout().mo26381c(true);
        }
        AdLandingPageEggCardHelper.m119891a(this.f274137d).mo132534f8();
        this.f274137d.f274102m.getViewTreeObserver().removeOnPreDrawListener(this);
        SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$2");
        return false;
    }
}
