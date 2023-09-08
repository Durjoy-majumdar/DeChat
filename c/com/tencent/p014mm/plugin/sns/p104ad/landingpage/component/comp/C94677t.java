package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import sq2.C13774c;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t */
public class C94677t extends C13774c {

    /* renamed from: d */
    public final /* synthetic */ View f273974d;

    /* renamed from: e */
    public final /* synthetic */ AdLandingHBCardComponent f273975e;

    public C94677t(AdLandingHBCardComponent adLandingHBCardComponent, View view) {
        this.f273975e = adLandingHBCardComponent;
        this.f273974d = view;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$2");
        View view = this.f273974d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f273974d.setTranslationX(0.0f);
        View view2 = this.f273974d;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(1.0f));
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        AdLandingHBCardComponent.m119636E(this.f273975e).mo139278d();
        AdLandingHBCardComponent.m119636E(this.f273975e).mo139277c();
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$2");
    }
}
