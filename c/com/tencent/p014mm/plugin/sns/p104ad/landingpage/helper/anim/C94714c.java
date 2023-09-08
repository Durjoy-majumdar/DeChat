package com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim;

import android.animation.Animator;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment;
import sq2.C13774c;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.c */
public class C94714c extends C13774c {

    /* renamed from: d */
    public final /* synthetic */ AdLandingPageEggCardHelper.C9470113 f274133d;

    public C94714c(AdLandingPageEggCardHelper.C9470113 r1) {
        this.f274133d = r1;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$13$1");
        AdLandingPageEggCardHelper adLandingPageEggCardHelper = AdLandingPageEggCardHelper.this;
        SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        boolean z = adLandingPageEggCardHelper.f274100k;
        SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (z) {
            AdLandingPageEggCardHelper adLandingPageEggCardHelper2 = AdLandingPageEggCardHelper.this;
            SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            adLandingPageEggCardHelper2.mo130365x((ContentFragment) null, true);
            SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        } else {
            AdLandingPageEggCardHelper adLandingPageEggCardHelper3 = AdLandingPageEggCardHelper.this;
            SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            boolean z2 = adLandingPageEggCardHelper3.f274093d;
            SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            if (z2) {
                AdLandingPageEggCardHelper adLandingPageEggCardHelper4 = AdLandingPageEggCardHelper.this;
                SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                adLandingPageEggCardHelper4.mo130366y((ContentFragment) null, true);
                SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$13$1");
    }
}
