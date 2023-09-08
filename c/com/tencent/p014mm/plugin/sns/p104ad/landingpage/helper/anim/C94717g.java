package com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import sq2.C13774c;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.g */
public class C94717g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdLandingPageEggCardHelper f274138d;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.g$a */
    public class C94718a implements ValueAnimator.AnimatorUpdateListener {
        public C94718a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$3$1");
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View g = AdLandingPageEggCardHelper.m119897g(C94717g.this.f274138d);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            View view = g;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            g.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$3$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.g$b */
    public class C94719b extends C13774c {
        public C94719b() {
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$3$2");
            Log.m105924i("AdLandingPageEggCardHelper", "tryPlayLongPressAnim, onAnimationEnd, loadLandingPages");
            SnsAdNativeLandingPagesUI a = AdLandingPageEggCardHelper.m119891a(C94717g.this.f274138d);
            a.getClass();
            SnsMethodCalculate.markStartTimeMs("setIsPlayingAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            a.f277594m1 = false;
            SnsMethodCalculate.markEndTimeMs("setIsPlayingAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            AdLandingPageEggCardHelper adLandingPageEggCardHelper = C94717g.this.f274138d;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            View view = adLandingPageEggCardHelper.f274105p;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            AdLandingPageEggCardHelper.m119891a(C94717g.this.f274138d).mo132500I8();
            AdLandingPageEggCardHelper.m119891a(C94717g.this.f274138d).mo132503L8();
            SnsAdNativeLandingPagesUI a2 = AdLandingPageEggCardHelper.m119891a(C94717g.this.f274138d);
            a2.getClass();
            SnsMethodCalculate.markStartTimeMs("isForbiddenSwipe", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            boolean z = a2.f277515G1;
            SnsMethodCalculate.markEndTimeMs("isForbiddenSwipe", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (!z && AdLandingPageEggCardHelper.m119891a(C94717g.this.f274138d).isSupportNavigationSwipeBack()) {
                AdLandingPageEggCardHelper.m119891a(C94717g.this.f274138d).getSwipeBackLayout().setEnableGesture(true);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$3$2");
        }
    }

    public C94717g(AdLandingPageEggCardHelper adLandingPageEggCardHelper) {
        this.f274138d = adLandingPageEggCardHelper;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$3");
        Log.m105924i("AdLandingPageEggCardHelper", "tryPlayLongPressAnim, after delay");
        View b = AdLandingPageEggCardHelper.m119892b(this.f274138d);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(b, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(b, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!AdLandingPageEggCardHelper.m119895e(this.f274138d)) {
            View g = AdLandingPageEggCardHelper.m119897g(this.f274138d);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(g, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(g, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View g2 = AdLandingPageEggCardHelper.m119897g(this.f274138d);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(g2, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        g2.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
        C117292a.m165359e(g2, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(AdLandingPageEggCardHelper.m119892b(this.f274138d), "alpha", new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C94718a());
        ofFloat.addListener(new C94719b());
        ofFloat.setDuration(500);
        ofFloat.start();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$3");
    }
}
