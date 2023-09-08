package com.tencent.p014mm.plugin.sns.p104ad.widget.shakead;

import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.ShakeCardAnimView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.e */
public class C94781e extends SimplePAGViewUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ShakeCardAnimView f274515d;

    public C94781e(ShakeCardAnimView shakeCardAnimView) {
        this.f274515d = shakeCardAnimView;
    }

    public void onAnimationCancel(PAGView pAGView) {
        SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
        SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
    }

    public void onAnimationEnd(PAGView pAGView) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
        Log.m105924i("ShakeCardAnimView", "PagView onAnimationEnd");
        ShakeCardAnimView shakeCardAnimView = this.f274515d;
        int i = ShakeCardAnimView.f274459o;
        SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        shakeCardAnimView.f274466j = false;
        SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        ShakeCardAnimView shakeCardAnimView2 = this.f274515d;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        ShakeCardAnimView.C94768c cVar = shakeCardAnimView2.f274467n;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        if (cVar != null) {
            ShakeCardAnimView shakeCardAnimView3 = this.f274515d;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            ShakeCardAnimView.C94768c cVar2 = shakeCardAnimView3.f274467n;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            AdLandingPageEggCardHelper.C94708e eVar = (AdLandingPageEggCardHelper.C94708e) cVar2;
            eVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onPagAnimEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$6");
            ShakeCardAnimView h = AdLandingPageEggCardHelper.m119898h(AdLandingPageEggCardHelper.this);
            h.getClass();
            SnsMethodCalculate.markStartTimeMs("isCardAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            if (h.f274465i) {
                GLCardAnimView gLCardAnimView = h.f274464h;
                gLCardAnimView.getClass();
                SnsMethodCalculate.markStartTimeMs("isCardAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                z = gLCardAnimView.f274457z;
                SnsMethodCalculate.markEndTimeMs("isCardAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                SnsMethodCalculate.markEndTimeMs("isCardAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            } else {
                CardAnimView cardAnimView = h.f274463g;
                cardAnimView.getClass();
                SnsMethodCalculate.markStartTimeMs("isCardAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                z = cardAnimView.f274446n;
                SnsMethodCalculate.markEndTimeMs("isCardAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                SnsMethodCalculate.markEndTimeMs("isCardAniming", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            }
            Log.m105924i("AdLandingPageEggCardHelper", "onPagAnimEnd, isCardAniming=" + z);
            if (!z) {
                AdLandingPageEggCardHelper.m119898h(AdLandingPageEggCardHelper.this).setVisibility(8);
            }
            SnsMethodCalculate.markEndTimeMs("onPagAnimEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$6");
        }
        ShakeCardAnimView.m120061a(this.f274515d).removeListener(this);
        ShakeCardAnimView.m120061a(this.f274515d).stop();
        ShakeCardAnimView shakeCardAnimView4 = this.f274515d;
        shakeCardAnimView4.removeView(ShakeCardAnimView.m120061a(shakeCardAnimView4));
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
    }

    public void onAnimationRepeat(PAGView pAGView) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
    }

    public void onAnimationStart(PAGView pAGView) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
        ShakeCardAnimView shakeCardAnimView = this.f274515d;
        int i = ShakeCardAnimView.f274459o;
        SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        shakeCardAnimView.f274466j = true;
        SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$1");
    }
}
