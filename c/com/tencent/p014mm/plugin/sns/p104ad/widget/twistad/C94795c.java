package com.tencent.p014mm.plugin.sns.p104ad.widget.twistad;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.C94722i;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.c */
public class C94795c extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ GLTwistRoateCardsView f274610d;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.c$a */
    public class C94796a implements Runnable {
        public C94796a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$7$1");
            C94722i iVar = (C94722i) GLTwistRoateCardsView.m120098h(C94795c.this.f274610d);
            iVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$8");
            if (AdLandingPageEggCardHelper.m119891a(iVar.f274143a).isSupportNavigationSwipeBack()) {
                AdLandingPageEggCardHelper.m119891a(iVar.f274143a).getSwipeBackLayout().setEnableGesture(true);
            }
            AdLandingPageEggCardHelper.m119891a(iVar.f274143a).mo132500I8();
            AdLandingPageEggCardHelper.m119891a(iVar.f274143a).mo132503L8();
            AdLandingPageEggCardHelper adLandingPageEggCardHelper = iVar.f274143a;
            SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            GLTwistRoateCardsView gLTwistRoateCardsView = adLandingPageEggCardHelper.f274092c;
            SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            if (gLTwistRoateCardsView != null) {
                AdLandingPageEggCardHelper adLandingPageEggCardHelper2 = iVar.f274143a;
                SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                GLTwistRoateCardsView gLTwistRoateCardsView2 = adLandingPageEggCardHelper2.f274092c;
                SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                ((FrameLayout) AdLandingPageEggCardHelper.m119891a(iVar.f274143a).findViewById(C0966R.C0970id.iwc)).removeView(gLTwistRoateCardsView2);
            }
            if (AdLandingPageEggCardHelper.m119899i(iVar.f274143a) != null) {
                AdLandingPageEggCardHelper.m119899i(iVar.f274143a).mo130197G();
            }
            SnsMethodCalculate.markEndTimeMs("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$8");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$7$1");
        }
    }

    public C94795c(GLTwistRoateCardsView gLTwistRoateCardsView) {
        this.f274610d = gLTwistRoateCardsView;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$7");
        if (GLTwistRoateCardsView.m120098h(this.f274610d) != null) {
            MMHandlerThread.postToMainThreadDelayed(new C94796a(), 800);
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$7");
    }
}
