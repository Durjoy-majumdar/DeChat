package com.tencent.p014mm.plugin.sns.p104ad.widget.twistad;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94625d;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.e */
public class C94798e extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ TwistRoateCardsView f274613d;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.e$a */
    public class C94799a implements Runnable {
        public C94799a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$6$1");
            AdLandingPageEggCardHelper.C94709f fVar = (AdLandingPageEggCardHelper.C94709f) TwistRoateCardsView.m120116a(C94798e.this.f274613d);
            fVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$7");
            if (AdLandingPageEggCardHelper.m119891a(AdLandingPageEggCardHelper.this).isSupportNavigationSwipeBack()) {
                AdLandingPageEggCardHelper.m119891a(AdLandingPageEggCardHelper.this).getSwipeBackLayout().setEnableGesture(true);
            }
            AdLandingPageEggCardHelper.m119891a(AdLandingPageEggCardHelper.this).mo132500I8();
            AdLandingPageEggCardHelper.m119891a(AdLandingPageEggCardHelper.this).mo132503L8();
            AdLandingPageEggCardHelper adLandingPageEggCardHelper = AdLandingPageEggCardHelper.this;
            SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            TwistRoateCardsView twistRoateCardsView = adLandingPageEggCardHelper.f274091b;
            SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            twistRoateCardsView.setVisibility(8);
            if (AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this) != null) {
                AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130197G();
                if (AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130208W()) {
                    AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130211b0(true);
                    AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130212c0();
                    AdLandingPageEggCardHelper.m119900j(AdLandingPageEggCardHelper.this).removeCallbacksAndMessages((Object) null);
                    C94625d i = AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this);
                    i.getClass();
                    SnsMethodCalculate.markStartTimeMs("isShowDoubleHBCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    boolean z = i.f273820y;
                    SnsMethodCalculate.markEndTimeMs("isShowDoubleHBCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                    if (z) {
                        AdLandingPageEggCardHelper.m119900j(AdLandingPageEggCardHelper.this).sendEmptyMessageDelayed(3, 7000);
                    } else {
                        AdLandingPageEggCardHelper.m119900j(AdLandingPageEggCardHelper.this).sendEmptyMessageDelayed(1, 3000);
                    }
                } else {
                    AdLandingPageEggCardHelper.m119901k(AdLandingPageEggCardHelper.this, true, true);
                }
                AdLandingPageEggCardHelper.m119899i(AdLandingPageEggCardHelper.this).mo130198H();
            }
            SnsMethodCalculate.markEndTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$7");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$6$1");
        }
    }

    public C94798e(TwistRoateCardsView twistRoateCardsView) {
        this.f274613d = twistRoateCardsView;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$6");
        if (TwistRoateCardsView.m120116a(this.f274613d) != null) {
            MMHandlerThread.postToMainThreadDelayed(new C94799a(), 800);
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$6");
    }
}
