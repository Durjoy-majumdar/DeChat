package com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import jt2.C99023b;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.j */
public class C94723j implements C99023b {

    /* renamed from: a */
    public final /* synthetic */ AdLandingPageEggCardHelper f274144a;

    public C94723j(AdLandingPageEggCardHelper adLandingPageEggCardHelper) {
        this.f274144a = adLandingPageEggCardHelper;
    }

    /* renamed from: a */
    public void mo130378a(float f) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$9");
        View d = AdLandingPageEggCardHelper.m119894d(this.f274144a);
        float f2 = 1.0f - f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(f2));
        C117292a.m165358d(d, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$9", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        d.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(d, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$9", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View b = AdLandingPageEggCardHelper.m119892b(this.f274144a);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(f2));
        C117292a.m165358d(b, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$9", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        b.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(b, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$9", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View g = AdLandingPageEggCardHelper.m119897g(this.f274144a);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(Float.valueOf(f2));
        C117292a.m165358d(g, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$9", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        g.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
        C117292a.m165359e(g, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$9", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$9");
    }

    public void onAnimationEnd() {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$9");
        SnsAdNativeLandingPagesUI a = AdLandingPageEggCardHelper.m119891a(this.f274144a);
        a.getClass();
        SnsMethodCalculate.markStartTimeMs("setIsPlayingAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        a.f277594m1 = false;
        SnsMethodCalculate.markEndTimeMs("setIsPlayingAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        AdLandingPageEggCardHelper adLandingPageEggCardHelper = this.f274144a;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        View view = adLandingPageEggCardHelper.f274105p;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$9", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$9", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        AdLandingPageEggCardHelper.m119891a(this.f274144a).mo132500I8();
        AdLandingPageEggCardHelper.m119891a(this.f274144a).mo132503L8();
        SnsAdNativeLandingPagesUI a2 = AdLandingPageEggCardHelper.m119891a(this.f274144a);
        a2.getClass();
        SnsMethodCalculate.markStartTimeMs("isForbiddenSwipe", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z = a2.f277515G1;
        SnsMethodCalculate.markEndTimeMs("isForbiddenSwipe", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (!z && AdLandingPageEggCardHelper.m119891a(this.f274144a).isSupportNavigationSwipeBack()) {
            AdLandingPageEggCardHelper.m119891a(this.f274144a).getSwipeBackLayout().setEnableGesture(true);
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$9");
    }

    public void onAnimationStart() {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$9");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$9");
    }
}
