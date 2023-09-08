package com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import sq2.C13774c;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h */
public class C94720h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdLandingPageEggCardHelper f274141d;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.h$a */
    public class C94721a extends C13774c {
        public C94721a() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$4$1");
            try {
                C94720h.this.f274141d.f274102m.setVisibility(4);
                SnsAdNativeLandingPagesUI a = AdLandingPageEggCardHelper.m119891a(C94720h.this.f274141d);
                a.getClass();
                SnsMethodCalculate.markStartTimeMs("getRootView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                FrameLayout frameLayout = a.f277565b1;
                SnsMethodCalculate.markEndTimeMs("getRootView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                if (frameLayout != null) {
                    Log.m105924i("AdLandingPageEggCardHelper", "removeView LongPressAnimView");
                    frameLayout.removeView(C94720h.this.f274141d.f274102m);
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingPageEggCardHelper", "remove LongPressAnimView, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$4$1");
        }
    }

    public C94720h(AdLandingPageEggCardHelper adLandingPageEggCardHelper) {
        this.f274141d = adLandingPageEggCardHelper;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$4");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f274141d.f274102m, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.addListener(new C94721a());
        ofFloat.setDuration(300);
        ofFloat.start();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$4");
    }
}
