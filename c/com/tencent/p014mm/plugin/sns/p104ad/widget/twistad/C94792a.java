package com.tencent.p014mm.plugin.sns.p104ad.widget.twistad;

import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94625d;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.C94722i;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.a */
public class C94792a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GLTwistRoateCardsView f274607d;

    public C94792a(GLTwistRoateCardsView gLTwistRoateCardsView) {
        this.f274607d = gLTwistRoateCardsView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$5");
        if (GLTwistRoateCardsView.m120098h(this.f274607d) != null) {
            C94722i iVar = (C94722i) GLTwistRoateCardsView.m120098h(this.f274607d);
            iVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onPrepareCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$8");
            AdLandingPageEggCardHelper adLandingPageEggCardHelper = iVar.f274143a;
            SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            String str = adLandingPageEggCardHelper.f274097h;
            SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            AdLandingPageEggCardHelper adLandingPageEggCardHelper2 = iVar.f274143a;
            SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            String str2 = adLandingPageEggCardHelper2.f274098i;
            SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            Log.m105924i("AdLandingPageEggCardHelper", "onPrepareCard, twistId=" + str + ", ext=" + str2);
            AdLandingPageEggCardHelper.m119899i(iVar.f274143a).mo130210Y(str, str2);
            try {
                if (TextUtils.isEmpty(str)) {
                    TwistCoverView.m120102g(AdLandingPageEggCardHelper.m119891a(iVar.f274143a).mo132541n8(), 2);
                    C115669n.INSTANCE.mo175911u(1572, 8);
                } else {
                    TwistCoverView.m120102g(AdLandingPageEggCardHelper.m119891a(iVar.f274143a).mo132541n8(), 1);
                    C115669n.INSTANCE.mo175911u(1572, 7);
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingPageEggCardHelper", "twist report exp=" + th.toString());
            }
            AdLandingPageEggCardHelper adLandingPageEggCardHelper3 = iVar.f274143a;
            View I = C94625d.m119712I(AdLandingPageEggCardHelper.m119899i(adLandingPageEggCardHelper3).mo130204Q());
            SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            adLandingPageEggCardHelper3.f274095f = I;
            SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            if (AdLandingPageEggCardHelper.m119893c(iVar.f274143a) != null) {
                AdLandingPageEggCardHelper adLandingPageEggCardHelper4 = iVar.f274143a;
                SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                GLTwistRoateCardsView gLTwistRoateCardsView = adLandingPageEggCardHelper4.f274092c;
                SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                gLTwistRoateCardsView.setAnimCardView(AdLandingPageEggCardHelper.m119893c(iVar.f274143a));
                View c = AdLandingPageEggCardHelper.m119893c(iVar.f274143a);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.0f));
                C117292a.m165358d(c, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$8", "onPrepareCard", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                c.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(c, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$8", "onPrepareCard", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                Log.m105920e("AdLandingPageEggCardHelper", "mTwistCardAnimView==null");
            }
            SnsMethodCalculate.markEndTimeMs("onPrepareCard", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$8");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$5");
    }
}
