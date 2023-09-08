package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.animation.Animator;
import android.text.TextUtils;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94680v;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.C94715d;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import sq2.C13774c;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.z */
public final class C94688z extends C13774c {

    /* renamed from: d */
    public final /* synthetic */ C94680v f274011d;

    public C94688z(C94680v vVar) {
        this.f274011d = vVar;
    }

    public void onAnimationEnd(Animator animator, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$startReqCardAnim$1");
        C94680v vVar = this.f274011d;
        SnsMethodCalculate.markStartTimeMs("access$getMAnimView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        ImageView imageView = vVar.f273981B;
        SnsMethodCalculate.markEndTimeMs("access$getMAnimView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        String str = null;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
            C94680v vVar2 = this.f274011d;
            SnsMethodCalculate.markStartTimeMs("access$getMAnimView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            ImageView imageView2 = vVar2.f273981B;
            SnsMethodCalculate.markEndTimeMs("access$getMAnimView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            if (imageView2 != null) {
                imageView2.setVisibility(4);
                C94680v vVar3 = this.f274011d;
                SnsMethodCalculate.markStartTimeMs("access$getMHalfEggCardListener$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                C94680v.C94681a aVar = vVar3.f273988I;
                SnsMethodCalculate.markEndTimeMs("access$getMHalfEggCardListener$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                boolean z2 = true;
                if (aVar != null) {
                    C94715d dVar = (C94715d) aVar;
                    SnsMethodCalculate.markStartTimeMs("onGetServerCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$16");
                    AdLandingPageEggCardHelper adLandingPageEggCardHelper = dVar.f274136c;
                    adLandingPageEggCardHelper.getClass();
                    SnsMethodCalculate.markStartTimeMs("getEggCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    String str2 = adLandingPageEggCardHelper.f274097h;
                    SnsMethodCalculate.markEndTimeMs("getEggCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    if (TextUtils.isEmpty(str2)) {
                        C115669n.INSTANCE.mo175911u(1970, 4);
                        AdLandingPageEggCardHelper.m119905t(AdLandingPageEggCardHelper.m119891a(dVar.f274136c).mo132541n8(), "", 2);
                    } else {
                        AdLandingPageEggCardHelper.m119905t(AdLandingPageEggCardHelper.m119891a(dVar.f274136c).mo132541n8(), str2, 1);
                    }
                    Log.m105924i("AdLandingPageEggCardHelper", "checkShowHalfEggCard pageId=" + dVar.f274134a + ", reqDuration=" + (System.currentTimeMillis() - dVar.f274135b) + ", ret=" + str2);
                    SnsMethodCalculate.markEndTimeMs("onGetServerCardId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$16");
                    str = str2;
                }
                if (!(str == null || str.length() == 0)) {
                    z2 = false;
                }
                if (z2) {
                    str = C94680v.m119821E(this.f274011d);
                    Log.m105920e("AdLandingHalfEggCardComponent", "onGetServerCardId empty, defaultId=" + str);
                } else {
                    Log.m105924i("AdLandingHalfEggCardComponent", "onGetServerCardId cardId=" + str);
                }
                this.f274011d.mo130279R(str);
                AdLandingPageEggCardHelper.m119906w(this.f274011d.mo131854m().mo140739f(), str);
                AdLandingPagesProxy.getInstance().notifyFinderCnyEggCardResult(this.f274011d.mo131854m().mo140739f(), str);
                C94680v vVar4 = this.f274011d;
                SnsMethodCalculate.markStartTimeMs("access$isAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                vVar4.getClass();
                SnsMethodCalculate.markStartTimeMs("isAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                boolean z3 = vVar4.f273993N;
                SnsMethodCalculate.markEndTimeMs("isAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                SnsMethodCalculate.markEndTimeMs("access$isAutoJumpH5", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                if (z3) {
                    C94680v vVar5 = this.f274011d;
                    SnsMethodCalculate.markStartTimeMs("access$showH5Content", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                    vVar5.mo130281V(false);
                    SnsMethodCalculate.markEndTimeMs("access$showH5Content", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                    C94680v vVar6 = this.f274011d;
                    vVar6.mo130277P(vVar6.mo131854m(), str, 2);
                } else {
                    C94680v vVar7 = this.f274011d;
                    SnsMethodCalculate.markStartTimeMs("access$showCardContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                    vVar7.mo130280U(false);
                    SnsMethodCalculate.markEndTimeMs("access$showCardContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
                }
                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$startReqCardAnim$1");
                return;
            }
            C87412m.m108603p("mAnimView");
            throw null;
        }
        C87412m.m108603p("mAnimView");
        throw null;
    }
}
