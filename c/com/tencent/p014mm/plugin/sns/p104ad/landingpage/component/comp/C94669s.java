package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.animation.Animator;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import sq2.C13774c;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.s */
public class C94669s extends C13774c {

    /* renamed from: d */
    public final /* synthetic */ View f273945d;

    /* renamed from: e */
    public final /* synthetic */ AdLandingHBCardComponent f273946e;

    public C94669s(AdLandingHBCardComponent adLandingHBCardComponent, View view) {
        this.f273946e = adLandingHBCardComponent;
        this.f273945d = view;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$1");
        AdLandingHBCardComponent adLandingHBCardComponent = this.f273946e;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        FrameLayout frameLayout = adLandingHBCardComponent.f273709v;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        frameLayout.removeView(this.f273945d);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$1");
    }
}
